---
title: "SpawnMarkerBlockStateSystems.TickHeartbeat"
kind: "class"
package: "com.hypixel.hytale.server.spawning.blockstates"
fqcn: "com.hypixel.hytale.server.spawning.blockstates.SpawnMarkerBlockStateSystems.TickHeartbeat"
api_surface: false
extends: "com.hypixel.hytale.component.system.tick.EntityTickingSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:30:09Z"
tags:
  - "server"
  - "spawning"
  - "blockstates"
  - "ecs"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.server.spawning.blockstates`

```java
public static class TickHeartbeat extends EntityTickingSystem<ChunkStore>
```

Inner class of `SpawnMarkerBlockStateSystems`. Chunk-store ticking system that monitors spawn marker block states. Creates spawn marker entities when the reference is null, refreshes the lost-marker timeout when the marker entity exists, and recreates markers when they desync.
