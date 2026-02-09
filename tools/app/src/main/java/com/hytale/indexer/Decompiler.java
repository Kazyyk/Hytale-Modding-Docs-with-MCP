package com.hytale.indexer;

import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Decompiles a JAR file using Vineflower (modern Fernflower fork).
 *
 * Vineflower produces readable Java source from bytecode. It handles
 * modern Java features including records, sealed classes, pattern matching,
 * and switch expressions.
 */
public class Decompiler {

    /**
     * Decompile a JAR file to a target directory.
     *
     * @param jarPath       Path to the JAR file to decompile
     * @param outputDir     Directory to write decompiled .java files
     * @throws IOException  if the output directory cannot be created
     */
    public void decompile(Path jarPath, Path outputDir) throws IOException {
        Files.createDirectories(outputDir);

        System.out.println("Input JAR: " + jarPath);
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
            jarPath.toString(),
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
    }
}
