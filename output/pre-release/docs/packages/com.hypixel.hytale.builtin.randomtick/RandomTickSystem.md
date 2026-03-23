---
title: "RandomTickSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.randomtick"
fqcn: "com.hypixel.hytale.builtin.randomtick.RandomTickSystem"
api_surface: false
extends: "EntityTickingSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "randomtick"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.randomtick`

```java
public class RandomTickSystem extends EntityTickingSystem
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<ChunkStore,BlockSection>` | `blockSelectionComponentType` |
| `private final` | `ComponentType<ChunkStore,ChunkSection>` | `chunkSectionComponentType` |
| `private final` | `Query<ChunkStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `tick(float dt, int index, ArchetypeChunk<ChunkStore> archetypeChunk, Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)` |
| `@Nullable @Override public` | `Query<ChunkStore>` | `getQuery()` |
