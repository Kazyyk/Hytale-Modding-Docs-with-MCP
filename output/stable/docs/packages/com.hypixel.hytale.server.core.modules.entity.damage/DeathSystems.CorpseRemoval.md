---
title: "DeathSystems.CorpseRemoval"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.CorpseRemoval"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "corpse"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.CorpseRemoval extends EntityTickingSystem<EntityStore>
```

A ticking system that removes dead non-player entity corpses from the world. Applies to entities with a `DeathComponent` but without a `Player` component. Waits for the death interaction chain to finish (if one exists), then either removes the entity immediately or waits for a [DeferredCorpseRemoval](DeferredCorpseRemoval.md) timer to expire before removal.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathComponent](DeathComponent.md) -- checked for interaction chain state
- [DeferredCorpseRemoval](DeferredCorpseRemoval.md) -- optional delay timer
- [DeathSystems.RunDeathInteractions](DeathSystems.RunDeathInteractions.md) -- sets the interaction chain
