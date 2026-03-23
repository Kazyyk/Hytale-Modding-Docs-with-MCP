# WorldConfig

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class WorldConfig

Comprehensive configuration for a single world, serialized via `BuilderCodec` (versioned, version 4). Controls world generation, chunk storage, spawn, ticking, PvP, weather, game mode, NPC spawning, day/night cycle, compass, saving behavior, and plugin configuration. Loaded from and saved to `config.json` (formerly `config.bson`).

## Constants

- VERSION | int | 4 | Current codec version.
- INITIAL_GAME_DAY_START_HOUR | int | 5 | Default game-day start hour.
- INITIAL_GAME_DAY_START_MINS | int | 30 | Default game-day start minutes.

## Key Accessors

- getUuid() | UUID | UUID | Unique world identifier.
- getDisplayName() | String | DisplayName | Player-facing world name.
- getSeed() | long | Seed | World generation seed.
- getSpawnProvider() | ISpawnProvider | SpawnProvider | Spawn location provider.
- getWorldGenProvider() | IWorldGenProvider | WorldGen | World generator provider.
- getChunkStorageProvider() | IChunkStorageProvider<?> | ChunkStorage | Chunk persistence backend.
- getChunkConfig() | ChunkConfig | ChunkConfig | Pregenerate/keep-loaded region settings.
- isTicking() | boolean | IsTicking | Whether chunks tick in this world.
- isBlockTicking() | boolean | IsBlockTicking | Whether blocks tick.
- isPvpEnabled() | boolean | IsPvpEnabled | PvP toggle.
- isFallDamageEnabled() | boolean | IsFallDamageEnabled | Fall damage toggle.
- isGameTimePaused() | boolean | IsGameTimePaused | Whether day/night cycle is paused.
- getGameTime() | Instant | GameTime | Current in-game time of day.
- getForcedWeather() | String | ForcedWeather | Forced weather type, or null.
- getClientEffects() | ClientEffectWorldSettings | ClientEffects | Client-side visual effect settings.
- getGameMode() | GameMode | GameMode | Default game mode.
- isSpawningNPC() | boolean | IsSpawningNPC | NPC spawning toggle.
- getGameplayConfig() | String | GameplayConfig | Gameplay configuration asset ID.
- canSaveChunks() | boolean | IsSavingChunks | Whether chunk data can be saved.
- canUnloadChunks() | boolean | IsUnloadingChunks | Whether chunks can unload.
- isDeleteOnRemove() | boolean | DeleteOnRemove | Whether to delete world data on removal.

## Static Methods

- load(Path) | CompletableFuture<WorldConfig> | Loads config from a JSON file asynchronously.
- save(Path, WorldConfig) | CompletableFuture<Void> | Saves config to a JSON file asynchronously.
- formatDisplayName(String) | String | Formats a camelCase/underscore name into a display string with spaces.

## Inner Types

### ChunkConfig (class)

Nested configuration for chunk pregeneration and keep-loaded regions.

- getPregenerateRegion() | Box2D | Region to pregenerate on world start, or null.
- setPregenerateRegion(Box2D) | void | Sets the pregeneration region.
- getKeepLoadedRegion() | Box2D | Region that never unloads, or null.
- setKeepLoadedRegion(Box2D) | void | Sets the keep-loaded region.

## See Also

