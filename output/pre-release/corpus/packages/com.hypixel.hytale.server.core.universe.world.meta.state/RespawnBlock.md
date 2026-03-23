# RespawnBlock

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Component<ChunkStore>

public class RespawnBlock implements Component<ChunkStore>

Block state component for blocks that serve as respawn points. When a player interacts with a respawn block, their spawn location is updated to its position.

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerProvider, OnAddRemove, OnRemove

Complete API:
  public static ComponentType<ChunkStore,RespawnBlock> getComponentType()
  public UUID getOwnerUUID()
  public void setOwnerUUID(UUID ownerUUID)
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<RespawnBlock> CODEC
private UUID ownerUUID
