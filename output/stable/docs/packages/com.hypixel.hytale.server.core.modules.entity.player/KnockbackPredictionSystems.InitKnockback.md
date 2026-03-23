---
title: "KnockbackPredictionSystems.InitKnockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackPredictionSystems.InitKnockback"
api_surface: false
extends: "RefChangeSystem<EntityStore, KnockbackSimulation>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "knockback"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class KnockbackPredictionSystems.InitKnockback extends RefChangeSystem<EntityStore, KnockbackSimulation>
```

An ECS component-change system that initializes a [KnockbackSimulation](KnockbackSimulation.md) when it is added to a player entity. Sets the simulation's client and sim positions to the entity's current transform position, and copies the current movement states. On removal, moves the player to the client's final position and restores the client's movement states.

Queries entities with `Player`, `TransformComponent`, `KnockbackSimulation`, and `MovementStatesComponent`.

## Related Types

- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- parent container class
- [KnockbackSimulation](KnockbackSimulation.md) -- component initialized/cleaned up by this system
