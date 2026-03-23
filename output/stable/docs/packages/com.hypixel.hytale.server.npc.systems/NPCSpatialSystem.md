---
title: "NPCSpatialSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.NPCSpatialSystem"
api_surface: false
extends: "SpatialSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "spatial"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class NPCSpatialSystem extends SpatialSystem<EntityStore>
```

Maintains the NPC spatial index for proximity queries. Updates the spatial structure each tick with the current positions of all NPC entities. Used by [PositionCacheSystems](PositionCacheSystems.md) and avoidance/separation steering.

## Query

```java
public static final Query<EntityStore> QUERY = Archetype.of(NPCEntity.getComponentType(), TransformComponent.getComponentType())
```

Matches entities with both `NPCEntity` and `TransformComponent`.

## Constructor

```java
public NPCSpatialSystem(@Nonnull ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)
```

## Position Extraction

```java
@Nonnull
@Override
public Vector3d getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)
```

Returns the entity's position from its `TransformComponent`.

## Related Types

- [PositionCacheSystems](PositionCacheSystems.md) -- uses the NPC spatial resource to populate nearby-entity caches
- [AvoidanceSystem](AvoidanceSystem.md) -- uses spatial data for avoidance steering
