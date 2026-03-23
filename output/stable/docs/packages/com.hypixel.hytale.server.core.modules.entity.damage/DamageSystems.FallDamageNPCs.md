---
title: "DamageSystems.FallDamageNPCs"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.FallDamageNPCs"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "fall"
  - "npc"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.FallDamageNPCs extends EntityTickingSystem<EntityStore>
```

Calculates and applies fall damage to non-player living entities. Part of the gather damage group. Only active when fall damage is enabled in the world config. Uses a quadratic curve: `damage% = (0.58 * (yVelocity - minFallSpeed))^2 + 10`. Rolling mitigates damage: full mitigation below `maxFallSpeedRollFullMitigation`, partial mitigation below `maxFallSpeedToEngageRoll`. Resets fall distance after landing.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CURVE_MODIFIER` | `float` | Fall damage curve modifier: `0.58`. |
| `CURVE_MULTIPLIER` | `float` | Fall damage curve power: `2.0`. |
| `MIN_DAMAGE` | `double` | Minimum damage percentage: `10.0`. |

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageSystems.FallDamagePlayers](DamageSystems.FallDamagePlayers.md) -- equivalent system for players
- [DamageCause](DamageCause.md) -- uses `FALL` cause
