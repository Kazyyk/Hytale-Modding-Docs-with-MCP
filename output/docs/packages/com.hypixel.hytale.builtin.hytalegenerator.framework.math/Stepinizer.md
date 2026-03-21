---
title: "Stepinizer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.Stepinizer"
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
public class Stepinizer implements Function<Double, Double>, Double2DoubleFunction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `double` | `stepSize` |
| `private` | `double` | `stepSizeHalf` |
| `private` | `double` | `slope` |
| `private` | `double` | `topSmooth` |
| `private` | `double` | `bottomSmooth` |
| `` | `double` | `polarity` |
| `` | `double` | `steepness` |
| `` | `double` | `bottomStep` |
| `` | `double` | `topStep` |
| `` | `double` | `result` |
| `` | `double` | `remainder` |
| `` | `double` | `midPoint` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Stepinizer()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Stepinizer` | `setSmooth(double top, double bottom)` |
| `` | `throw new` | `IllegalArgumentException("invalid values provided")` |
| `public` | `Stepinizer` | `setEdgeSlope(double slope)` |
| `` | `throw new` | `IllegalArgumentException("negative slope")` |
| `public` | `Stepinizer` | `setStep(double size)` |
| `` | `throw new` | `IllegalArgumentException("negative size")` |
| `` | `public double` | `apply(double x)` |
| `` | `public double` | `get(double x)` |
| `` | `private double` | `closestStep(double x)` |
| `` | `private double` | `topStep(double x)` |
| `` | `private double` | `bottomStep(double x)` |
| `` | `private double` | `polarity(double x)` |
| `` | `private double` | `steepness(double x)` |

## Related Types

- [Calculator](Calculator.md)
- [Normalizer](Normalizer.md)
