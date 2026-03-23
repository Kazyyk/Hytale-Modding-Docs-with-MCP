---
title: "MeshNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.MeshNoiseJsonLoader"
api_surface: false
extends: "AbstractCellJitterJsonLoader"
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
public class MeshNoiseJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<K, NoiseFunction>
```

Loads mesh noise configurations. Supports both square grid (`MeshNoise`) and hexagonal (`HexMeshNoise`) cell types with configurable thickness, density, and jitter.

## Key Methods

- `load()`
- `loadGridMeshNoise()`
- `loadHexMeshNoise()`
- `loadCellType()`
- `loadThickness()`
- `loadDensity()`
- `loadLinesX/Y/Z()`

## Related Types

- MeshNoiseJsonLoader.Constants -- thickness, lines defaults

