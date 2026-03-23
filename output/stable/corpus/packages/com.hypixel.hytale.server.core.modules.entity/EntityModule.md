# EntityModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: JavaPlugin

public class EntityModule extends JavaPlugin

The core server plugin that bootstraps the entire entity system. Registers all entity-related ECS components, systems, spatial resources, and asset stores onto the `EntityStore` component registry. This is the central wiring point for entity lifecycle management, physics, tracking, networking, player systems, items, teleportation, damage data, and model rendering.

Accessed as a singleton via `EntityModule.get()`. Depends on `Universe` and `CollisionModule`.

## Constants


public static final PluginManifest MANIFEST

Plugin manifest declaring `EntityModule` as a core plugin with dependencies on `Universe` and `CollisionModule`.


public static final String[] LEGACY_ENTITY_CLASS_NAMES = new String[]{
    "SpawnSuppressor", "Block", "LegacySpawnBeacon", "PatrolPathMarker", "Player", "SpawnBeacon", "SpawnMarker"
}

Array of legacy entity class names recognized by the system.


public static final String MOUNT_MOVEMENT_SETTINGS_ASSET_ID = "Mount"

Asset identifier for mount movement configuration.

## Singleton Access


public static EntityModule get()

Returns the singleton instance, set during construction.

## Constructor


public EntityModule(@Nonnull JavaPluginInit init)

Constructs the module and assigns the singleton instance. Called by the server framework.

## Lifecycle

### setup()


@Override
protected void setup()

Registers all entity ECS infrastructure. This is the largest registration method in the codebase. Key registrations include:

**Core components:** `Velocity`, `PhysicsValues`, `BoundingBox`, `EntityScaleComponent`, `TransformComponent`, `HeadRotation`, `UUIDComponent`, `CollisionResultComponent`, `NetworkId`, `RotateObjectComponent`, `EffectControllerComponent`, `Interactable`, `Intangible`, `PreventPickup`, `Invulnerable`, `RespondToHit`, `AudioComponent`, `MovementAudioComponent`, `PositionDataComponent`, `ActiveAnimationComponent`, `NewSpawnComponent`.

**Entity components:** `BlockEntity`, `ProjectileComponent`, `Player`, `Frozen`, `MovementManager`, `CameraManager`, `ModelComponent`, `PersistentModel`, `PropComponent`, `NPCMarkerComponent`, `PlayerSkinComponent`, `DisplayNameComponent`, `EntityGroup`, `DamageDataComponent`, `KnockbackComponent`, `DespawnComponent`, `Nameplate`, `HitboxCollision`, `Repulsion`, `Teleport`, `PendingTeleport`, `TeleportRecord`.

**Item components:** `ItemComponent`, `PickupItemComponent`, `PreventItemMerging`, `ItemPhysicsComponent`, `DynamicLight`, `PersistentDynamicLight`, `PrefabCopyableComponent`.

**Spatial resources:** Player, entity, item, and network-sendable KD-tree spatial indices.

**Systems:** Block entity systems, legacy projectile systems, despawn system, player systems (spawn, input, movement, camera, chunk tracking, saving, inventory), entity tracker systems, snapshot systems, transform/UUID migration, teleport, model, audio, damage data, knockback prediction, repulsion, hitbox collision, velocity, physics values, item merge/pickup/physics, dynamic lighting, nameplate, interactable/intangible/invulnerable/respond-to-hit tracker, and more.

**Asset stores:** `HitboxCollisionConfig`, `RepulsionConfig`, `MovementConfig`.

Also registers a global event listener for `LivingEntityInventoryChangeEvent` to handle creative mode hotbar saving.

### start()


@Override
protected void start()

Initializes the static `DamageCause` constants (`PHYSICAL`, `PROJECTILE`, `COMMAND`, `DROWNING`, `ENVIRONMENT`, `FALL`, `OUT_OF_WORLD`, `SUFFOCATION`) from the asset map. Throws `IllegalStateException` if any default cause is missing.

## Entity Registration


@Nullable
public <T extends Entity> EntityRegistration registerEntity(
    @Nonnull String id, @Nonnull Class<T> clazz, Function<World, T> entityConstructor, @Nullable DirectDecodeCodec<T> codec
)

