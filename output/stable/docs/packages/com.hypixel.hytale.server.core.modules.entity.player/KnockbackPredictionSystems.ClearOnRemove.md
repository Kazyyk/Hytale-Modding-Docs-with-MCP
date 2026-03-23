---
title: "KnockbackPredictionSystems.ClearOnRemove"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.KnockbackPredictionSystems.ClearOnRemove"
api_surface: false
extends: "RefSystem<EntityStore>"
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
public static class KnockbackPredictionSystems.ClearOnRemove extends RefSystem<EntityStore>
```

An ECS ref system that removes the `KnockbackSimulation` component when an entity with that component is removed from the store. Prevents stale simulation state from persisting.

## Related Types

- [KnockbackPredictionSystems](KnockbackPredictionSystems.md) -- parent container class
- [KnockbackSimulation](KnockbackSimulation.md) -- component removed by this system
