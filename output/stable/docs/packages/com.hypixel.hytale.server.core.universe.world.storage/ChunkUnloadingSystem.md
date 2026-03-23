---
title: "ChunkUnloadingSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.component.ChunkUnloadingSystem"
api_surface: true
extends: "TickingSystem<ChunkStore>"
implements:
  - "RunWhenPausedSystem<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "storage"
  - "ecs"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage`

```java
public class ChunkUnloadingSystem extends TickingSystem<ChunkStore> implements RunWhenPausedSystem<ChunkStore>
```

Periodic system that unloads chunks no longer visible to any player. Uses RAM pressure detection (85% threshold) to increase poll rate. Respects keep-alive timers and keep-loaded regions.
