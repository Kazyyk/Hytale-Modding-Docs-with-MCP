package com.hytale.indexer;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseResult;
import com.github.javaparser.ParserConfiguration;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.*;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.type.ReferenceType;
import com.github.javaparser.ast.type.TypeParameter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Walks a directory of decompiled .java files, parses each with JavaParser,
 * and produces a structured class-index.json per the spec schema.
 */
public class ClassIndexer {

    private final JavaParser parser;
    private final Gson gson;
    private final AtomicInteger successCount = new AtomicInteger(0);
    private final AtomicInteger errorCount = new AtomicInteger(0);

    public ClassIndexer() {
        ParserConfiguration config = new ParserConfiguration();
        config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_21);
        this.parser = new JavaParser(config);
        this.gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    }

    /**
     * Parse all .java files under decompiledDir and write class-index.json.
     */
    public void index(Path decompiledDir, Path outputPath, String jarHash) throws IOException {
        if (!Files.isDirectory(decompiledDir)) {
            throw new IOException("Decompiled directory not found: " + decompiledDir);
        }

        List<ClassEntry> classes = new ArrayList<>();

        // Walk all .java files
        List<Path> javaFiles = new ArrayList<>();
        Files.walkFileTree(decompiledDir, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (file.toString().endsWith(".java")) {
                    javaFiles.add(file);
                }
                return FileVisitResult.CONTINUE;
            }
        });

        System.out.println("Found " + javaFiles.size() + " .java files to parse");

        for (Path javaFile : javaFiles) {
            try {
                parseFile(javaFile, decompiledDir, classes);
                successCount.incrementAndGet();
            } catch (Exception e) {
                errorCount.incrementAndGet();
                System.err.println("WARN: Failed to parse " + javaFile + ": " + e.getMessage());
            }
        }

        // Build the index
        ClassIndex index = new ClassIndex();
        index.version = "1.0.0";
        index.jar_hash = jarHash;
        index.generated_at = DateTimeFormatter.ISO_INSTANT.format(Instant.now().atOffset(ZoneOffset.UTC));
        index.classes = classes;

        // Write JSON
        Files.createDirectories(outputPath.getParent());
        Files.writeString(outputPath, gson.toJson(index));

        System.out.println("Parsed " + successCount.get() + " files successfully, "
            + errorCount.get() + " errors");
        System.out.println("Indexed " + classes.size() + " types");
        System.out.println("Written to: " + outputPath);
    }

    private void parseFile(Path javaFile, Path decompiledDir, List<ClassEntry> classes) {
        ParseResult<CompilationUnit> result;
        try {
            result = parser.parse(javaFile);
        } catch (IOException e) {
            throw new RuntimeException("Cannot read file: " + e.getMessage(), e);
        }

        if (!result.isSuccessful() || result.getResult().isEmpty()) {
            String problems = result.getProblems().stream()
                .map(p -> p.getVerboseMessage())
                .collect(Collectors.joining("; "));
            throw new RuntimeException("Parse failed: " + problems);
        }

        CompilationUnit cu = result.getResult().get();
        String packageName = cu.getPackageDeclaration()
            .map(pd -> pd.getNameAsString())
            .orElse("");

        String sourceFile = decompiledDir.getParent().relativize(javaFile).toString();

        // Process all type declarations in the file
        for (TypeDeclaration<?> type : cu.getTypes()) {
            processType(type, packageName, sourceFile, classes, null);
        }
    }

    private void processType(TypeDeclaration<?> type, String packageName,
                             String sourceFile, List<ClassEntry> classes,
                             String enclosingFqcn) {
        ClassEntry entry = new ClassEntry();

        entry.name = type.getNameAsString();
        entry.package_ = packageName;
        entry.fqcn = enclosingFqcn != null
            ? enclosingFqcn + "." + entry.name
            : (packageName.isEmpty() ? entry.name : packageName + "." + entry.name);
        entry.source_file = sourceFile;

        // Determine kind
        entry.kind = determineKind(type);

        // Modifiers
        entry.modifiers = type.getModifiers().stream()
            .map(m -> m.getKeyword().asString())
            .collect(Collectors.toList());

        // Annotations
        entry.annotations = type.getAnnotations().stream()
            .map(AnnotationExpr::getNameAsString)
            .collect(Collectors.toList());

        // Superclass and interfaces (only for ClassOrInterfaceDeclaration)
        if (type instanceof ClassOrInterfaceDeclaration cid) {
            entry.superclass = cid.getExtendedTypes().stream()
                .findFirst()
                .map(ClassOrInterfaceType::getNameAsString)
                .orElse("java.lang.Object");

            entry.interfaces = cid.getImplementedTypes().stream()
                .map(ClassOrInterfaceType::getNameAsString)
                .collect(Collectors.toList());

            entry.type_parameters = cid.getTypeParameters().stream()
                .map(TypeParameter::getNameAsString)
                .collect(Collectors.toList());

            // For interfaces, the "extends" are actually the parent interfaces
            if (cid.isInterface()) {
                entry.superclass = null;
                entry.interfaces = cid.getExtendedTypes().stream()
                    .map(ClassOrInterfaceType::getNameAsString)
                    .collect(Collectors.toList());
            }
        } else if (type instanceof EnumDeclaration ed) {
            entry.superclass = "java.lang.Enum";
            entry.interfaces = ed.getImplementedTypes().stream()
                .map(ClassOrInterfaceType::getNameAsString)
                .collect(Collectors.toList());
            entry.type_parameters = List.of();
        } else if (type instanceof RecordDeclaration rd) {
            entry.superclass = "java.lang.Record";
            entry.interfaces = rd.getImplementedTypes().stream()
                .map(ClassOrInterfaceType::getNameAsString)
                .collect(Collectors.toList());
            entry.type_parameters = rd.getTypeParameters().stream()
                .map(TypeParameter::getNameAsString)
                .collect(Collectors.toList());
        } else {
            entry.superclass = "java.lang.Object";
            entry.interfaces = List.of();
            entry.type_parameters = List.of();
        }

        // Fields
        entry.fields = new ArrayList<>();
        for (FieldDeclaration field : type.getFields()) {
            for (VariableDeclarator var : field.getVariables()) {
                FieldEntry fe = new FieldEntry();
                fe.name = var.getNameAsString();
                fe.type = var.getTypeAsString();
                fe.modifiers = field.getModifiers().stream()
                    .map(m -> m.getKeyword().asString())
                    .collect(Collectors.toList());
                fe.annotations = field.getAnnotations().stream()
                    .map(AnnotationExpr::getNameAsString)
                    .collect(Collectors.toList());
                entry.fields.add(fe);
            }
        }

        // Methods
        entry.methods = new ArrayList<>();
        for (MethodDeclaration method : type.getMethods()) {
            MethodEntry me = new MethodEntry();
            me.name = method.getNameAsString();
            me.return_type = method.getTypeAsString();
            me.modifiers = method.getModifiers().stream()
                .map(m -> m.getKeyword().asString())
                .collect(Collectors.toList());
            me.annotations = method.getAnnotations().stream()
                .map(AnnotationExpr::getNameAsString)
                .collect(Collectors.toList());
            me.throws_ = method.getThrownExceptions().stream()
                .map(ReferenceType::asString)
                .collect(Collectors.toList());

            me.parameters = new ArrayList<>();
            for (Parameter param : method.getParameters()) {
                ParameterEntry pe = new ParameterEntry();
                pe.name = param.getNameAsString();
                pe.type = param.getTypeAsString();
                me.parameters.add(pe);
            }

            entry.methods.add(me);
        }

        // Inner classes (names only at this level)
        entry.inner_classes = new ArrayList<>();
        for (BodyDeclaration<?> member : type.getMembers()) {
            if (member instanceof TypeDeclaration<?> innerType) {
                entry.inner_classes.add(innerType.getNameAsString());
                // Recursively process inner types as separate entries
                processType(innerType, packageName, sourceFile, classes, entry.fqcn);
            }
        }

        classes.add(entry);
    }

    private String determineKind(TypeDeclaration<?> type) {
        if (type instanceof EnumDeclaration) return "enum";
        if (type instanceof RecordDeclaration) return "record";
        if (type instanceof AnnotationDeclaration) return "annotation";
        if (type instanceof ClassOrInterfaceDeclaration cid) {
            return cid.isInterface() ? "interface" : "class";
        }
        return "class";
    }

    // JSON model classes matching the spec schema

    static class ClassIndex {
        String version;
        String jar_hash;
        String generated_at;
        List<ClassEntry> classes;
    }

    static class ClassEntry {
        String fqcn;
        @com.google.gson.annotations.SerializedName("package")
        String package_;
        String name;
        String kind;
        List<String> modifiers;
        String superclass;
        List<String> interfaces;
        List<String> type_parameters;
        List<String> annotations;
        List<FieldEntry> fields;
        List<MethodEntry> methods;
        List<String> inner_classes;
        String source_file;
    }

    static class FieldEntry {
        String name;
        String type;
        List<String> modifiers;
        List<String> annotations;
    }

    static class MethodEntry {
        String name;
        String return_type;
        List<ParameterEntry> parameters;
        List<String> modifiers;
        List<String> annotations;
        @com.google.gson.annotations.SerializedName("throws")
        List<String> throws_;
    }

    static class ParameterEntry {
        String name;
        String type;
    }
}
