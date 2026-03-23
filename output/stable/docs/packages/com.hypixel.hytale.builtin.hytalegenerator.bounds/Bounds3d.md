---
title: "Bounds3d"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.bounds"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.bounds.Bounds3d"
api_surface: false
extends: ~
implements: 
  - "MemInstrument"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.bounds`

```java
public class Bounds3d implements MemInstrument
```

Implementation of `MemInstrument`.

## Fields

| Field | Type | Description |
|---|---|---|
| `min` | `Vector3d` | final Vector3d field. |
| `max` | `Vector3d` | final Vector3d field. |

## Constructors

| Constructor | Description |
|---|---|
| `Bounds3d()` | Creates a new Bounds3d instance. |
| `Bounds3d(@Nonnull Vector3d min, @Nonnull Vector3d max)` | Creates a new Bounds3d instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `contains(@Nonnull Vector3d position)` | `boolean` | public method. |
| `contains(@Nonnull Bounds3d other)` | `boolean` | public method. |
| `intersects(@Nonnull Bounds3d other)` | `boolean` | public method. |
| `isZeroVolume()` | `boolean` | public method. |
| `getSize()` | `Vector3d` | public method. |
| `assign(@Nonnull Bounds3d other)` | `Bounds3d` | public method. |
| `assign(@Nonnull Vector3d min, @Nonnull Vector3d max)` | `Bounds3d` | public method. |
| `offset(@Nonnull Vector3d vector)` | `Bounds3d` | public method. |
| `intersect(@Nonnull Bounds3d other)` | `Bounds3d` | public method. |
| `encompass(@Nonnull Bounds3d other)` | `Bounds3d` | public method. |
| `encompass(@Nonnull Vector3d position)` | `Bounds3d` | public method. |
| `stack(@Nonnull Bounds3d other)` | `Bounds3d` | public method. |
| `flipOnOriginPoint()` | `Bounds3d` | public method. |
| `flipOnOriginVoxel()` | `Bounds3d` | public method. |
| `clone()` | `Bounds3d` | public method. |
| `isCorrect()` | `boolean` | public method. |
| `correct()` | `void` | public method. |
| `getMemoryUsage()` | `MemInstrument.Report` | public method. |
