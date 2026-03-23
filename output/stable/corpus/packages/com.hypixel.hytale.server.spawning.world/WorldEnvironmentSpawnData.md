# WorldEnvironmentSpawnData

Type: class | Package: com.hypixel.hytale.server.spawning.world

public class WorldEnvironmentSpawnData

World-level data tracking environment-specific spawn statistics and constraints.

Also in this package: ChunkEnvironmentSpawnData, CountOnly, WorldNPCSpawnStat

Complete API:
  public int getEnvironmentIndex()
  public int getSegmentCount()
  public boolean isUnspawnable()
  public void setUnspawnable(boolean unspawnable)
  public double getExpectedNPCs()
  public int getActualNPCs()
  public boolean isEmpty()
  public boolean hasNPCs()
  public Int2ObjectMap<WorldNPCSpawnStat> getNpcStatMap()
  public boolean isFullyPopulated()
  public void setFullyPopulated(boolean fullyPopulated)
  public Set<Ref<ChunkStore>> getChunkRefSet()
  public void adjustSegmentCount(int delta)
  public void forEachNpcStat(IntObjectConsumer<WorldNPCSpawnStat> consumer)
  public void setDensity(double density, Store<ChunkStore> store)
  public void updateNPCs(WorldSpawnWrapper spawnWrapper, World world)
  public void clearNPCs()
  public void updateSpawnStats(int roleIndex, int spansTried, int spansSuccess, int budgetUsed, Object2IntMap<SpawnRejection> rejections, boolean success)
  public void removeNPC(int roleIndex, ComponentAccessor<EntityStore> componentAccessor)
  public void addNPC(int roleIndex, WorldSpawnWrapper spawnWrapper, RoleSpawnParameters spawnParams, World world, ComponentAccessor<EntityStore> componentAccessor)
  public double spawnWeight()
  public WorldNPCSpawnStat pickRandomSpawnNPCStat(ComponentAccessor<EntityStore> componentAccessor)
  public void resetUnspawnable()
  public void trackSpawn(int roleNameIndex, int npcCount)
  public void trackDespawn(int roleNameIndex, int npcCount)
  public void removeChunk(Ref<ChunkStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void addChunk(Ref<ChunkStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void recalculateWeight(int moonPhase)
  public void updateExpectedNPCs(int moonPhase)

Fields:
public static final double K_COLUMNS
private final int environmentIndex
private double expectedNPCs
private int actualNPCs
private int segmentCount
private double density
private double sumOfWeights
private boolean unspawnable
private boolean fullyPopulated
private final Int2ObjectMap<WorldNPCSpawnStat> npcStatMap
private final Set<Ref<ChunkStore>> chunkRefSet
