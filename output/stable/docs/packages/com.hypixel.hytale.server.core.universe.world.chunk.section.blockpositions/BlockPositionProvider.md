---
title: "BlockPositionProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions"
fqcn: "com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions.BlockPositionProvider"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "chunk"
  - "section"
  - "blockpositions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.chunk.section.blockpositions`

```java
public class BlockPositionProvider implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `BitSet` | `searchedBlockSets` |
| `private final` | `Int2ObjectMap<List<IBlockPositionData>>` | `blockData` |
| `private final` | `short` | `lightChangeCounter` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<ChunkStore,BlockPositionProvider>` | `getComponentType()` |
| `public` | `boolean` | `isStale(int currentBlockSet, BlockSection section)` |
| `public` | `void` | `findBlocks(List<IBlockPositionData> resultList, int blockSet, double range, double yRange, Ref<EntityStore> ref, BiPredicate<IBlockPositionData,T> filter, T obj, ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `BitSet` | `getSearchedBlockSets()` |
| `public` | `void` | `forEachBlockSet(IntObjectConsumer<List<IBlockPositionData>> listConsumer)` |
| `@Nonnull @Override public` | `Component<ChunkStore>` | `clone()` |
