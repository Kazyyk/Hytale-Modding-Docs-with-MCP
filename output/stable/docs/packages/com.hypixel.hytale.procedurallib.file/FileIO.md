---
title: "FileIO"
kind: "interface"
package: "com.hypixel.hytale.procedurallib.file"
fqcn: "com.hypixel.hytale.procedurallib.file.FileIO"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "procedurallib"
  - "file"
  - "interface"
---

**Package:** `com.hypixel.hytale.procedurallib.file`

```java
public interface FileIO
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `static` | `void` | `setDefaultRoot(@Nonnull Path path)` |
| `@Nonnull static` | `<FS extends FileIOSystem> FS` | `openFileIOSystem(@Nonnull FS fs)` |
| `static` | `void` | `closeFileIOSystem(@Nonnull FileIOSystem fs)` |
| `static` | `boolean` | `exists(@Nonnull AssetPath path)` |
| `static` | `boolean` | `exists(@Nonnull Path root, @Nonnull Path path)` |
| `@Nonnull static` | `AssetPath` | `resolve(@Nonnull Path path)` |
| `@Nonnull static` | `<T> T` | `load(@Nonnull AssetPath assetPath, @Nonnull AssetLoader<T> loader)` |
| `@Nonnull static` | `<T> T` | `load(@Nonnull Path path, @Nonnull AssetLoader<T> loader)` |
| `@Nonnull static` | `List<AssetPath>` | `list(@Nonnull Path path, @Nonnull Predicate<AssetPath> matcher, @Nonnull UnaryOperator<AssetPath> disableOp)` |
| `static` | `boolean` | `startsWith(Path path, Path prefix)` |
| `static` | `Path` | `relativize(Path child, Path parent)` |
| `static` | `Path` | `append(Path root, Path path)` |
| `static` | `boolean` | `equals(@Nullable Path a, @Nullable Path b)` |
| `static` | `int` | `hashCode(@Nullable Path path)` |
