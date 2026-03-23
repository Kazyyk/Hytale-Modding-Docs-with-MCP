# RefChangeSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: Component<ECS_TYPE>> extends System<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class RefChangeSystem<ECS_TYPE, T extends Component<ECS_TYPE>> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>

## Methods

- @Nonnull public abstract ComponentType<ECS_TYPE, T> componentType()
- public abstract void onComponentAdded(@Nonnull Ref<ECS_TYPE> var1, @Nonnull T var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)
- public abstract void onComponentSet(@Nonnull Ref<ECS_TYPE> var1, @Nullable T var2, @Nonnull T var3, @Nonnull Store<ECS_TYPE> var4, @Nonnull CommandBuffer<ECS_TYPE> var5)
- public abstract void onComponentRemoved(@Nonnull Ref<ECS_TYPE> var1, @Nonnull T var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)

Known subclasses: BlockComponentChunkLoadingSystem, ClearOnTeleport, ComponentRemoved, CreateWarpWhenTeleporterPlacedSystem, EnterBedSystem, EntityChunkLoadingSystem, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerAddAndRemove, EntityTrackerRemove, EntityTrackerRemove, EntityTrackerRemove, EntityTrackerRemove, EntityTrackerRemove, EntityTrackerRemove, InitKnockback, InvalidateWeatherAfterTeleport, LegacyUUIDUpdateSystem, ModelChange, ModelChangeSystem, MountedEntityDeath, MoveSystem, NameplateRefChangeSystem, NameplateRefChangeSystem, OnDeathSystem, OnFlockJoinSystem, OnNonTicking, OnPlayerSettingsChange, OnRespawnSystem, OnTeleportSystem, PlayerMount, PlayerMoveCompleteSystem, PlayerMoveSystem, PlayerUpdateMovementManager, RefChange, Remove, TeleportMountedEntity, TeleporterOwnedWarpRefChangeSystem, TickingState, TickingState, TrackedMounted, TrackerRemove, UpdateBoundingBox, WakeUpOnDismountSystem, WorldGenChangeSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EntityHolderEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  public abstract ComponentType<ECS_TYPE,T> componentType()
  public abstract void onComponentAdded(Ref<ECS_TYPE> var1, T var2, Store<ECS_TYPE> var3, CommandBuffer<ECS_TYPE> var4)
  public abstract void onComponentSet(Ref<ECS_TYPE> var1, T var2, T var3, Store<ECS_TYPE> var4, CommandBuffer<ECS_TYPE> var5)
  public abstract void onComponentRemoved(Ref<ECS_TYPE> var1, T var2, Store<ECS_TYPE> var3, CommandBuffer<ECS_TYPE> var4)
