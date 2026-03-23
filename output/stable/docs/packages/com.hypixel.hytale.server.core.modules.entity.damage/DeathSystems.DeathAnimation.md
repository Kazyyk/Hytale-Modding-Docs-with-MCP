---
title: "DeathSystems.DeathAnimation"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.DeathAnimation"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "animation"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.DeathAnimation extends DeathSystems.OnDeathSystem
```

Plays the death animation on a living entity when it dies. Runs before `EntityStatsSystems.EntityTrackerUpdate` and after [DeathSystems.ClearEntityEffects](DeathSystems.ClearEntityEffects.md). Selects the animation based on the entity's movement states and the death cause, then plays it on `AnimationSlot.Status`.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.SpawnedDeathAnimation](DeathSystems.SpawnedDeathAnimation.md) -- plays animation when a dead entity is spawned into the world
- [DamageCause](DamageCause.md) -- provides the death animation ID
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
