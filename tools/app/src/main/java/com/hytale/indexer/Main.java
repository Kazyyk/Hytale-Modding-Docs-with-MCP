package com.hytale.indexer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HexFormat;

/**
 * CLI entry point for the Hytale JAR indexer.
 *
 * Usage: java -jar hytale-indexer.jar <path-to-jar> [branch]
 *
 * Performs two steps:
 * 1. Decompiles the JAR using Vineflower to artifacts/{branch}/decompiled/
 * 2. Parses the decompiled source with JavaParser to produce artifacts/{branch}/class-index.json
 *
 * If branch is omitted, outputs directly to artifacts/ (legacy behavior).
 */
public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: hytale-indexer <path-to-jar> [branch]");
            System.err.println("  <path-to-jar>  Path to the HytaleServer.jar file");
            System.err.println("  [branch]       Branch name (stable, pre-release). Omit for legacy paths.");
            System.exit(1);
        }

        Path jarPath = Path.of(args[0]).toAbsolutePath();
        if (!Files.isRegularFile(jarPath)) {
            System.err.println("ERROR: File not found: " + jarPath);
            System.exit(1);
        }

        if (!jarPath.toString().endsWith(".jar")) {
            System.err.println("ERROR: Expected a .jar file, got: " + jarPath.getFileName());
            System.exit(1);
        }

        String branch = args.length >= 2 ? args[1] : null;

        // Resolve project root (two levels up from tools/app/)
        Path projectRoot = resolveProjectRoot(jarPath);
        Path artifactsDir = branch != null
            ? projectRoot.resolve("artifacts").resolve(branch)
            : projectRoot.resolve("artifacts");
        Path decompiledDir = artifactsDir.resolve("decompiled");
        Path classIndexPath = artifactsDir.resolve("class-index.json");

        try {
            // Compute JAR hash for change detection
            String jarHash = computeSha256(jarPath);
            System.out.println("JAR SHA-256: " + jarHash);

            // Step 1: Decompile
            System.out.println();
            System.out.println("=== Phase 1a: Decompiling JAR with Vineflower ===");
            Decompiler decompiler = new Decompiler();
            decompiler.decompile(jarPath, decompiledDir);

            // Step 2: Parse and index
            System.out.println();
            System.out.println("=== Phase 1b: Parsing decompiled source with JavaParser ===");
            ClassIndexer indexer = new ClassIndexer();
            indexer.index(decompiledDir, classIndexPath, jarHash);

            System.out.println();
            System.out.println("=== Phase 1 complete ===");
            System.out.println("  Decompiled source: " + decompiledDir);
            System.out.println("  Class index:       " + classIndexPath);

        } catch (Exception e) {
            System.err.println("FATAL: " + e.getMessage());
            e.printStackTrace();
            System.exit(2);
        }
    }

    /**
     * Resolve the project root directory. Walks up from the JAR path looking
     * for a parent named "input" (handles both input/X.jar and input/branch/X.jar).
     */
    private static Path resolveProjectRoot(Path jarPath) {
        Path current = jarPath.getParent();
        while (current != null && current.getFileName() != null) {
            if (current.getFileName().toString().equals("input")) {
                return current.getParent();
            }
            current = current.getParent();
        }
        // Fallback: current working directory
        return Path.of("").toAbsolutePath();
    }

    static String computeSha256(Path file) throws IOException, NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = Files.readAllBytes(file);
        byte[] hash = digest.digest(bytes);
        return "sha256:" + HexFormat.of().formatHex(hash);
    }
}
