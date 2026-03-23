# StoreSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: System<ECS_TYPE>

public abstract class StoreSystem<ECS_TYPE> extends System<ECS_TYPE>

## Methods

- public abstract void onSystemAddedToStore(@Nonnull Store<ECS_TYPE> var1)
- public abstract void onSystemRemovedFromStore(@Nonnull Store<ECS_TYPE> var1)

Known subclasses: ChunkLoaderSaverSetupSystem, Init, InitSystem, Load, ReputationAttitudeSystem, WorldAddedSystem, WorldPregenerateSystem, WorldRemoved, WorldRemovedSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EntityHolderEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, System, WorldEventSystem

Complete API:
  public abstract void onSystemAddedToStore(Store<ECS_TYPE> var1)
  public abstract void onSystemRemovedFromStore(Store<ECS_TYPE> var1)
