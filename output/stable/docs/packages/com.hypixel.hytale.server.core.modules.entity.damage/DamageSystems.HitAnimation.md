---
title: "DamageSystems.HitAnimation"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.HitAnimation"
api_surface: false
extends: "DamageEventSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "animation"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.HitAnimation extends DamageEventSystem
```

Plays a hurt animation on entities that take positive damage and are not dead. Part of the inspect damage group. Selects the appropriate hurt animation ID based on the entity's movement states and damage cause, then plays it on the `AnimationSlot.Status` slot. Only applies to entities with a `MovementStatesComponent` and without a `DeathComponent`.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- used to select the animation variant
- [DamageEventSystem](DamageEventSystem.md) -- base class
