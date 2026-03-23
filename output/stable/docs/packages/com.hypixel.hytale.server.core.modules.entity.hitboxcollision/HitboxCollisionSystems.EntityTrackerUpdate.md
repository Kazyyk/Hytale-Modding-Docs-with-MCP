---
title: "HitboxCollisionSystems.EntityTrackerUpdate"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision"
fqcn: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision.HitboxCollisionSystems.EntityTrackerUpdate"
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
**Package:** `com.hypixel.hytale.server.core.modules.entity.hitboxcollision`

```java
public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore, EntityTrackerSystems.Visible>` | `visibleComponentType` |
| `private final` | `ComponentType<EntityStore, HitboxCollision>` | `componentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EntityTrackerUpdate( ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType, ComponentType<EntityStore, HitboxCollision> componentType )` |
| `public` | `SystemGroup<EntityStore>` | `getGroup()` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `boolean` | `isParallel(int archetypeChunkSize, int taskCount)` |
| `public` | `void` | `tick( float dt, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `private static` | `void` | `queueUpdatesFor( Ref<EntityStore> ref, @Nonnull HitboxCollision hitboxCollision, @Nonnull Map<Ref<EntityStore>, EntityTrackerSystems.EntityViewer> visibleTo )` |
