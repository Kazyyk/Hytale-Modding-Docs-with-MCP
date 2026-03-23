# RefSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: System<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class RefSystem<ECS_TYPE> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>

## Methods

- public abstract void onEntityAdded(@Nonnull Ref<ECS_TYPE> var1, @Nonnull AddReason var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)
- public abstract void onEntityRemove(@Nonnull Ref<ECS_TYPE> var1, @Nonnull RemoveReason var2, @Nonnull Store<ECS_TYPE> var3, @Nonnull CommandBuffer<ECS_TYPE> var4)

Known subclasses: AddOrRemove, AddSpawnEntityEffectSystem, AddedFromExternalSystem, AddedSystem, BeaconAddRemoveSystem, BlockSpawnerSystem, BlockStateInfoRefSystem, CacheMarker, ChunkAdded, ChunkRefAdded, CleanUpSystem, ClearMarker, ClearOnRemove, CoopResidentEntitySystem, CraftingRefSystem, CurseItemDropsSystem, DeleteCursedItemsOnSpawnSystem, DeployableRegisterer, EntityAdded, EntityAdded, EntityAdded, EntityAddedFromExternal, EntityRef, EntityRefAdded, EntityRemoved, EntityRemoved, FailedSpawnSystem, FixFillerBlocksSystem, Init, InitSystem, InitializeSystem, Instantiate, ItemContainerStateRefSystem, LegacyEntityAdded, LegacyEntityRefSystem, LocalSpawnBeaconSystem, LocalSpawnSetupSystem, MarkerAddRemoveSystem, MergeWaitingBlocksSystem, NameplateRefSystem, NetworkIdSystem, ObjectivePlayerSetupSystem, OnAdd, OnAddOrRemoved, OnAddRefSystem, OnAddRemove, OnAddRemove, OnAddedOrRemoved, OnChunkLoad, OnCoopAdded, OnFarmBlockAdded, OnPlayerRemove, OnRemove, OnRemove, OnRemove, OnSoilAdded, PlayerAddedSystem, PlayerAddedSystem, PlayerAddedSystem, PlayerInitSystem, PlayerRefAddedSystem, PlayerSpawnedSystem, PortalInvalidDestinationSystem, PostAssignmentSystem, ProcessingBenchLifecycle, RemoveBlockSeat, RemoveMounted, RemoveMountedBy, ReturnToHubButtonSystem, SpawnMarkerAddedFromExternal, SpawnMarkerSuppressionSystem, SpawnSystem, SpawnedDeathAnimation, StashSystem, Suppressor, TeleporterOwnedWarpRefSystem, TrackerSystem, TurnOffTeleportersSystem, UUIDSystem, UnloadEntityFromChunk, VoidEventRefSystem, WorldSpawnTrackingSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EntityHolderEventSystem, EventSystem, HolderSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, StoreSystem, System, WorldEventSystem

Complete API:
  public abstract void onEntityAdded(Ref<ECS_TYPE> var1, AddReason var2, Store<ECS_TYPE> var3, CommandBuffer<ECS_TYPE> var4)
  public abstract void onEntityRemove(Ref<ECS_TYPE> var1, RemoveReason var2, Store<ECS_TYPE> var3, CommandBuffer<ECS_TYPE> var4)
