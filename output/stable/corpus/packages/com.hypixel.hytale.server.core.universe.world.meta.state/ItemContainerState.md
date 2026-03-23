# ItemContainerState

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object

public class ItemContainerState

Base class for item container state management. Holds a collection of items with slot-based access. Used by both block-based containers (`ItemContainerBlockState`) and entity-based containers.

Known subclasses: TreasureChestState

Also in this package: BlockMapMarker, BlockMapMarkerData, BlockMapMarkersResource, BreakValidatedBlockState, DestroyableBlockState, ItemContainerBlockState, ItemContainerStateData, LaunchPad, LaunchPadSettingsPage, LaunchPadSettingsPageEventData, MarkerBlockState, MarkerProvider, OnAddRemove, OnRemove, PlacedByBlockState, RespawnBlock, SendableBlockState

Complete API:
  public boolean initialize(BlockType blockType)
  public boolean canOpen(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void onOpen(Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void onDestroy()
  public void setCustom(boolean custom)
  public void setAllowViewing(boolean allowViewing)
  public boolean isAllowViewing()
  public void setItemContainer(SimpleItemContainer itemContainer)
  public String getDroplist()
  public void setDroplist(String droplist)
  public Map<UUID,ContainerBlockWindow> getWindows()
  public ItemContainer getItemContainer()
  public void onItemChange(ItemContainer.ItemContainerChangeEvent event)

Fields:
public static final Codec<ItemContainerState> CODEC
private final Map<UUID,ContainerBlockWindow> windows
protected boolean custom
protected boolean allowViewing
protected String droplist
protected SimpleItemContainer itemContainer
