# SpawnMarkerBlockState

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates

public class SpawnMarkerBlockState

Block state for spawn marker blocks. Stores a `PersistentRef` to the associated marker entity and a lost-marker timeout. Contains inner `Data` class with spawn marker asset ID and offset.

Also in this package: AddOrRemove, Data, SpawnMarkerAddedFromExternal, SpawnMarkerBlockReference, SpawnMarkerBlockStateSystems, SpawnMarkerTickHeartbeat, TickHeartbeat

Complete API:
  public PersistentRef getSpawnMarkerReference()
  public void setSpawnMarkerReference(PersistentRef spawnMarkerReference)
  public void refreshMarkerLostTimeout()
  public boolean tickMarkerLostTimeout(float dt)

Fields:
public static final Codec<SpawnMarkerBlockState> CODEC
private PersistentRef spawnMarkerReference
private float markerLostTimeout