- World
- ClientEffectWorldSettings
- WorldConfigProvider

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfigProvider, WorldMapTracker, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public UUID getUuid()
  public void setUuid(UUID uuid)
  public boolean isDeleteOnUniverseStart()
  public void setDeleteOnUniverseStart(boolean deleteOnUniverseStart)
  public boolean isDeleteOnRemove()
  public void setDeleteOnRemove(boolean deleteOnRemove)
  public boolean isSavingConfig()
  public void setSavingConfig(boolean savingConfig)
  public String getDisplayName()
  public void setDisplayName(String name)
  public static String formatDisplayName(String name)
  public long getSeed()
  public void setSeed(long seed)
  public ISpawnProvider getSpawnProvider()
  public void setSpawnProvider(ISpawnProvider spawnProvider)
  public void setDefaultSpawnProvider(IWorldGen generator)
  public IWorldGenProvider getWorldGenProvider()
  public void setWorldGenProvider(IWorldGenProvider worldGenProvider)
  public IWorldMapProvider getWorldMapProvider()
  public void setWorldMapProvider(IWorldMapProvider worldMapProvider)
  public IChunkStorageProvider<?> getChunkStorageProvider()
  public void setChunkStorageProvider(IChunkStorageProvider<?> chunkStorageProvider)
  public WorldConfig.ChunkConfig getChunkConfig()
  public void setChunkConfig(WorldConfig.ChunkConfig chunkConfig)
  public boolean isTicking()
  public void setTicking(boolean ticking)
  public boolean isBlockTicking()
  public void setBlockTicking(boolean ticking)
  public boolean isPvpEnabled()
  public boolean isFallDamageEnabled()
  public void setPvpEnabled(boolean pvpEnabled)
  public boolean isGameTimePaused()
  public void setGameTimePaused(boolean gameTimePaused)
  public Instant getGameTime()
  public void setGameTime(Instant gameTime)
  public String getForcedWeather()
  public void setForcedWeather(String forcedWeather)
  public void setClientEffects(ClientEffectWorldSettings clientEffects)
  public ClientEffectWorldSettings getClientEffects()
  public Map<PluginIdentifier,SemverRange> getRequiredPlugins()
  public void setRequiredPlugins(Map<PluginIdentifier,SemverRange> requiredPlugins)
  public GameMode getGameMode()
  public void setGameMode(GameMode gameMode)
  public boolean isSpawningNPC()
  public void setSpawningNPC(boolean spawningNPC)
  public boolean isSpawnMarkersEnabled()
  public void setIsSpawnMarkersEnabled(boolean spawnMarkersEnabled)
  public boolean isAllNPCFrozen()
  public void setIsAllNPCFrozen(boolean allNPCFrozen)
  public String getGameplayConfig()
  public void setGameplayConfig(String gameplayConfig)
  public DeathConfig getDeathConfigOverride()
  public Integer getDaytimeDurationSecondsOverride()
  public Integer getNighttimeDurationSecondsOverride()
  public boolean isCompassUpdating()
  public void setCompassUpdating(boolean compassUpdating)
  public boolean isSavingPlayers()
  public void setSavingPlayers(boolean savingPlayers)
  public boolean canUnloadChunks()
  public void setCanUnloadChunks(boolean unloadingChunks)
  public boolean canSaveChunks()
  public void setCanSaveChunks(boolean savingChunks)
  public boolean shouldSaveNewChunks()
  public void setSaveNewChunks(boolean saveNewChunks)
  public boolean isObjectiveMarkersEnabled()
  public void setObjectiveMarkersEnabled(boolean objectiveMarkersEnabled)
  public IResourceStorageProvider getResourceStorageProvider()
  public void setResourceStorageProvider(IResourceStorageProvider resourceStorageProvider)
  public MapKeyMapCodec.TypeMap<Object> getPluginConfig()
  public void markChanged()
  public boolean consumeHasChanged()
  public static CompletableFuture<WorldConfig> load(Path path)
  public static CompletableFuture<Void> save(Path path, WorldConfig worldConfig)

Fields:
public static final int VERSION
public static final int INITIAL_GAME_DAY_START_HOUR
public static final int INITIAL_GAME_DAY_START_MINS
public static final MapKeyMapCodec<Object> PLUGIN_CODEC
public static final BuilderCodec<WorldConfig> CODEC
private transient AtomicBoolean hasChanged
private UUID uuid
private String displayName
private long seed
private ISpawnProvider spawnProvider
private IWorldGenProvider worldGenProvider
private IWorldMapProvider worldMapProvider
private IChunkStorageProvider<?> chunkStorageProvider
private WorldConfig.ChunkConfig chunkConfig
private boolean isTicking
private boolean isBlockTicking
private boolean isPvpEnabled
private boolean isFallDamageEnabled
private boolean isGameTimePaused
private Instant gameTime
private String forcedWeather
private ClientEffectWorldSettings clientEffects
private Map<PluginIdentifier,SemverRange> requiredPlugins
private GameMode gameMode
private boolean isSpawningNPC
private boolean isSpawnMarkersEnabled
private boolean isAllNPCFrozen
private String gameplayConfig
private DeathConfig deathConfigOverride
private Integer daytimeDurationSecondsOverride
private Integer nighttimeDurationSecondsOverride
private boolean isCompassUpdating
private boolean isSavingPlayers
private boolean canSaveChunks
private boolean saveNewChunks
private boolean canUnloadChunks
private boolean isObjectiveMarkersEnabled
private boolean deleteOnUniverseStart
private boolean deleteOnRemove
private IResourceStorageProvider resourceStorageProvider
protected MapKeyMapCodec.TypeMap<Object> pluginConfig
private transient ISpawnProvider defaultSpawnProvider
private transient boolean isSavingConfig
