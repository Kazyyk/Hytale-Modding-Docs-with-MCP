---
title: "HitboxCollisionSystems.EntityTrackerRemove"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision"
fqcn: "com.hypixel.hytale.server.core.modules.entity.hitboxcollision.HitboxCollisionSystems.EntityTrackerRemove"
api_surface: false
extends: "RefChangeSystem"
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
public static class EntityTrackerRemove extends RefChangeSystem<EntityStore, HitboxCollision>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `ComponentType<EntityStore, HitboxCollision>` | `componentType` |
| `private final` | `ComponentType<EntityStore, EntityTrackerSystems.Visible>` | `visibleComponentType` |
| `private final` | `Query<EntityStore>` | `query` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `` | `EntityTrackerRemove( ComponentType<EntityStore, EntityTrackerSystems.Visible> visibleComponentType, ComponentType<EntityStore, HitboxCollision> componentType )` |
| `public` | `Query<EntityStore>` | `getQuery()` |
| `public` | `ComponentType<EntityStore, HitboxCollision>` | `componentType()` |
| `public` | `void` | `onComponentAdded( @Nonnull Ref<EntityStore> ref, @Nonnull HitboxCollision component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `void` | `onComponentSet( @Nonnull Ref<EntityStore> ref, HitboxCollision oldComponent, @Nonnull HitboxCollision newComponent, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
| `public` | `void` | `onComponentRemoved( @Nonnull Ref<EntityStore> ref, @Nonnull HitboxCollision component, @Nonnull Store<EntityStore> store, @Nonnull CommandBuffer<EntityStore> commandBuffer )` |
