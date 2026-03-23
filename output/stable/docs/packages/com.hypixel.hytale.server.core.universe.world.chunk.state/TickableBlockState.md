---
title: "TickableBlockState"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.chunk.state"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.state.TickableBlockState"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "chunk"
  - "state"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.state`

```java
public interface TickableBlockState
```

Utility type in the `state` subsystem.

## Abstract Methods

| Method | Returns | Parameters |
|---|---|---|
| `tick` | `void` | `float var1, int var2, ArchetypeChunk<ChunkStore> var3, Store<ChunkStore> var4, CommandBuffer<ChunkStore> var5` |
| `getPosition` | `Vector3i` | `` |
| `getBlockPosition` | `Vector3i` | `` |
| `getChunk` | `WorldChunk` | `` |
| `invalidate` | `void` | `` |
