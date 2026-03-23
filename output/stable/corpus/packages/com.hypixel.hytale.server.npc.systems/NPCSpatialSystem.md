# NPCSpatialSystem

Type: class | Package: com.hypixel.hytale.server.npc.systems | Extends: SpatialSystem<EntityStore>

public class NPCSpatialSystem extends SpatialSystem<EntityStore>

Maintains the NPC spatial index for proximity queries. Updates the spatial structure each tick with the current positions of all NPC entities. Used by PositionCacheSystems and avoidance/separation steering.

## Query


public static final Query<EntityStore> QUERY = Archetype.of(NPCEntity.getComponentType(), TransformComponent.getComponentType())

Matches entities with both `NPCEntity` and `TransformComponent`.

## Constructor


public NPCSpatialSystem(@Nonnull ResourceType<EntityStore, SpatialResource<Ref<EntityStore>, EntityStore>> spatialResource)

## Position Extraction


@Nonnull
@Override
public Vector3d getPosition(@Nonnull ArchetypeChunk<EntityStore> archetypeChunk, int index)

Returns the entity's position from its `TransformComponent`.

## Related Types

- PositionCacheSystems -- uses the NPC spatial resource to populate nearby-entity caches
- AvoidanceSystem -- uses spatial data for avoidance steering

Also in this package: AddSimulationManagerSystem, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedFromWorldGenSystem, AddedSystem, AvoidanceSystem, BalancingInitialisationSystem, BeaconAddRemoveSystem, BeaconSystem, BehaviourTickSystem, BlackboardSystems, BreakBlockEventSystem, ComputeVelocitySystem, DamageBlockEventSystem, DamageDealtSystem, DamageReceivedEventViewSystem, DamageReceivedSystem, DropDeathItems, EntityViewSystem, FailedSpawnSystem (and 48 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void tick(float dt, int systemIndex, Store<EntityStore> store)
  public Vector3d getPosition(ArchetypeChunk<EntityStore> archetypeChunk, int index)

Fields:
public static final Query<EntityStore> QUERY
