---
title: "DamageSystems.WieldingKnockbackReduction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.WieldingKnockbackReduction"
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
  - "knockback"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
@Deprecated
public static class DamageSystems.WieldingKnockbackReduction extends DamageEventSystem
```

Reduces knockback when the target entity is actively wielding an item. Part of the filter damage group. Similar to [DamageSystems.WieldingDamageReduction](DamageSystems.WieldingDamageReduction.md) but applies knockback modifiers instead of damage modifiers. Checks both standard and angled wielding knockback modifier maps, and applies the modifiers to the `KNOCKBACK_COMPONENT` meta.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageSystems.WieldingDamageReduction](DamageSystems.WieldingDamageReduction.md) -- companion system for damage
- [DamageEventSystem](DamageEventSystem.md) -- base class
