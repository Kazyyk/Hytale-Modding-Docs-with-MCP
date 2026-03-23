# ItemStackItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class ItemStackItemContainer extends ItemContainer

A container whose storage lives inside an `ItemStack`'s BSON metadata in a parent container. When slots change, the modified item array is written back into the parent item stack's metadata. This enables items such as bags or pouches to hold other items.

Thread safety is provided by a `ReentrantReadWriteLock`. Does not support `clone()` -- throws `UnsupportedOperationException`.

## Fields

- ItemContainer parentContainer
- short itemStackSlot
- ItemStack originalItemStack
- short capacity
- ItemStack[] items

## Methods


public ItemContainer getParentContainer()

Returns the parent container.


public short getItemStackSlot()

Returns the slot index in the parent container.


public ItemStack getOriginalItemStack()

Returns the original item stack reference.


public boolean isItemStackValid()

Returns `true` if the item stack in the parent container still matches the original.


@Nullable
public static ItemStackItemContainer getContainer(@Nonnull ItemContainer itemContainer, short slot)

Reads an existing nested container from the item stack at the given slot. Returns `null` if the item stack has no container metadata.


@Nonnull
public static ItemStackItemContainer makeContainerWithCapacity(@Nonnull ItemContainer itemContainer, short slot, short capacity)

Creates a new nested container in the item stack at the given slot. Throws `IllegalStateException` if a container already exists.


@Nullable
public static ItemStackItemContainer ensureContainer(@Nonnull ItemContainer itemContainer, short slot, short capacity)

Returns the existing nested container if present, otherwise creates one.


@Nullable
public static ItemStackItemContainer ensureConfiguredContainer(@Nonnull ItemContainer itemContainer, short slot, @Nonnull ItemStackContainerConfig config)

Ensures a nested container exists and applies global filter and tag filters from the given config.


public static void writeToItemStack(@Nonnull ItemContainer itemContainer, short slot, ItemStack originalItemStack, ItemStack[] items)

Writes the items array back into the item stack's BSON metadata.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

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
