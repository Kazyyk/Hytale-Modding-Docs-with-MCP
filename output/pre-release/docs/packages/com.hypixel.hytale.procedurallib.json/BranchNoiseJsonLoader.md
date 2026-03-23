---
title: "BranchNoiseJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.BranchNoiseJsonLoader"
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
public class BranchNoiseJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<T, BranchNoise>
```

Loads branching noise configurations. Creates `BranchNoise` with separate parent and line cell systems, each with independent jitter, distance, and evaluation settings.

## Key Methods

- `load()`
- `loadParentCellType()`
- `loadLineCellType()`
- `loadParentEvaluator()`
- `loadLineEvaluator()`
- `loadParentDensity()`
- `loadParentDistance2Function()`
- `loadParentFormula()`

## Related Types

- BranchNoiseJsonLoader.LoadedBranchNoise -- inner class with SeedResource
- BranchNoiseJsonLoader.Constant -- JSON keys and defaults

