# PlacedByBlockState

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Component<ChunkStore>

public class PlacedByBlockState implements Component<ChunkStore>

Block state component that records which player placed a block. Stores the placer's UUID for ownership tracking, protection, and attribution systems.

Known implementors: ProcessingBenchState

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, BreakValidatedBlockState, DestroyableBlockState, ItemContainerBlockState, ItemContainerState, ItemContainerStateData, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerBlockState, MarkerProvider, OnAddRemove, OnRemove, RespawnBlock, SendableBlockState

Complete API:
  void placedBy(Ref<EntityStore> var1, String var2, BlockState var3, ComponentAccessor<EntityStore> var4)