Registers a new entity type with the given string identifier, class, constructor function, and optional codec. Creates a `ComponentType` on the entity store, registers legacy holder and ref systems, and returns an EntityRegistration handle. Returns `null` if the module is disabled.


@Nullable
public <T extends Entity> Function<World, T> getConstructor(@Nullable Class<T> entityClass)

Returns the constructor function for the given entity class, or `null` if not registered or module is disabled.


@Nullable
public <T extends Entity> DirectDecodeCodec<T> getCodec(@Nullable Class<T> entityClass)

Returns the deserialization codec for the given entity class, or `null` if not registered or module is disabled.


@Nullable
public Class<? extends Entity> getClass(@Nullable String name)

Returns the entity class for the given string identifier, or `null` if not found or module is disabled.


@Nullable
public String getIdentifier(@Nullable Class<? extends Entity> entityClass)

Returns the string identifier for the given entity class, or `null` if not found or module is disabled.


@Nullable
public <T extends Entity> ComponentType<EntityStore, T> getComponentType(@Nullable Class<T> entityClass)

Returns the ECS component type for the given entity class. Throws `IllegalArgumentException` if called with `Player.class` -- use `getPlayerComponentType()` instead.


public boolean isKnown(@Nullable Entity entity)

Returns `true` if the given entity's class has a registered constructor.

## Component Type Accessors

The module exposes component types for all registered components. Each accessor returns the `ComponentType` registered during `setup()`.

- getPlayerComponentType() | Player
- getFrozenComponentType() | Frozen
- getChunkTrackerComponentType() | ChunkTracker
- getPlayerSkinComponentType() | PlayerSkinComponent
- getDisplayNameComponentType() | DisplayNameComponent
- getApplyRandomSkinPersistedComponent() | ApplyRandomSkinPersistedComponent
- getEntityGroupComponentType() | EntityGroup
- getCollisionResultComponentType() | CollisionResultComponent
- getEntityViewerComponentType() | EntityTrackerSystems.EntityViewer
- getVisibleComponentType() | EntityTrackerSystems.Visible
- getDamageDataComponentType() | DamageDataComponent
- getKnockbackComponentType() | KnockbackComponent
- getDespawnComponentType() | DespawnComponent
- getSnapshotWorldInfoResourceType() | SnapshotSystems.SnapshotWorldInfo
- getSnapshotBufferComponentType() | SnapshotBuffer
- getInteractableComponentType() | Interactable
- getIntangibleComponentType() | Intangible
- getPreventPickupComponentType() | PreventPickup
- getInvulnerableComponentType() | Invulnerable
- getRespondToHitComponentType() | RespondToHit
- getHiddenFromAdventurePlayerComponentType() | HiddenFromAdventurePlayers
- getFromPrefabComponentType() | FromPrefab
- getFromWorldGenComponentType() | FromWorldGen
- getWorldGenIdComponentType() | WorldGenId
- getMovementManagerComponentType() | MovementManager
- getNameplateComponentType() | Nameplate
- getPersistentRefCountComponentType() | PersistentRefCount
- getTransformComponentType() | TransformComponent
- getHeadRotationComponentType() | HeadRotation
- getNetworkIdComponentType() | NetworkId
- getEffectControllerComponentType() | EffectControllerComponent
- getMovementStatesComponentType() | MovementStatesComponent
- getBlockEntityComponentType() | BlockEntity
- getEntityScaleComponentType() | EntityScaleComponent
- getCameraManagerComponentType() | CameraManager
- getUuidComponentType() | UUIDComponent
- getPlayerInputComponentType() | PlayerInput
- getKnockbackSimulationComponentType() | KnockbackSimulation
- getTeleportComponentType() | Teleport
- getProjectileComponentType() | ProjectileComponent
- getPendingTeleportComponentType() | PendingTeleport
- getTeleportRecordComponentType() | TeleportRecord
- getModelComponentType() | ModelComponent
- getPersistentModelComponentType() | PersistentModel
- getPropComponentType() | PropComponent
- getNPCMarkerComponentType() | NPCMarkerComponent
- getBoundingBoxComponentType() | BoundingBox
- getHitboxCollisionComponentType() | HitboxCollision
- getVelocityComponentType() | Velocity
- getPhysicsValuesComponentType() | PhysicsValues
- getRepulsionComponentType() | Repulsion
- getItemComponentType() | ItemComponent
- getPickupItemComponentType() | PickupItemComponent
- getPreventItemMergingType() | PreventItemMerging
- getItemPhysicsComponentType() | ItemPhysicsComponent
- getDynamicLightComponentType() | DynamicLight
- getPersistentDynamicLightComponentType() | PersistentDynamicLight
- getPrefabCopyableComponentType() | PrefabCopyableComponent
- getRotateObjectComponentType() | RotateObjectComponent
- getNewSpawnComponentType() | NewSpawnComponent
- getAudioComponentType() | AudioComponent
- getMovementAudioComponentType() | MovementAudioComponent
- getPositionDataComponentType() | PositionDataComponent
- getPlayerSettingsComponentType() | PlayerSettings
- getUniqueItemUsagesComponentType() | UniqueItemUsagesComponent
- getActiveAnimationComponentType() | ActiveAnimationComponent

