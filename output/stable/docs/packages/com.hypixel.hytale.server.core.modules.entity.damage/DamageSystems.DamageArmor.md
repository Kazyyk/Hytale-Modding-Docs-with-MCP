---
title: "DamageSystems.DamageArmor"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.DamageArmor"
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
  - "durability"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.DamageArmor extends DamageEventSystem
```

Reduces the durability of a random non-broken armor piece on the damaged entity when the damage cause has `durabilityLoss` enabled. Part of the inspect damage group. Collects all non-broken armor slots, selects one at random, and decreases its durability by 3.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- checked for `isDurabilityLoss()`
- [DamageEventSystem](DamageEventSystem.md) -- base class
