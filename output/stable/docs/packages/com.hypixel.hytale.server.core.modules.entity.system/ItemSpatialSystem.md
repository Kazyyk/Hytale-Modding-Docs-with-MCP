---
title: "ItemSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.ItemSpatialSystem"
api_surface: false
extends: "SpatialSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "spatial"
  - "item"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class ItemSpatialSystem extends SpatialSystem<EntityStore>
```

Spatial indexing system for item entities. Maintains a spatial data structure for efficient proximity queries on dropped items, enabling item merging and pickup detection. Extends the generic `SpatialSystem` framework.

## Query

```java
@Nonnull
private static final AndQuery<EntityStore> QUERY = Query.and(
    ItemComponent.getComponentType(), TransformComponent.getComponentType(), Query.not(PreventItemMerging.getComponentType())
);
```

Matches entities that have both `ItemComponent` and `TransformComponent` but do **not** have `PreventItemMerging`. Items flagged with `PreventItemMerging` are excluded from the spatial index to prevent them from being merged with other items.

## Constructor

```java
public ItemSpatialSystem(ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)
```

Takes the spatial resource type that this system will maintain in the entity store.

## Methods

```java
@Nonnull
@Override
public Query<EntityStore> getQuery()
```

Returns `QUERY`.

```java
@Override
public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
```

Delegates to the superclass `SpatialSystem.tick()`.

```java
@Nonnull
@Override
public Vector3d getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)
```

Returns the entity's position from its `TransformComponent`.

## Related Types

- [EntitySpatialSystem](EntitySpatialSystem.md) -- spatial system for general entities
- [PlayerSpatialSystem](PlayerSpatialSystem.md) -- spatial system for player entities
- [NetworkSendableSpatialSystem](NetworkSendableSpatialSystem.md) -- spatial system for network-sendable entities
- `SpatialSystem` -- abstract base class providing spatial indexing infrastructure
- `ItemComponent` -- marks an entity as an item
- `PreventItemMerging` -- marker component that excludes items from merging
- `TransformComponent` -- provides entity position
