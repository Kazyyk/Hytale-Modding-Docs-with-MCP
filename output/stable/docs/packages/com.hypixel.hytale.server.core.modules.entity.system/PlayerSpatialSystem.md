---
title: "PlayerSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.PlayerSpatialSystem"
api_surface: false
extends: "SpatialSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "spatial"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class PlayerSpatialSystem extends SpatialSystem<EntityStore>
```

Spatial indexing system specifically for player entities. Maintains a spatial data structure for efficient proximity queries on players, separate from the general entity spatial index. Extends the generic `SpatialSystem` framework.

## Query

```java
@Nonnull
public static final Query<EntityStore> QUERY = Archetype.of(Player.getComponentType(), TransformComponent.getComponentType())
```

Matches entities that have both `Player` and `TransformComponent`. Uses `Archetype.of()` to create the query. Player entities are excluded from [EntitySpatialSystem](EntitySpatialSystem.md) via `Query.not(Player.getComponentType())`.

## Constructor

```java
public PlayerSpatialSystem(@Nonnull ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)
```

Takes the spatial resource type that this system will maintain in the entity store.

## Methods

```java
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

- [EntitySpatialSystem](EntitySpatialSystem.md) -- spatial system for general non-player entities
- [ItemSpatialSystem](ItemSpatialSystem.md) -- spatial system for item entities
- [NetworkSendableSpatialSystem](NetworkSendableSpatialSystem.md) -- spatial system for network-sendable entities
- [PlayerCollisionResultAddSystem](PlayerCollisionResultAddSystem.md) -- initializes collision for players
- `SpatialSystem` -- abstract base class providing spatial indexing infrastructure
- `Player` -- the player ECS component
- `TransformComponent` -- provides entity position
