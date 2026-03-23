---
title: "PlayerChunkTrackerSystems.AddSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerChunkTrackerSystems.AddSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
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
public static class PlayerChunkTrackerSystems.AddSystem extends HolderSystem<EntityStore>
```

An ECS holder system that sets the [ChunkTracker](ChunkTracker.md) to "ready for chunks" when an entity with a `ChunkTracker` component is added to the store.

## Related Types

- [PlayerChunkTrackerSystems](PlayerChunkTrackerSystems.md) -- parent container class
- [ChunkTracker](ChunkTracker.md) -- component initialized by this system
