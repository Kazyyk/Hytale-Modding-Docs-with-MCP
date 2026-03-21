---
title: "NoisePropertyJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.NoisePropertyJsonLoader"
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
public class NoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseProperty>
```

Central noise property loader supporting 14 composition types: MAX, MIN, SUM, SCALE, FORMULA, MULTIPLY, DISTORTED, NORMALIZE, INVERT, OFFSET, ROTATE, GRADIENT, CURVE, BLEND. Also supports fractal noise (FBM/RIDGED/TURBULENCE) when no explicit Type is set. Post-processing modifiers (Formula, Curve, Scale, Normalize, Offset, Rotate, Gradient) are applied in sequence.

## Key Methods

- `load()`
- `loadSeed()`
- `loadNoiseProperties(@Nonnull JsonElement)`
- `loadDoubleArray(@Nullable JsonElement, int)`

## Related Types

- NoisePropertyJsonLoader.Constants -- all JSON keys, error strings, DEFAULT_FRACTAL_MODE = FBM

