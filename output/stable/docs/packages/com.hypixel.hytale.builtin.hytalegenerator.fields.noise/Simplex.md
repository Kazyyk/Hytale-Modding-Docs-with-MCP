---
title: "Simplex"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.fields.noise.Simplex"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "fields"
  - "noise"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.fields.noise`

```java
class Simplex
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `private static int` | `fastfloor(double x)` |
| `` | `private static double` | `dot(@Nonnull Simplex.Grad g, double x, double y)` |
| `` | `private static double` | `dot(@Nonnull Simplex.Grad g, double x, double y, double z)` |
| `` | `private static double` | `dot(@Nonnull Simplex.Grad g, double x, double y, double z, double w)` |
| `` | `public static double` | `noise(double xin, double yin)` |
| `` | `public static double` | `noise(double xin, double yin, double zin)` |
| `` | `public static double` | `noise(double x, double y, double z, double w)` |
| `` | `` | `Grad(double x, double y, double z)` |
| `` | `` | `Grad(double x, double y, double z, double w)` |
