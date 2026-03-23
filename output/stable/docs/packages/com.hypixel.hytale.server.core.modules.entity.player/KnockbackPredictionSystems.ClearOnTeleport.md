---
title: "KnockbackPredictionSystems.ClearOnTeleport"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackPredictionSystems.ClearOnTeleport"
api_surface: false
extends: "RefChangeSystem<EntityStore, Teleport>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "knockback"
  - "teleport"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class KnockbackPredictionSystems.ClearOnTeleport extends RefChangeSystem<EntityStore, Teleport>
```

An ECS component-change system that removes the `KnockbackSimulation` component when a `Teleport` component is added to an entity that has a knockback simulation in progress. This cancels the knockback prediction when the player is teleported.

## Related Types

- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- parent container class
- [KnockbackSimulation](KnockbackSimulation.md) -- component removed by this system
