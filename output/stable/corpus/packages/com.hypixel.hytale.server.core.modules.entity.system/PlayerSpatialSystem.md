# PlayerSpatialSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.system | Extends: SpatialSystem<EntityStore>

public class PlayerSpatialSystem extends SpatialSystem<EntityStore>

Spatial indexing system specifically for player entities. Maintains a spatial data structure for efficient proximity queries on players, separate from the general entity spatial index. Extends the generic `SpatialSystem` framework.

## Query


@Nonnull
public static final Query<EntityStore> QUERY = Archetype.of(Player.getComponentType(), TransformComponent.getComponentType())

Matches entities that have both `Player` and `TransformComponent`. Uses `Archetype.of()` to create the query. Player entities are excluded from EntitySpatialSystem via `Query.not(Player.getComponentType())`.

## Constructor


public PlayerSpatialSystem(@Nonnull ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)

Takes the spatial resource type that this system will maintain in the entity store.

## Methods


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

- EntitySpatialSystem -- spatial system for general non-player entities
- ItemSpatialSystem -- spatial system for item entities
- NetworkSendableSpatialSystem -- spatial system for network-sendable entities
- PlayerCollisionResultAddSystem -- initializes collision for players
- `SpatialSystem` -- abstract base class providing spatial indexing infrastructure
- `Player` -- the player ECS component
- `TransformComponent` -- provides entity position

Also in this package: Add, AdventurePlayerSystem, AnimationEntityTrackerUpdate, ApplyRandomSkin, AssignNetworkIdToProps, AudioSystems, Capture, ClearFromPrefabMarker, ClearFromWorldGenMarker, ClearMarker, DynamicLightTracker, EnsurePropsPrefabCopyable, EntityInteractableSystems, EntitySpatialSystem, EntitySystems, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerUpdate (and 40 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public Vector3d getPosition(ArchetypeChunk<EntityStore> archetypeChunk, int index)

Fields:
public static final Query<EntityStore> QUERY
