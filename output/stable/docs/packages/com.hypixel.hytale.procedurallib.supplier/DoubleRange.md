---
title: "DoubleRange"
kind: "class"
package: "com.hypixel.hytale.procedurallib.supplier"
fqcn: "com.hypixel.hytale.procedurallib.supplier.DoubleRange"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "procedurallib"
  - "supplier"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.supplier`

```java
public class DoubleRange
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `DoubleRange.Constant` | `ZERO` |
| `public static final` | `DoubleRange.Constant` | `ONE` |
| `protected final` | `double` | `result` |
| `protected final` | `double[]` | `thresholds` |
| `protected final` | `double[]` | `values` |
| `protected final` | `double` | `min` |
| `protected final` | `double` | `range` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getResult()` |
| `@Override public` | `double` | `getValue(double v)` |
| `@Override public` | `double` | `getValue(DoubleSupplier supplier)` |
| `@Override public` | `double` | `getValue(Random random)` |
| `@Override public` | `double` | `getValue(int seed, double x, double y, IDoubleCoordinateSupplier2d supplier)` |
| `@Override public` | `double` | `getValue(int seed, double x, double y, double z, IDoubleCoordinateSupplier3d supplier)` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Override public` | `double` | `getValue(@Nonnull DoubleSupplier supplier)` |
| `@Override public` | `double` | `getValue(@Nonnull Random random)` |
| `@Override public` | `double` | `getValue(int seed, double x, double y, @Nonnull IDoubleCoordinateSupplier2d supplier)` |
| `@Override public` | `double` | `getValue(int seed, double x, double y, double z, @Nonnull IDoubleCoordinateSupplier3d supplier)` |
| `public` | `double` | `getMin()` |
| `public` | `double` | `getRange()` |

## Inner Types

- `DoubleRange.Constant`
- `DoubleRange.Multiple`
- `DoubleRange.Normal`
