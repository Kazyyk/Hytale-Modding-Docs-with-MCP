---
title: "ShapeDistortionJsonLoader"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.loader.cave.shape"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.shape.ShapeDistortionJsonLoader"
api_surface: false
extends: "SeedResource> extends JsonLoader<K, ShapeDistortion>"
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
public class ShapeDistortionJsonLoader<K extends SeedResource> extends JsonLoader<K, ShapeDistortion>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `ShapeDistortion` | `load()` |
| `@Nullable private` | `NoiseProperty` | `loadWidth()` |
| `@Nullable private` | `NoiseProperty` | `loadFloor()` |
| `@Nullable private` | `NoiseProperty` | `loadCeiling()` |
| `public` | `` | `ShapeDistortionJsonLoader(@Nonnull SeedString<K> seed, Path dataFolder, JsonElement json)` |

## Inner Types

- `ShapeDistortionJsonLoader.Constants`
