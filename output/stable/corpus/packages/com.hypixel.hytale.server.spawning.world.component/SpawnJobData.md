# SpawnJobData

Type: class | Package: com.hypixel.hytale.server.spawning.world.component

public class SpawnJobData

Data structure holding state for an active spawn job including position, role, and timing information.

Also in this package: ChunkSpawnData, ChunkSpawnedNPCData, UnspawnableEntry, WorldSpawnData

Complete API:
  public static ComponentType<ChunkStore,SpawnJobData> getComponentType()
  public int getJobId()
  public int getEnvironmentIndex()
  public int getTotalColumnsTested()
  public void incrementTotalColumnsTested()
  public int getTotalColumnsBlocked()
  public void incrementTotalColumnsBlocked()
  public int getBudgetUsed()
  public void setBudgetUsed(int budgetUsed)
  public void adjustBudgetUsed(int amount)
  public int getTotalBudgetUsed()
  public boolean isSpawnFrozen()
  public void setSpawnFrozen(boolean spawnFrozen)
  public SpawningContext getSpawningContext()
  public int getRoleIndex()
  public SpawnWrapper<?> getSpawnConfig()
  public int getSpawnConfigIndex()
  public int getFlockSize()
  public FlockAsset getFlockAsset()
  public SuppressionSpanHelper getSuppressionSpanHelper()
  public Environment getEnvironment()
  public int getSpansTried()
  public void incrementSpansTried()
  public int getSpansSuccess()
  public void incrementSpansSuccess()
  public Object2IntMap<SpawnRejection> getRejectionMap()
  public boolean isIgnoreFullyPopulated()
  public void setIgnoreFullyPopulated(boolean ignoreFullyPopulated)
  public boolean isTerminated()
  public void terminate()
  public void init(int roleIndex, Environment environment, int environmentIndex, SpawnWrapper<?> spawnConfig, FlockAsset flockDefinition, int flockSize)
  public Component<ChunkStore> clone()

Fields:
private static int jobIdCounter
private final int jobId
private int environmentIndex
private int totalColumnsTested
private int totalColumnsBlocked
private int budgetUsed
private int totalBudgetUsed
private boolean spawnFrozen
private final SpawningContext spawningContext
private int roleIndex
private SpawnWrapper<?> spawnConfig
private int spawnConfigIndex
private int flockSize
private FlockAsset flockAsset
private final SuppressionSpanHelper suppressionSpanHelper
private Environment environment
private int spansTried
private int spansSuccess
private final Object2IntMap<SpawnRejection> rejectionMap
private boolean ignoreFullyPopulated
private boolean terminated
