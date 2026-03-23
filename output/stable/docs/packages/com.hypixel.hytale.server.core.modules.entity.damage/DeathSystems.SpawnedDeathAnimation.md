---
title: "DeathSystems.SpawnedDeathAnimation"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.SpawnedDeathAnimation"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "animation"
  - "spawn"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.SpawnedDeathAnimation extends RefSystem<EntityStore>
```

Plays the death animation on entities that are spawned into the world already dead (i.e., they have a `DeathComponent` when added to the store). This handles the case where a dead entity is loaded from persistence. Triggers on `onEntityAdded` for entities matching the dead living entity query. The `onEntityRemove` method is a no-op.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [DeathSystems.DeathAnimation](DeathSystems.DeathAnimation.md) -- plays animation when death component is added at runtime
- [DeathComponent](DeathComponent.md) -- required component
