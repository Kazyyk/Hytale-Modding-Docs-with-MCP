---
title: "FloatRangeNoiseSupplier"
kind: "class"
package: "com.hypixel.hytale.procedurallib.supplier"
fqcn: "com.hypixel.hytale.procedurallib.supplier.FloatRangeNoiseSupplier"
api_surface: false
extends: ~
implements: ["IFloatCoordinateSupplier"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "procedurallib"
  - "supplier"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.supplier`

```java
public class FloatRangeNoiseSupplier implements IFloatCoordinateSupplier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IFloatRange` | `range` |
| `protected final` | `NoiseProperty` | `noiseProperty` |
| `protected final` | `IDoubleCoordinateSupplier2d` | `supplier2d` |
| `protected final` | `IDoubleCoordinateSupplier3d` | `supplier3d` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `float` | `get(int seed, double x, double y)` |
| `@Override public` | `float` | `get(int seed, double x, double y, double z)` |
| `@Override @Nonnull public` | `String` | `toString()` |
