# SpawningPlugin

Type: class | Package: com.hypixel.hytale.server.spawning | Extends: com.hypixel.hytale.server.core.plugin.JavaPlugin

public class SpawningPlugin extends JavaPlugin

Plugin that manages NPC spawning subsystems including world spawning, beacon spawning, spawn markers, spawn suppression, and local spawn controllers. Registers all related ECS components, resources, systems, asset stores, and commands.

Also in this package: ISpawnable, ISpawnableWithModel, LegacySpawnSuppressorEntityMigration, LoadedNPCEvent, NPCSpawningConfig, SpawnRejection, SpawnSpan, SpawnTestResult, SpawningContext

Complete API:
  public static SpawningPlugin get()
  public void setup()
  public void start()
  public void shutdown()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getSpawnMarkerSpatialResource()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getManualSpawnBeaconSpatialResource()
  public ComponentType<EntityStore,SpawnMarkerEntity> getSpawnMarkerComponentType()
  public ComponentType<EntityStore,LocalSpawnController> getLocalSpawnControllerComponentType()
  public ResourceType<EntityStore,WorldSpawnData> getWorldSpawnDataResourceType()
  public ComponentType<EntityStore,SpawnSuppressionComponent> getSpawnSuppressorComponentType()
  public ResourceType<EntityStore,SpawnSuppressionController> getSpawnSuppressionControllerResourceType()
  public ComponentType<EntityStore,LocalSpawnBeacon> getLocalSpawnBeaconComponentType()
  public ResourceType<EntityStore,LocalSpawnState> getLocalSpawnStateResourceType()
  public ComponentType<EntityStore,InitialBeaconDelay> getInitialBeaconDelayComponentType()
  public ComponentType<ChunkStore,SpawnJobData> getSpawnJobDataComponentType()
  public ComponentType<ChunkStore,ChunkSpawnData> getChunkSpawnDataComponentType()
  public ComponentType<ChunkStore,ChunkSpawnedNPCData> getChunkSpawnedNPCDataComponentType()
  public ResourceType<ChunkStore,ChunkSuppressionQueue> getChunkSuppressionQueueResourceType()
  public ResourceType<EntityStore,FloodFillEntryPoolProviderSimple> getFloodFillEntryPoolProviderSimpleResourceType()
  public ComponentType<ChunkStore,ChunkSuppressionEntry> getChunkSuppressionEntryComponentType()
  public BeaconSpawnWrapper getBeaconSpawnWrapper(int configId)
  public ComponentType<EntityStore,SpawnMarkerReference> getSpawnMarkerReferenceComponentType()
  public ComponentType<EntityStore,SpawnBeaconReference> getSpawnBeaconReferenceComponentType()
  public ComponentType<EntityStore,FloodFillPositionSelector> getFloodFillPositionSelectorComponentType()
  public ComponentType<EntityStore,SpawnMarkerBlockReference> getSpawnMarkerBlockReferenceComponentType()
  public ComponentType<ChunkStore,SpawnMarkerBlock> getSpawnMarkerBlockComponentType()
  public boolean shouldNPCDespawn(Store<EntityStore> store, NPCEntity npcComponent, WorldTimeResource timeManager, int configuration, boolean beaconSpawn)
  public Model getSpawnMarkerModel()
  public EnvironmentSpawnParameters getWorldEnvironmentSpawnParameters(int environmentIndex)
  public List<BeaconSpawnWrapper> getBeaconSpawnsForEnvironment(int environmentIndex)
  public IntSet getRolesForEnvironment(int environment)
  public int getTickColumnBudget()
  public int getMaxActiveJobs()
  public double getLocalSpawnControllerJoinDelay()
  public static void validateSpawnsConfigurations(String type, Map<String,T> spawns, List<String> errors)
  public static void validateSpawnMarkers(Map<String,SpawnMarker> markers, List<String> errors)
  public double getEnvironmentDensity(int environmentIndex)
  protected void onSpawnMarkersChange(LoadedAssetsEvent<String,SpawnMarker,DefaultAssetMap<String,SpawnMarker>> event)
  protected static void onSpawnMarkersRemove(RemovedAssetsEvent<String,SpawnMarker,DefaultAssetMap<String,SpawnMarker>> event)
  private void onEnvironmentChange(LoadedAssetsEvent<String,Environment,IndexedLookupTableAssetMap<String,Environment>> event)
  private void onWorldNPCSpawnsLoaded(LoadedAssetsEvent<String,WorldNPCSpawn,IndexedLookupTableAssetMap<String,WorldNPCSpawn>> event)
  private void onBeaconNPCSpawnsLoaded(LoadedAssetsEvent<String,BeaconNPCSpawn,IndexedLookupTableAssetMap<String,BeaconNPCSpawn>> event)
  private void onWorldNPCSpawnsRemoved(RemovedAssetsEvent<String,WorldNPCSpawn,IndexedLookupTableAssetMap<String,WorldNPCSpawn>> event)
  private void onBeaconNPCSpawnsRemoved(RemovedAssetsEvent<String,BeaconNPCSpawn,IndexedLookupTableAssetMap<String,BeaconNPCSpawn>> event)
  private void onLoadedNPCEvent(AllNPCsLoadedEvent loadedNPCEvent)
  private void setUpWithAllRoles()
  private void rebuildBeaconSpawnConfigurations(IntSet changeSet)
  private void onModelAssetChange(LoadedAssetsEvent<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> event)
  private void onLoadAsset(LoadAssetEvent event)

