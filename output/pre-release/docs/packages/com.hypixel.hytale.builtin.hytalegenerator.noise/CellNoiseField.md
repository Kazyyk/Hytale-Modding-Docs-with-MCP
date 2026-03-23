---
title: "CellNoiseField"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.noise"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.noise.CellNoiseField"
api_surface: false
extends: "NoiseField"
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
public class CellNoiseField extends NoiseField
```

Cellular (Voronoi/Worley) noise field implementation backed by [FastNoiseLite](FastNoiseLite.md). Supports configurable cellular return types, fractal octaves, and optional domain warping. Coordinates are divided by per-axis scale factors before sampling.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `FastNoiseLite` | `cellNoise` |
| `private` | `int` | `seed` |
| `private` | `boolean` | `doDomainWarp` |
| `private` | `double` | `scaleX` |
| `private` | `double` | `scaleY` |
| `private` | `double` | `scaleZ` |

## Constructors

| Signature |
|---|
| `CellNoiseField(int seed, double scaleX, double scaleY, double scaleZ, double jitter, int octaves, @Nonnull FastNoiseLite.CellularReturnType cellType, @Nonnull FastNoiseLite.DomainWarpType domainWarpType, double warpAmount, double warpScale)` |
| `CellNoiseField(int seed, double scaleX, double scaleY, double scaleZ, double jitter, int octaves, @Nonnull FastNoiseLite.CellularReturnType cellType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `double` | `valueAt(double x, double y, double z, double w)` |
| `@Override public` | `double` | `valueAt(double x, double y, double z)` |
| `@Override public` | `double` | `valueAt(double x, double z)` |
| `@Override public` | `double` | `valueAt(double x)` |
