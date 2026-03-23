---
title: "NodeFunction"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.math.NodeFunction"
api_surface: false
extends: null
implements: ["Function<Double, Double>", "Double2DoubleFunction"]
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "math"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.math`

```java
public class NodeFunction implements Function<Double, Double>, Double2DoubleFunction
```

A piecewise linear function defined by sorted (input, output) control points. For inputs between two adjacent points, linearly interpolates between their output values. Inputs below the first point return the first point's value; inputs above the last point return the last point's value. Uses binary search over pre-computed ranges for efficient lookup.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `double` | `FALLBACK_VALUE` |
| `@Nonnull private final` | `List<double[]>` | `points` |
| `@Nonnull private final` | `List<RangeDouble>` | `ranges` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Double` | `apply(@Nonnull Double input)` |
| `public` | `double` | `get(double input)` |
| `@Nonnull public` | `NodeFunction` | `addPoint(double in, double out)` |
| `public` | `boolean` | `contains(double x)` |
| `private` | `void` | `initializeRanges()` |
| `private` | `int` | `indexBefore(double input)` |
