# SendableBlockState

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Component<ChunkStore>

public class SendableBlockState implements Component<ChunkStore>

Block state component marking blocks whose state data must be sent to clients. Used as a flag to include block state information in chunk data packets sent during world streaming.

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, BreakValidatedBlockState, DestroyableBlockState, ItemContainerBlockState, ItemContainerState, ItemContainerStateData, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerBlockState, MarkerProvider, OnAddRemove, OnRemove, PlacedByBlockState, RespawnBlock

Complete API:
  void sendTo(List<ToClientPacket> var1)
  void unloadFrom(List<ToClientPacket> var1)
  default boolean canPlayerSee(PlayerRef player)
