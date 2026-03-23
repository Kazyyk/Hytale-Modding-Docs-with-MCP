# WorldMap

Type: class | Package: com.hypixel.hytale.server.core.universe.world.map | Implements: NetworkSerializable

public class WorldMap implements NetworkSerializable

## Fields

- private final Map<String,MapMarker> pointsOfInterest
- private final Long2ObjectMap<MapImage> chunks
- private UpdateWorldMap packet

## Methods

- @Nonnull public Map<String,MapMarker> getPointsOfInterest()
- @Nonnull public Long2ObjectMap<MapImage> getChunks()
- public void addPointOfInterest(String id, String name, String markerType, Vector3i pos)
- public void addPointOfInterest(String id, String name, String markerType, Vector3d pos)
- public void addPointOfInterest(String id, String name, String markerType, Transform transform)
- @Nonnull public UpdateWorldMap toPacket()
- @Nonnull @Override public String toString()

Complete API:
  public Map<String,MapMarker> getPointsOfInterest()
  public Long2ObjectMap<MapImage> getChunks()
  public void addPointOfInterest(String id, String name, String markerType, Vector3i pos)
  public void addPointOfInterest(String id, String name, String markerType, Vector3d pos)
  public void addPointOfInterest(String id, String name, String markerType, Transform transform)
  public UpdateWorldMap toPacket()
  public String toString()

Fields:
private final Map<String,MapMarker> pointsOfInterest
private final Long2ObjectMap<MapImage> chunks
private UpdateWorldMap packet
