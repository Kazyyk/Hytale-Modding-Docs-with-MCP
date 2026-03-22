---
title: "DistortedCaveNodeShapeGeneratorJsonLoader"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.shape.DistortedCaveNodeShapeGeneratorJsonLoader"
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
public class DistortedCaveNodeShapeGeneratorJsonLoader extends CaveNodeShapeGeneratorJsonLoader
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `CaveNodeShapeEnum.CaveNodeShapeGenerator` | `load()` |
| `@Nonnull private` | `DistortedShape.Factory` | `loadShape()` |
| `@Nullable private` | `IDoubleRange` | `loadWidth()` |
| `@Nullable private` | `IDoubleRange` | `loadHeight()` |
| `@Nullable private` | `IDoubleRange` | `loadMidWidth()` |
| `@Nullable private` | `IDoubleRange` | `loadMidHeight()` |
| `@Nullable private` | `IDoubleRange` | `loadLength()` |
| `private` | `boolean` | `loadInheritParentRadius()` |
| `@Nullable private` | `ShapeDistortion` | `loadShapeDistortion()` |
| `private` | `GeneralNoise.InterpolationFunction` | `loadInterpolation()` |
| `public` | `` | `DistortedCaveNodeShapeGeneratorJsonLoader(@Nonnull SeedString<SeedStringResource> seed, Path dataFolder, JsonElement json)` |

## Inner Types

- `DistortedCaveNodeShapeGeneratorJsonLoader.Constants`
