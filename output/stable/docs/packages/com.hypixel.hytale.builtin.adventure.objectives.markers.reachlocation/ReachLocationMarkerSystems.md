---
title: "ReachLocationMarkerSystems"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation.ReachLocationMarkerSystems"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "objectives"
  - "markers"
  - "reachlocation"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation`

```java
public class ReachLocationMarkerSystems
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public` | `EnsureNetworkSendable(@Nonnull ComponentType<EntityStore, ReachLocationMarker> reachLocationMarkerComponentType,
            @Nonnull ComponentType<EntityStore, NetworkId> networkIdComponentType)` |
| `@Override public` | `void` | `onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `void` | `onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `Query<EntityStore>` | `getQuery()` |
| `` | `public` | `EntityAdded(@Nonnull ComponentType<EntityStore, ReachLocationMarker> reachLocationMarkerComponent,
            @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType)` |
| `@Override public` | `void` | `onEntityAdded(@Nonnull Ref<EntityStore> ref, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `@Override public` | `void` | `onEntityRemove(@Nonnull Ref<EntityStore> ref, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `` | `public` | `Ticking(@Nonnull ComponentType<EntityStore, ReachLocationMarker> reachLocationMarkerComponent,
            @Nonnull ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> playerSpatialComponent,
            @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType,
            @Nonnull ComponentType<EntityStore, UUIDComponent> uuidComponentType)` |
| `@Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `@Override public` | `void` | `tick(float dt,
            int index,
            @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
            @Nonnull Store<EntityStore> store,
            @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
