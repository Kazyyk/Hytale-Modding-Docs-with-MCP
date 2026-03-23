---
title: "PointEvaluatorJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.PointEvaluatorJsonLoader"
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
public class PointEvaluatorJsonLoader<K extends SeedResource> extends AbstractCellJitterJsonLoader<T, PointEvaluator>
```

Loads point evaluator configurations. Supports centre-distance and border-distance measurement modes with configurable distance calculation, jitter, density conditions, distance ranges, and skip settings.

## Key Methods

- `load()`
- `loadCentrePointEvaluator()`
- `loadBorderPointEvaluator()`
- `loadPointDistanceFunction()`
- `loadDistanceRange()`
- `loadDensity()`
- `loadSkipCount()`
- `loadSkipMode()`

