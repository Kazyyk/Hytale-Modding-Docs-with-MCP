---
title: "ChunkBlockTickSystem.Ticking"
kind: "class"
package: "com.hypixel.hytale.builtin.blocktick.system"
fqcn: "com.hypixel.hytale.builtin.blocktick.system.ChunkBlockTickSystem.Ticking"
api_surface: false
extends: "EntityTickingSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "blocktick"
  - "system"
  - "ticking"
---

**Package:** `com.hypixel.hytale.builtin.blocktick.system`

```java
public static class ChunkBlockTickSystem.Ticking extends EntityTickingSystem<ChunkStore>
```

Chunk-store ticking system that executes block tick procedures on all ticking blocks within loaded chunks. Runs after `ChunkBlockTickSystem.PreTick` (enforced via a `SystemDependency` with `Order.AFTER`). For each ticking block, delegates to the block type's `TickProcedure` to determine the outcome (e.g., grow, sleep, or ignore).

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private static final` | `ComponentType<ChunkStore, WorldChunk>` | `COMPONENT_TYPE_WORLD_CHUNK` |
| `@Nonnull private static final` | `ComponentType<ChunkStore, BlockChunk>` | `COMPONENT_TYPE_BLOCK_CHUNK` |
| `@Nonnull private static final` | `Query<ChunkStore>` | `QUERY` |
| `@Nonnull private static final` | `Set<Dependency<ChunkStore>>` | `DEPENDENCIES` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `Query<ChunkStore>` | `getQuery()` |
| `@Nonnull @Override public` | `Set<Dependency<ChunkStore>>` | `getDependencies()` |
| `@Override public` | `void` | `tick(float dt, int index, @Nonnull ArchetypeChunk<ChunkStore> archetypeChunk, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `protected static` | `void` | `tick(@Nonnull Ref<ChunkStore> ref, @Nonnull BlockChunk blockChunkComponent, @Nonnull WorldChunk worldChunk)` |
| `protected static` | `BlockTickStrategy` | `tickProcedure(@Nonnull World world, @Nonnull WorldChunk chunk, int blockX, int blockY, int blockZ, int blockId)` |

## Behavior

- The query requires both `WorldChunk` and `BlockChunk` components.
- `tick` iterates all ticking blocks in a chunk via `BlockChunk.forEachTicking`, converting local coordinates to world coordinates and invoking `tickProcedure`.
- `tickProcedure` checks that `WorldConfig.isBlockTicking()` is enabled and that a `BlockTickManager` provider is set, then calls `TickProcedure.onTick`. Returns `BlockTickStrategy.IGNORED` if ticking is disabled or no procedure exists, and `BlockTickStrategy.SLEEP` if the procedure throws an exception.
- Tick counts are logged at `FINER` level per chunk.

## Related Types

- [ChunkBlockTickSystem](ChunkBlockTickSystem.md) -- enclosing class containing `PreTick` and this `Ticking` system
- [BlockTickPlugin](../com.hypixel.hytale.builtin.blocktick/BlockTickPlugin.md) -- the plugin that registers this system
