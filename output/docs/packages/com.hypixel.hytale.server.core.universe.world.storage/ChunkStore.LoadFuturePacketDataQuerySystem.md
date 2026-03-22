---
title: "ChunkStore.LoadFuturePacketDataQuerySystem"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.storage"
fqcn: "com.hypixel.hytale.server.core.universe.world.storage.ChunkStore.LoadFuturePacketDataQuerySystem"
api_surface: true
extends: "EntityDataSystem<ChunkStore, PlayerRef, CompletableFuture<ToClientPacket>>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "world"
  - "chunks"
  - "networking"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.storage.chunkstore`

```java
public abstract class LoadFuturePacketDataQuerySystem extends EntityDataSystem<ChunkStore, PlayerRef, CompletableFuture<ToClientPacket>>
```

Abstract system type for querying future chunk load packet data.
