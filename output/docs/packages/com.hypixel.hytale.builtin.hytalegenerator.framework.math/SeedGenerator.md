---
title: "SeedGenerator"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.math"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.math.SeedGenerator"
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
public class SeedGenerator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `long[]` | `coPrimes` |
| `private static final` | `long` | `FLOOR` |
| `` | `int` | `x` |
| `` | `int` | `y` |
| `` | `int` | `z` |
| `` | `int` | `w` |
| `` | `int` | `k` |
| `` | `int` | `t` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `SeedGenerator(long seed)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public long` | `seedAt(long x, long y, long z, long w, long k, long t)` |
| `` | `public long` | `seedAt(long x, long y, long z, long w, long k)` |
| `` | `public long` | `seedAt(long x, long y, long z, long w)` |
| `` | `public long` | `seedAt(long x, long y, long z)` |
| `` | `public long` | `seedAt(long x, long y)` |
| `` | `public long` | `seedAt(double xd, double yd, double zd, double wd, double kd, double td, double resolution)` |
| `` | `public long` | `seedAt(double xd, double yd, double zd, double wd, double kd, double resolution)` |
| `` | `public long` | `seedAt(double xd, double yd, double zd, double wd, double resolution)` |
| `` | `public long` | `seedAt(double xd, double yd, double zd, double resolution)` |
| `` | `public long` | `seedAt(double xd, double yd, double resolution)` |
| `public` | `String` | `toString()` |

## Related Types

- [CoPrimeGenerator](CoPrimeGenerator.md)
