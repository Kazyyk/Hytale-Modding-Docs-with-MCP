# WorldMapTracker

Type: class | Package: com.hypixel.hytale.server.core.universe.world | Implements: Tickable

public class WorldMapTracker implements Tickable

Per-player world map state manager. Tracks which map chunks are loaded for a player, handles spiral-order loading/unloading, zone discovery with sound/title events, marker tracking, biome tracking, and reload-on-change. Respects world map area bounds, view radius, and frame size limits.

## Inner Types

- `WorldMapTracker.ZoneDiscoveryInfo` -- record with zone name, region, display flag, sound, icon, and timing

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldNotificationHandler, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public void tick(float dt)
  public void updateCurrentZoneAndBiome(Ref<EntityStore> ref, WorldMapTracker.ZoneDiscoveryInfo zoneDiscoveryInfo, String biomeName, ComponentAccessor<EntityStore> componentAccessor)
  private void onZoneDiscovered(Ref<EntityStore> ref, WorldMapTracker.ZoneDiscoveryInfo zoneDiscoveryInfo, ComponentAccessor<EntityStore> componentAccessor)
  private void updateWorldMap(World world, float dt, WorldMapSettings worldMapSettings, int chunkViewRadius, int playerChunkX, int playerChunkZ)
  private void unloadImages(int chunkViewRadius, int playerChunkX, int playerChunkZ)
  private void processPendingReloadChunks(World world)
  private int loadImages(World world, int chunkViewRadius, int playerChunkX, int playerChunkZ, int maxGeneration)
  private int loadWorldMap(World world, Box2D worldMapArea, int maxGeneration)
  private void writeUpdatePacket(List<MapChunk> list)
  public Map<String,MapMarker> getSentMarkers()
  public Player getPlayer()
  public TransformComponent getTransformComponent()
  public void clear()
  public void clearChunks(LongSet chunkIndices)
  public void sendSettings(World world)
  private boolean hasDiscoveredZone(String zoneName)
  public boolean discoverZone(World world, String zoneName)
  public boolean undiscoverZone(World world, String zoneName)
  public boolean discoverZones(World world, Set<String> zoneNames)
  public boolean undiscoverZones(World world, Set<String> zoneNames)
  public boolean isAllowTeleportToCoordinates()
  public boolean isAllowTeleportToMarkers()
  public void setPlayerMapFilter(Predicate<PlayerRef> playerMapFilter)
  public void setClientHasWorldMapVisible(boolean visible)
  public Integer getViewRadiusOverride()
  public String getCurrentBiomeName()
  public WorldMapTracker.ZoneDiscoveryInfo getCurrentZone()
  public void setViewRadiusOverride(Integer viewRadiusOverride)
  public int getEffectiveViewRadius(World world)
  public boolean shouldBeVisible(int chunkViewRadius, long chunkCoordinates)
  public void copyFrom(WorldMapTracker worldMapTracker)
  public static boolean shouldBeVisible(int chunkViewRadius, int chunkX, int chunkZ, int x, int z)

Fields:
private static final HytaleLogger LOGGER
public static final float UPDATE_SPEED
public static final int EMPTY_UPDATE_WORLD_MAP_SIZE
private static final int EMPTY_MAP_CHUNK_SIZE
private static final int FULL_MAP_CHUNK_SIZE
public static final int MAX_IMAGE_GENERATION
public static final int MAX_FRAME
private final Player player
private final CircleSpiralIterator spiralIterator
private final ReentrantReadWriteLock loadedLock
private final HLongSet loaded
private final HLongSet pendingReloadChunks
private final Long2ObjectOpenHashMap<CompletableFuture<MapImage>> pendingReloadFutures
private final MapMarkerTracker markerTracker
private float updateTimer
private Integer viewRadiusOverride
private boolean started
private int sentViewRadius
private int lastChunkX
private int lastChunkZ
private String currentBiomeName
private WorldMapTracker.ZoneDiscoveryInfo currentZone
private boolean allowTeleportToCoordinates
private boolean allowTeleportToMarkers
private boolean clientHasWorldMapVisible
private TransformComponent transformComponent
