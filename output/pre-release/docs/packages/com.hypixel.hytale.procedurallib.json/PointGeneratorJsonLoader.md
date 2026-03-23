---
title: "PointGeneratorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.PointGeneratorJsonLoader"
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
public class PointGeneratorJsonLoader<K extends SeedResource> extends JsonLoader<K, IPointGenerator>
```

Loads point generator configurations. Creates `SeedResourcePointGenerator` instances with optional scale, distortion (randomizer), offset, and rotation transforms.

## Key Methods

- `load()`
- `loadSeed()`
- `newPointGenerator(int, CellDistanceFunction)`
- `loadCellDistanceFunction()`
- `loadPointEvaluator()`
- `loadPointDistanceFunction()`

## Related Types

- PointGeneratorJsonLoader.Constants -- KEY_SEED, KEY_SCALE, KEY_RANDOMIZER, KEY_OFFSET_X/Y/Z

