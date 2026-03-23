---
title: "KnockbackPredictionSystems.CaptureKnockbackInput"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackPredictionSystems.CaptureKnockbackInput"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
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
public static class KnockbackPredictionSystems.CaptureKnockbackInput extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that runs BEFORE `PlayerSystems.ProcessPlayerInput` to extract movement and jump inputs from the player input queue during knockback. Updates the [KnockbackSimulation](KnockbackSimulation.md) component with client position, relative movement, and movement states.

Queries entities with both `PlayerInput` and `KnockbackSimulation` components.

## Related Types

- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- parent container class
- [KnockbackSimulation](KnockbackSimulation.md) -- simulation state updated by this system
- [PlayerInput](PlayerInput.md) -- input queue consumed by this system
