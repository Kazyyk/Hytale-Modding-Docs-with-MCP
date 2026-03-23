# NPCPlugin

Type: class | Package: com.hypixel.hytale.server.npc | Extends: JavaPlugin

public class NPCPlugin extends JavaPlugin

Central plugin for the NPC (non-player character) system. Manages the NPC component registry, builder factories, role definitions, blackboard systems, spawning, combat, movement, and all NPC-related asset loading. Registered as a `JavaPlugin` with the server plugin system.

Registers a comprehensive set of builder types for NPC behaviours including actions, sensors, body motions, head motions, entity filters, entity prioritisers, state machine transitions, timers, and audio-visual effects. Handles asset pack registration/unregistration events and migration support.

## Key Responsibilities

- Registers all NPC component types with the entity store registry
- Manages builder factories for NPC behaviour definitions (actions, sensors, motions, filters, etc.)
- Maintains role and descriptor indices
- Provides spatial resources (KD-tree) for NPC entity lookups
- Integrates with the flock system, combat system, and interaction system
- Handles NPC-related commands (`/npc`)
- Manages blackboard views (attitude, combat, block type, events)

## Access


public static NPCPlugin get()

Returns the singleton instance.

Also in this package: AllNPCsLoadedEvent, NPCConfig, NPCEntityRegenerateStatsSystem

