# ItemContainerBlockState

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: ItemContainerState | Implements: Component<ChunkStore>

public class ItemContainerBlockState extends ItemContainerState implements Component<ChunkStore>

Block state component for blocks that contain items (e.g., chests, barrels). Extends `ItemContainerState` with chunk-store ECS integration. Manages serialization of the contained inventory alongside block metadata.

Known implementors: ItemContainerState, ProcessingBenchState

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, BreakValidatedBlockState, DestroyableBlockState, ItemContainerState, ItemContainerStateData, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerBlockState, MarkerProvider, OnAddRemove, OnRemove, PlacedByBlockState, RespawnBlock, SendableBlockState

Complete API:
  ItemContainer getItemContainer()
