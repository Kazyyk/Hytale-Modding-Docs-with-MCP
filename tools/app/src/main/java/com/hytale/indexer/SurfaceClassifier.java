package com.hytale.indexer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * Phase 2: Classify API Surface.
 *
 * Loads class-index.json, seeds the frontier with known plugin entry points,
 * and transitively expands by following public/protected member type references.
 * Produces surface.json, internal-index.json, and surface-review.json.
 */
public class SurfaceClassifier {

    // --- Excluded packages (types here are NOT API even if reachable) ---
    // Note: protocol.packets.* and protocol.io.* are excluded (network internals),
    // but protocol root types (GameMode, BlockPosition, etc.) are allowed through
    // because many are the ONLY definition of fundamental game concepts.
    private static final List<String> EXCLUDED_PACKAGES = List.of(
        "com.hypixel.hytale.builtin.",
        "com.hypixel.hytale.protocol.packets.",
        "com.hypixel.hytale.protocol.io.",
        "com.hypixel.hytale.procedurallib."
    );

    // --- External package prefixes to skip entirely ---
    private static final List<String> EXTERNAL_PREFIXES = List.of(
        "java.", "javax.", "org.slf4j.", "org.bson.", "io.netty.",
        "org.jetbrains.", "org.intellij."
    );

    // --- Excluded package -> tag mapping (for internal-index.json) ---
    private static final Map<String, String> EXCLUDED_TAGS = Map.of(
        "com.hypixel.hytale.builtin.", "builtin",
        "com.hypixel.hytale.protocol.packets.", "protocol",
        "com.hypixel.hytale.protocol.io.", "protocol",
        "com.hypixel.hytale.procedurallib.", "procedural"
    );

    // --- Seed types by tier ---
    private static final Map<String, String> TIER1_SEEDS = Map.of(
        "com.hypixel.hytale.server.core.plugin.JavaPlugin", "seed:tier1",
        "com.hypixel.hytale.server.core.plugin.JavaPluginInit", "seed:tier1",
        "com.hypixel.hytale.server.core.plugin.PluginBase", "seed:tier1",
        "com.hypixel.hytale.common.plugin.PluginManifest", "seed:tier1",
        "com.hypixel.hytale.server.core.plugin.PluginManager", "seed:tier1",
        "com.hypixel.hytale.server.core.plugin.PluginState", "seed:tier1",
        "com.hypixel.hytale.common.plugin.PluginIdentifier", "seed:tier1"
    );

    private static final Map<String, String> TIER2_SEEDS = new LinkedHashMap<>();
    static {
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.command.system.CommandRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.plugin.registry.AssetRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.plugin.registry.CodecMapRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.plugin.registry.MapKeyMapRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.command.system.CommandManager", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.event.EventRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.event.IEventBus", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.universe.world.meta.BlockStateRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.modules.entity.EntityRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.task.TaskRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.registry.ClientFeatureRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.plugin.registry.IRegistry", "seed:tier2");
        TIER2_SEEDS.put("com.hypixel.hytale.server.core.plugin.registry.CodecMapRegistry.Assets", "seed:tier2");
    }

