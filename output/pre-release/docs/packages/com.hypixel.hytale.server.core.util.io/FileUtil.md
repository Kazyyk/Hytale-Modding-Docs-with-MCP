---
title: "FileUtil"
kind: "class"
package: "com.hypixel.hytale.server.core.util.io"
fqcn: "com.hypixel.hytale.server.core.util.io.FileUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "io"
---

**Package:** `com.hypixel.hytale.server.core.util.io`

```java
public class FileUtil
```

Class in the io subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_WALK_TREE_OPTIONS_ARRAY` | `FileVisitOption[]` | Static final FileVisitOption[] field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `copyDirectory(@Nonnull Path origin, @Nonnull Path destination)` | `void` | static public method. |
| `moveDirectoryContents(@Nonnull Path origin, @Nonnull Path destination, CopyOption... options)` | `void` | static public method. |
| `deleteDirectory(@Nonnull Path path)` | `void` | static public method. |
| `extractZip(@Nonnull Path zipFile, @Nonnull Path destDir)` | `void` | static public method. |
| `extractZip(@Nonnull InputStream inputStream, @Nonnull Path destDir)` | `void` | static public method. |
| `writeStringAtomic(@Nonnull Path file, @Nonnull String content, boolean backup)` | `void` | static public method. |
| `atomicMove(@Nonnull Path source, @Nonnull Path target)` | `void` | static public method. |
| `writeStringAtomic(@Nonnull Path file, @Nonnull String content)` | `void` | static public method. |
