---
title: "BlockReplaceEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block"
fqcn: "com.hypixel.hytale.server.core.modules.block.BlockReplaceEvent"
api_surface: false
extends: "EcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "event"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block`

```java
public class BlockReplaceEvent extends EcsEvent
```

ECS event fired when a block entity is being replaced by a new one. Carries the chunk reference, the self position (which can be updated via `next()` for filler blocks), and the new entity holder. Used by `ItemContainerSystems` to migrate item containers between old and new block entities.

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `BlockReplaceEvent(Ref<ChunkStore> chunkRef, int selfX, int selfY, int selfZ, Holder<ChunkStore> newEntity, int baseX, int baseY, int baseZ)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Ref<ChunkStore>` | `getChunkRef()` |
| `public` | `int` | `getSelfX()` |
| `public` | `int` | `getSelfY()` |
| `public` | `int` | `getSelfZ()` |
| `public` | `Holder<ChunkStore>` | `getNewEntity()` |
| `public` | `void` | `next(int selfX, int selfY, int selfZ)` |

## Relationships

- Extends `EcsEvent`
- Dispatched by [BlockEntity](BlockEntity.md)
- Handled by `ItemContainerSystems.OnReplaced` and `ItemContainerSystems.OnReplacedHolder`
