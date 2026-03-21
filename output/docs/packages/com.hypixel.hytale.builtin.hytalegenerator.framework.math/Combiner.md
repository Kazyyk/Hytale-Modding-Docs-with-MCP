---
title: "Combiner"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.Combiner"
api_surface: false
extends: "null"
implements: []
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
public class Combiner
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `double` | `y` |
| `private` | `double` | `value` |
| `` | `MAX_POLICY,` | `MIN_POLICY` |
| `` | `private final Combiner` | `parent` |
| `` | `private double` | `value` |
| `` | `private double` | `floor` |
| `` | `private double` | `ceiling` |
| `` | `private double` | `paddingFloor` |
| `` | `private double` | `paddingCeiling` |
| `` | `private Combiner.IntersectionPolicy` | `intersectionPolicy` |
| `` | `private double` | `intersectionSmoothingRange` |
| `` | `private boolean` | `withLimitsCheck` |
| `` | `private boolean` | `withPaddingCheck` |
| `` | `private boolean` | `withIntersectionPolicyCheck` |
| `` | `private boolean` | `isFinished` |
| `` | `double` | `floorPaddingMultiplier` |
| `` | `double` | `ceilingPaddingMultiplier` |
| `` | `double` | `paddingMultiplier` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Combiner(double background, double y)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Combiner.Layer` | `addLayer(double density)` |
| `` | `public double` | `getValue()` |
| `` | `private` | `Layer(@Nonnull Combiner combiner, double value)` |
| `` | `throw new` | `NullPointerException()` |
| `` | `public Combiner` | `finishLayer()` |
| `` | `throw new` | `IllegalStateException("incomplete")` |
| `` | `throw new` | `IllegalStateException("method was already called")` |
| `` | `public Combiner.Layer` | `withLimits(double floor, double ceiling)` |
| `` | `public Combiner.Layer` | `withPadding(double paddingFloor, double paddingCeiling)` |
| `` | `throw new` | `IllegalArgumentException("negative padding values")` |
| `` | `public Combiner.Layer` | `withIntersectionPolicy(@Nonnull Combiner.IntersectionPolicy policy, double smoothRange)` |

## Inner Types

- `Combiner.IntersectionPolicy`
- `Combiner.Layer`

## Related Types

- [Calculator](Calculator.md)
