# DelayedSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: TickingSystem<ECS_TYPE>

public abstract class DelayedSystem<ECS_TYPE> extends TickingSystem<ECS_TYPE>

## Fields

- @Nonnull private final ResourceType<ECS_TYPE, DelayedSystem.Data<ECS_TYPE>> resourceType
- private final float intervalSec

## Constructors

- public DelayedSystem(float intervalSec)

## Methods

- @Nonnull public ResourceType<ECS_TYPE, DelayedSystem.Data<ECS_TYPE>> getResourceType()
- public float getIntervalSec()
- @Override public void tick(float dt, int systemIndex, @Nonnull Store<ECS_TYPE> store)
- public abstract void delayedTick(float var1, int var2, @Nonnull Store<ECS_TYPE> var3)

## Inner Types

- `DelayedSystem.Data`

Known subclasses: SleepNotificationSystem, StartSlumberSystem, StartVoidEventInFragmentSystem, TickingSystem, TimePacketSystem, UpdateEntitySeedSystem, WorldConfigSaveSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, EcsEvent, EntityEventSystem, EntityHolderEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  public ResourceType<ECS_TYPE,DelayedSystem.Data<ECS_TYPE>> getResourceType()
  public float getIntervalSec()
  public void tick(float dt, int systemIndex, Store<ECS_TYPE> store)
  public abstract void delayedTick(float var1, int var2, Store<ECS_TYPE> var3)

Fields:
private final ResourceType<ECS_TYPE,DelayedSystem.Data<ECS_TYPE>> resourceType
private final float intervalSec
