# SpawnMarkerBlockReference

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates

public class SpawnMarkerBlockReference

ECS component linking an entity back to its originating spawn marker block position. Tracks a lost-origin timeout for cleanup.

Also in this package: AddOrRemove, Data, SpawnMarkerAddedFromExternal, SpawnMarkerBlockState, SpawnMarkerBlockStateSystems, SpawnMarkerTickHeartbeat, TickHeartbeat

Complete API:
  public static ComponentType<EntityStore,SpawnMarkerBlockReference> getComponentType()
  public Vector3i getBlockPosition()
  public void refreshOriginLostTimeout()
  public boolean tickOriginLostTimeout(float dt)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<SpawnMarkerBlockReference> CODEC
private Vector3i blockPosition
private float originLostTimeout
