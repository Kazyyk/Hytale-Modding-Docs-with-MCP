# DespawnSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: EntityTickingSystem<EntityStore>

public class DespawnSystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that removes entities whose scheduled despawn time has elapsed. On each tick, reads the DespawnComponent to get the despawn instant, compares it against the current server time from `TimeResource`, and issues a `RemoveReason.REMOVE` command if the time has passed.

The query excludes entities with the `Interactable` component, preventing despawn of entities that are currently being interacted with.

Supports parallel execution via `EntityTickingSystem.maybeUseParallel()`.

## Constructor


public DespawnSystem(ComponentType<EntityStore, DespawnComponent> despawnComponentType)

Constructs the system with the given despawn component type. The query is built as `Query.and(despawnComponentType, Query.not(Interactable.getComponentType()))`.

## Methods


@Override
public boolean isParallel(int archetypeChunkSize, int taskCount)

Returns `true` when parallel execution is beneficial, delegating to `EntityTickingSystem.maybeUseParallel()`.


@Nonnull
@Override
public Query<EntityStore> getQuery()

Returns the compound query matching entities that have a `DespawnComponent` but do not have an `Interactable` component.


@Override
public void tick(
    float dt,
    int index,
    @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
    @Nonnull Store<EntityStore> store,
    @Nonnull CommandBuffer<EntityStore> commandBuffer
)

Per-entity tick. Reads the despawn instant from the `DespawnComponent`, retrieves the current time from `TimeResource`, and removes the entity if the current time is after the despawn instant.

## Related Types

- DespawnComponent -- the component that stores the despawn time
- EntityModule -- registers this system during setup
- `TimeResource` -- provides the current server time for comparison
- `Interactable` -- entities with this component are excluded from despawn
- `EntityTickingSystem` -- base class for per-entity ticking systems

Also in this package: AllLegacyEntityTypesQuery, AllLegacyLivingEntityTypesQuery, BlockEntitySetupSystem, BlockEntitySystems, BlockEntityTrackerSystem, BlockMigrationExtraInfo, DespawnComponent, EntityModule, EntityRegistration, EntityRegistry, HiddenFromPlayerMigrationSystem, LegacyEntityHolderSystem, LegacyEntityRefSystem, LegacyProjectileSystems, LegacyTransformSystem, LegacyUUIDSystem, LegacyUUIDUpdateSystem, MigrationSystem, OnAddHolderSystem, OnAddRefSystem (and 4 more)

Complete API:
  public boolean isParallel(int archetypeChunkSize, int taskCount)
  public Query<EntityStore> getQuery()
  public void tick(float dt, int index, ArchetypeChunk<EntityStore> archetypeChunk, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)

Fields:
private final ComponentType<EntityStore,DespawnComponent> despawnComponentType
private final Query<EntityStore> query
