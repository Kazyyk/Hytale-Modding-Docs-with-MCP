---
title: "MergeWaitingBlocksSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.blocktick.system"
fqcn: "com.hypixel.hytale.builtin.blocktick.system.MergeWaitingBlocksSystem"
api_surface: false
extends: "RefSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "blocktick"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.blocktick.system`

```java
public class MergeWaitingBlocksSystem extends RefSystem<ChunkStore>
```

ECS system handling MergeWaitingBlocks tick processing.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `@Nonnull private static final` | `ComponentType<ChunkStore, WorldChunk>` | `COMPONENT_TYPE` | `WorldChunk.getComponentType()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `Query<ChunkStore>` | `getQuery()` |
| `@Override public` | `void` | `onEntityAdded(@Nonnull Ref<ChunkStore> ref, @Nonnull AddReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(@Nonnull Ref<ChunkStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `public static` | `void` | `mergeTickingBlocks(@Nonnull ChunkStore store, int x, int z)` |
