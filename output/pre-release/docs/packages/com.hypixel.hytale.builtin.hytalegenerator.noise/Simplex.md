---
title: "Simplex"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.Simplex"
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
class Simplex
```

Package-private simplex noise implementation providing static 2D, 3D, and 4D noise functions. Uses a fixed permutation table and gradient vectors. Called by [SimplexNoiseField](SimplexNoiseField.md) for octave-layered sampling.

## Inner Types

| Type | Kind |
|---|---|
| [Simplex.Grad](Simplex.Grad.md) | class |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `double` | `F2` |
| `private static final` | `double` | `G2` |
| `private static final` | `double` | `F3` |
| `private static final` | `double` | `G3` |
| `private static final` | `double` | `F4` |
| `private static final` | `double` | `G4` |
| `@Nonnull private static final` | `Simplex.Grad[]` | `grad3` |
| `@Nonnull private static final` | `Simplex.Grad[]` | `grad4` |
| `@Nonnull private static final` | `short[]` | `p` |
| `@Nonnull private static final` | `short[]` | `perm` |
| `@Nonnull private static final` | `short[]` | `permMod12` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `double` | `noise(double xin, double yin)` |
| `public static` | `double` | `noise(double xin, double yin, double zin)` |
| `public static` | `double` | `noise(double x, double y, double z, double w)` |
