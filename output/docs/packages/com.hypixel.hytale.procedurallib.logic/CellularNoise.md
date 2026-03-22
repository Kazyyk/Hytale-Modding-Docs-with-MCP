---
title: "CellularNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.CellularNoise"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "lookup-table"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public final class CellularNoise
```

Static lookup table containing 256 pre-computed `DoubleArray.Double2` vectors used as cell jitter offsets by [MeshNoise](MeshNoise.md) and other cellular noise implementations. Each entry contains x and y values in the range [0, 1). This class has no constructor or methods beyond the constant array.

## Constants

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `DoubleArray.Double2[]` | `CELL_2D` |
