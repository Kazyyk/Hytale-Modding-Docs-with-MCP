---
title: "ParkourCheckpointSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.parkour"
fqcn: "com.hypixel.hytale.builtin.parkour.ParkourCheckpointSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "parkour"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.parkour`

```java
public class ParkourCheckpointSystems
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `Query<EntityStore>` | `getQuery()` |
| `` | `public` | `Init(ComponentType<EntityStore, ParkourCheckpoint> parkourCheckpointComponentType)` |
| `@Override public` | `void` | `onEntityAdded(@Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(@Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `` | `public` | `Ticking(ComponentType<EntityStore, ParkourCheckpoint> parkourCheckpointComponentType,
            ComponentType<EntityStore, Player> playerComponentType,
            ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> playerSpatialComponent)` |
| `@Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `void` | `tick(float dt,
            int index,
            @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `` | `` | `handleCheckpointUpdate(currentCheckpointByPlayerMap, startTimeByPlayerMap, player, playerUuid, parkourCheckpointIndex, lastIndex)` |
| `` | `private static void` | `handleCheckpointUpdate(@Nonnull Object2IntMap<UUID> currentCheckpointByPlayerMap,
            @Nonnull Object2LongMap<UUID> startTimeByPlayerMap,
            @Nonnull Player player,
            UUID playerUuid,
            int checkpointIndex,
            int lastIndex)` |
