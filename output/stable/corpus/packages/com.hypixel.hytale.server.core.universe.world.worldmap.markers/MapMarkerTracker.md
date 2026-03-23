# MapMarkerTracker

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers

public class MapMarkerTracker

Class in the markers subsystem.

## Fields

- worldMapTracker | WorldMapTracker | final WorldMapTracker field.
- player | Player | final Player field.
- SMALL_MOVEMENTS_UPDATE_INTERVAL | float | Static final float field.
- smallMovementsTimer | float | float field.
- playerMapFilter | Predicate<PlayerRef> | Predicate<PlayerRef> field.

## Constructors

- MapMarkerTracker(WorldMapTracker worldMapTracker) | Creates a new MapMarkerTracker instance.

## Methods

- getPlayer() | Player | public method.
- getSentMarkers() | Map<String, MapMarker> | public method.
- getPlayerMapFilter() | Predicate<PlayerRef> | public method.
- setPlayerMapFilter(Predicate<PlayerRef> playerMapFilter) | void | public method.
- isSendingSmallMovements() | boolean | private method.
- resetSmallMovementTimer() | void | private method.
- updatePointsOfInterest(float dt, @Nonnull World world, int chunkViewRadius, int playerChunkX, int playerChunkZ) | void | public method.
- sendMapMarker(MapMarker marker) | void | public method.
- doesMarkerNeedNetworkUpdate(@Nullable MapMarker oldMarker, MapMarker newMarker) | boolean | private method.
- copyFrom(@Nonnull MapMarkerTracker other) | void | public method.

Also in this package: MapMarkerBuilder, MarkersCollector, MarkersCollectorImpl

Complete API:
  public Player getPlayer()
  public Map<String,MapMarker> getSentMarkers()
  public Predicate<PlayerRef> getPlayerMapFilter()
  public void setPlayerMapFilter(Predicate<PlayerRef> playerMapFilter)
  private boolean isSendingSmallMovements()
  private void resetSmallMovementTimer()
  public void updatePointsOfInterest(float dt, World world, int chunkViewRadius, int playerChunkX, int playerChunkZ)
  public void sendMapMarker(MapMarker marker)
  private boolean doesMarkerNeedNetworkUpdate(MapMarker oldMarker, MapMarker newMarker)
  public void copyFrom(MapMarkerTracker other)

Fields:
private final WorldMapTracker worldMapTracker
private final Player player
private final Map<String,MapMarker> sentToClientById
public static final float SMALL_MOVEMENTS_UPDATE_INTERVAL
private float smallMovementsTimer
private Predicate<PlayerRef> playerMapFilter
private final Set<String> tempToRemove
private final Set<MapMarker> tempToAdd
private final Set<String> tempTestedMarkers
