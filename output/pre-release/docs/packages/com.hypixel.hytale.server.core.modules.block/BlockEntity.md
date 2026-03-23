---
title: "BlockEntity"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.block"
fqcn: "com.hypixel.hytale.server.core.modules.block.BlockEntity"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:59Z"
tags:
  - "block"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.block`

```java
public class BlockEntity
```

Utility class for placing and removing block entities in the chunk store. The static `setBlockEntity` method handles both ticking and non-ticking chunk stores, dispatches `BlockReplaceEvent` to existing block entities at the target position and filler block positions, and manages `BlockStateInfo` component setup.

## Static Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `setBlockEntity(ComponentAccessor<ChunkStore> accessor, Ref<ChunkStore> chunkRef, BlockComponentChunk componentChunk, int x, int y, int z, BlockType blockType, int rotation, Holder<ChunkStore> holder)` |

## Relationships

- Dispatches [BlockReplaceEvent](BlockReplaceEvent.md)
- Works with [BlockModule](BlockModule.md) and `BlockComponentChunk`
