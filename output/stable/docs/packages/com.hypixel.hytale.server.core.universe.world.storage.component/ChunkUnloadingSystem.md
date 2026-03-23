---
title: "ChunkUnloadingSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage.component"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.component.ChunkUnloadingSystem"
api_surface: true
extends: "TickingSystem<ChunkStore>"
implements:
  - "RunWhenPausedSystem<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "storage"
  - "component"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.component`

```java
public class ChunkUnloadingSystem extends TickingSystem<ChunkStore> implements RunWhenPausedSystem<ChunkStore>
```

ECS system that unloads chunks that are no longer needed, running even when the game is paused.
