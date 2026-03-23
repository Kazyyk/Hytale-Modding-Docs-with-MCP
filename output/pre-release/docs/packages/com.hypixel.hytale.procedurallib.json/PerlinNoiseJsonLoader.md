---
title: "PerlinNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.PerlinNoiseJsonLoader"
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
public class PerlinNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>
```

Loads Perlin noise configurations. Creates `PerlinNoise` with a configurable interpolation mode (default `QUINTIC`).

## Key Methods

- `load()`
- `loadInterpolationFunction()`

## Related Types

- PerlinNoiseJsonLoader.Constants -- DEFAULT_INTERPOLATION_MODE = QUINTIC

