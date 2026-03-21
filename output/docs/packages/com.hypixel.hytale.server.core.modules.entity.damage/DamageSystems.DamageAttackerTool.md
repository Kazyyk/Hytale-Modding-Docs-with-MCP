---
title: "DamageSystems.DamageAttackerTool"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.DamageAttackerTool"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "durability"
  - "weapon"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.DamageAttackerTool extends DamageEventSystem
```

Reduces the durability of the attacker's held weapon when the damage cause has `durabilityLoss` enabled and the source is an `EntitySource`. Part of the inspect damage group. Decreases the active hotbar item's durability by 1 on the source living entity.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- checked for `isDurabilityLoss()`
- [Damage.EntitySource](Damage.EntitySource.md) -- required source type
- [DamageEventSystem](DamageEventSystem.md) -- base class
