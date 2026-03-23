# EntityModule

Type: class | Package: com.hypixel.hytale.server.core.modules.entity | Extends: JavaPlugin

public class EntityModule extends JavaPlugin

Core plugin module registering all entity-related ECS components, systems, and resources. Handles registration of transform, model, bounding box, inventory, physics, damage, interaction, tracking, movement, player, item, condition, effect, and teleport components and systems. One of the largest modules in the server; depends on `Universe` and `CollisionModule`.

## Static Methods

- public static EntityModule get()

## Key Component Type Accessors

Returns `ComponentType` instances for:
- Inventory components (Armor, Backpack, Hotbar, Storage, Tool, Utility, Combined)
- Transform, Model, BoundingBox, HeadRotation, SnapshotBuffer
- NetworkId, UUIDComponent, Entity, Player, Frozen
- CachedStatsComponent, and many more

## Relationships

- Extends `JavaPlugin`
- Depends on `Universe`, `CollisionModule`
- Registers InventorySystems and condition codecs

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
  public ComponentType<EntityStore,InventoryComponent.Storage> getStorageInventoryComponentType()
  public ComponentType<EntityStore,InventoryComponent.Armor> getArmorInventoryComponentType()
  public ComponentType<EntityStore,InventoryComponent.Hotbar> getHotbarInventoryComponentType()
  public ComponentType<EntityStore,InventoryComponent.Utility> getUtilityInventoryComponentType()
  public ComponentType<EntityStore,InventoryComponent.Backpack> getBackpackInventoryComponentType()
  public ComponentType<EntityStore,InventoryComponent.Tool> getToolInventoryComponentType()
  public ComponentType<EntityStore,InventoryComponent.Combined> getCombinedInventoryComponentType()
  public ComponentType<EntityStore,ActiveAnimationComponent> getActiveAnimationComponentType()
  public ComponentType<EntityStore,CachedStatsComponent> getCachedStatsComponentType()
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
private ComponentType<EntityStore,CachedStatsComponent> cachedStatsComponentType
private ComponentType<EntityStore,NewSpawnComponent> newSpawnComponentType
private ComponentType<EntityStore,ItemComponent> itemComponentType
private ComponentType<EntityStore,PickupItemComponent> pickupItemComponentType
private ComponentType<EntityStore,PreventItemMerging> preventItemMergingType
private ComponentType<EntityStore,ItemPhysicsComponent> itemPhysicsComponentType
private ComponentType<EntityStore,DynamicLight> dynamicLightComponentType
private ComponentType<EntityStore,PersistentDynamicLight> persistentDynamicLightComponentType
private ComponentType<EntityStore,PrefabCopyableComponent> prefabCopyableComponentType
private ComponentType<EntityStore,UniqueItemUsagesComponent> uniqueItemUsagesComponentType
private ComponentType<EntityStore,InventoryComponent.Storage> storageInventoryComponentType
private ComponentType<EntityStore,InventoryComponent.Armor> armorInventoryComponentType
private ComponentType<EntityStore,InventoryComponent.Hotbar> hotbarInventoryComponentType
private ComponentType<EntityStore,InventoryComponent.Utility> utilityInventoryComponentType
private ComponentType<EntityStore,InventoryComponent.Backpack> backpackInventoryComponentType
private ComponentType<EntityStore,InventoryComponent.Tool> toolInventoryComponentType
private ComponentType<EntityStore,InventoryComponent.Combined> combinedInventoryComponentType
