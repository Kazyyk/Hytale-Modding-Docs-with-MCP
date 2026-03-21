---
title: "PlayerChunkTrackerSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerChunkTrackerSystems"
api_surface: false
extends: ~
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
public class PlayerChunkTrackerSystems
```

Container class for ECS systems that manage the [ChunkTracker](ChunkTracker.md) component lifecycle. Contains an initialization system and a per-tick update system.

## Inner Types

- [PlayerChunkTrackerSystems.AddSystem](PlayerChunkTrackerSystems.AddSystem.md) -- marks the chunk tracker as ready on entity add
- [PlayerChunkTrackerSystems.UpdateSystem](PlayerChunkTrackerSystems.UpdateSystem.md) -- ticks the chunk tracker each frame

## Related Types

- [ChunkTracker](ChunkTracker.md) -- component managed by these systems
