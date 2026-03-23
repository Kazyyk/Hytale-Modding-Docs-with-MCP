# MarkersCollectorImpl

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldmap.markers | Implements: MarkersCollector

class MarkersCollectorImpl implements MarkersCollector

Implementation of `MarkersCollector`.

## Fields

- tracker | MapMarkerTracker | final MapMarkerTracker field.
- chunkViewRadius | int | final int field.
- playerChunkX | int | final int field.
- playerChunkZ | int | final int field.

## Constructors

- MarkersCollectorImpl(MapMarkerTracker tracker, int chunkViewRadius, int playerChunkX, int playerChunkZ) | Creates a new MarkersCollectorImpl instance.

## Methods

- getChunkViewRadius() | int | public method.
- getPlayerChunkX() | int | public method.
- getPlayerChunkZ() | int | public method.
- isInViewDistance(double x, double z) | boolean | public method.
- add(MapMarker marker) | void | public method.
- addIgnoreViewDistance(MapMarker marker) | void | public method.
- getPlayerMapFilter() | Predicate<PlayerRef> | public method.

Also in this package: MapMarkerBuilder, MapMarkerTracker, MarkersCollector

Complete API:
  public int getChunkViewRadius()
  public int getPlayerChunkX()
  public int getPlayerChunkZ()
  public boolean isInViewDistance(double x, double z)
  public void add(MapMarker marker)
  public void addIgnoreViewDistance(MapMarker marker)
  public Predicate<PlayerRef> getPlayerMapFilter()

Fields:
private final MapMarkerTracker tracker
private final int chunkViewRadius
private final int playerChunkX
private final int playerChunkZ
