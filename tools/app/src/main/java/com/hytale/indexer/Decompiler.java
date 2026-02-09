package com.hytale.indexer;

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

/**
 * Decompiles a JAR file using Vineflower (modern Fernflower fork).
 *
 * Only Hytale's own packages are decompiled. Third-party dependencies
 * (fastutil, Netty, Gson, Guava, etc.) are excluded to avoid OOM errors
 * on massive generated classes and to keep the index focused.
 */
public class Decompiler {

    /** Package prefixes to include in decompilation. */
    private static final List<String> INCLUDE_PREFIXES = List.of(
        "com/hypixel/hytale/"
    );

    /**
     * Decompile a JAR file to a target directory.
     * Only classes under the included package prefixes are decompiled.
     *
     * @param jarPath       Path to the JAR file to decompile
     * @param outputDir     Directory to write decompiled .java files
     * @throws IOException  if the output directory cannot be created or the JAR cannot be filtered
     */
    public void decompile(Path jarPath, Path outputDir) throws IOException {
        Files.createDirectories(outputDir);

        // Create a filtered JAR with only Hytale's own classes
        Path filteredJar = Files.createTempFile("hytale-filtered-", ".jar");
        try {
            long originalCount = filterJar(jarPath, filteredJar);
            System.out.println("Input JAR: " + jarPath);
            System.out.println("Filtered to " + originalCount + " entries (packages: " +
                String.join(", ", INCLUDE_PREFIXES) + ")");
            System.out.println("Output:    " + outputDir);

            // Vineflower CLI arguments:
            //   -dgs=1  : decompile generic signatures
            //   -asc=1  : allow synthetic class access (for inner classes)
            //   -rsy=1  : remove synthetic methods/fields
            //   -ind=    : use spaces for indentation
            //   -log=WARN : reduce noise, only show warnings and errors
            //   -thr=N  : use available processors for parallel decompilation
            String threads = String.valueOf(Runtime.getRuntime().availableProcessors());

            String[] args = {
                "-dgs=1",
                "-asc=1",
                "-rsy=1",
                "-ind=    ",
                "-log=WARN",
                "-thr=" + threads,
                filteredJar.toString(),
                outputDir.toString()
            };

            System.out.println("Starting Vineflower with " + threads + " threads...");
            long start = System.currentTimeMillis();

            try {
                ConsoleDecompiler.main(args);
            } catch (Exception e) {
                throw new RuntimeException("Vineflower decompilation failed: " + e.getMessage(), e);
            }

            long elapsed = System.currentTimeMillis() - start;
            System.out.printf("Decompilation completed in %.1f seconds%n", elapsed / 1000.0);
        } finally {
            Files.deleteIfExists(filteredJar);
        }
    }

    /**
     * Create a filtered copy of the JAR containing only entries that match
     * the included package prefixes.
     *
     * @return the number of entries written to the filtered JAR
     */
    private long filterJar(Path sourceJar, Path targetJar) throws IOException {
        long count = 0;

        try (JarFile jf = new JarFile(sourceJar.toFile());
             OutputStream os = Files.newOutputStream(targetJar);
             JarOutputStream jos = new JarOutputStream(os, new Manifest())) {

            var entries = jf.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                // Include META-INF (manifest, etc.) and matching packages
                if (shouldInclude(name)) {
                    jos.putNextEntry(new JarEntry(name));
                    if (!entry.isDirectory()) {
                        try (InputStream is = jf.getInputStream(entry)) {
                            is.transferTo(jos);
                        }
                    }
                    jos.closeEntry();
                    count++;
                }
            }
        }

        return count;
    }

    private boolean shouldInclude(String entryName) {
        // Skip manifest — JarOutputStream already writes one
        if (entryName.equals("META-INF/MANIFEST.MF")) {
            return false;
        }
        // Include other META-INF entries (services, licenses, etc.)
        if (entryName.startsWith("META-INF/")) {
            return true;
        }
        // Include entries matching our target packages
        for (String prefix : INCLUDE_PREFIXES) {
            if (entryName.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}