## Resource Type Accessors

- getPlayerSpatialResourceType() | Player KD-tree spatial index
- getEntitySpatialResourceType() | Entity KD-tree spatial index
- getItemSpatialResourceType() | Item KD-tree spatial index
- getNetworkSendableSpatialResourceType() | Network-sendable KD-tree spatial index
- getInteractableQueueResourceType() | Interactable queue resource
- getIntangibleQueueResourceType() | Intangible queue resource
- getInvulnerableQueueResourceType() | Invulnerable queue resource
- getRespondToHitQueueResourceType() | Respond-to-hit queue resource

## System Accessors


public SystemType<EntityStore, EntityModule.MigrationSystem> getMigrationSystemType()

Returns the system type for migration systems.


public SystemType<EntityStore, ? extends ISystem<EntityStore>> getVelocityModifyingSystemType()

Returns the system type for velocity-modifying systems.


public SystemGroup<EntityStore> getPreClearMarkersGroup()

Returns the system group that runs before marker components are cleared.

## Inner Classes

### MigrationSystem


public abstract static class MigrationSystem extends HolderSystem<EntityStore>

Abstract base class for migration systems that adapt legacy entity data to the current ECS format.

### LegacyEntityHolderSystem


public static class LegacyEntityHolderSystem<T extends Entity> extends HolderSystem<EntityStore>

Holder system that bridges legacy `Entity` objects with the ECS. On entity add, calls `loadIntoWorld()`, assigns a `NetworkId`, and sets the display name. On entity remove, calls `remove()` and `unloadFromWorld()` for `REMOVE` reason, or `unloadFromWorld()` and `clearReference()` for `UNLOAD` reason. Runs with `RootDependency.first()` priority.

### LegacyEntityRefSystem


public static class LegacyEntityRefSystem<T extends Entity> extends RefSystem<EntityStore>

Ref system that sets the ECS reference on legacy entity objects after they are added to the store. Runs with `RootDependency.first()` priority.

### LegacyTransformSystem


public static class LegacyTransformSystem extends EntityModule.MigrationSystem

Migration system that wires `TransformComponent` to legacy entity objects via `Entity.setTransformComponent()`. Queries via AllLegacyEntityTypesQuery.

### LegacyUUIDSystem


public static class LegacyUUIDSystem extends EntityModule.MigrationSystem

Migration system that synchronizes UUIDs between `UUIDComponent` and legacy entity objects. If the component is missing but the entity has a UUID, adds the component. If the component exists, sets the entity's legacy UUID. Runs before `EntityStore.UUIDSystem`.

### LegacyUUIDUpdateSystem


public static class LegacyUUIDUpdateSystem extends RefChangeSystem<EntityStore, UUIDComponent>

Ref change system that keeps legacy entity UUIDs in sync when the `UUIDComponent` is added, set, or removed. Queries via AllLegacyEntityTypesQuery.

