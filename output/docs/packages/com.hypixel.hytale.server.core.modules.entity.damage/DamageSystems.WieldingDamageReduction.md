---
title: "DamageSystems.WieldingDamageReduction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.WieldingDamageReduction"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "wielding"
  - "blocking"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
@Deprecated
public static class DamageSystems.WieldingDamageReduction extends DamageEventSystem
```

Reduces damage when the target entity is actively wielding an item (e.g., blocking with a shield). Part of the filter damage group. Checks the entity's current wielding interaction for damage modifiers keyed by damage cause index. If the source is an entity, also checks angled wielding for directional blocking (requires the attacker to be within the shield's angle arc). Applies blocked effects, sets the `BLOCKED` meta flag, and may initiate a blocked interaction chain.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageSystems.WieldingKnockbackReduction](DamageSystems.WieldingKnockbackReduction.md) -- companion system for knockback
- [Damage](Damage.md) -- sets `BLOCKED` meta key
- [DamageEventSystem](DamageEventSystem.md) -- base class
