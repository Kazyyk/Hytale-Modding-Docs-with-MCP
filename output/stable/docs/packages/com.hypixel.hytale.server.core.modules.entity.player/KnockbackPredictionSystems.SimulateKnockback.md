---
title: "KnockbackPredictionSystems.SimulateKnockback"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackPredictionSystems.SimulateKnockback"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "knockback"
  - "physics"
  - "system"
  - "deprecated"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
@Deprecated
public static class KnockbackPredictionSystems.SimulateKnockback extends EntityTickingSystem<EntityStore>
```

**Deprecated.** An ECS ticking system that runs the server-side knockback physics simulation. Runs AFTER `PlayerSystems.ProcessPlayerInput`. Simulates gravity, drag, friction, jumping, and collision detection at a fixed 60 Hz time step to predict knockback trajectory. Handles velocity requests (add/set), wish movement conversion, and blends the client position with the simulation position near the end of the knockback window.

Removes the `KnockbackSimulation` component when the simulation timer expires or the entity is dead.

Queries entities with `Player`, `TransformComponent`, `KnockbackSimulation`, `BoundingBox`, `MovementStatesComponent`, `MovementManager`, and `PlayerRef`.

## Related Types

- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- parent container class
- [KnockbackSimulation](KnockbackSimulation.md) -- simulation state managed by this system
