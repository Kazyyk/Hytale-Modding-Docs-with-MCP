# SpawnMarker

Type: class | Package: com.hypixel.hytale.server.spawning.assets.spawnmarker.config

public class SpawnMarker implements JsonAssetWithMap<String, DefaultAssetMap<String, SpawnMarker>>

Asset configuration for spawn markers that spawn NPCs at designated positions with defined rotations. When the spawned NPC dies, a new one respawns after a configurable cooldown (game time or real time). Supports model configuration, role assignment, flock integration, and multiple spawn timing options.

Also in this package: SpawnConfiguration

Complete API:
  public static AssetStore<String,SpawnMarker,DefaultAssetMap<String,SpawnMarker>> getAssetStore()
  public static DefaultAssetMap<String,SpawnMarker> getAssetMap()
  public IWeightedMap<SpawnMarker.SpawnConfiguration> getWeightedConfigurations()
  public String getId()
  public String getModel()
  public double getExclusionRadius()
  public double getMaxDropHeightSquared()
  public boolean isRealtimeRespawn()
  public boolean isManualTrigger()
  public double getDeactivationDistance()
  public double getDeactivationTime()

Fields:
public static final AssetBuilderCodec<String,SpawnMarker> CODEC
public static final ValidatorCache<String> VALIDATOR_CACHE
private static AssetStore<String,SpawnMarker,DefaultAssetMap<String,SpawnMarker>> ASSET_STORE
private AssetExtraInfo.Data data
protected String id
protected String model
protected IWeightedMap<SpawnMarker.SpawnConfiguration> weightedConfigurations
protected double exclusionRadius
protected double maxDropHeightSquared
protected boolean realtimeRespawn
protected boolean manualTrigger
protected double deactivationDistance
protected double deactivationTime
