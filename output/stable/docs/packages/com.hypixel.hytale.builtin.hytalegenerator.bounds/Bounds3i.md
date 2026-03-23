---
title: "Bounds3i"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.bounds"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.bounds.Bounds3i"
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
public class Bounds3i implements MemInstrument
```

Implementation of `MemInstrument`.

## Fields

| Field | Type | Description |
|---|---|---|
| `min` | `Vector3i` | final Vector3i field. |
| `max` | `Vector3i` | final Vector3i field. |

## Constructors

| Constructor | Description |
|---|---|
| `Bounds3i()` | Creates a new Bounds3i instance. |
| `Bounds3i(@Nonnull Vector3i min, @Nonnull Vector3i max)` | Creates a new Bounds3i instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `contains(@Nonnull Vector3i position)` | `boolean` | public method. |
| `contains(@Nonnull Bounds3i other)` | `boolean` | public method. |
| `intersects(@Nonnull Bounds3i other)` | `boolean` | public method. |
| `isZeroVolume()` | `boolean` | public method. |
| `getSize()` | `Vector3i` | public method. |
| `assign(@Nonnull Bounds3i other)` | `Bounds3i` | public method. |
| `assign(@Nonnull Vector3i min, @Nonnull Vector3i max)` | `Bounds3i` | public method. |
| `offset(@Nonnull Vector3i vector)` | `Bounds3i` | public method. |
| `intersect(@Nonnull Bounds3i other)` | `Bounds3i` | public method. |
| `encompass(@Nonnull Bounds3i other)` | `Bounds3i` | public method. |
| `encompass(@Nonnull Vector3i position)` | `Bounds3i` | public method. |
| `stack(@Nonnull Bounds3i other)` | `Bounds3i` | public method. |
| `flipOnOriginPoint()` | `Bounds3i` | public method. |
| `flipOnOriginVoxel()` | `Bounds3i` | public method. |
| `toBounds3d()` | `Bounds3d` | public method. |
| `clone()` | `Bounds3i` | public method. |
| `isCorrect()` | `boolean` | public method. |
| `correct()` | `void` | public method. |
| `getMemoryUsage()` | `MemInstrument.Report` | public method. |
