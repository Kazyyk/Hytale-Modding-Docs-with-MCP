---
title: "ItemContainerStateSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block.system"
fqcn: "com.hypixel.hytale.server.core.modules.block.system.ItemContainerStateSpatialSystem"
api_surface: false
extends: "SpatialSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "modules"
  - "block"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.block.system`

```java
public class ItemContainerStateSpatialSystem extends SpatialSystem<ChunkStore>
```

Spatial system for efficient positional queries.

## Constants

| Constant | Type |
|---|---|
| `QUERY` | `Query<ChunkStore>` |

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getPosition(ArchetypeChunk<ChunkStore> archetypeChunk, int index)` | `Vector3d` | Accessor method. |
| `getQuery()` | `Query<ChunkStore>` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `tick(float dt, int systemIndex, Store<ChunkStore> store)` | `void` | Instance method. |
