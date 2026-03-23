---
title: "NetworkSendableSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.NetworkSendableSpatialSystem"
api_surface: false
extends: "SpatialSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "spatial"
  - "network"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class NetworkSendableSpatialSystem extends SpatialSystem<EntityStore>
```

Spatial indexing system for entities that are visible over the network. Maintains a spatial data structure for all entities that have both a `TransformComponent` and a `NetworkId`, enabling the entity tracker to efficiently find nearby entities to send to clients.

## Query

```java
private static final Query<EntityStore> QUERY = Archetype.of(TransformComponent.getComponentType(), NetworkId.getComponentType())
```

Matches entities that have both `TransformComponent` and `NetworkId`. Uses `Archetype.of()` to create the query rather than `Query.and()`.

## Constructor

```java
public NetworkSendableSpatialSystem(ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)
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
- [PlayerSpatialSystem](PlayerSpatialSystem.md) -- spatial system for player entities
- [ItemSpatialSystem](ItemSpatialSystem.md) -- spatial system for item entities
- `SpatialSystem` -- abstract base class providing spatial indexing infrastructure
- `TransformComponent` -- provides entity position
- `NetworkId` -- marks an entity as having a network identity
