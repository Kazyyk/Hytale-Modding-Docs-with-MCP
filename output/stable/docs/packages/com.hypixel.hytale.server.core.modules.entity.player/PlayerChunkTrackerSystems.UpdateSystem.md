---
title: "PlayerChunkTrackerSystems.UpdateSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerChunkTrackerSystems.UpdateSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "chunks"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerChunkTrackerSystems.UpdateSystem extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that calls `ChunkTracker.tick()` each frame for entities with `ChunkTracker`, `Player`, `PlayerRef`, and `TransformComponent`. Runs single-threaded (`isParallel` returns `false`).

## Related Types

- [PlayerChunkTrackerSystems](PlayerChunkTrackerSystems.md) -- parent container class
- [ChunkTracker](ChunkTracker.md) -- component ticked by this system