### HiddenFromPlayerMigrationSystem


@Deprecated(forRemoval = true)
public static class HiddenFromPlayerMigrationSystem extends EntityModule.MigrationSystem

Deprecated migration system that ensures entities matching a given query have the `HiddenFromAdventurePlayers` component.

### TangibleMigrationSystem


@Deprecated(forRemoval = true)
public static class TangibleMigrationSystem extends EntityModule.MigrationSystem

Deprecated migration system that ensures entities matching a given query (currently projectiles) have the `Intangible` component.

### Type (enum)


public static enum Type {
    PLAYERS,
    ALL;
}

Enum distinguishing between player-only and all-entity scopes.

## Related Types

- EntityRegistry -- plugin-scoped registry for entity registration
- EntityRegistration -- registration handle returned by `registerEntity()`
- DespawnComponent -- component registered by this module
- DespawnSystem -- system registered by this module
- BlockEntitySystems -- block entity systems registered by this module
- LegacyProjectileSystems -- projectile systems registered by this module
- AllLegacyEntityTypesQuery -- query used by migration systems
- AllLegacyLivingEntityTypesQuery -- query for living entities
- `JavaPlugin` -- base class providing plugin lifecycle

Also in this package: AllLegacyEntityTypesQuery, AllLegacyLivingEntityTypesQuery, BlockEntitySetupSystem, BlockEntitySystems, BlockEntityTrackerSystem, BlockMigrationExtraInfo, DespawnComponent, DespawnSystem, EntityRegistration, EntityRegistry, HiddenFromPlayerMigrationSystem, LegacyEntityHolderSystem, LegacyEntityRefSystem, LegacyProjectileSystems, LegacyTransformSystem, LegacyUUIDSystem, LegacyUUIDUpdateSystem, MigrationSystem, OnAddHolderSystem, OnAddRefSystem (and 4 more)

