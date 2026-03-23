---
title: "CreateWarpWhenTeleporterPlacedSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.teleporter.system"
fqcn: "com.hypixel.hytale.builtin.adventure.teleporter.system.CreateWarpWhenTeleporterPlacedSystem"
api_surface: false
extends: "RefChangeSystem<ChunkStore, PlacedByInteractionComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "teleporter"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.teleporter.system`

```java
public class CreateWarpWhenTeleporterPlacedSystem extends RefChangeSystem<ChunkStore, PlacedByInteractionComponent>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `ComponentType<ChunkStore, PlacedByInteractionComponent>` | `placedByInteractionComponentType` |
| `@Nonnull private final` | `ComponentType<ChunkStore, Teleporter>` | `teleporterComponentType` |
| `@Nonnull private final` | `ComponentType<ChunkStore, BlockModule.BlockStateInfo>` | `blockStateInfoComponentType` |
| `@Nonnull private final` | `ComponentType<EntityStore, PlayerRef>` | `playerRefComponentType` |
| `@Nonnull private final` | `Query<ChunkStore>` | `query` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `CreateWarpWhenTeleporterPlacedSystem(@Nonnull ComponentType<ChunkStore, PlacedByInteractionComponent> placedByInteractionComponentType,
        @Nonnull ComponentType<ChunkStore, Teleporter> teleporterComponentType,
        @Nonnull ComponentType<ChunkStore, BlockModule.BlockStateInfo> blockStateInfoComponentType,
        @Nonnull ComponentType<EntityStore, PlayerRef> playerRefComponentType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `onComponentAdded(@Nonnull Ref<ChunkStore> ref,
        @Nonnull PlacedByInteractionComponent placedBy,
        @Nonnull Store<ChunkStore> chunkStore,
        @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `public static` | `void` | `createWarp(@Nonnull WorldChunk worldChunk, @Nonnull BlockModule.BlockStateInfo blockStateInfo, @Nonnull String name)` |
| `public` | `void` | `onComponentSet(@Nonnull Ref<ChunkStore> ref,
        @Nullable PlacedByInteractionComponent oldComponent,
        @Nonnull PlacedByInteractionComponent newComponent,
        @Nonnull Store<ChunkStore> store,
        @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `public` | `void` | `onComponentRemoved(@Nonnull Ref<ChunkStore> ref,
        @Nonnull PlacedByInteractionComponent component,
        @Nonnull Store<ChunkStore> store,
        @Nonnull CommandBuffer<ChunkStore> commandBuffer)` |
| `@Nonnull @Override public` | `ComponentType<ChunkStore, PlacedByInteractionComponent>` | `componentType()` |
| `@Nonnull @Override public` | `Query<ChunkStore>` | `getQuery()` |
