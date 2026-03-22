---
title: "WorldGenPrefabSupplier"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader"
fqcn: "com.hypixel.hytale.server.worldgen.loader.WorldGenPrefabSupplier"
api_surface: true
extends: "null"
implements: ["PrefabSupplier"]
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
public class WorldGenPrefabSupplier implements PrefabSupplier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `WorldGenPrefabSupplier[]` | `EMPTY_ARRAY` |
| `private final` | `WorldGenPrefabLoader` | `loader` |
| `private final` | `String` | `prefabKey` |
| `private final` | `Path` | `path` |
| `private` | `String` | `prefabName` |
| `private` | `ChunkBounds` | `bounds` |
| `` | `WorldGenPrefabSupplier` | `that` |
| `` | `int` | `minX` |
| `` | `int` | `minZ` |
| `` | `int` | `maxX` |
| `` | `int` | `maxZ` |
| `` | `int` | `childX` |
| `` | `int` | `childZ` |
| `` | `IPrefabBuffer` | `childPrefab` |
| `` | `PrefabRotation` | `childRotation` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `WorldGenPrefabSupplier(WorldGenPrefabLoader loader, String prefabKey, Path path)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public WorldGenPrefabLoader` | `getLoader()` |
| `public` | `String` | `getName()` |
| `public` | `String` | `getPrefabName()` |
| `` | `public Path` | `getPath()` |
| `public` | `IPrefabBuffer` | `get()` |
| `public` | `IChunkBounds` | `getBounds(@Nonnull IPrefabBuffer buffer)` |
| `public` | `boolean` | `equals(@Nullable Object o)` |
| `public` | `int` | `hashCode()` |
| `public` | `String` | `toString()` |
| `private` | `ChunkBounds` | `getBounds(int depth, int x, int z, @Nonnull IPrefabBuffer prefab, @Nonnull PrefabRotation rotation, @Nonnull ChunkBounds bounds)` |

## Related Types

- [WorldGenPrefabLoader](WorldGenPrefabLoader.md)
