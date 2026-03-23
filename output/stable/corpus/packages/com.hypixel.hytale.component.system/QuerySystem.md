# QuerySystem

Type: interface | Package: com.hypixel.hytale.component.system | Extends: ISystem<ECS_TYPE>

public interface QuerySystem<ECS_TYPE> extends ISystem<ECS_TYPE>

## Methods

- default boolean test(ComponentRegistry<ECS_TYPE> componentRegistry, Archetype<ECS_TYPE> archetype)
- @Nullable Query<ECS_TYPE> getQuery()

Known implementors: ArchetypeChunkSystem, ArchetypeDataSystem, ArchetypeTickingSystem, BlockPausedMovementSystem, EntityEventSystem, HolderSystem, RefChangeSystem, RefSystem, SpatialSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  default boolean test(ComponentRegistry<ECS_TYPE> componentRegistry, Archetype<ECS_TYPE> archetype)
  Query<ECS_TYPE> getQuery()
