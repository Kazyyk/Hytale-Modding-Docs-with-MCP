---
title: "PositionsDensity"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.PositionsDensity"
api_surface: false
extends: "Density"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "density"
  - "nodes"
  - "positions"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions`

```java
public class PositionsDensity extends Density
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `PositionProvider` | `positionProvider` |
| `private final` | `double` | `maxDistance` |
| `private final` | `double` | `maxDistanceRaw` |
| `private final` | `ReturnType` | `returnType` |
| `private final` | `DistanceFunction` | `distanceFunction` |
| `private final` | `Vector3d` | `rMin` |
| `private final` | `Vector3d` | `rMax` |
| `private final` | `Vector3d` | `rClosestPoint` |
| `private final` | `Vector3d` | `rPreviousClosestPoint` |
| `private final` | `Vector3d` | `rLocalPoint` |
| `private final` | `double[]` | `rDistance` |
| `private final` | `boolean[]` | `rHasClosestPoint` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `Double2DoubleFunction` | `cellNoiseDistanceFunction(double maxDistance)` |
| `@Override public` | `double` | `process(Density.Context context)` |
