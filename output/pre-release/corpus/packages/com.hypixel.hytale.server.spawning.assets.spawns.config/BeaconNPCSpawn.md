# BeaconNPCSpawn

Type: class | Package: com.hypixel.hytale.server.spawning.assets.spawns.config | Extends: NPCSpawn | Implements: JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, BeaconNPCSpawn>>

public class BeaconNPCSpawn extends NPCSpawn implements JsonAssetWithMap<String, IndexedLookupTableAssetMap<String, BeaconNPCSpawn>>

NPC spawn configuration for beacon-based spawning at fixed prefab locations. Adds spawn position selection via `FloodFillPositionSelector` parameters and environment restrictions.

Also in this package: DespawnParameters, NPCSpawn, RoleSpawnParameters, WorldNPCSpawn

Complete API:
  public static AssetStore<String,BeaconNPCSpawn,IndexedLookupTableAssetMap<String,BeaconNPCSpawn>> getAssetStore()
  public static IndexedLookupTableAssetMap<String,BeaconNPCSpawn> getAssetMap()
  public String getId()
  public String getModel()
  public double getTargetDistanceFromPlayer()
  public double getMinDistanceFromPlayer()
  public int[] getYRange()
  public int getMaxSpawnedNpcs()
  public int[] getConcurrentSpawnsRange()
  public Duration[] getSpawnAfterGameTimeRange()
  public Duration[] getSpawnAfterRealTimeRange()
  public boolean isRespawnRealtime()
  public double[] getInitialSpawnDelay()
  public double getNpcIdleDespawnTimeSeconds()
  public Duration getBeaconVacantDespawnTime()
  public double getBeaconRadius()
  public double getSpawnRadius()
  public String getNpcSpawnState()
  public String getNpcSpawnSubState()
  public String getSpawnSuppression()
  public boolean isOverrideSpawnSuppressors()
  public String getTargetSlot()
  public ScaledXYResponseCurve getMaxSpawnsScalingCurve()
  public ScaledXYResponseCurve getConcurrentSpawnsScalingCurve()
  public FloodFillPositionSelector.Debug getDebug()
  public String toString()

Fields:
public static final AssetBuilderCodec<String,BeaconNPCSpawn> CODEC
public static final int[] DEFAULT_Y_RANGE
public static final int[] DEFAULT_CONCURRENT_SPAWNS_RANGE
private static final Duration[] DEFAULT_RESPAWN_TIME_RANGE
protected String model
protected double targetDistanceFromPlayer
protected double minDistanceFromPlayer
protected int[] yRange
protected int maxSpawnedNpcs
protected int[] concurrentSpawnsRange
protected Duration[] spawnAfterGameTime
protected Duration[] spawnAfterRealTime
protected double[] initialSpawnDelay
protected double npcIdleDespawnTimeSeconds
protected double beaconRadius
protected double spawnRadius
protected Duration beaconVacantDespawnTime
protected String npcSpawnState
protected String npcSpawnSubState
protected String targetSlot
protected String spawnSuppression
protected ScaledXYResponseCurve maxSpawnsScalingCurve
protected ScaledXYResponseCurve concurrentSpawnsScalingCurve
protected boolean overrideSpawnSuppressors
protected FloodFillPositionSelector.Debug debug
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,BeaconNPCSpawn,IndexedLookupTableAssetMap<String,BeaconNPCSpawn>> ASSET_STORE
