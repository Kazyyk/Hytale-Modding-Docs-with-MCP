# WorldConfig

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class WorldConfig

Configuration for a single world. Controls all per-world settings including UUID, display name, seed, spawn provider, world gen, world map, chunk storage, ticking, PvP, fall damage, game time, weather, game mode, NPC spawning, chunk saving/unloading, compass, and plugin-specific configuration. Supports versioned codec serialization (version 4) with documentation annotations for each field.

## Inner Types

- `WorldConfig.ChunkConfig` -- nested config for pregenerate and keep-loaded regions

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
  public WorldWorldMapConfig getWorldMapConfig()
  public void setWorldMapConfig(WorldWorldMapConfig worldMapConfig)
  public IChunkStorageProvider<?> getChunkStorageProvider()
  public void setChunkStorageProvider(IChunkStorageProvider<?> chunkStorageProvider)
  public WorldConfig.ChunkConfig getChunkConfig()
  public void setChunkConfig(WorldConfig.ChunkConfig chunkConfig)
  public boolean isTicking()
  public void setTicking(boolean ticking)
  public boolean isBlockTicking()
  public void setBlockTicking(boolean ticking)
  public boolean isPvpEnabled()
  public void setPvpEnabled(boolean pvpEnabled)
  public boolean isFallDamageEnabled()
  public void setFallDamageEnabled(boolean fallDamageEnabled)
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
  public Set<String> getDisabledFluidTickers()
  public void setDisabledFluidTickers(Set<String> disabledFluidTickers)
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
private final transient AtomicBoolean hasChanged
private UUID uuid
private String displayName
private long seed
private ISpawnProvider spawnProvider
private IWorldGenProvider worldGenProvider
private IWorldMapProvider worldMapProvider
private WorldWorldMapConfig worldMapConfig
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
private Set<String> disabledFluidTickers
private IResourceStorageProvider resourceStorageProvider
protected MapKeyMapCodec.TypeMap<Object> pluginConfig
private transient ISpawnProvider defaultSpawnProvider
private transient boolean isSavingConfig
