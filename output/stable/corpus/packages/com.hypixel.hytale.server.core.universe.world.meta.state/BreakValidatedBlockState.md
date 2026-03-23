# BreakValidatedBlockState

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Component<ChunkStore>

public class BreakValidatedBlockState implements Component<ChunkStore>

Block state component that validates whether a block can be broken based on additional conditions. Attached to blocks that require custom break validation beyond the standard hardness/tool checks.

Known implementors: TreasureChestState

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, DestroyableBlockState, ItemContainerBlockState, ItemContainerState, ItemContainerStateData, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerBlockState, MarkerProvider, OnAddRemove, OnRemove, PlacedByBlockState, RespawnBlock, SendableBlockState

Complete API:
  boolean canDestroy(Ref<EntityStore> var1, ComponentAccessor<EntityStore> var2)
