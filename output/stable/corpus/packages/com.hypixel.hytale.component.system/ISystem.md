# ISystem

Type: interface | Package: com.hypixel.hytale.component.system

public interface ISystem<ECS_TYPE>

## Fields

- ISystem[] EMPTY_ARRAY

## Methods

- default void onSystemRegistered()
- default void onSystemUnregistered()
- @Nullable default SystemGroup<ECS_TYPE> getGroup()
- @Nonnull default Set<Dependency<ECS_TYPE>> getDependencies()
- static <ECS_TYPE> void calculateOrder(@Nonnull ComponentRegistry<ECS_TYPE> registry, @Nonnull ISystem<ECS_TYPE>[] sortedSystems, int systemSize)

Known implementors: IVelocityModifyingSystem, OrderGatherFilter, QuerySystem, StatModifyingSystem, System, TickableSystem, WorldEventSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  default void onSystemRegistered()
  default void onSystemUnregistered()
  default SystemGroup<ECS_TYPE> getGroup()
  default Set<Dependency<ECS_TYPE>> getDependencies()
  static void calculateOrder(ComponentRegistry<ECS_TYPE> registry, ISystem<ECS_TYPE>[] sortedSystems, int systemSize)

Fields:
ISystem[] EMPTY_ARRAY
