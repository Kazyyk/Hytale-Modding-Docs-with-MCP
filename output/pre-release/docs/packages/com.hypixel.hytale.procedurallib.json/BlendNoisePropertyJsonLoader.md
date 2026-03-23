---
title: "BlendNoisePropertyJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.BlendNoisePropertyJsonLoader"
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
public class BlendNoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, BlendNoiseProperty>
```

Loads blend noise property configurations. Creates `BlendNoiseProperty` with an alpha noise, an array of noise sources, and ascending threshold values.

## Key Methods

- `load()`
- `loadAlpha()`
- `loadNoise()`
- `loadThresholds()`
- `validate(NoiseProperty[], double[])`

## Related Types

- BlendNoisePropertyJsonLoader.Constants -- KEY_ALPHA, KEY_NOISE, KEY_THRESHOLDS

