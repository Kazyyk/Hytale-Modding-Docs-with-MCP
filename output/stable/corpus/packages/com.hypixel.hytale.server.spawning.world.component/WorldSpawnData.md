# WorldSpawnData

Type: class | Package: com.hypixel.hytale.server.spawning.world.component

public class WorldSpawnData implements Resource<EntityStore>

World-level resource tracking global spawn state including total NPC counts and spawn controller references.

Also in this package: ChunkSpawnData, ChunkSpawnedNPCData, SpawnJobData, UnspawnableEntry

Complete API:
  public static ResourceType<EntityStore,WorldSpawnData> getResourceType()
  public int getActualNPCs()
  public double getExpectedNPCs()
  public double getExpectedNPCsInEmptyEnvironments()
  public boolean isUnspawnable()
  public void setUnspawnable(boolean unspawnable)
  public int getChunkCount()
  public void adjustChunkCount(int amount)
  public void adjustSegmentCount(int amount)
  public SpiralIterator getSpiralIterator()
  public double averageSegmentCount()
  public int getActiveSpawnJobs()
  public void adjustActiveSpawnJobs(int amount, int trackedCount)
  public int getTrackedCountFromJobs()
  public int getTotalSpawnJobBudgetUsed()
  public int getTotalSpawnJobsCompleted()
  public void addCompletedSpawnJob(int budgetUsed)
  public WorldEnvironmentSpawnData getWorldEnvironmentSpawnData(int environmentIndex)
  public WorldEnvironmentSpawnData getOrCreateWorldEnvironmentSpawnData(int environmentIndex, World world, ComponentAccessor<EntityStore> componentAccessor)
  public int[] getWorldEnvironmentSpawnDataIndexes()
  public void updateSpawnability()
  public void forEachEnvironmentSpawnData(Consumer<WorldEnvironmentSpawnData> consumer)
  public boolean trackNPC(int environmentIndex, int roleIndex, int npcCount, World world, ComponentAccessor<EntityStore> componentAccessor)
  public boolean untrackNPC(int environmentIndex, int roleIndex, int npcCount)
  public void recalculateWorldCount()
  public void queueUnspawnableChunk(int environmentIndex, long chunkIndex)
  public boolean hasUnprocessedUnspawnableChunks()
  public WorldSpawnData.UnspawnableEntry nextUnspawnableChunk()
  public Resource<EntityStore> clone()

Fields:
private static final HytaleLogger LOGGER
private final Int2ObjectMap<WorldEnvironmentSpawnData> worldEnvironmentSpawnData
private final ArrayDeque<WorldSpawnData.UnspawnableEntry> unspawnableProcessingQueue
private int actualNPCs
private double expectedNPCs
private double expectedNPCsInEmptyEnvironments
private boolean unspawnable
private int chunkCount
private int segmentCount
private int activeSpawnJobs
private int trackedCountFromJobs
private int totalSpawnJobBudgetUsed
private int totalSpawnJobsCompleted
private final SpiralIterator spiralIterator
