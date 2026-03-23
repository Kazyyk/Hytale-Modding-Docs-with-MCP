# Component

Type: interface | Package: com.hypixel.hytale.component | Extends: Cloneable

public interface Component<ECS_TYPE> extends Cloneable

The root interface for all ECS components. Every piece of per-entity data in the ECS framework implements this interface. Components are stored in ArchetypeChunk arrays and accessed via ComponentType handles.

Components must be cloneable because the ECS serialization, entity copying, and archetype migration operations all require deep copies of component data.

## Type Parameters

- `ECS_TYPE` -- the store type parameter (e.g., `EntityStore` or `ChunkStore`)

## Fields


@Nonnull
Component[] EMPTY_ARRAY = new Component[0];

Shared empty array constant used as a default when no components are present.

## Methods


@Nullable
Component<ECS_TYPE> clone();

Creates a deep copy of this component. Returns `null` if the component cannot be cloned.


@Nullable
default Component<ECS_TYPE> cloneSerializable()

Creates a copy containing only serializable state. Defaults to calling `clone()`. Override this when a component contains transient runtime data that should be excluded from persistence.

## Related Types

- ComponentType -- typed handle used to register and access components in the ECS
- ArchetypeChunk -- stores component arrays for entities sharing the same archetype
- Store -- the ECS store that manages entities and their components
- Resource -- the equivalent interface for per-store singleton data

Known implementors: ActiveAnimationComponent, AmbienceTracker, AmbientEmitterComponent, ApplyRandomSkinPersistedComponent, AudioComponent, BeaconSupport, BlockChunk, BlockComponentChunk, BlockEntity, BlockHealthChunk, BlockMapMarker, BlockMountComponent, BlockPhysics, BlockPositionProvider, BlockSection, BlockSpawner, BlockState, BlockStateInfo, BoundingBox, BuilderToolsUserData, CameraManager, ChunkColumn, ChunkSection, ChunkSpawnData, ChunkSpawnedNPCData, ChunkSuppressionEntry, ChunkTracker, CollisionResultComponent, CombatActionEvaluator, CombatConstructionData, CombatData, ConfigurableInstanceBlock, CoopBlock, CoopResidentComponent, CraftingManager, CreativeHubEntityConfig, DamageDataComponent, DamageMemory, Data, DeathComponent, DeferredCorpseRemoval, DeployableComponent, DeployableOwnerComponent, DeployableProjectileComponent, DeployableProjectileShooterComponent, DespawnComponent, DisplayNameComponent, DynamicLight, EffectControllerComponent, Entity, EntityChunk, EntityGroup, EntityScaleComponent, EntityStatMap, EntityViewer, EnvironmentChunk, FailedSpawnComponent, FarmingBlock, FarmingBlockState, Flock, FlockMembership, FloodFillPositionSelector, FluidSection, FromPrefab, FromWorldGen, Frozen, HeadRotation, HiddenFromAdventurePlayers, HitboxCollision, InitialBeaconDelay, InstanceBlock, InstanceEntityConfig, Intangible, Interactable, InteractionManager, Interactions, Invulnerable, ItemComponent, ItemPhysicsComponent, KnockbackComponent, KnockbackSimulation, LaunchPad, LegacyBlockStateChunk, LocalSpawnBeacon, LocalSpawnController, MessageSupport, MinecartComponent, ModelComponent, MountedByComponent, MountedComponent, MovementAudioComponent, MovementManager, MovementStatesComponent, NPCBlockEventSupport, NPCEntityEventSupport, NPCMarkerComponent, NPCMountComponent, NPCTestData, Nameplate, NetworkId, NewSpawnComponent, NonSerialized, NonTicking, ObjectiveHistoryComponent, ObjectiveLocationMarker, ParkourCheckpoint, PendingTeleport, PersistentDynamicLight, PersistentFlockData, PersistentModel, PersistentRefCount, PhysicsValues, PickupItemComponent, PlacedByInteractionComponent, PlayerBlockEventSupport, PlayerEntityEventSupport, PlayerInput, PlayerMemories, PlayerRef, PlayerSettings, PlayerSkinComponent, PlayerSomnolence, PortalDevice, PositionDataComponent, PredictedProjectile, PrefabAnchor, PrefabCopyableComponent, PreventItemMerging, PreventPickup, Projectile, ProjectileComponent, PropComponent, ReachLocationMarker, Repulsion, ReputationGroupComponent, RespawnBlock, RespondToHit, RotateObjectComponent, SessionSettings, SleepTracker, SnapshotBuffer, SpawnJobData, SpawnMarkerBlockReference, SpawnMarkerEntity, SpawnReference, SpawnSuppressionComponent, StandardPhysicsProvider, StateEvaluator, StepComponent, TargetMemory, Teleport, TeleportHistory, TeleportRecord, Teleporter, TempUnknownComponent, TilledSoilBlock, Timers, TrackedPlacement, TransformComponent, UIComponentList, UUIDComponent, UniqueItemUsagesComponent, UnknownComponents, UsedTeleporter, ValueStore, Velocity, Visible, VoidEvent, VoidSpawner, WarpComponent, WeatherTracker, WorldChunk, WorldGenId, WorldPathBuilder

Also in this package: AddReason, Archetype, ArchetypeChunk, CommandBuffer, ComponentAccessor, ComponentRegistration, ComponentRegistry, ComponentRegistryProxy, ComponentType, Data, DisableProcessingAssert, EmptyResourceStorage, Holder, IComponentRegistry, IResourceStorage, NonSerialized, NonTicking, ProcessingCounter, ReadWriteQuery, Ref (and 8 more)

Complete API:
  Component<ECS_TYPE> clone()
  default Component<ECS_TYPE> cloneSerializable()

Fields:
Component[] EMPTY_ARRAY
