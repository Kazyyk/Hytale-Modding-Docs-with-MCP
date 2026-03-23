---
title: "CoordinateRandomizerJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.CoordinateRandomizerJsonLoader"
api_surface: false
extends: "JsonLoader"
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
public class CoordinateRandomizerJsonLoader<K extends SeedResource> extends JsonLoader<K, ICoordinateRandomizer>
```

Loads coordinate randomizer configurations. Creates `CoordinateRandomizer` with per-axis amplitude noise generators, optionally wrapped in a `RotatedCoordinateRandomizer`.

## Key Methods

- `load()`
- `loadRandomizer()`
- `loadGenerators(@Nonnull String seedSuffix)`

## Related Types

- CoordinateRandomizerJsonLoader.Constants -- SEED_X/Y/Z_NOISE_SUFFIX

