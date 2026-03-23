# WorldNPCSpawnStat

Type: class | Package: com.hypixel.hytale.server.spawning.world

public class WorldNPCSpawnStat

Statistics tracker for NPC spawning at the world level including counts and rates.

Known subclasses: CountOnly

Also in this package: ChunkEnvironmentSpawnData, CountOnly, WorldEnvironmentSpawnData

Complete API:
  public int getRoleIndex()
  public double getExpected()
  public void setExpected(double expected)
  public int getActual()
  public void adjustActual(int count)
  public boolean isUnspawnable()
  public void setUnspawnable(boolean unspawnable)
  public WorldSpawnWrapper getSpawnWrapper()
  public RoleSpawnParameters getSpawnParams()
  public int getSpansTried()
  public int getSpansSuccess()
  public int getSuccessfulJobCount()
  public int getSuccessfulJobTotalBudget()
  public int getFailedJobCount()
  public int getFailedJobTotalBudget()
  public double getWeight(int moonPhase)
  public double getMissingCount(ComponentAccessor<EntityStore> componentAccessor)
  public int getAvailableSlots()
  public int getRejectionCount(SpawnRejection rejection)
  public void updateSpawnStats(int spansTried, int spansSuccess, int budgetUsed, Object2IntMap<SpawnRejection> rejections, boolean success)
  public void resetUnspawnable()
  private boolean isSpawnable()
  private void recomputeSpawnSize()

Fields:
private final int roleIndex
private final World world
private WeakReference<BuilderInfo> builderInfoReference
private int minSpawnSize
private double expected
private int actual
private boolean unspawnable
private final WorldSpawnWrapper spawnWrapper
private final RoleSpawnParameters spawnParams
private int spansTried
private final Object2IntMap<SpawnRejection> rejections
private int spansSuccess
private int successfulJobCount
private int successfulJobTotalBudget
private int failedJobCount
private int failedJobTotalBudget
private final double weight
