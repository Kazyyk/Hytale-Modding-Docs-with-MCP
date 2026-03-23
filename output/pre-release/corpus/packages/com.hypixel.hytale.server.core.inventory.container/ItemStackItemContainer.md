# ItemStackItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class ItemStackItemContainer extends ItemContainer

Item container backed by an item stack's BSON metadata. Stores sub-items inside the metadata of a parent item stack (e.g., a bag or backpack item). Writes changes back to the parent container whenever items are modified. Not clonable.

## Static Fields

- public static KeyedCodec<BsonDocument> CONTAINER_CODEC
- public static KeyedCodec<Short> CAPACITY_CODEC
- public static KeyedCodec<ItemStack[]> ITEMS_CODEC

## Methods

- public ItemContainer getParentContainer()
- public short getItemStackSlot()
- public ItemStack getOriginalItemStack()
- public boolean isItemStackValid()
- public short getCapacity()
- public ItemStack getItemStack(short slot)
- public static void writeToItemStack(ItemContainer itemContainer, short slot, ItemStack originalItemStack, ItemStack[] items)
- public static ItemStackItemContainer getContainer(ItemContainer itemContainer, short slot)
- public static ItemStackItemContainer makeContainerWithCapacity(ItemContainer itemContainer, short slot, short capacity)
- public static ItemStackItemContainer ensureContainer(ItemContainer itemContainer, short slot, short capacity)
- public static ItemStackItemContainer ensureConfiguredContainer(ItemContainer itemContainer, short slot, ItemStackContainerConfig config)

## Relationships

- Extends `ItemContainer`

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public ItemContainer getParentContainer()
  public short getItemStackSlot()
  public ItemStack getOriginalItemStack()
  public boolean isItemStackValid()
  public short getCapacity()
  public void setGlobalFilter(FilterType globalFilter)
  public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
  public ItemContainer clone()
  protected V readAction(Supplier<V> action)
  protected V readAction(Function<X,V> action, X x)
  protected V writeAction(Supplier<V> action)
  protected V writeAction(Function<X,V> action, X x)
  protected void lockForRead()
  protected void unlockForRead()
  protected void lockForWrite()
  protected void unlockForWrite()
  public boolean isEmpty()
  protected ClearTransaction internal_clear()
  protected ItemStack internal_getSlot(short slot)
  protected ItemStack internal_setSlot(short slot, ItemStack itemStack)
  protected ItemStack internal_removeSlot(short slot)
  protected boolean cantAddToSlot(short slot, ItemStack itemStack, ItemStack slotItemStack)
  protected boolean cantRemoveFromSlot(short slot)
  protected boolean cantDropFromSlot(short slot)
  protected boolean cantMoveToSlot(ItemContainer fromContainer, short slotFrom)
  private boolean testFilter(FilterActionType actionType, short slot, ItemStack itemStack)
  public ItemStack getItemStack(short slot)
  public static void writeToItemStack(ItemContainer itemContainer, short slot, ItemStack originalItemStack, ItemStack[] items)
  public static ItemStackItemContainer getContainer(ItemContainer itemContainer, short slot)
  public static ItemStackItemContainer makeContainerWithCapacity(ItemContainer itemContainer, short slot, short capacity)
  public static ItemStackItemContainer ensureContainer(ItemContainer itemContainer, short slot, short capacity)
  public static ItemStackItemContainer ensureConfiguredContainer(ItemContainer itemContainer, short slot, ItemStackContainerConfig config)

Fields:
public static KeyedCodec<BsonDocument> CONTAINER_CODEC
public static KeyedCodec<Short> CAPACITY_CODEC
public static KeyedCodec<ItemStack[]> ITEMS_CODEC
protected final ReadWriteLock lock
protected final ItemContainer parentContainer
protected final short itemStackSlot
protected final ItemStack originalItemStack
protected final short capacity
protected ItemStack[] items
private final Map<FilterActionType,Int2ObjectConcurrentHashMap<SlotFilter>> slotFilters
private FilterType globalFilter
