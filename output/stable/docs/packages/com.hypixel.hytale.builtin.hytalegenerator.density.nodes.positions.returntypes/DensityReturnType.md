---
title: "DensityReturnType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes.DensityReturnType"
api_surface: false
extends: "ReturnType"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "density"
  - "nodes"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes`

```java
public class DensityReturnType extends ReturnType
```

Extends `ReturnType` to provide DensityReturnType functionality.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Density` | `choiceDensity` |
| `private final` | `double` | `defaultValue` |
| `@Nonnull private final` | `double[][]` | `delimiters` |
| `@Nonnull private final` | `Density[]` | `sampleDensities` |
| `private final` | `boolean` | `calculateDistanceFromWall` |
| `@Nonnull private final` | `Vector3d` | `rScaledSamplePointClone` |
| `@Nonnull private final` | `Density.Context` | `rChildContext` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `DensityReturnType(@Nonnull Density choiceDensity, @Nonnull Map<Range, Density> densityDelimiters, boolean calculateDistanceFromWall, double defaultValue)` |
| `@Override public` | `double` | `get(double distance0,
        double distance1,
        @Nonnull Vector3d samplePoint,
        @Nullable Vector3d closestPoint0,
        @Nullable Vector3d closestPoint1,
        @Nullable Density.Context context)` |
