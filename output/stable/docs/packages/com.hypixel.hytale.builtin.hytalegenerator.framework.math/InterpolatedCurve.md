---
title: "InterpolatedCurve"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.InterpolatedCurve"
api_surface: false
extends: "null"
implements: ["Double2DoubleFunction"]
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
public class InterpolatedCurve implements Double2DoubleFunction
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Double2DoubleFunction` | `functionA` |
| `private final` | `Double2DoubleFunction` | `functionB` |
| `private final` | `double` | `positionA` |
| `private final` | `double` | `positionB` |
| `private final` | `double` | `distance` |
| `private final` | `double` | `smoothTransition` |
| `` | `double` | `bRatio` |
| `` | `double` | `aRatio` |
| `` | `double` | `a` |
| `` | `double` | `v` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `InterpolatedCurve(double positionA, double positionB, double smoothTransition, @Nonnull Double2DoubleFunction functionA, @Nonnull Double2DoubleFunction functionB)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `throw new` | `IllegalArgumentException()` |
| `` | `public double` | `get(double x)` |
| `` | `public double` | `transitionCurve(double ratio)` |
