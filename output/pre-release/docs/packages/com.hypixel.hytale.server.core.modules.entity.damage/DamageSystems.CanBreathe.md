---
title: "DamageSystems.CanBreathe"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.CanBreathe"
api_surface: false
extends: "DelayedEntitySystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "drowning"
  - "suffocation"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.CanBreathe extends DelayedEntitySystem<EntityStore>
```

A ticking system in the gather damage group that inflicts drowning or suffocation damage on living entities that cannot breathe. Ticks every 1.0 seconds. Checks the entity's oxygen stat: if at minimum and the entity cannot breathe at its breathing height, deals 10 damage (DROWNING) if in fluid, or 20 damage (SUFFOCATION) if in a solid block.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `DAMAGE_AMOUNT_DROWNING` | `float` | Drowning damage per tick: `10.0`. |
| `DAMAGE_AMOUNT_SUFFOCATION` | `float` | Suffocation damage per tick: `20.0`. |

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- uses `DROWNING` and `SUFFOCATION` causes
- [Damage](Damage.md) -- the damage events generated
