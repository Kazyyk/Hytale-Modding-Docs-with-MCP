---
title: "NoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.NoiseField"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "noise"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.noise`

```java
public abstract class NoiseField
```

Abstract base class for noise field implementations. Provides per-axis scale factors and abstract `valueAt` methods for sampling noise at 1D through 4D coordinates.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `double` | `scaleX` |
| `protected` | `double` | `scaleY` |
| `protected` | `double` | `scaleZ` |
| `protected` | `double` | `scaleW` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `double` | `valueAt(double var1, double var3, double var5, double var7)` |
| `public abstract` | `double` | `valueAt(double var1, double var3, double var5)` |
| `public abstract` | `double` | `valueAt(double var1, double var3)` |
| `public abstract` | `double` | `valueAt(double var1)` |
| `@Nonnull public` | `NoiseField` | `setScale(double scaleX, double scaleY, double scaleZ, double scaleW)` |
| `@Nonnull public` | `NoiseField` | `setScale(double scale)` |
