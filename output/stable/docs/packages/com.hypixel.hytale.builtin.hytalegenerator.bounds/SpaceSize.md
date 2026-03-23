---
title: "SpaceSize"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.bounds"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.bounds.SpaceSize"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.bounds`

```java
public class SpaceSize
```

Class in the bounds subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `minInclusive` | `Vector3i` | final Vector3i field. |
| `maxExclusive` | `Vector3i` | final Vector3i field. |
| `maxInclusive` | `Vector3i` | final Vector3i field. |

## Constructors

| Constructor | Description |
|---|---|
| `SpaceSize(@Nonnull Vector3i minInclusive, @Nonnull Vector3i maxExclusive)` | Creates a new SpaceSize instance. |
| `SpaceSize(@Nonnull Vector3i voxel)` | Creates a new SpaceSize instance. |
| `SpaceSize()` | Creates a new SpaceSize instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `moveBy(@Nonnull Vector3i delta)` | `SpaceSize` | public method. |
| `getMinInclusive()` | `Vector3i` | public method. |
| `getMaxExclusive()` | `Vector3i` | public method. |
| `getMaxInclusive()` | `Vector3i` | public method. |
| `getRange()` | `Vector3i` | public method. |
| `toBounds3i()` | `Bounds3i` | public method. |
| `clone()` | `SpaceSize` | public method. |
| `merge(@Nonnull SpaceSize a, @Nonnull SpaceSize b)` | `SpaceSize` | static public method. |
| `stack(@Nonnull SpaceSize a, @Nonnull SpaceSize b)` | `SpaceSize` | static public method. |
| `empty()` | `SpaceSize` | static public method. |
