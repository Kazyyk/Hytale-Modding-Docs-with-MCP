---
title: "DamageSystems.ArmorKnockbackReduction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.ArmorKnockbackReduction"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "armor"
  - "knockback"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
@Deprecated
public static class DamageSystems.ArmorKnockbackReduction extends DamageEventSystem
```

Reduces knockback from incoming damage based on the target entity's armor knockback resistance values. Part of the filter damage group. Iterates over the entity's armor container, sums knockback resistance values for the damage cause, and applies a knockback modifier of `max(1 - totalResistance, 0)` to the `KNOCKBACK_COMPONENT` meta.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- used to look up per-cause knockback resistance
- [DamageEventSystem](DamageEventSystem.md) -- base class
