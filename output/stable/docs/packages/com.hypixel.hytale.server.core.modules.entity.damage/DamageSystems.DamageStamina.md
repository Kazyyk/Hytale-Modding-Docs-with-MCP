---
title: "DamageSystems.DamageStamina"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.DamageStamina"
api_surface: false
extends: "DamageEventSystem"
implements:
  - "EntityStatsSystems.StatModifyingSystem"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "stamina"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.DamageStamina extends DamageEventSystem implements EntityStatsSystems.StatModifyingSystem
```

Drains stamina from the damaged entity when they block a hit while wielding an item with a stamina cost. Part of the inspect damage group. If the `BLOCKED` meta is true and the entity's current wielding interaction has a `StaminaCost`, computes the stamina to consume from the initial damage amount, applies the optional `STAMINA_DRAIN_MULTIPLIER`, and subtracts from the stamina stat.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [Damage](Damage.md) -- reads `BLOCKED` and `STAMINA_DRAIN_MULTIPLIER` meta keys
- [DamageEventSystem](DamageEventSystem.md) -- base class
