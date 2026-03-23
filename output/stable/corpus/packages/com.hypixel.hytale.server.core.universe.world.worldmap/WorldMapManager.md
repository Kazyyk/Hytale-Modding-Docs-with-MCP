# WorldMapManager

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap | Extends: TickingThread

public class WorldMapManager extends TickingThread

Per-world manager for the in-game world map. Runs on a dedicated ticking thread (10 TPS) to generate map images, manage marker providers, track player visibility, and handle image caching with automatic unloading. Registered marker providers include spawn, player icons, death, respawn, personal markers, shared markers, and points of interest.

## Constructors


public WorldMapManager(@Nonnull World world)

Creates the manager for the given world and registers all default marker providers.

## Instance Methods


public IWorldMap getGenerator()


public void setGenerator(@Nullable IWorldMap generator)

Sets or replaces the map generator. Clears cached images, reloads settings, and triggers point-of-interest generation.


public World getWorld()


public WorldMapSettings getWorldMapSettings()


public boolean isWorldMapEnabled()


public Map<String, MarkerProvider> getMarkerProviders()


public void addMarkerProvider(@Nonnull String key, @Nonnull MarkerProvider provider)


public Map<String, MapMarker> getPointsOfInterest()


public MapImage getImageIfInMemory(int x, int z)


public MapImage getImageIfInMemory(long index)


public CompletableFuture<MapImage> getImageAsync(int x, int z)


public CompletableFuture<MapImage> getImageAsync(long index)

Returns the cached image or generates it asynchronously via the IWorldMap generator.


public void unloadImages()

Removes cached map images that are no longer visible to any player, using a 60-tick keep-alive countdown.


public void clearImages()


public void clearImagesInChunks(@Nonnull LongSet chunkIndices)


public void sendSettings()


public boolean shouldTick()


public void updateTickingState(boolean before)


public void handleUserCreateMarker(PlayerRef playerRef, CreateUserMarker packet)

Validates and creates a personal or shared user map marker.


public void handleUserRemoveMarker(PlayerRef playerRef, RemoveMapMarker packet)

Validates and removes a user map marker (personal, shared, or death marker).

## Static Methods


public static boolean isWorldMapImageVisibleToAnyPlayer(@Nonnull List<Player> players, long imageIndex, @Nonnull WorldMapSettings settings)


public static void sendSettingsToAllWorlds()

## Inner Types

### MarkerProvider


public interface MarkerProvider

Functional interface for populating map markers for a player. Called per-tick to update dynamic markers.

### MarkerReference


public interface MarkerReference

Codec-registered reference to a map marker that supports remote removal.

### PlayerMarkerReference


public static class PlayerMarkerReference implements MarkerReference

Codec-serializable reference to a player's personal map marker, supporting removal for both online and offline players.

### ImageEntry


public static class ImageEntry

Cache entry wrapping a `MapImage` with an atomic keep-alive counter for eviction.

Also in this package: IWorldMap, ImageEntry, MarkerAndItsStore, MarkerProvider, MarkerReference, PlayerMarkerReference, WorldMapLoadException, WorldMapSettings

Complete API:
  public IWorldMap getGenerator()
  public void setGenerator(IWorldMap generator)
  protected boolean isIdle()
  protected void tick(float dt)
  protected void onShutdown()
  public void unloadImages()
  public boolean isWorldMapEnabled()
  public static boolean isWorldMapImageVisibleToAnyPlayer(List<Player> players, long imageIndex, WorldMapSettings settings)
  public World getWorld()
  public WorldMapSettings getWorldMapSettings()
  public Map<String,WorldMapManager.MarkerProvider> getMarkerProviders()
  public void addMarkerProvider(String key, WorldMapManager.MarkerProvider provider)
  public Map<String,MapMarker> getPointsOfInterest()
  public MapImage getImageIfInMemory(int x, int z)
  public MapImage getImageIfInMemory(long index)
  public CompletableFuture<MapImage> getImageAsync(int x, int z)
  public CompletableFuture<MapImage> getImageAsync(long index)
  public void generate()
  public void sendSettings()
  public boolean shouldTick()
  public void updateTickingState(boolean before)
  public void handleUserCreateMarker(PlayerRef playerRef, CreateUserMarker packet)
  public void handleUserRemoveMarker(PlayerRef playerRef, RemoveMapMarker packet)
  private WorldMapManager.MarkerAndItsStore findUserMapMarker(String markerId, Player player, World world)
  public void clearImages()
  public void clearImagesInChunks(LongSet chunkIndices)
  public static void sendSettingsToAllWorlds()

Fields:
private static final int IMAGE_KEEP_ALIVE
private static final float DEFAULT_UNLOAD_DELAY
private final HytaleLogger logger
private final World world
private final Long2ObjectConcurrentHashMap<WorldMapManager.ImageEntry> images
private final Long2ObjectConcurrentHashMap<CompletableFuture<MapImage>> generating
private final Map<String,WorldMapManager.MarkerProvider> markerProviders
private final Map<String,MapMarker> pointsOfInterest
private WorldMapSettings worldMapSettings
private IWorldMap generator
private CompletableFuture<Void> generatorLoaded
private float unloadDelay
