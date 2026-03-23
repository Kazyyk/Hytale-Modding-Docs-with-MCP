# TickingSystem

Type: class | Package: com.hypixel.hytale.component.system.tick | Extends: System<ECS_TYPE> | Implements: TickableSystem<ECS_TYPE>

public abstract class TickingSystem<ECS_TYPE> extends System<ECS_TYPE> implements TickableSystem<ECS_TYPE>

## Methods

- @Override public abstract void tick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)

Known subclasses: ArchetypeTickingSystem, BehaviourTickSystem, ChunkUnloadingSystem, DelayedSystem, LocalSpawnControllerSystem, NewSpawnStartTickingSystem, RemovalSystem, RoleChangeSystem, SpatialSystem, Ticking, Ticking, Ticking, TimeSystem, UpdateWorldSlumberSystem, WorldSpawningSystem

Also in this package: ArchetypeTickingSystem, Data, DelayedEntitySystem, EntityTickingSystem, RunWhenPausedSystem, SystemTaskData, TickableSystem

Complete API:
  public abstract void tick(float var1, int var2, Store<ECS_TYPE> var3)
