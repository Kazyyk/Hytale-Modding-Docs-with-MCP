# TickableSystem

Type: interface | Package: com.hypixel.hytale.component.system.tick | Extends: ISystem<ECS_TYPE>

public interface TickableSystem<ECS_TYPE> extends ISystem<ECS_TYPE>

## Methods

- void tick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)

Known implementors: RunWhenPausedSystem, TickingSystem

Also in this package: ArchetypeTickingSystem, Data, DelayedEntitySystem, EntityTickingSystem, RunWhenPausedSystem, SystemTaskData, TickingSystem

Complete API:
  void tick(float var1, int var2, Store<ECS_TYPE> var3)