    private static final Map<String, String> TIER3_SEEDS = new LinkedHashMap<>();
    static {
        TIER3_SEEDS.put("com.hypixel.hytale.event.IEvent", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.event.IAsyncEvent", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.event.IBaseEvent", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.event.ICancellable", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.event.EventPriority", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.event.EventRegistration", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.component.ComponentType", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.component.ComponentAccessor", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.component.SystemType", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.component.SystemGroup", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.component.Resource", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.registry.Registry", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.registry.Registration", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.server.core.command.system.CommandContext", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.server.core.command.system.CommandOwner", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.server.core.command.system.CommandSender", "seed:tier3");
        TIER3_SEEDS.put("com.hypixel.hytale.component.ComponentRegistryProxy", "seed:tier3");
    }

    // Category assignment by package prefix (order matters — more specific first)
    private static final List<Map.Entry<String, String>> CATEGORY_RULES = List.of(
        Map.entry("com.hypixel.hytale.server.core.plugin", "plugin"),
        Map.entry("com.hypixel.hytale.common.plugin", "plugin"),
        Map.entry("com.hypixel.hytale.server.core.event", "event"),
        Map.entry("com.hypixel.hytale.event", "event"),
        Map.entry("com.hypixel.hytale.server.core.command", "command"),
        Map.entry("com.hypixel.hytale.component", "component"),
        Map.entry("com.hypixel.hytale.server.core.modules.entity", "entity"),
        Map.entry("com.hypixel.hytale.server.core.entity", "entity"),
        Map.entry("com.hypixel.hytale.server.npc", "npc"),
        Map.entry("com.hypixel.hytale.registry", "registry"),
        Map.entry("com.hypixel.hytale.server.core.registry", "registry"),
        Map.entry("com.hypixel.hytale.server.core.asset", "asset"),
        Map.entry("com.hypixel.hytale.assetstore", "asset"),
        Map.entry("com.hypixel.hytale.codec", "codec"),
        Map.entry("com.hypixel.hytale.server.core.inventory", "inventory"),
        Map.entry("com.hypixel.hytale.server.core.universe", "universe"),
        Map.entry("com.hypixel.hytale.server.worldgen", "worldgen"),
        Map.entry("com.hypixel.hytale.server.core.prefab", "prefab"),
        Map.entry("com.hypixel.hytale.server.core.permissions", "permissions"),
        Map.entry("com.hypixel.hytale.server.core.ui", "ui"),
        Map.entry("com.hypixel.hytale.server.core.task", "task"),
        Map.entry("com.hypixel.hytale.server.core.modules", "modules"),
        Map.entry("com.hypixel.hytale.server.core.meta", "meta"),
        Map.entry("com.hypixel.hytale.math", "math"),
        Map.entry("com.hypixel.hytale.function", "util"),
        Map.entry("com.hypixel.hytale.common", "util"),
        Map.entry("com.hypixel.hytale.metrics", "metrics"),
        Map.entry("com.hypixel.hytale.logger", "logging"),
        Map.entry("com.hypixel.hytale.server.core.util", "util"),
        Map.entry("com.hypixel.hytale.server.core.io", "io"),
        Map.entry("com.hypixel.hytale.protocol", "protocol"),
        Map.entry("com.hypixel.hytale.server.core", "core")
    );

    // --- State ---
    private final Map<String, ClassIndexer.ClassEntry> fqcnToEntry = new HashMap<>();
    private final Map<String, List<String>> simpleNameToFqcns = new HashMap<>();
    private final Map<String, SurfaceType> apiSurface = new LinkedHashMap<>();
    private final List<BorderlineCase> borderlineCases = new ArrayList<>();
    private final List<String> allSeedFqcns = new ArrayList<>();
    // Maps FQCN -> set of imported FQCNs (extracted from decompiled source files)
    private final Map<String, Set<String>> importMap = new HashMap<>();

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: surface-classifier <path-to-class-index.json>");
            System.exit(1);
        }

        Path indexPath = Path.of(args[0]).toAbsolutePath();
        if (!Files.isRegularFile(indexPath)) {
            System.err.println("ERROR: File not found: " + indexPath);
            System.exit(1);
        }

        Path artifactsDir = indexPath.getParent();

