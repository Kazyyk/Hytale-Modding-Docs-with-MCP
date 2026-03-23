---
title: "NodeFunction"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.NodeFunction"
api_surface: false
extends: "null"
implements: ["Function<Double, Double>", "Double2DoubleFunction"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "framework"
  - "math"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.math`

```java
public class NodeFunction implements Function<Double, Double>, Double2DoubleFunction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `double` | `FALLBACK_VALUE` |
| `private final` | `List<double[]>` | `points` |
| `private final` | `List<RangeDouble>` | `ranges` |
| `` | `int` | `indexBefore` |
| `` | `double[]` | `before` |
| `` | `double[]` | `after` |
| `` | `double` | `differenceY` |
| `` | `double` | `ratio` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public Double` | `apply(@Nonnull Double input)` |
| `` | `public double` | `get(double input)` |
| `public` | `NodeFunction` | `addPoint(double in, double out)` |
| `` | `public boolean` | `contains(double x)` |
| `` | `private void` | `initializeRanges()` |
| `` | `private int` | `indexBefore(double input)` |
