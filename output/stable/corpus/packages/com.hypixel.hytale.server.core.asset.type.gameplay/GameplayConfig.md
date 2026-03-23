# GameplayConfig

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay | Implements: JsonAssetWithMap

public class GameplayConfig implements JsonAssetWithMap

Top-level gameplay configuration asset that aggregates all sub-configs (combat, crafting, death, gathering, player, respawn, spawn, world, etc.) into a single loadable asset.

Also in this package: ArmorVisibilityOption, BrokenPenalties, CameraEffectsConfig, CombatConfig, CraftingConfig, DeathConfig, GatheringConfig, GatheringEffectsConfig, ItemDurabilityConfig, ItemsLossMode, PlayerConfig, RespawnConfig, SleepConfig, SpawnConfig, WorldConfig, WorldMapConfig

Complete API:
  public static AssetStore<String,GameplayConfig,DefaultAssetMap<String,GameplayConfig>> getAssetStore()
  public static DefaultAssetMap<String,GameplayConfig> getAssetMap()
  public GatheringConfig getGatheringConfig()
  public WorldConfig getWorldConfig()
  public WorldMapConfig getWorldMapConfig()
  public DeathConfig getDeathConfig()
  public boolean getShowItemPickupNotifications()
  public ItemDurabilityConfig getItemDurabilityConfig()
  public ItemEntityConfig getItemEntityConfig()
  public RespawnConfig getRespawnConfig()
  public CombatConfig getCombatConfig()
  public MapKeyMapCodec.TypeMap<Object> getPluginConfig()
  public PlayerConfig getPlayerConfig()
  public CameraEffectsConfig getCameraEffectsConfig()
  public String getCreativePlaySoundSet()
  public int getCreativePlaySoundSetIndex()
  public CraftingConfig getCraftingConfig()
  public int getMaxEnvironmentalNPCSpawns()
  public SpawnConfig getSpawnConfig()
  protected void processConfig()
  public String getId()

Fields:
public static final String DEFAULT_ID
public static final GameplayConfig DEFAULT
public static final MapKeyMapCodec<Object> PLUGIN_CODEC
public static final AssetBuilderCodec<String,GameplayConfig> CODEC
private static AssetStore<String,GameplayConfig,DefaultAssetMap<String,GameplayConfig>> ASSET_STORE
public static final ValidatorCache<String> VALIDATOR_CACHE
protected AssetExtraInfo.Data data
protected String id
protected GatheringConfig gatheringConfig
protected WorldConfig worldConfig
protected WorldMapConfig worldMapConfig
protected DeathConfig deathConfig
protected ItemDurabilityConfig itemDurabilityConfig
protected ItemEntityConfig itemEntityConfig
protected RespawnConfig respawnConfig
protected CombatConfig combatConfig
protected MapKeyMapCodec.TypeMap<Object> pluginConfig
protected PlayerConfig playerConfig
protected CameraEffectsConfig cameraEffectsConfig
protected CraftingConfig craftingConfig
protected SpawnConfig spawnConfig
protected String creativePlaySoundSet
protected boolean showItemPickupNotifications
protected transient int creativePlaySoundSetIndex
protected int maxEnvironmentalNPCSpawns
