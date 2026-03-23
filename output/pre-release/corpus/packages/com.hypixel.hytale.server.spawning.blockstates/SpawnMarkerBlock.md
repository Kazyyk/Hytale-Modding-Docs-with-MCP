# SpawnMarkerBlock

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates | Implements: com.hypixel.hytale.component.Component

public class SpawnMarkerBlock implements Component<ChunkStore>

Chunk-store component that associates a block with a spawn marker entity. Holds a `PersistentRef` to the spawn marker and a configurable lost-marker timeout (default 30 seconds). Implements `Component<ChunkStore>` and is cloneable.

Also in this package: AddOrRemove, Data, SpawnMarkerAddedFromExternal, SpawnMarkerBlockReference, SpawnMarkerBlockStateSystems, SpawnMarkerTickHeartbeat, TickHeartbeat

Complete API:
  public static ComponentType<ChunkStore,SpawnMarkerBlock> getComponentType()
  public PersistentRef getSpawnMarkerReference()
  public SpawnMarkerBlock.Data getConfig()
  public void setSpawnMarkerReference(PersistentRef spawnMarkerReference)
  public void refreshMarkerLostTimeout()
  public boolean tickMarkerLostTimeout(float dt)
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<SpawnMarkerBlock> CODEC
private PersistentRef spawnMarkerReference
private float markerLostTimeout
private SpawnMarkerBlock.Data config
