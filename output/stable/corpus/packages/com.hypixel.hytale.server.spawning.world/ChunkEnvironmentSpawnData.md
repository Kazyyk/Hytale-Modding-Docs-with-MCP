# ChunkEnvironmentSpawnData

Type: class | Package: com.hypixel.hytale.server.spawning.world

public class ChunkEnvironmentSpawnData

Tracks environment-specific spawn data per chunk for the spawning system.

Also in this package: CountOnly, WorldEnvironmentSpawnData, WorldNPCSpawnStat

Complete API:
  public double getExpectedNPCs()
  public RandomChunkColumnIterator getRandomChunkColumnIterator()
  public void init(int environmentIndex, WorldChunk chunk)
  public void registerSegment(int x, int z)
  public int getSegmentCount()
  public void updateDensity(double density)
  public double getWeight(double spawnedNPCs)
  public boolean isFullyPopulated(double spawnedNPCs)
  public void markRoleAsUnspawnable(int roleIndex)
  public boolean isRoleSpawnable(int roleIndex)
  public boolean allRolesUnspawnable()
  public boolean wasProcessedAsUnspawnable()
  public void markProcessedAsUnspawnable()

Fields:
private IntSet possibleRoleTypes
private final IntSet unspawnableRoles
private boolean processedAsUnspawnable
private RandomChunkColumnIterator randomChunkColumnIterator
private int segmentCount
private double expectedNPCs
