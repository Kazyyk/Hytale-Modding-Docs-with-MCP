# Universe

Type: class | Package: com.hypixel.hytale.server.core.universe | Extends: JavaPlugin

public class Universe extends JavaPlugin

Core plugin managing the universe of worlds. Handles world creation, loading, removal, player connection/disconnection, world transfers, backup scheduling, and player data persistence. Maintains the player registry mapping UUIDs to `PlayerRef` instances and provides world lookup by name.

Also in this package: PlayerRef, WorldLoadCancelledException

Complete API:
  public static Universe get()
  public CompletableFuture<Void> runBackup()
  protected void setup()
  protected void start()
  private CompletableFuture<IntIntPair> verifyWorld(World world, Path recoveryPath)
  private CompletableFuture<Void> verifyAllChunks(World world, IChunkLoader loader, IChunkSaver saver, IChunkLoader fallbackLoader, LongIterator iterator, AtomicInteger completed, AtomicInteger corrupted, int total)
  private void verifyNextChunk(CompletableFuture<Void> result, World world, IChunkLoader loader, IChunkSaver saver, IChunkLoader fallbackLoader, LongIterator iterator, AtomicInteger completed, AtomicInteger corrupted, int total)
  private static void collectBackupZips(Path dir, DateTimeFormatter formatter, List<Path> out)
  protected void shutdown()
  public void disconnectAllPLayers()
  public void shutdownAllWorlds()
  public MetricResults toMetricResults()
  public CompletableFuture<Void> getUniverseReady()
  public ResourceType<ChunkStore,WorldMarkersResource> getWorldMarkersResourceType()
  public boolean isWorldLoadable(String name)
  public CompletableFuture<World> addWorld(String name)
  public CompletableFuture<World> addWorld(String name, String generatorType, String chunkStorageType)
  public Path validateWorldPath(String name)
  public CompletableFuture<World> makeWorld(String name, Path savePath, WorldConfig worldConfig)
  public CompletableFuture<World> makeWorld(String name, Path savePath, WorldConfig worldConfig, boolean start)
  private CompletableFuture<Void> loadWorldFromStart(Path savePath, String name)
  public CompletableFuture<World> loadWorld(String name)
  public World getWorld(String worldName)
  public World getWorld(UUID uuid)
  public World getDefaultWorld()
  public boolean removeWorld(String name)
  public void removeWorldExceptionally(String name, Map<UUID,PlayerRef> players)
  public Path getPath()
  public Path getWorldsPath()
  public Path getWorldsDeletedPath()
  public Map<String,World> getWorlds()
  public List<PlayerRef> getPlayers()
  public PlayerRef getPlayer(UUID uuid)
  public PlayerRef getPlayer(String value, NameMatching matching)
  public PlayerRef getPlayer(String value, Comparator<String> comparator, BiPredicate<String,String> equality)
  public PlayerRef getPlayerByUsername(String value, NameMatching matching)
  public PlayerRef getPlayerByUsername(String value, Comparator<String> comparator, BiPredicate<String,String> equality)
  public int getPlayerCount()
  public CompletableFuture<PlayerRef> addPlayer(Channel channel, String language, ProtocolVersion protocolVersion, UUID uuid, String username, PlayerAuthentication auth, int clientViewRadiusChunks, PlayerSkin skin)
  public void removePlayer(PlayerRef playerRef)
  private void finalizePlayerRemoval(PlayerRef playerRef)
  public CompletableFuture<PlayerRef> resetPlayer(PlayerRef oldPlayer)
  public CompletableFuture<PlayerRef> resetPlayer(PlayerRef oldPlayer, Holder<EntityStore> holder)
  public CompletableFuture<PlayerRef> resetPlayer(PlayerRef playerRef, Holder<EntityStore> holder, World world, Transform transform)
  public void sendMessage(Message message)
  public void broadcastPacket(ToClientPacket packet)
  public void broadcastPacketNoCache(ToClientPacket packet)
  public void broadcastPacket(ToClientPacket packets)
  public PlayerStorage getPlayerStorage()
  public void setPlayerStorage(PlayerStorage playerStorage)
  public WorldConfigProvider getWorldConfigProvider()
  public ComponentType<EntityStore,PlayerRef> getPlayerRefComponentType()
  public static Map<Integer,String> getLegacyBlockIdMap()
  public static Path getWorldGenPath()

Fields:
public static final PluginManifest MANIFEST
private static Map<Integer,String> LEGACY_BLOCK_ID_MAP
public static final MetricsRegistry<Universe> METRICS_REGISTRY
private static Universe instance
private ComponentType<EntityStore,PlayerRef> playerRefComponentType
private final Path path
private final Path worldsPath
private final Path worldsDeletedPath
private final Map<UUID,PlayerRef> players
private final Map<String,World> worlds
private final Map<UUID,World> worldsByUuid
private final Map<String,World> unmodifiableWorlds
private PlayerStorage playerStorage
private WorldConfigProvider worldConfigProvider
private ResourceType<ChunkStore,WorldMarkersResource> worldMarkersResourceType
private CompletableFuture<Void> universeReady
private final AtomicBoolean isBackingUp
