---
title: "DistanceNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.DistanceNoiseJsonLoader"
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
public class DistanceNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>
```

Loads distance-based noise configurations. Creates `DistanceNoise` instances with configurable measurement modes and distance-2 functions.

## Key Methods

- `load()`
- `loadCellDistanceFunction()`
- `loadPointEvaluator()`
- `loadMeasurementMode()`
- `loadDistance2Function()`

## Related Types

- DistanceNoiseJsonLoader.LoadedDistanceNoise -- inner class with SeedResource buffer delegation
- DistanceNoiseJsonLoader.Constants -- defaults (DEFAULT_MEASUREMENT = CENTRE_DISTANCE, DEFAULT_DISTANCE_2_MODE = SUB)

