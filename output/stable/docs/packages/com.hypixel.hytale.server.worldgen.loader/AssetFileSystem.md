---
title: "AssetFileSystem"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.AssetFileSystem"
api_surface: false
extends: "null"
implements: ["FileIOSystem"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader`

```java
public class AssetFileSystem implements FileIOSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `Strategy<Path>` | `PATH_STRATEGY` |
| `private final` | `Path` | `root` |
| `private final` | `FileIOSystem.PathArray` | `packRoots` |
| `private final` | `List<AssetPack>` | `packs` |
| `private final` | `Object2ObjectMap<Path, AssetPath>` | `files` |
| `private final` | `Object2ObjectMap<AssetPath, AssetFileSystem.Resource<?>>` | `resources` |
| `` | `Path` | `root` |
| `` | `Path` | `assetPath` |
| `` | `Path` | `relPath` |
| `` | `AssetPath` | `assetPath` |
| `` | `AssetFileSystem.Resource<?>` | `resource` |
| `` | `T` | `value` |
| `` | `AssetModule` | `assets` |
| `` | `Path` | `versionsDir` |
| `` | `List<AssetPack>` | `allPacks` |
| `` | `ObjectArrayList<AssetPack>` | `packs` |
| `` | `AssetPack` | `pack` |
| `` | `Path[]` | `roots` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `AssetFileSystem(@Nonnull WorldGenConfig config)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public int` | `hashCode(Path o)` |
| `` | `public boolean` | `equals(Path a, Path b)` |
| `public` | `Path` | `baseRoot()` |
| `public` | `FileIOSystem.PathArray` | `roots()` |
| `public` | `AssetPath` | `resolve(@Nonnull Path path)` |
| `public` | `<T> T` | `load(@Nonnull AssetPath path, @Nonnull AssetLoader<T> loader)` |
| `` | `throw new` | `IllegalStateException("Resource type mismatch: expected " + loader.type()` |
| `public` | `void` | `close()` |
| `` | `public List<AssetPack>` | `packs()` |
| `` | `public static List<AssetPack>` | `getAssetPacks(@Nonnull WorldGenConfig config, @Nonnull Predicate<Path> filter)` |
| `` | `public static Path[]` | `getAssetRoots(@Nonnull List<AssetPack> packs)` |

## Inner Types

- `AssetFileSystem.Resource`