Complete API:
  public static EntityModule get()
  protected void setup()
  protected void start()
  public SystemType<EntityStore,EntityModule.MigrationSystem> getMigrationSystemType()
  public SystemType<EntityStore,? extends ISystem<EntityStore>> getVelocityModifyingSystemType()
  public ComponentType<EntityStore,Player> getPlayerComponentType()
  public ComponentType<EntityStore,Frozen> getFrozenComponentType()
  public ComponentType<EntityStore,ChunkTracker> getChunkTrackerComponentType()
  public ComponentType<EntityStore,PlayerSkinComponent> getPlayerSkinComponentType()
  public ComponentType<EntityStore,DisplayNameComponent> getDisplayNameComponentType()
  public ComponentType<EntityStore,ApplyRandomSkinPersistedComponent> getApplyRandomSkinPersistedComponent()
  public ComponentType<EntityStore,EntityGroup> getEntityGroupComponentType()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getPlayerSpatialResourceType()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getItemSpatialResourceType()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getNetworkSendableSpatialResourceType()
  public ComponentType<EntityStore,CollisionResultComponent> getCollisionResultComponentType()
  public ComponentType<EntityStore,EntityTrackerSystems.EntityViewer> getEntityViewerComponentType()
  public ComponentType<EntityStore,EntityTrackerSystems.Visible> getVisibleComponentType()
  public ComponentType<EntityStore,DamageDataComponent> getDamageDataComponentType()
  public ComponentType<EntityStore,KnockbackComponent> getKnockbackComponentType()
  public ComponentType<EntityStore,DespawnComponent> getDespawnComponentType()
  public ResourceType<EntityStore,SnapshotSystems.SnapshotWorldInfo> getSnapshotWorldInfoResourceType()
  public ComponentType<EntityStore,SnapshotBuffer> getSnapshotBufferComponentType()
  public ComponentType<EntityStore,Interactable> getInteractableComponentType()
  public ComponentType<EntityStore,Intangible> getIntangibleComponentType()
  public ComponentType<EntityStore,PreventPickup> getPreventPickupComponentType()
  public ComponentType<EntityStore,Invulnerable> getInvulnerableComponentType()
  public ComponentType<EntityStore,RespondToHit> getRespondToHitComponentType()
  public ResourceType<EntityStore,EntityInteractableSystems.QueueResource> getInteractableQueueResourceType()
  public ResourceType<EntityStore,IntangibleSystems.QueueResource> getIntangibleQueueResourceType()
  public ResourceType<EntityStore,InvulnerableSystems.QueueResource> getInvulnerableQueueResourceType()
  public ResourceType<EntityStore,RespondToHitSystems.QueueResource> getRespondToHitQueueResourceType()
  public ComponentType<EntityStore,HiddenFromAdventurePlayers> getHiddenFromAdventurePlayerComponentType()
  public ComponentType<EntityStore,FromPrefab> getFromPrefabComponentType()
  public ComponentType<EntityStore,FromWorldGen> getFromWorldGenComponentType()
  public ComponentType<EntityStore,WorldGenId> getWorldGenIdComponentType()
  public ComponentType<EntityStore,MovementManager> getMovementManagerComponentType()
  public ComponentType<EntityStore,Nameplate> getNameplateComponentType()
  public SystemGroup<EntityStore> getPreClearMarkersGroup()
  public ComponentType<EntityStore,PersistentRefCount> getPersistentRefCountComponentType()
  public ComponentType<EntityStore,TransformComponent> getTransformComponentType()
  public ComponentType<EntityStore,HeadRotation> getHeadRotationComponentType()
  public ComponentType<EntityStore,NetworkId> getNetworkIdComponentType()
  public ComponentType<EntityStore,EffectControllerComponent> getEffectControllerComponentType()
  public ComponentType<EntityStore,MovementStatesComponent> getMovementStatesComponentType()
  public ComponentType<EntityStore,BlockEntity> getBlockEntityComponentType()
  public ComponentType<EntityStore,EntityScaleComponent> getEntityScaleComponentType()
  public ComponentType<EntityStore,CameraManager> getCameraManagerComponentType()
  public ComponentType<EntityStore,UUIDComponent> getUuidComponentType()
  public ComponentType<EntityStore,PlayerInput> getPlayerInputComponentType()
  public ComponentType<EntityStore,KnockbackSimulation> getKnockbackSimulationComponentType()
  public ComponentType<EntityStore,Teleport> getTeleportComponentType()
  public ComponentType<EntityStore,ProjectileComponent> getProjectileComponentType()
  public ComponentType<EntityStore,PendingTeleport> getPendingTeleportComponentType()
  public ComponentType<EntityStore,TeleportRecord> getTeleportRecordComponentType()
  public ComponentType<EntityStore,ModelComponent> getModelComponentType()
  public ComponentType<EntityStore,PersistentModel> getPersistentModelComponentType()
  public ComponentType<EntityStore,PropComponent> getPropComponentType()
  public ComponentType<EntityStore,NPCMarkerComponent> getNPCMarkerComponentType()
  public ComponentType<EntityStore,BoundingBox> getBoundingBoxComponentType()
  public ComponentType<EntityStore,HitboxCollision> getHitboxCollisionComponentType()
  public ComponentType<EntityStore,Velocity> getVelocityComponentType()
  public ComponentType<EntityStore,PhysicsValues> getPhysicsValuesComponentType()
  public ComponentType<EntityStore,Repulsion> getRepulsionComponentType()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getEntitySpatialResourceType()
  public ComponentType<EntityStore,ItemComponent> getItemComponentType()
  public ComponentType<EntityStore,PickupItemComponent> getPickupItemComponentType()
  public ComponentType<EntityStore,PreventItemMerging> getPreventItemMergingType()
  public ComponentType<EntityStore,ItemPhysicsComponent> getItemPhysicsComponentType()
  public ComponentType<EntityStore,DynamicLight> getDynamicLightComponentType()
  public ComponentType<EntityStore,PersistentDynamicLight> getPersistentDynamicLightComponentType()
  public ComponentType<EntityStore,PrefabCopyableComponent> getPrefabCopyableComponentType()
  public ComponentType<EntityStore,RotateObjectComponent> getRotateObjectComponentType()
  public ComponentType<EntityStore,NewSpawnComponent> getNewSpawnComponentType()
  private void onMovementConfigLoadedAssetsEvent(LoadedAssetsEvent<String,MovementConfig,DefaultAssetMap<String,MovementConfig>> event)
  private void onGameplayConfigLoadedAssetsEvent(LoadedAssetsEvent<String,GameplayConfig,DefaultAssetMap<String,GameplayConfig>> event)
  public ComponentType<EntityStore,AudioComponent> getAudioComponentType()
  public ComponentType<EntityStore,MovementAudioComponent> getMovementAudioComponentType()
  public ComponentType<EntityStore,PositionDataComponent> getPositionDataComponentType()
  public ComponentType<EntityStore,PlayerSettings> getPlayerSettingsComponentType()
  public ComponentType<EntityStore,UniqueItemUsagesComponent> getUniqueItemUsagesComponentType()
  public ComponentType<EntityStore,ActiveAnimationComponent> getActiveAnimationComponentType()
  public EntityRegistration registerEntity(String id, Class<T> clazz, Function<World,T> entityConstructor, DirectDecodeCodec<T> codec)
  private void unregisterEntity(Class<T> clazz)
  public Function<World,T> getConstructor(Class<T> entityClass)
  public DirectDecodeCodec<T> getCodec(Class<T> entityClass)
  public Class<? extends Entity> getClass(String name)
  public String getIdentifier(Class<? extends Entity> entityClass)
  public ComponentType<EntityStore,T> getComponentType(Class<T> entityClass)
  public boolean isKnown(Entity entity)

