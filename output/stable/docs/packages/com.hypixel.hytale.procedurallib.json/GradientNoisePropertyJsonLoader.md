---
title: "GradientNoisePropertyJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.GradientNoisePropertyJsonLoader"
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
public class GradientNoisePropertyJsonLoader<K extends SeedResource> extends JsonLoader<K, GradientNoiseProperty>
```

Loads gradient noise property configurations. Applies gradient computation (MAGNITUDE mode by default) with configurable distance (5.0) and normalization (0.1).

## Key Methods

- `load()`
- `loadMode()`
- `loadDistance()`
- `loadNormalization()`

## Related Types

- GradientNoisePropertyJsonLoader.Constants -- DEFAULT_MODE = MAGNITUDE, DEFAULT_DISTANCE = 5.0

