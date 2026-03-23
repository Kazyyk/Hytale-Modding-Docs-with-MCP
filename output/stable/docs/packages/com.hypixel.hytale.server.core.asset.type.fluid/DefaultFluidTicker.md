---
title: "DefaultFluidTicker"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.DefaultFluidTicker"
api_surface: false
extends: "com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "asset"
  - "fluid"
  - "simulation"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

```java
public class DefaultFluidTicker extends FluidTicker
```

Standard liquid fluid ticker. Implements gravity-driven downward flow with lateral spreading. Supports a `SpreadFluid` property for fluid type conversion (e.g. source water converting to flowing water), and a `Collisions` map defining what happens when this fluid encounters another (e.g. lava + water = cobblestone).

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `DefaultFluidTicker` | `INSTANCE` | Singleton default instance. |

## JSON-Configurable Fields

| Type | Name | Description |
|---|---|---|
| `String` | `spreadFluid` | Fluid ID to place when spreading (null = self). |
| `Map<String, FluidCollisionConfig>` | `rawCollisionMap` | Collision configs keyed by other fluid ID. |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Int2ObjectMap<FluidCollisionConfig>` | `getCollisionMap()` |

## Spread Algorithm

The `spread` method first attempts downward flow: if the block below is not solid and not already filled with the spread fluid, the fluid fills downward at max level. If downward flow is blocked, the ticker computes the shortest path to a drop point using `getSpreadOffsets` (searching up to 5 blocks laterally), then spreads to adjacent cells at `fluidLevel - 1`. When spreading into another fluid type, the collision map is consulted to determine whether to place a block, play a sound, and/or suppress fluid placement.

## Inner Types

### FluidCollisionConfig (static class)

```java
public static class FluidCollisionConfig
```

Defines what happens when two fluids collide: `BlockToPlace` (the block to create, e.g. cobblestone), `SoundEvent` (sound to play), and `PlaceFluid` (whether the spreading fluid is still placed). Lazily resolves block type and sound event indices.

| Type | Name | Default | Description |
|---|---|---|---|
| `String` | `blockToPlace` | -- | Block type to place on collision. |
| `String` | `soundEvent` | -- | Sound event to play. |
| `boolean` | `placeFluid` | `false` | Whether to still place the fluid. |

## Related Types

- [FluidTicker](FluidTicker.md) -- base class
- [Fluid](Fluid.md) -- owns this ticker