Fields:
public static final PluginManifest MANIFEST
public static final String[] LEGACY_ENTITY_CLASS_NAMES
public static final String MOUNT_MOVEMENT_SETTINGS_ASSET_ID
private static EntityModule instance
private final Map<String,Class<? extends Entity>> idMap
private final Map<Class<? extends Entity>,String> classIdMap
private final Map<Class<? extends Entity>,Function<World,? extends Entity>> classMap
private final Map<Class<? extends Entity>,DirectDecodeCodec<? extends Entity>> codecMap
private final Map<Class<? extends Entity>,ComponentType<EntityStore,? extends Entity>> classToComponentType
private ComponentType<EntityStore,UUIDComponent> uuidComponentType
private ComponentType<EntityStore,TransformComponent> transformComponentType
private ComponentType<EntityStore,HeadRotation> headRotationComponentType
private ComponentType<EntityStore,NetworkId> networkIdComponentType
private ComponentType<EntityStore,EntityScaleComponent> entityScaleComponentType
private ComponentType<EntityStore,Player> playerComponentType
private ComponentType<EntityStore,MovementManager> movementManagerComponentType
private ComponentType<EntityStore,CameraManager> cameraManagerComponentType
private ComponentType<EntityStore,Frozen> frozenComponentType
private ComponentType<EntityStore,CollisionResultComponent> collisionResultComponentType
private ComponentType<EntityStore,ChunkTracker> chunkTrackerComponentType
private ComponentType<EntityStore,ProjectileComponent> projectileComponentType
private ComponentType<EntityStore,BlockEntity> blockEntityComponentType
private ComponentType<EntityStore,EffectControllerComponent> effectControllerComponentType
private ComponentType<EntityStore,RotateObjectComponent> rotateObjectComponentType
private ComponentType<EntityStore,ModelComponent> modelComponentType
private ComponentType<EntityStore,PersistentModel> persistentModelComponentType
private ComponentType<EntityStore,PropComponent> propComponentType
private ComponentType<EntityStore,NPCMarkerComponent> npcMarkerComponentType
private ComponentType<EntityStore,BoundingBox> boundingBoxComponentType
private ComponentType<EntityStore,PlayerSkinComponent> playerSkinComponentType
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> playerSpatialResourceType
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> entitySpatialResourceType
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> itemSpatialResourceType
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> networkSendableSpatialResourceType
private ComponentType<EntityStore,DisplayNameComponent> displayNameComponentType
private ComponentType<EntityStore,EntityGroup> entityGroupComponentType
private ComponentType<EntityStore,MovementStatesComponent> movementStatesComponentType
private ComponentType<EntityStore,DamageDataComponent> damageDataComponentType
private ComponentType<EntityStore,KnockbackComponent> knockbackComponentType
private ComponentType<EntityStore,DespawnComponent> despawnComponentComponentType
private ComponentType<EntityStore,EntityTrackerSystems.EntityViewer> entityViewerComponentType
private ComponentType<EntityStore,EntityTrackerSystems.Visible> visibleComponentType
private ResourceType<EntityStore,SnapshotSystems.SnapshotWorldInfo> snapshotWorldInfoResourceType
private ComponentType<EntityStore,SnapshotBuffer> snapshotBufferComponentType
private ComponentType<EntityStore,PersistentRefCount> persistentRefCountComponentType
private ComponentType<EntityStore,Velocity> velocityComponentType
private ComponentType<EntityStore,PhysicsValues> physicsValuesComponentType
private ComponentType<EntityStore,FromPrefab> fromPrefabComponentType
private ComponentType<EntityStore,FromWorldGen> fromWorldGenComponentType
private ComponentType<EntityStore,WorldGenId> worldGenIdComponentType
private ComponentType<EntityStore,Interactable> interactableComponentType
private ComponentType<EntityStore,Intangible> intangibleComponentType
private ComponentType<EntityStore,PreventPickup> preventPickupComponentType
private ComponentType<EntityStore,Invulnerable> invulnerableComponentType
private ComponentType<EntityStore,RespondToHit> respondToHitComponentType
private ResourceType<EntityStore,EntityInteractableSystems.QueueResource> interactableQueueResourceType
private ResourceType<EntityStore,IntangibleSystems.QueueResource> intangibleQueueResourceType
private ResourceType<EntityStore,InvulnerableSystems.QueueResource> invulnerableQueueResourceType
private ResourceType<EntityStore,RespondToHitSystems.QueueResource> respondToHitQueueResourceType
private ComponentType<EntityStore,HiddenFromAdventurePlayers> hiddenFromAdventurePlayerComponentType
private ComponentType<EntityStore,Nameplate> nameplateComponentType
private ComponentType<EntityStore,HitboxCollision> hitboxCollisionComponentType
private ComponentType<EntityStore,Repulsion> repulsionComponentType
private ComponentType<EntityStore,Teleport> teleportComponentType
private ComponentType<EntityStore,PendingTeleport> pendingTeleportComponentType
private ComponentType<EntityStore,TeleportRecord> teleportRecordComponentType
private ComponentType<EntityStore,ApplyRandomSkinPersistedComponent> applyRandomSkinPersistedComponent
private SystemGroup<EntityStore> preClearMarkersGroup
private ComponentType<EntityStore,PlayerInput> playerInputComponentType
private ComponentType<EntityStore,KnockbackSimulation> knockbackSimulationComponentType
private ComponentType<EntityStore,PlayerSettings> playerSettingsComponentType
private SystemType<EntityStore,EntityModule.MigrationSystem> migrationSystemType
private SystemType<EntityStore,? extends ISystem<EntityStore>> velocityModifyingSystemType
private ComponentType<EntityStore,AudioComponent> audioComponentType
private ComponentType<EntityStore,MovementAudioComponent> movementAudioComponentType
private ComponentType<EntityStore,PositionDataComponent> positionDataComponentType
private ComponentType<EntityStore,ActiveAnimationComponent> activeAnimationComponentType
private ComponentType<EntityStore,NewSpawnComponent> newSpawnComponentType
private ComponentType<EntityStore,ItemComponent> itemComponentType
private ComponentType<EntityStore,PickupItemComponent> pickupItemComponentType
private ComponentType<EntityStore,PreventItemMerging> preventItemMergingType
private ComponentType<EntityStore,ItemPhysicsComponent> itemPhysicsComponentType
private ComponentType<EntityStore,DynamicLight> dynamicLightComponentType
private ComponentType<EntityStore,PersistentDynamicLight> persistentDynamicLightComponentType
private ComponentType<EntityStore,PrefabCopyableComponent> prefabCopyableComponentType
private ComponentType<EntityStore,UniqueItemUsagesComponent> uniqueItemUsagesComponentType
