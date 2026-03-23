---
title: "CellDistanceFunctionJsonLoader"
kind: "class"
package: "com.hypixel.hytale.procedurallib.json"
fqcn: "com.hypixel.hytale.procedurallib.json.CellDistanceFunctionJsonLoader"
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
public class CellDistanceFunctionJsonLoader<K extends SeedResource> extends JsonLoader<K, CellDistanceFunction>
```

Loads cell distance function configurations. Supports SQUARE (`GridCellDistanceFunction`) and HEX (`HexCellDistanceFunction`) cell types. Delegates to `CellBorderDistanceFunctionJsonLoader` when measurement mode is BORDER_DISTANCE.

## Key Methods

- `load()`
- `loadCellType()`
- `loadDistanceFunction()`

