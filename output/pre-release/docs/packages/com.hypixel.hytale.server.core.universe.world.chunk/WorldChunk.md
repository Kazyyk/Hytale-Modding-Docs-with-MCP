---
title: "WorldChunk"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.WorldChunk"
api_surface: true
extends: ~
implements:
  - "BlockAccessor"
  - "Component<ChunkStore>"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "world"
  - "chunk"
  - "component"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk`

```java
public class WorldChunk implements BlockAccessor, Component<ChunkStore>
```

Core chunk component stored in the `ChunkStore`. Contains the `BlockChunk`, `BlockComponentChunk`, and `EntityChunk` sub-components. Manages chunk lifecycle flags, keep-alive timers, saving state, and lighting update control. Provides `BlockAccessor` implementation for reading/writing block data within the chunk.

## Constants

| Field | Type | Value |
|---|---|---|
| `KEEP_ALIVE_DEFAULT` | `int` | `15` |

## Static Methods

| Method | Signature |
|---|---|
| `getComponentType` | `static ComponentType<ChunkStore, WorldChunk> getComponentType()` |