---
title: "DamageSystems.HackKnockbackValues"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.HackKnockbackValues"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "knockback"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
@Deprecated
public static class DamageSystems.HackKnockbackValues extends EntityTickingSystem<EntityStore>
```

A deprecated ticking system in the filter damage group that scales knockback velocity on the X and Z axes by `PLAYER_KNOCKBACK_SCALE` (default 25.0). Only applies when the knockback component has no velocity config or split velocity modification is enabled. This is a temporary workaround and is marked for replacement.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `PLAYER_KNOCKBACK_SCALE` | `float` | Scale multiplier for knockback X/Z velocity: `25.0`. |

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
