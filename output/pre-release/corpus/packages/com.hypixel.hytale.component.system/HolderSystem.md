# HolderSystem

Type: class | Package: com.hypixel.hytale.component.system | Extends: System<ECS_TYPE> | Implements: QuerySystem<ECS_TYPE>

public abstract class HolderSystem<ECS_TYPE> extends System<ECS_TYPE> implements QuerySystem<ECS_TYPE>

## Methods

- public abstract void onEntityAdd(@Nonnull Holder<ECS_TYPE> var1, @Nonnull AddReason var2, @Nonnull Store<ECS_TYPE> var3)
- public abstract void onEntityRemoved(@Nonnull Holder<ECS_TYPE> var1, @Nonnull RemoveReason var2, @Nonnull Store<ECS_TYPE> var3)

Known subclasses: Add, AddOrRemove, AddSimulationManagerSystem, AddSystem, AddSystem, AddSystem, AddedFromWorldGen, AddedFromWorldGen, AddedFromWorldGenSystem, ApplyRandomSkin, AssignNetworkIdToProps, AssignmentSystem, BalancingInitialisationSystem, BlockEntitySetupSystem, BuilderToolsUserDataSystem, ChunkColumnMigrationSystem, ChunkSectionMigrationSystem, CraftingHolderSystem, DamageDataSetupSystem, Ensure, EnsureBlockHealthSystem, EnsureBlockSection, EnsureBuilderTools, EnsureFluidSection, EnsureMinecartComponents, EnsureNetworkSendable, EnsureNetworkSendable, EnsureNetworkSendable, EnsureNetworkSendable, EnsureNetworkSendableSystem, EnsurePropsPrefabCopyable, EnsureRequiredComponents, EntityAdded, EntityRemoved, EntityRemoved, LegacyEntityHolderSystem, LegacyWorldGenId, LoadBlockSection, MigrationSystem, MigrationSystem, ModelSpawned, NPCAddedFromWorldGen, NPCReputationHolderSystem, NameplateHolderSystem, ObjectiveItemEntityRemovalSystem, OnAddHolderSystem, OnAdded, OnLoadFromExternal, OnNPCAdded, OnRemove, PhysicsValuesAddSystem, PlayerAddManagerSystem, PlayerAdded, PlayerAddedSystem, PlayerCameraAddSystem, PlayerCollisionResultAddSystem, PlayerConnect, PlayerInitSystem, PlayerRemovedSystem, PlayerSetup, RegisterTrackerSystem, RemoveMountedHolder, RemoveVisibleComponent, RoleActivateSystem, RoleActivateSystem, RoleBuilderSystem, SetRenderedModel, Setup, Setup, Setup, Setup, SetupSection, SpawnBeaconCheckRemovalSystem

Also in this package: ArchetypeChunkSystem, CancellableEcsEvent, Data, DelayedSystem, EcsEvent, EntityEventSystem, EntityHolderEventSystem, EventSystem, ICancellableEcsEvent, ISystem, MetricSystem, QuerySystem, RefChangeSystem, RefSystem, StoreSystem, System, WorldEventSystem

Complete API:
  public abstract void onEntityAdd(Holder<ECS_TYPE> var1, AddReason var2, Store<ECS_TYPE> var3)
  public abstract void onEntityRemoved(Holder<ECS_TYPE> var1, RemoveReason var2, Store<ECS_TYPE> var3)
