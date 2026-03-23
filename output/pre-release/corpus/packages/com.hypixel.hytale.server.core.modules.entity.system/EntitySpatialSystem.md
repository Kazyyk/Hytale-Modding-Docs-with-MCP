# EntitySpatialSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system | Extends: SpatialSystem<EntityStore>

public class EntitySpatialSystem extends SpatialSystem<EntityStore>

Spatial indexing system for general (non-player, non-item) entities. Maintains a spatial data structure that allows efficient spatial queries such as finding nearby entities. Extends the generic `SpatialSystem` framework.

## Query


public static final Query<EntityStore> QUERY = Query.and(
    TransformComponent.getComponentType(), Query.not(Intangible.getComponentType()), Query.not(Player.getComponentType())
);

Matches entities that have a `TransformComponent` but are **not** `Intangible` and are **not** `Player` entities. Players have their own PlayerSpatialSystem, and intangible entities are excluded from spatial queries.

## Constructor


public EntitySpatialSystem(ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)

Takes the spatial resource type that this system will maintain in the entity store.

## Methods


@Nonnull
@Override
public Query<EntityStore> getQuery()

Returns `QUERY`.


@Override
public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)

Delegates to the superclass `SpatialSystem.tick()`.


@Nonnull
@Override
public Vector3d getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)

Returns the entity's position from its `TransformComponent`.

## Related Types

- PlayerSpatialSystem -- spatial system for player entities
- ItemSpatialSystem -- spatial system for item entities
- NetworkSendableSpatialSystem -- spatial system for network-sendable entities
- `SpatialSystem` -- abstract base class providing spatial indexing infrastructure
- `TransformComponent` -- provides entity position
- `Intangible` -- marker component; intangible entities are excluded