        try {
            SurfaceClassifier classifier = new SurfaceClassifier();
            classifier.run(indexPath, artifactsDir);
        } catch (Exception e) {
            System.err.println("FATAL: " + e.getMessage());
            e.printStackTrace();
            System.exit(2);
        }
    }

    public void run(Path indexPath, Path outputDir) throws IOException {
        System.out.println("=== Phase 2: Classify API Surface ===");
        System.out.println("Loading class-index.json...");

        Path decompiledDir = outputDir.resolve("decompiled");

        // Load index
        Gson gson = new GsonBuilder().create();
        ClassIndexer.ClassIndex index;
        try (Reader reader = Files.newBufferedReader(indexPath)) {
            index = gson.fromJson(reader, ClassIndexer.ClassIndex.class);
        }

        System.out.println("Loaded " + index.classes.size() + " types");

        // Build lookup maps
        buildLookupMaps(index.classes);

        // Build import map from decompiled source files for accurate type resolution
        buildImportMap(index.classes, decompiledDir);

        // Collect all seeds
        Map<String, String> allSeeds = new LinkedHashMap<>();
        allSeeds.putAll(TIER1_SEEDS);
        allSeeds.putAll(TIER2_SEEDS);
        allSeeds.putAll(TIER3_SEEDS);

        // Tier 4: all types in event packages
        for (ClassIndexer.ClassEntry entry : index.classes) {
            if (entry.package_ != null && (
                    entry.package_.equals("com.hypixel.hytale.server.core.event") ||
                    entry.package_.startsWith("com.hypixel.hytale.server.core.event.") ||
                    entry.package_.equals("com.hypixel.hytale.event") ||
                    entry.package_.startsWith("com.hypixel.hytale.event."))) {
                allSeeds.putIfAbsent(entry.fqcn, "seed:tier4");
            }
        }

        // Validate seeds
        int validSeeds = 0;
        for (Map.Entry<String, String> seed : allSeeds.entrySet()) {
            if (fqcnToEntry.containsKey(seed.getKey())) {
                validSeeds++;
                allSeedFqcns.add(seed.getKey());
            } else {
                System.err.println("WARN: Seed type not found in index: " + seed.getKey());
            }
        }
        System.out.println("Seeds: " + validSeeds + "/" + allSeeds.size() + " resolved");

        // BFS expansion
        System.out.println("Expanding API surface...");
        expand(allSeeds);

        System.out.println("API surface (pre-dedup): " + apiSurface.size() + " types");

        // Remove protocol types that duplicate a non-protocol type already in the surface
        int removed = deduplicateProtocolTypes();
        if (removed > 0) {
            System.out.println("Removed " + removed + " redundant protocol duplicates");
        }

        System.out.println("API surface: " + apiSurface.size() + " types");
        System.out.println("Borderline cases: " + borderlineCases.size());

        // Build internal index (everything not in API surface)
        List<InternalType> internalTypes = new ArrayList<>();
        for (ClassIndexer.ClassEntry entry : index.classes) {
            if (!apiSurface.containsKey(entry.fqcn)) {
                InternalType it = new InternalType();
                it.fqcn = entry.fqcn;
                it.tag = tagForPackage(entry.fqcn);
                internalTypes.add(it);
            }
        }
        System.out.println("Internal types: " + internalTypes.size());

        // Write outputs
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
        String timestamp = DateTimeFormatter.ISO_INSTANT.format(Instant.now().atOffset(ZoneOffset.UTC));

        writeSurfaceJson(prettyGson, outputDir, timestamp);
        writeInternalJson(prettyGson, outputDir, timestamp, internalTypes);
        writeReviewJson(prettyGson, outputDir, timestamp);

        System.out.println();
        System.out.println("=== Phase 2 complete ===");
        System.out.println("  API surface:    " + outputDir.resolve("surface.json"));
        System.out.println("  Internal index: " + outputDir.resolve("internal-index.json"));
        System.out.println("  Review cases:   " + outputDir.resolve("surface-review.json"));

        // Print category breakdown
        Map<String, Integer> categoryCount = new TreeMap<>();
        for (SurfaceType st : apiSurface.values()) {
            categoryCount.merge(st.category, 1, Integer::sum);
        }
        System.out.println();
        System.out.println("Category breakdown:");
        for (Map.Entry<String, Integer> e : categoryCount.entrySet()) {
            System.out.printf("  %-15s %d%n", e.getKey(), e.getValue());
        }
    }

    private void buildLookupMaps(List<ClassIndexer.ClassEntry> classes) {
        for (ClassIndexer.ClassEntry entry : classes) {
            fqcnToEntry.put(entry.fqcn, entry);
            simpleNameToFqcns
                .computeIfAbsent(entry.name, k -> new ArrayList<>())
                .add(entry.fqcn);
        }
        System.out.println("Built lookup maps: " + fqcnToEntry.size() + " entries, "
            + simpleNameToFqcns.size() + " unique simple names");
    }

    /**
     * Build a map of FQCN -> imported FQCNs by reading import statements from decompiled source.
     * This allows accurate disambiguation of simple type names.
     */
    private void buildImportMap(List<ClassIndexer.ClassEntry> classes, Path decompiledDir) {
        int loaded = 0;
        for (ClassIndexer.ClassEntry entry : classes) {
            if (entry.source_file == null) continue;
            // source_file is relative to artifacts/ parent, like "decompiled/com/hypixel/..."
            // The decompiled dir is artifacts/decompiled, so strip the "decompiled/" prefix
            String relPath = entry.source_file;
            if (relPath.startsWith("decompiled/")) {
                relPath = relPath.substring("decompiled/".length());
            }
            Path sourceFile = decompiledDir.resolve(relPath);
            if (!Files.isRegularFile(sourceFile)) continue;

            Set<String> imports = new HashSet<>();
            try {
                List<String> lines = Files.readAllLines(sourceFile);
                for (String line : lines) {
                    String trimmed = line.trim();
                    if (trimmed.startsWith("import ") && trimmed.endsWith(";")) {
                        String importStr = trimmed.substring(7, trimmed.length() - 1).trim();
                        if (importStr.startsWith("static ")) continue; // skip static imports
                        imports.add(importStr);
                    }
                    // Stop at class/interface/enum declaration (optimization)
                    if (trimmed.startsWith("public ") || trimmed.startsWith("abstract ")
                            || trimmed.startsWith("final ") || trimmed.startsWith("sealed ")
                            || trimmed.startsWith("class ") || trimmed.startsWith("interface ")
                            || trimmed.startsWith("enum ") || trimmed.startsWith("record ")) {
                        break;
                    }
                }
            } catch (IOException e) {
                // Skip files that can't be read
                continue;
            }

            importMap.put(entry.fqcn, imports);
            loaded++;
        }
        System.out.println("Built import map: " + loaded + " source files scanned");
    }

    private void expand(Map<String, String> allSeeds) {
        // BFS frontier: FQCN -> (inclusion_reason, expansion_path)
        Deque<ExpansionItem> frontier = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();

        // Seed the frontier
        for (Map.Entry<String, String> seed : allSeeds.entrySet()) {
            String fqcn = seed.getKey();
            if (fqcnToEntry.containsKey(fqcn)) {
                frontier.add(new ExpansionItem(fqcn, seed.getValue(), List.of()));
            }
        }

        while (!frontier.isEmpty()) {
            ExpansionItem item = frontier.poll();
            if (visited.contains(item.fqcn)) continue;
            visited.add(item.fqcn);

            // Skip external types
            if (isExternal(item.fqcn)) continue;

            // Check excluded packages
            if (isExcludedPackage(item.fqcn)) {
                // Record as borderline if reachable from API
                if (!item.expansionPath.isEmpty()) {
                    BorderlineCase bc = new BorderlineCase();
                    bc.fqcn = item.fqcn;
                    bc.reason = "Reachable from API via " + String.join(" -> ", item.expansionPath)
                        + " but lives in excluded package";
                    bc.recommendation = "exclude";
                    bc.confidence = "high";
                    borderlineCases.add(bc);
                }
                continue;
            }

            ClassIndexer.ClassEntry entry = fqcnToEntry.get(item.fqcn);
            if (entry == null) continue;

            // Add to API surface
            SurfaceType st = new SurfaceType();
            st.fqcn = item.fqcn;
            st.inclusion_reason = item.reason;
            st.expansion_path = item.expansionPath;
            st.category = categorize(item.fqcn);
            apiSurface.put(item.fqcn, st);

            // Expand: extract all referenced types from public/protected members
            Set<String> referencedSimpleNames = new LinkedHashSet<>();

            // Superclass
            if (entry.superclass != null && !entry.superclass.equals("java.lang.Object")
                    && !entry.superclass.equals("java.lang.Enum")
                    && !entry.superclass.equals("java.lang.Record")) {
                extractTypeNames(entry.superclass, referencedSimpleNames);
            }

            // Interfaces
            if (entry.interfaces != null) {
                for (String iface : entry.interfaces) {
                    extractTypeNames(iface, referencedSimpleNames);
                }
            }

            // Annotations
            if (entry.annotations != null) {
                for (String ann : entry.annotations) {
                    referencedSimpleNames.add(ann);
                }
            }

            // Public/protected methods
            if (entry.methods != null) {
                for (ClassIndexer.MethodEntry method : entry.methods) {
                    if (!isPublicOrProtected(method.modifiers)) continue;
                    extractTypeNames(method.return_type, referencedSimpleNames);
                    if (method.parameters != null) {
                        for (ClassIndexer.ParameterEntry param : method.parameters) {
                            extractTypeNames(param.type, referencedSimpleNames);
                        }
                    }
                    if (method.throws_ != null) {
                        for (String thrown : method.throws_) {
                            extractTypeNames(thrown, referencedSimpleNames);
                        }
                    }
                }
            }

            // Public/protected fields
            if (entry.fields != null) {
                for (ClassIndexer.FieldEntry field : entry.fields) {
                    if (!isPublicOrProtected(field.modifiers)) continue;
                    extractTypeNames(field.type, referencedSimpleNames);
                }
            }

            // Resolve simple names to FQCNs and add to frontier
            for (String simpleName : referencedSimpleNames) {
                List<String> resolved = resolveSimpleName(simpleName, entry);
                for (String resolvedFqcn : resolved) {
                    if (!visited.contains(resolvedFqcn)) {
                        List<String> newPath = new ArrayList<>(item.expansionPath);
                        newPath.add(item.fqcn);
                        String reason = item.expansionPath.isEmpty() ? "expansion" : "expansion";
                        frontier.add(new ExpansionItem(resolvedFqcn, reason, newPath));
                    }
                }
            }
        }
    }

    /**
     * After BFS expansion, remove protocol types from the surface when a non-protocol
     * type with the same simple name already exists. These are wire-format DTO copies
     * (e.g., protocol.BlockType duplicates server.core.asset.type.blocktype.config.BlockType).
     * The server-side type is the canonical definition for plugin developers.
     *
     * Protocol types that are the ONLY definition of a concept (no server-side equivalent)
     * are kept — they're legitimate API surface.
     */
    private int deduplicateProtocolTypes() {
        String protocolPrefix = "com.hypixel.hytale.protocol.";
        List<String> toRemove = new ArrayList<>();

        for (SurfaceType st : apiSurface.values()) {
            if (!st.fqcn.startsWith(protocolPrefix)) continue;

            // Get the simple name
            ClassIndexer.ClassEntry entry = fqcnToEntry.get(st.fqcn);
            if (entry == null) continue;
            String simpleName = entry.name;

            // Check if a non-protocol type with the same simple name is in the surface
            boolean hasDuplicate = false;
            for (SurfaceType other : apiSurface.values()) {
                if (other.fqcn.startsWith(protocolPrefix)) continue;
                ClassIndexer.ClassEntry otherEntry = fqcnToEntry.get(other.fqcn);
                if (otherEntry != null && otherEntry.name.equals(simpleName)) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (hasDuplicate) {
                toRemove.add(st.fqcn);
            }
        }

        for (String fqcn : toRemove) {
            apiSurface.remove(fqcn);
        }
        return toRemove.size();
    }

    /**
     * Determines if a method/field modifier list indicates public or protected visibility.
     * In the class-index, methods/fields without explicit access modifiers are package-private.
     * Interface methods default to public even without the keyword.
     */
    private boolean isPublicOrProtected(List<String> modifiers) {
        if (modifiers == null) return false;
        for (String mod : modifiers) {
            if (mod.equals("public") || mod.equals("protected")) return true;
            if (mod.equals("private")) return false;
        }
        // No explicit access modifier. In the decompiled output, Vineflower typically
        // includes explicit modifiers. For interface methods, "default" or "abstract"
        // without access modifier implies public.
        // We treat no-modifier as package-private (not followed), except for interfaces.
        return modifiers.contains("default") || modifiers.contains("abstract");
    }

    /**
     * Extract all type names from a type string, handling generics.
     * E.g., "Map<String, List<CommandContext>>" -> {Map, String, List, CommandContext}
     * Skips: single-char type params (T, R, E), wildcards (?), primitives, void
     */
    static void extractTypeNames(String typeStr, Set<String> out) {
        if (typeStr == null || typeStr.isEmpty()) return;

        StringBuilder current = new StringBuilder();
        for (int i = 0; i < typeStr.length(); i++) {
            char c = typeStr.charAt(i);
            if (c == '<' || c == '>' || c == ',' || c == ' ' || c == '[' || c == ']') {
                flushTypeName(current, out);
            } else if (c == '?') {
                // Wildcard — skip, but "extends"/"super" keyword will be handled
                flushTypeName(current, out);
            } else {
                current.append(c);
            }
        }
        flushTypeName(current, out);
    }

    private static void flushTypeName(StringBuilder sb, Set<String> out) {
        if (sb.isEmpty()) return;
        String name = sb.toString().trim();
        sb.setLength(0);

        // Skip keywords, primitives, single-char type parameters
        if (name.isEmpty()) return;
        if (name.equals("extends") || name.equals("super")) return;
        if (name.equals("void") || name.equals("boolean") || name.equals("byte")
                || name.equals("short") || name.equals("int") || name.equals("long")
                || name.equals("float") || name.equals("double") || name.equals("char")) return;
        if (name.length() == 1 && Character.isUpperCase(name.charAt(0))) return; // T, R, E, etc.

        // Handle dotted names like "CodecMapRegistry.Assets" — keep both parts
        if (name.contains(".")) {
            // Could be a FQCN-like reference or inner class reference
            // Add the full name and the first part
            out.add(name);
            out.add(name.substring(0, name.indexOf('.')));
        } else {
            out.add(name);
        }
    }

    /**
     * Resolve a simple type name to FQCN(s) using the lookup map.
     * Uses package proximity for disambiguation.
     */
    private List<String> resolveSimpleName(String simpleName, ClassIndexer.ClassEntry context) {
        // If it looks like a FQCN already (contains dots and starts with com.)
        if (simpleName.contains(".") && simpleName.startsWith("com.")) {
            if (fqcnToEntry.containsKey(simpleName)) {
                return List.of(simpleName);
            }
            return List.of();
        }

        // Handle inner class references like "CodecMapRegistry.Assets"
        if (simpleName.contains(".")) {
            String outerName = simpleName.substring(0, simpleName.indexOf('.'));
            String innerName = simpleName.substring(simpleName.indexOf('.') + 1);
            List<String> outerFqcns = resolveSimpleName(outerName, context);
            List<String> results = new ArrayList<>();
            for (String outerFqcn : outerFqcns) {
                String innerFqcn = outerFqcn + "." + innerName;
                if (fqcnToEntry.containsKey(innerFqcn)) {
                    results.add(innerFqcn);
                }
            }
            return results;
        }

        List<String> candidates = simpleNameToFqcns.get(simpleName);
        if (candidates == null || candidates.isEmpty()) return List.of();

        // Single match — but check if it's an inner class being matched by an unqualified name.
        // E.g., "Function" in source means java.util.function.Function (external, not in index),
        // but would spuriously match Scope.Function (an inner class). If the only candidate
        // is an inner class and we're using a bare name, it's likely an external type.
        if (candidates.size() == 1) {
            if (isInnerClass(candidates.get(0))) {
                return List.of(); // Bare name doesn't match inner classes
            }
            return candidates;
        }

        // Multiple matches — use heuristics

        // 0. Check import statements (most accurate)
        // For inner classes, also check the outer class's imports
        Set<String> imports = getEffectiveImports(context);
        if (imports != null && !imports.isEmpty()) {
            List<String> imported = new ArrayList<>();
            for (String candidate : candidates) {
                // Direct import match
                if (imports.contains(candidate)) {
                    imported.add(candidate);
                    continue;
                }
                // Inner class of an imported type (handles scope inheritance)
                // E.g., BuilderCodec.BuilderBase matched when BuilderCodec is imported
                int lastDot = candidate.lastIndexOf('.');
                while (lastDot > 0) {
                    String parent = candidate.substring(0, lastDot);
                    if (imports.contains(parent)) {
                        imported.add(candidate);
                        break;
                    }
                    lastDot = parent.lastIndexOf('.');
                }
            }
            if (imported.size() == 1) return imported;
            if (!imported.isEmpty()) return imported;
        }

        // 1. Prefer same package
        String contextPackage = context.package_;
        for (String candidate : candidates) {
            ClassIndexer.ClassEntry ce = fqcnToEntry.get(candidate);
            if (ce != null && ce.package_ != null && ce.package_.equals(contextPackage)) {
                return List.of(candidate);
            }
        }

        // 2. Prefer non-excluded package types
        List<String> pool = candidates;
        List<String> nonExcluded = new ArrayList<>();
        for (String candidate : pool) {
            if (!isExcludedPackage(candidate) && !isExternal(candidate)) {
                nonExcluded.add(candidate);
            }
        }
        if (nonExcluded.size() == 1) return nonExcluded;

        // 4. Prefer types from the same top-level package hierarchy
        if (contextPackage != null) {
            String topPackage = getTopLevelPackage(contextPackage);
            List<String> sameTopLevel = new ArrayList<>();
            for (String candidate : nonExcluded.isEmpty() ? pool : nonExcluded) {
                ClassIndexer.ClassEntry ce = fqcnToEntry.get(candidate);
                if (ce != null && ce.package_ != null && getTopLevelPackage(ce.package_).equals(topPackage)) {
                    sameTopLevel.add(candidate);
                }
            }
            if (sameTopLevel.size() == 1) return sameTopLevel;
            if (!sameTopLevel.isEmpty()) return sameTopLevel;
        }

        // 5. Return all non-excluded candidates (prefer false positives)
        return nonExcluded.isEmpty() ? pool : nonExcluded;
    }

    /**
     * Get effective imports for a class. For inner classes, the imports come from
     * the compilation unit (the outer class's source file) since Java shares imports.
     */
    private Set<String> getEffectiveImports(ClassIndexer.ClassEntry context) {
        // Inner classes share the source file with their outermost class.
        // The import map is keyed by FQCN, so for inner classes we need
        // to look up the outermost enclosing class.
        String lookupFqcn = context.fqcn;
        if (isInnerClass(lookupFqcn)) {
            // Walk up to the outermost class
            while (true) {
                int lastDot = lookupFqcn.lastIndexOf('.');
                if (lastDot < 0) break;
                String candidate = lookupFqcn.substring(0, lastDot);
                ClassIndexer.ClassEntry ce = fqcnToEntry.get(candidate);
                if (ce != null && !isInnerClass(candidate)) {
                    lookupFqcn = candidate;
                    break;
                }
                if (ce == null) break; // reached the package level
                lookupFqcn = candidate;
            }
        }
        return importMap.get(lookupFqcn);
    }

    /**
     * Check if a FQCN represents an inner class. In the index, inner classes
     * have FQCNs like "com.foo.Outer.Inner" where "Outer" is a class name
     * (starts with uppercase) in the FQCN path.
     */
    private boolean isInnerClass(String fqcn) {
        ClassIndexer.ClassEntry entry = fqcnToEntry.get(fqcn);
        if (entry == null) return false;
        // If the FQCN has more segments after the package than just the class name,
        // it's an inner class. Compare package + "." + name vs fqcn.
        String expected = entry.package_.isEmpty() ? entry.name : entry.package_ + "." + entry.name;
        return !fqcn.equals(expected);
    }

    private static String getTopLevelPackage(String pkg) {
        // Extract top 4 segments: com.hypixel.hytale.server or com.hypixel.hytale.event etc.
        String[] parts = pkg.split("\\.");
        int depth = Math.min(4, parts.length);
        return String.join(".", Arrays.copyOf(parts, depth));
    }

    private static boolean isExternal(String fqcn) {
        for (String prefix : EXTERNAL_PREFIXES) {
            if (fqcn.startsWith(prefix)) return true;
        }
        return false;
    }

    private static boolean isExcludedPackage(String fqcn) {
        for (String prefix : EXCLUDED_PACKAGES) {
            if (fqcn.startsWith(prefix)) return true;
        }
        return false;
    }

    private static String tagForPackage(String fqcn) {
        for (Map.Entry<String, String> entry : EXCLUDED_TAGS.entrySet()) {
            if (fqcn.startsWith(entry.getKey())) return entry.getValue();
        }
        // Root protocol types not reached by expansion still get tagged as protocol
        if (fqcn.startsWith("com.hypixel.hytale.protocol.")) return "protocol";
        return "internal";
    }

    private static String categorize(String fqcn) {
        for (Map.Entry<String, String> rule : CATEGORY_RULES) {
            if (fqcn.startsWith(rule.getKey())) return rule.getValue();
        }
        return "core";
    }

    // --- Output writing ---

    private void writeSurfaceJson(Gson gson, Path outputDir, String timestamp) throws IOException {
        SurfaceOutput output = new SurfaceOutput();
        output.version = "1.0.0";
        output.generated_at = timestamp;
        output.total_api_types = apiSurface.size();
        output.seed_types = allSeedFqcns;
        output.types = new ArrayList<>(apiSurface.values());
        Files.writeString(outputDir.resolve("surface.json"), gson.toJson(output));
    }

    private void writeInternalJson(Gson gson, Path outputDir, String timestamp,
                                    List<InternalType> internalTypes) throws IOException {
        InternalOutput output = new InternalOutput();
        output.version = "1.0.0";
        output.generated_at = timestamp;
        output.total_internal_types = internalTypes.size();
        output.types = internalTypes;
        Files.writeString(outputDir.resolve("internal-index.json"), gson.toJson(output));
    }

    private void writeReviewJson(Gson gson, Path outputDir, String timestamp) throws IOException {
        ReviewOutput output = new ReviewOutput();
        output.version = "1.0.0";
        output.generated_at = timestamp;
        output.borderline_cases = borderlineCases;
        Files.writeString(outputDir.resolve("surface-review.json"), gson.toJson(output));
    }

    // --- Record types for BFS ---

    private record ExpansionItem(String fqcn, String reason, List<String> expansionPath) {}

    // --- JSON output model classes ---

    static class SurfaceOutput {
        String version;
        String generated_at;
        int total_api_types;
        List<String> seed_types;
        List<SurfaceType> types;
    }

    static class SurfaceType {
        String fqcn;
        String inclusion_reason;
        List<String> expansion_path;
        String category;
    }

    static class InternalOutput {
        String version;
        String generated_at;
        int total_internal_types;
        List<InternalType> types;
    }

    static class InternalType {
        String fqcn;
        String tag;
    }

    static class ReviewOutput {
        String version;
        String generated_at;
        List<BorderlineCase> borderline_cases;
    }

    static class BorderlineCase {
        String fqcn;
        String reason;
        String recommendation;
        String confidence;
    }
}
