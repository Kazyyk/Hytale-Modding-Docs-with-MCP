---
title: "NoiseTypeJson"
kind: "enum"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.NoiseTypeJson"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "procedural-generation"
  - "noise"
  - "json-loader"
---

**Package:** `com.hypixel.hytale.procedurallib.json`

```java
public enum NoiseTypeJson
```

Maps noise type names to their corresponding JSON loader classes. Each constant holds a reflectively-obtained constructor for the loader, enabling dynamic loader instantiation based on the `"NoiseType"` key in JSON configuration.

## Enum Constants

| Constant | Noise Type | Loader Class |
|---|---|---|
| `CELL` | `NoiseType.CELL` | [CellNoiseJsonLoader](CellNoiseJsonLoader.md) |
| `CONSTANT` | `NoiseType.CONSTANT` | [ConstantNoiseJsonLoader](ConstantNoiseJsonLoader.md) |
| `DISTANCE` | `NoiseType.DISTANCE` | [DistanceNoiseJsonLoader](DistanceNoiseJsonLoader.md) |
| `PERLIN` | `NoiseType.PERLIN` | [PerlinNoiseJsonLoader](PerlinNoiseJsonLoader.md) |
| `SIMPLEX` | `NoiseType.SIMPLEX` | [SimplexNoiseJsonLoader](SimplexNoiseJsonLoader.md) |
| `OLD_SIMPLEX` | `NoiseType.OLD_SIMPLEX` | [OldSimplexNoiseJsonLoader](OldSimplexNoiseJsonLoader.md) |
| `VALUE` | `NoiseType.VALUE` | [ValueNoiseJsonLoader](ValueNoiseJsonLoader.md) |
| `MESH` | `NoiseType.MESH` | [MeshNoiseJsonLoader](MeshNoiseJsonLoader.md) |
| `GRID` | `NoiseType.GRID` | [GridNoiseJsonLoader](GridNoiseJsonLoader.md) |
| `BRANCH` | `NoiseType.BRANCH` | [BranchNoiseJsonLoader](BranchNoiseJsonLoader.md) |
| `POINT` | `NoiseType.POINT` | [PointNoiseJsonLoader](PointNoiseJsonLoader.md) |

## Methods

```java
@Nonnull
public <K extends SeedResource> JsonLoader<K, NoiseFunction> newLoader(SeedString<K> seed, Path dataFolder, JsonElement json)
```

Reflectively constructs a new loader instance for this noise type.

## Related Types

- [NoiseFunctionJsonLoader](NoiseFunctionJsonLoader.md) -- uses this enum to dispatch to the correct loader
