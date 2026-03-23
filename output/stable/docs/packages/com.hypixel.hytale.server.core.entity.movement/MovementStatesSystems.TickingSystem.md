---
title: "MovementStatesSystems.TickingSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.movement"
fqcn: "com.hypixel.hytale.server.core.entity.movement.MovementStatesSystems.TickingSystem"
api_surface: false
extends: "EntityTickingSystem"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.entity.movement`

```java
public static class TickingSystem extends EntityTickingSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore, EntityTrackerSystems.Visible>` | `visibleComponentType` |
| `private final` | `ComponentType<EntityStore, MovementStatesComponent>` | `movementStatesComponentComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `TickingSystem( @Nonnull ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType, @Nonnull ComponentType<EntityStore, MovementStatesComponent> movementStatesComponentComponentType )` |
| `public` | `SystemGroup<EntityStore>` | `getGroup()` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `void` | `tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `private static` | `void` | `queueUpdatesFor( @Nonnull Ref<EntityStore> ref, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo, @Nonnull MovementStatesComponent movementStatesComponent )` |
| `public static` | `void` | `copyMovementStatesFrom(@Nonnull MovementStates from, @Nonnull MovementStates to)` |
