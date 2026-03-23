# EntityHolderEventSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: EcsEvent> extends EventSystem | Implements: QuerySystem<ECS_TYPE>

public abstract class EntityHolderEventSystem<ECS_TYPE, EventType extends EcsEvent> extends EventSystem<EventType> implements QuerySystem<ECS_TYPE>

Abstract system that handles events dispatched on entity holders (Holder instances) in the ECS.

Known subclasses: OnReplacedHolder

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  public abstract void handle(Holder<ECS_TYPE> var1, Store<ECS_TYPE> var2, CommandBuffer<ECS_TYPE> var3, EventType var4)
  public void handleInternal(Holder<ECS_TYPE> holder, Store<ECS_TYPE> store, CommandBuffer<ECS_TYPE> commandBuffer, EventType event)