Complete API:
  public static NPCPlugin get()
  protected void setup()
  protected void start()
  public ResourceType<EntityStore,Blackboard> getBlackboardResourceType()
  public ResourceType<EntityStore,CombatViewSystems.CombatDataPool> getCombatDataPoolResourceType()
  public ResourceType<EntityStore,RoleChangeSystem.RoleChangeQueue> getRoleChangeQueueResourceType()
  public ResourceType<EntityStore,NewSpawnStartTickingSystem.QueueResource> getNewSpawnStartTickingQueueResourceType()
  public ResourceType<EntityStore,SortBufferProviderResource> getSortBufferProviderResourceResourceType()
  public ResourceType<EntityStore,AStarNodePoolProviderSimple> getAStarNodePoolProviderSimpleResourceType()
  public ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> getNpcSpatialResource()
  public ComponentType<EntityStore,CombatViewSystems.CombatData> getCombatDataComponentType()
  public ComponentType<EntityStore,NPCRunTestsCommand.NPCTestData> getNpcTestDataComponentType()
  public ComponentType<EntityStore,BeaconSupport> getBeaconSupportComponentType()
  public ComponentType<EntityStore,NPCBlockEventSupport> getNpcBlockEventSupportComponentType()
  public ComponentType<EntityStore,PlayerBlockEventSupport> getPlayerBlockEventSupportComponentType()
  public ComponentType<EntityStore,NPCEntityEventSupport> getNpcEntityEventSupportComponentType()
  public ComponentType<EntityStore,PlayerEntityEventSupport> getPlayerEntityEventSupportComponentType()
  public ComponentType<EntityStore,StepComponent> getStepComponentType()
  public ComponentType<EntityStore,FailedSpawnComponent> getFailedSpawnComponentType()
  public ComponentType<EntityStore,Timers> getTimersComponentType()
  public ComponentType<EntityStore,StateEvaluator> getStateEvaluatorComponentType()
  public ComponentType<EntityStore,ValueStore> getValueStoreComponentType()
  public void setupNPCLoading()
  public String[] getPresetCoverageTestNPCs()
  public Pair<Ref<EntityStore>,INonPlayerCharacter> spawnNPC(Store<EntityStore> store, String npcType, String groupType, Vector3d position, Vector3f rotation)
  public static void reloadNPCsWithRole(int roleIndex)
  protected void onNPCGroupsLoaded(LoadedAssetsEvent<String,NPCGroup,AssetMap<String,NPCGroup>> event)
  protected void onNPCGroupsRemoved(RemovedAssetsEvent<String,NPCGroup,AssetMap<String,NPCGroup>> event)
  protected void onAttitudeGroupsLoaded(LoadedAssetsEvent<String,AttitudeGroup,AssetMap<String,AttitudeGroup>> event)
  protected void onAttitudeGroupsRemoved(RemovedAssetsEvent<String,AttitudeGroup,AssetMap<String,AttitudeGroup>> event)
  protected void onItemAttitudeGroupsLoaded(LoadedAssetsEvent<String,ItemAttitudeGroup,AssetMap<String,ItemAttitudeGroup>> event)
  protected void onItemAttitudeGroupsRemoved(RemovedAssetsEvent<String,ItemAttitudeGroup,AssetMap<String,ItemAttitudeGroup>> event)
  private void putItemAttitudeGroups()
  protected void onPathChange(WorldPathChangedEvent event)
  public int getPathChangeRevision()
  protected void onNPCsLoaded(AllNPCsLoadedEvent event)
  private void putNPCGroups()
  private void putAttitudeGroups()
  public String getName(int builderIndex)
  public int getIndex(String builderName)
  public Builder<Role> tryGetCachedValidRole(int roleIndex)
  public BuilderInfo getBuilderInfo(Builder<?> builder)
  public List<String> getRoleTemplateNames(boolean spawnableOnly)
  public boolean hasRoleName(String roleName)
  public void validateSpawnableRole(String roleName)
  public BuilderInfo getRoleBuilderInfo(int roleIndex)
  public void setBuilderInvalid(int builderIndex)
  public AttitudeMap getAttitudeMap()
  public ItemAttitudeMap getItemAttitudeMap()
  public boolean testAndValidateRole(BuilderInfo builderInfo)
  public void forceValidation(int builderIndex)
  public Pair<Ref<EntityStore>,NPCEntity> spawnEntity(Store<EntityStore> store, int roleIndex, Vector3d position, Vector3f rotation, Model spawnModel, TriConsumer<NPCEntity,Ref<EntityStore>,Store<EntityStore>> postSpawn)
  public Pair<Ref<EntityStore>,NPCEntity> spawnEntity(Store<EntityStore> store, int roleIndex, Vector3d position, Vector3f rotation, Model spawnModel, TriConsumer<NPCEntity,Holder<EntityStore>,Store<EntityStore>> preAddToWorld, TriConsumer<NPCEntity,Ref<EntityStore>,Store<EntityStore>> postSpawn)
  public BuilderInfo prepareRoleBuilderInfo(int roleIndex)
  public static Role buildRole(Builder<Role> roleBuilder, BuilderInfo builderInfo, BuilderSupport builderSupport, int roleIndex)
  protected void onModelsChanged(LoadedAssetsEvent<String,ModelAsset,DefaultAssetMap<String,ModelAsset>> event)
  public void generateDescriptors()
  public void saveDescriptors()
  public BuilderManager getBuilderManager()
  public int getMaxBlackboardBlockCountPerType()
  public boolean isLogFailingTestErrors()
  public boolean startRoleBenchmark(double seconds, Consumer<Int2ObjectMap<TimeDistributionRecorder>> onFinished)
  public void collectRoleTick(int roleIndex, long nanos)
  public boolean isBenchmarkingRole()
  public boolean startSensorSupportBenchmark(double seconds, Consumer<Int2ObjectMap<SensorSupportBenchmark>> onFinished)
  public boolean isBenchmarkingSensorSupport()
  protected boolean isBenchmarking()
  public void collectSensorSupportPlayerList(int roleIndex, long getNanos, double maxPlayerDistanceSorted, double maxPlayerDistance, double maxPlayerDistanceAvoidance, int numPlayers)
  public void collectSensorSupportEntityList(int roleIndex, long getNanos, double maxEntityDistanceSorted, double maxEntityDistance, double maxEntityDistanceAvoidance, int numEntities)
  public void collectSensorSupportLosTest(int roleIndex, boolean cacheHit, long time)
  public void collectSensorSupportInverseLosTest(int roleIndex, boolean cacheHit)
  public void collectSensorSupportFriendlyBlockingTest(int roleIndex, boolean cacheHit)
  public void collectSensorSupportTickDone(int roleIndex)
  public NPCPlugin registerCoreComponentType(String name, Supplier<Builder<T>> builder)
  public void setRoleBuilderNeedsReload(Builder<?> builder)
  protected void registerCoreFactories()
  protected static void onBalanceAssetsChanged(LoadedAssetsEvent<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>> event)
  protected static void onBalanceAssetsRemoved(RemovedAssetsEvent<String,BalanceAsset,DefaultAssetMap<String,BalanceAsset>> event)

