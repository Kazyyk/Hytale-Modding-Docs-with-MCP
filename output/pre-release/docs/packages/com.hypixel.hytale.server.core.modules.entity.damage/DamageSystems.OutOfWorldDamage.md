---
title: "DamageSystems.OutOfWorldDamage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DamageSystems.OutOfWorldDamage"
api_surface: false
extends: "DelayedEntitySystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "combat"
  - "system"
  - "void"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DamageSystems.OutOfWorldDamage extends DelayedEntitySystem<EntityStore>
```

A ticking system in the gather damage group that damages entities below Y=0. Ticks every 1.0 seconds. Entities below Y=-32 are instantly killed with maximum damage and a `DeathComponent` is added directly. Entities between Y=0 and Y=-32 take 50 damage per tick with `OUT_OF_WORLD` cause.

## Related Types

- [DamageSystems](DamageSystems.md) -- parent class
- [DamageCause](DamageCause.md) -- uses `OUT_OF_WORLD` cause
- [DeathComponent](DeathComponent.md) -- added directly for entities far below the world
