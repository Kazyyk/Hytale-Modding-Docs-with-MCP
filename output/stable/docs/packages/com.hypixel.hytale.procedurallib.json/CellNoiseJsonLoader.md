---
title: "CellNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.CellNoiseJsonLoader"
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
public class CellNoiseJsonLoader<K extends SeedResource> extends JsonLoader<K, NoiseFunction>
```

Loads cell noise configurations. Creates `CellNoise` instances by loading cell distance functions, point evaluators, cell modes, and optional noise lookup properties.

## Key Methods

- `load()`
- `loadCellDistanceFunction()`
- `loadPointEvaluator()`
- `loadCellFunction()`
- `loadNoiseLookup()`

## Related Types

- CellNoiseJsonLoader.LoadedCellNoise -- inner class extending CellNoise with SeedResource buffer delegation
- CellNoiseJsonLoader.Constants -- JSON keys and defaults (DEFAULT_CELL_MODE = CELL_VALUE, DEFAULT_CELL_TYPE = SQUARE)

