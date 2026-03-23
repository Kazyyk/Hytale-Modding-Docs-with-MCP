---
title: "HitboxCollisionSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision"
fqcn: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision.HitboxCollisionSystems"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "entity"
---
**Package:** `com.hypixel.hytale.server.core.modules.entity.hitboxcollision`

```java
public class HitboxCollisionSystems
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore, HitboxCollision>` | `componentType` |
| `private final` | `ComponentType<EntityStore, EntityTrackerSystems.Visible>` | `visibleComponentType` |
| `private final` | `Query<EntityStore>` | `query` |
| `private final` | `ComponentType<EntityStore, EntityTrackerSystems.Visible>` | `visibleComponentType` |
| `private final` | `ComponentType<EntityStore, HitboxCollision>` | `componentType` |
| `private final` | `Query<EntityStore>` | `query` |
| `private final` | `ComponentType<EntityStore, HitboxCollision>` | `componentType` |
| `private final` | `ComponentType<EntityStore, Player>` | `playerComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `ComponentType<EntityStore, HitboxCollision>` | `componentType()` |
| `public` | `void` | `onComponentAdded( @Nonnull Ref<EntityStore> ref, @Nonnull HitboxCollision component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `void` | `onComponentSet( @Nonnull Ref<EntityStore> ref, HitboxCollision oldComponent, @Nonnull HitboxCollision newComponent, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `void` | `onComponentRemoved( @Nonnull Ref<EntityStore> ref, @Nonnull HitboxCollision component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `SystemGroup<EntityStore>` | `getGroup()` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `void` | `tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `private static` | `void` | `queueUpdatesFor( Ref<EntityStore> ref, @Nonnull HitboxCollision hitboxCollision, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo )` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `void` | `onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)` |
| `public` | `void` | `onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)` |