Fields:
private static final String DEFAULT_SPAWN_MARKER_MODEL
private static final int TICK_COLUMN_BUDGET
private static final float OVERPOPULATION_RATIO
private static final int OVERPOPULATION_GROUP_BUFFER
private static SpawningPlugin instance
private ComponentType<ChunkStore,SpawnMarkerBlock> spawnMarkerBlockComponentType
private Model spawnMarkerModel
private double localSpawnControllerJoinDelay
private int tickColumnBudget
private final WorldSpawnManager worldSpawnManager
private final BeaconSpawnManager beaconSpawnManager
private final Config<SpawningPlugin.NPCSpawningConfig> config
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> legacyBeaconSpatialResource
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> spawnMarkerSpatialResource
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> manualSpawnBeaconSpatialResource
private ComponentType<EntityStore,SpawnMarkerEntity> spawnMarkerComponentType
private ComponentType<EntityStore,LocalSpawnController> localSpawnControllerComponentType
private ResourceType<EntityStore,WorldSpawnData> worldSpawnDataResourceType
private ComponentType<EntityStore,SpawnSuppressionComponent> spawnSuppressorComponentType
private ResourceType<EntityStore,SpawnSuppressionController> spawnSuppressionControllerResourceType
private ComponentType<EntityStore,LocalSpawnBeacon> localSpawnBeaconComponentType
private ResourceType<EntityStore,LocalSpawnState> localSpawnStateResourceType
private ComponentType<ChunkStore,SpawnJobData> spawnJobDataComponentType
private ComponentType<ChunkStore,ChunkSpawnData> chunkSpawnDataComponentType
private ComponentType<ChunkStore,ChunkSpawnedNPCData> chunkSpawnedNPCDataComponentType
private ResourceType<ChunkStore,ChunkSuppressionQueue> chunkSuppressionQueueResourceType
private ComponentType<ChunkStore,ChunkSuppressionEntry> chunkSuppressionEntryComponentType
private ComponentType<EntityStore,InitialBeaconDelay> initialBeaconDelayComponentType
private ComponentType<EntityStore,SpawnMarkerReference> spawnMarkerReferenceComponentType
private ComponentType<EntityStore,SpawnBeaconReference> spawnBeaconReferenceComponentType
private ComponentType<EntityStore,FloodFillPositionSelector> floodFillPositionSelectorComponentType
private ResourceType<EntityStore,FloodFillEntryPoolProviderSimple> floodFillEntryPoolProviderSimpleResourceType
private ComponentType<EntityStore,SpawnMarkerBlockReference> spawnMarkerBlockReferenceComponentType