Fields:
public static String FACTORY_CLASS_ROLE
public static String FACTORY_CLASS_BODY_MOTION
public static String FACTORY_CLASS_HEAD_MOTION
public static String FACTORY_CLASS_ACTION
public static String FACTORY_CLASS_SENSOR
public static String FACTORY_CLASS_INSTRUCTION
public static String FACTORY_CLASS_TRANSIENT_PATH
public static String FACTORY_CLASS_ACTION_LIST
public static String ROLE_ASSETS_PATH
private static NPCPlugin instance
protected List<BuilderDescriptor> builderDescriptors
protected final BuilderManager builderManager
protected boolean validateBuilder
protected int maxBlackboardBlockCountPerType
protected boolean logFailingTestErrors
protected String[] presetCoverageTestNPCs
protected AtomicInteger pathChangeRevision
protected Lock benchmarkLock
protected Int2ObjectMap<TimeDistributionRecorder> roleTickDistribution
protected Int2ObjectMap<SensorSupportBenchmark> roleSensorSupportDistribution
protected TimeDistributionRecorder roleTickDistributionAll
protected SensorSupportBenchmark roleSensorSupportDistributionAll
protected boolean autoReload
private AttitudeMap attitudeMap
private ItemAttitudeMap itemAttitudeMap
private static final Vector3f NULL_ROTATION
public static final short PRIORITY_LOAD_NPC
public static final short PRIORITY_SPAWN_VALIDATION
private final Config<NPCPlugin.NPCConfig> config
private ResourceType<EntityStore,Blackboard> blackboardResourceType
private ResourceType<EntityStore,CombatViewSystems.CombatDataPool> combatDataPoolResourceType
private ResourceType<EntityStore,RoleChangeSystem.RoleChangeQueue> roleChangeQueueResourceType
private ResourceType<EntityStore,NewSpawnStartTickingSystem.QueueResource> newSpawnStartTickingQueueResourceType
private ResourceType<EntityStore,SortBufferProviderResource> sortBufferProviderResourceResourceType
private ResourceType<EntityStore,AStarNodePoolProviderSimple> aStarNodePoolProviderSimpleResourceType
private ResourceType<EntityStore,SpatialResource<Ref<EntityStore>,EntityStore>> npcSpatialResource
private ComponentType<EntityStore,CombatViewSystems.CombatData> combatDataComponentType
private ComponentType<EntityStore,NPCRunTestsCommand.NPCTestData> npcTestDataComponentType
private ComponentType<EntityStore,BeaconSupport> beaconSupportComponentType
private ComponentType<EntityStore,NPCBlockEventSupport> npcBlockEventSupportComponentType
private ComponentType<EntityStore,PlayerBlockEventSupport> playerBlockEventSupportComponentType
private ComponentType<EntityStore,NPCEntityEventSupport> npcEntityEventSupportComponentType
private ComponentType<EntityStore,PlayerEntityEventSupport> playerEntityEventSupportComponentType
private ComponentType<EntityStore,StepComponent> stepComponentType
private ComponentType<EntityStore,FailedSpawnComponent> failedSpawnComponentType
private ComponentType<EntityStore,Timers> timersComponentType
private ComponentType<EntityStore,StateEvaluator> stateEvaluatorComponentType
private ComponentType<EntityStore,ValueStore> valueStoreComponentType
