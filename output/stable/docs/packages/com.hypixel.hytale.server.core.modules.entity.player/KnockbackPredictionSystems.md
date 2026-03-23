---
title: "KnockbackPredictionSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackPredictionSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "knockback"
  - "physics"
  - "prediction"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class KnockbackPredictionSystems
```

Container class for ECS systems that handle server-side knockback prediction for players. These systems capture player input during knockback, initialize and clear simulation state, and run the physics simulation that reconciles client and server positions.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `DEBUG_KNOCKBACK_POSITION` | `boolean` | Enables debug particle visualization of knockback positions. Default `false`. |

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `DEFAULT_BLOCK_DRAG` | `float` | `0.82F` | Default drag coefficient on ground. |
| `AIR_DENSITY` | `float` | `0.001225F` | Air density used for terminal velocity calculation. |
| `COLLISION_PADDING` | `float` | `1.0E-4F` | Padding added to collision checks. |
| `MAX_CYCLE_MOVEMENT` | `float` | `0.25F` | Maximum movement per physics sub-cycle. |
| `TIME_STEP` | `float` | `0.016666668F` | Fixed time step for knockback simulation (~60 Hz). |
| `MAX_JUMP_COMBOS` | `int` | `3` | Maximum number of consecutive jumps tracked. |

## Inner Types

- [KnockbackPredictionSystems.CaptureKnockbackInput](KnockbackPredictionSystems.CaptureKnockbackInput.md) -- captures player input for knockback simulation
- [KnockbackPredictionSystems.ClearOnRemove](KnockbackPredictionSystems.ClearOnRemove.md) -- removes simulation on entity removal
- [KnockbackPredictionSystems.ClearOnTeleport](KnockbackPredictionSystems.ClearOnTeleport.md) -- clears simulation on teleport
- [KnockbackPredictionSystems.CollisionAxis](KnockbackPredictionSystems.CollisionAxis.md) -- collision axis enum (private)
- [KnockbackPredictionSystems.InitKnockback](KnockbackPredictionSystems.InitKnockback.md) -- initializes simulation state
- [KnockbackPredictionSystems.SimulateKnockback](KnockbackPredictionSystems.SimulateKnockback.md) -- runs knockback physics simulation (deprecated)

## Related Types

- [KnockbackSimulation](KnockbackSimulation.md) -- component holding the knockback simulation state
- [PlayerInput](PlayerInput.md) -- player input component consumed by these systems
