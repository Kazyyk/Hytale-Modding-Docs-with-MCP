---
title: "RotatedPosition"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality.RotatedPosition"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props.directionality`

```java
public class RotatedPosition
```

Class in the directionality subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `x` | `int` | final int field. |
| `y` | `int` | final int field. |
| `z` | `int` | final int field. |
| `rotation` | `PrefabRotation` | final PrefabRotation field. |

## Constructors

| Constructor | Description |
|---|---|
| `RotatedPosition(int x, int y, int z, @Nonnull PrefabRotation rotation)` | Creates a new RotatedPosition instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getRelativeTo(@Nonnull RotatedPosition other)` | `RotatedPosition` | public method. |
| `toVector3i()` | `Vector3i` | public method. |
