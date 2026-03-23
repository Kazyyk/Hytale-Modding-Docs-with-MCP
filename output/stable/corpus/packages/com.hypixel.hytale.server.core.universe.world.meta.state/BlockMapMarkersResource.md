# BlockMapMarkersResource

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Resource<ChunkStore>

public class BlockMapMarkersResource implements Resource<ChunkStore>

Per-chunk-store resource that collects all block map markers into a `MarkersCollector`. Provides the chunk-level aggregation of markers for the world map system.

Also in this package: BlockMapMarker, BlockMapMarkerData, BreakValidatedBlockState, DestroyableBlockState, ItemContainerBlockState, ItemContainerState, ItemContainerStateData, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerBlockState, MarkerProvider, OnAddRemove, OnRemove, PlacedByBlockState, RespawnBlock, SendableBlockState

Complete API:
  public static ResourceType<ChunkStore,BlockMapMarkersResource> getResourceType()
  public Long2ObjectMap<BlockMapMarkersResource.BlockMapMarkerData> getMarkers()
  public void addMarker(Vector3i position, String name, String icon)
  public void removeMarker(Vector3i position)
  public Resource<ChunkStore> clone()

Fields:
public static final BuilderCodec<BlockMapMarkersResource> CODEC
private Long2ObjectMap<BlockMapMarkersResource.BlockMapMarkerData> markers
