---
title: "HexMeshNoise"
kind: "class"
package: "com.hypixel.hytale.procedurallib.logic"
fqcn: "com.hypixel.hytale.procedurallib.logic.HexMeshNoise"
api_surface: false
extends: null
implements:
  - "com.hypixel.hytale.procedurallib.NoiseFunction"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "procedural"
  - "noise"
  - "mesh"
  - "hexagonal"
---

**Package:** `com.hypixel.hytale.procedurallib.logic`

```java
public class HexMeshNoise implements NoiseFunction
```

Hexagonal mesh noise that draws line segments connecting neighboring cell centers on a hex grid. Controlled by density condition, thickness, jitter, and axis flags (`linesX`, `linesY`, `linesZ`) that enable connections in different hex-grid directions. Only supports 2D evaluation; the 3D overload throws `UnsupportedOperationException`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IIntCondition` | `density` |
| `protected final` | `double` | `thickness` |
| `protected final` | `double` | `thicknessSquared` |
| `protected final` | `CellJitter` | `jitter` |
| `protected final` | `boolean` | `linesX` |
| `protected final` | `boolean` | `linesY` |
| `protected final` | `boolean` | `linesZ` |

## Constructor

```java
public HexMeshNoise(IIntCondition density, double thickness, CellJitter jitter, boolean linesX, boolean linesY, boolean linesZ)
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y)` |
| `public` | `double` | `get(int seed, int offsetSeed, double x, double y, double z)` |
| `protected` | `double` | `checkConnections(int offsetSeed, double x, double y, int cx, int cy, double nearest)` |
| `protected` | `double` | `checkDiagonalConnections(int offsetSeed, double x, double y, int cx, int cy, double nearest)` |
| `protected` | `double` | `dist2Cell(int offsetSeed, double x, double y, double adx, double ady, double ax, double ay, int cx, int cy)` |
