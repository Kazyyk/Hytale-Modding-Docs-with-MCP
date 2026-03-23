# SpawnMarkerBlock.Data

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates

public static class Data

Inner class of `SpawnMarkerBlock`. Holds JSON-configured data for a spawn marker block state: the spawn marker asset ID and an optional offset from the block position where the marker entity should be spawned.

Also in this package: AddOrRemove, SpawnMarkerAddedFromExternal, SpawnMarkerBlock, SpawnMarkerBlockReference, SpawnMarkerBlockStateSystems, SpawnMarkerTickHeartbeat, TickHeartbeat

Complete API:
  public String getSpawnMarker()
  public Vector3i getMarkerOffset()

Fields:
public static final BuilderCodec<SpawnMarkerBlock.Data> CODEC
private String spawnMarker
private Vector3i markerOffset
