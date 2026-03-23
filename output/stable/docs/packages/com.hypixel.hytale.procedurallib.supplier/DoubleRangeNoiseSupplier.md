---
title: "DoubleRangeNoiseSupplier"
kind: "class"
package: "com.hypixel.hytale.procedurallib.supplier"
fqcn: "com.hypixel.hytale.procedurallib.supplier.DoubleRangeNoiseSupplier"
api_surface: false
extends: ~
implements: ["IDoubleCoordinateSupplier"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "procedurallib"
  - "supplier"
  - "class"
---

**Package:** `com.hypixel.hytale.procedurallib.supplier`

```java
public class DoubleRangeNoiseSupplier implements IDoubleCoordinateSupplier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected final` | `IDoubleRange` | `range` |
| `protected final` | `NoiseProperty` | `noiseProperty` |
| `protected final` | `IDoubleCoordinateSupplier2d` | `supplier2d` |
| `protected final` | `IDoubleCoordinateSupplier3d` | `supplier3d` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `get(int seed, double x, double y)` |
| `@Override public` | `double` | `get(int seed, double x, double y, double z)` |
| `@Override @Nonnull public` | `String` | `toString()` |
