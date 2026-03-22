---
title: "ChunkSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.systems"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.systems.ChunkSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "chunk"
  - "systems"
  - "class"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.systems`

```java
public class ChunkSystems
```

Container for chunk-related ECS systems that manage chunk lifecycle and block change replication. Inner classes handle chunk section creation, loading, non-ticking state propagation, and network replication of block changes to players.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| `ChunkSystems.EnsureBlockSection` | class | Ensures `BlockSection` component exists on chunk sections |
| `ChunkSystems.LoadBlockSection` | class | Marks block sections as loaded |
| `ChunkSystems.OnChunkLoad` | class | Creates or restores chunk sections when a chunk column loads |
| `ChunkSystems.OnNewChunk` | class | Creates a new `ChunkColumn` with 10 section holders |
| `ChunkSystems.OnNonTicking` | class | Propagates non-ticking state to chunk sections |
| `ChunkSystems.ReplicateChanges` | class | Sends block changes to players via `ServerSetBlock`/`ServerSetBlocks`/`SetChunk` packets |
