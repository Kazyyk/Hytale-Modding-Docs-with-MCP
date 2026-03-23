---
title: "MultipliedIteration"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.MultipliedIteration"
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
public class MultipliedIteration
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `double` | `candidate` |
| `` | `double` | `currentSize` |
| `` | `int` | `iterations` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `double` | `calculateMultiplier(double startValue, double endValue, int numberOfIterations, double precision)` |
| `` | `throw new` | `IllegalArgumentException("start smaller than end")` |
| `` | `throw new` | `IllegalArgumentException("number of iterations must be greater than 0")` |
| `` | `throw new` | `IllegalArgumentException("precision must be greater than 0")` |
| `` | `public static int` | `calculateIterations(double multiplier, double startValue, double endValue)` |
