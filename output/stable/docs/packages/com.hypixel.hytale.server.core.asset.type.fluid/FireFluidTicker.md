---
title: "FireFluidTicker"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.fluid"
fqcn: "com.hypixel.hytale.server.core.asset.type.fluid.FireFluidTicker"
api_surface: false
extends: "com.hypixel.hytale.server.core.asset.type.fluid.FluidTicker"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "core"
  - "asset"
  - "fluid"
  - "fire"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.fluid`

```java
public class FireFluidTicker extends FluidTicker
```

Fire propagation fluid ticker. Fire spreads to all 6 adjacent blocks (not just lateral) if the neighbor block matches a flammability tag pattern. Fire increases its own level each tick up to the fluid's max level. When the level reaches the block's `burnLevel` threshold, a random check against `burnChance` determines whether the block burns (replacing it with a `resultingBlock` and playing an optional sound). Fire can occupy solid blocks (`canOccupySolidBlocks` returns true).

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `FireFluidTicker` | `INSTANCE` | Singleton default instance. |

## JSON-Configurable Fields

| Type | Name | Description |
|---|---|---|
| `String` | `spreadFluid` | Fluid ID to place when spreading (null = self). |
| `FlammabilityConfig[]` | `rawFlammabilityConfigs` | Flammability definitions per tag pattern. |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `List<FlammabilityConfig>` | `getSortedFlammabilityConfigs()` |
| `@Override public` | `boolean` | `canOccupySolidBlocks()` |

## Inner Types

### FlammabilityConfig (static class)

```java
public static class FlammabilityConfig
```

Defines flammability for blocks matching a tag pattern.

| Type | Name | Default | Description |
|---|---|---|---|
| `String` | `tagPatternId` | -- | Tag pattern to match flammable blocks. |
| `int` | `priority` | `0` | Higher values checked first. |
| `byte` | `burnLevel` | `1` | Minimum fluid level to trigger burn. |
| `float` | `burnChance` | `0.1` | Per-tick probability of burning (0.0-1.0). |
| `String` | `resultingBlock` | `"Empty"` | Block placed after burning. |
| `String` | `soundEvent` | -- | Sound played on burn. |

## Related Types

- [FluidTicker](FluidTicker.md) -- base class
- [Fluid](Fluid.md) -- owns this ticker
