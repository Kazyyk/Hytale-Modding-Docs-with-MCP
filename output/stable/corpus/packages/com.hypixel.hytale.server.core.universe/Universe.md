# Universe

Type: class | Package: com.hypixel.hytale.server.core.universe | Extends: JavaPlugin | Implements: IMessageReceiver, MetricProvider

public class Universe extends JavaPlugin implements IMessageReceiver, MetricProvider

The central singleton managing the server universe. Handles world creation, loading, and removal; player connection lifecycle; player storage; plugin management; and server backup operations. Maintains maps of connected players and loaded worlds.

## Methods


public static Universe get()

Returns the singleton instance.


@Nonnull
public ComponentType<EntityStore, PlayerRef> getPlayerRefComponentType()


public int getPlayerCount()


@Nonnull
public Map<String, World> getWorlds()

Also in this package: PlayerRef, WorldLoadCancelledException

Complete API:
  public static Universe get()
  public CompletableFuture<Void> runBackup()
  protected void setup()
  protected void start()
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
