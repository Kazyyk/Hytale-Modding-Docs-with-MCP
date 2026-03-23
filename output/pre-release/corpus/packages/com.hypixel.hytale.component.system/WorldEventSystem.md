# WorldEventSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: EcsEvent> extends EventSystem<EventType> | Implements: ISystem<ECS_TYPE>

public abstract class WorldEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements ISystem<ECS_TYPE>

## Constructors

- protected WorldEventSystem(@Nonnull Class<EventType> eventType)

## Methods

- public abstract void handle(@Nonnull Store<ECS_TYPE> var1, @Nonnull CommandBuffer<ECS_TYPE> var2, @Nonnull EventType var3)
- public void handleInternal(@Nonnull Store<ECS_TYPE> store, @Nonnull CommandBuffer<ECS_TYPE> commandBuffer, @Nonnull EventType event)

Known subclasses: MoonPhaseChangeEventSystem, PrefabPasteEventSystem, PrefabPasteEventSystem, PrefabPasteEventSystem, PrefabPlaceEntityEventSystem, PrefabPlaceEntityEventSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EntityHolderEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System

Complete API:
  public abstract void handle(Store<ECS_TYPE> var1, CommandBuffer<ECS_TYPE> var2, EventType var3)
  public void handleInternal(Store<ECS_TYPE> store, CommandBuffer<ECS_TYPE> commandBuffer, EventType event)
