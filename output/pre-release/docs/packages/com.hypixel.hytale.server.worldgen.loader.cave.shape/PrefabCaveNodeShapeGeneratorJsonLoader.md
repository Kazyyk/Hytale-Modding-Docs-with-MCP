---
title: "PrefabCaveNodeShapeGeneratorJsonLoader"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.shape.PrefabCaveNodeShapeGeneratorJsonLoader"
api_surface: false
extends: "CaveNodeShapeGeneratorJsonLoader"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "worldgen"
  - "loader"
  - "cave"
  - "shape"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave.shape`

```java
public class PrefabCaveNodeShapeGeneratorJsonLoader extends CaveNodeShapeGeneratorJsonLoader
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `PrefabCaveNodeShape.PrefabCaveNodeShapeGenerator` | `load()` |
| `@Nonnull protected` | `List<WorldGenPrefabSupplier>` | `loadPrefabs()` |
| `@Nullable protected` | `BlockMaskCondition` | `loadMask()` |
| `public` | `` | `PrefabCaveNodeShapeGeneratorJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)` |

## Inner Types

- `PrefabCaveNodeShapeGeneratorJsonLoader.Constants`
