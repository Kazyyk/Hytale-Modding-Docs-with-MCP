# WorldMapTracker

Type: class | Package: com.hypixel.hytale.server.core.universe.world | Implements: Tickable

public class WorldMapTracker implements Tickable

Per-player tracker that manages world map state: loading/unloading map chunk images in a spiral pattern around the player, tracking zone discoveries with title/sound notifications, managing map markers, and handling pending reload chunks. Uses a read-write lock for thread-safe access to the loaded chunk set. Sends `UpdateWorldMap`, `ClearWorldMap`, and `UpdateWorldMapSettings` packets to the player.

## Constants

- UPDATE_SPEED | float | 1.0F | Seconds between map update ticks.
- RADIUS_MAX | int | 512 | Maximum map view radius in chunks.
- MAX_IMAGE_GENERATION | int | 20 | Maximum map images generated per tick.
- MAX_FRAME | int | 2621440 | Maximum packet frame size.

## Key Methods

- tick(float) | void | Tick handler: updates compass markers and loads/unloads map images.
- updateCurrentZoneAndBiome(Ref, ZoneDiscoveryInfo, String, ComponentAccessor) | void | Updates the player's current zone and biome; fires zone discovery events.
- discoverZone(World, String) | boolean | Records a zone as discovered and refreshes settings. Returns true if newly discovered.
- undiscoverZone(World, String) | boolean | Removes a zone from the discovered set.
- discoverZones(World, Set<String>) | boolean | Batch-discovers multiple zones.
- clear() | void | Clears all loaded map data and markers.
- clearChunks(LongSet) | void | Queues specific chunks for reload.
- sendSettings(World) | void | Sends map settings (teleport permissions, marker creation, etc.) to the client.
- setViewRadiusOverride(Integer) | void | Overrides the map view radius (null restores default).
- getPlayer() | Player | Returns the owning player.
- getSentMarkers() | Map<String, MapMarker> | Returns markers currently sent to the client.
- copyFrom(WorldMapTracker) | void | Copies loaded chunk and marker state from another tracker.

## Inner Types

### ZoneDiscoveryInfo (record)

Immutable data class for zone discovery events.

- zoneName | String | Zone identifier.
- regionName | String | Parent region identifier.
- display | boolean | Whether to display the discovery title.
- discoverySoundEventId | String | Sound event to play, or null.
- icon | String | Discovery icon identifier, or null.
- major | boolean | Whether this is a major zone discovery.
- duration | float | Title display duration.
- fadeInDuration | float | Title fade-in duration.
- fadeOutDuration | float | Title fade-out duration.

## See Also

- World
- WorldNotificationHandler

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
public static final int RADIUS_MAX
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
