---
title: "CellBorderDistanceFunctionJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.CellBorderDistanceFunctionJsonLoader"
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
public class CellBorderDistanceFunctionJsonLoader<K extends SeedResource> extends JsonLoader<K, BorderDistanceFunction>
```

Loads border distance function configurations. Wraps a `CellDistanceFunction` with border-specific point evaluation and density conditions.

## Key Methods

- `load()`
- `loadPointEvaluator()`
- `loadDensity()`

