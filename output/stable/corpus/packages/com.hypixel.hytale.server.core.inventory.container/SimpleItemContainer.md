# SimpleItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class SimpleItemContainer extends ItemContainer

Concrete thread-safe item container backed by a `Short2ObjectMap<ItemStack>` with a `ReentrantReadWriteLock`. Supports per-slot filters, a global `FilterType`, and BSON codec serialization.

This is the most common container implementation used for player inventories, chests, and other fixed-capacity storage.

## Fields

- short capacity
- Short2ObjectMap<ItemStack> items

## Constructors


public SimpleItemContainer(short capacity)

Creates a container with the given capacity. Throws `IllegalArgumentException` if capacity is zero or negative.


public SimpleItemContainer(@Nonnull SimpleItemContainer other)

Copy constructor. Copies the items map and filters under the source's read lock.

## Methods


@Override
public short getCapacity()

Returns the fixed capacity of this container.


@Nonnull
public SimpleItemContainer clone()

Returns a copy of this container via the copy constructor.


@Override
public void setGlobalFilter(@Nonnull FilterType globalFilter)

Sets the global input/output filter.


@Override
public void setSlotFilter(FilterActionType actionType, short slot, @Nullable SlotFilter filter)

Sets or removes a per-slot filter for the given action type.


public static ItemContainer getNewContainer(short capacity)

Factory method that creates a new `SimpleItemContainer` with the given capacity.


public static boolean addOrDropItemStack(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull ItemContainer itemContainer, @Nonnull ItemStack itemStack)

Attempts to add an item stack to the container; drops any remainder as a world item.


public static boolean addOrDropItemStacks(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull ItemContainer itemContainer, List<ItemStack> itemStacks)

Attempts to add multiple item stacks; drops any remainders as world items.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  protected V readAction(Supplier<V> action)
  protected V readAction(Function<X,V> action, X x)
  protected V writeAction(Supplier<V> action)
  protected V writeAction(Function<X,V> action, X x)
  protected ItemStack internal_getSlot(short slot)
  protected ItemStack internal_setSlot(short slot, ItemStack itemStack)
  protected ItemStack internal_removeSlot(short slot)
  protected boolean cantAddToSlot(short slot, ItemStack itemStack, ItemStack slotItemStack)
  protected boolean cantRemoveFromSlot(short slot)
  protected boolean cantDropFromSlot(short slot)
  protected boolean cantMoveToSlot(ItemContainer fromContainer, short slotFrom)
  private boolean testFilter(FilterActionType actionType, short slot, ItemStack itemStack)
  public short getCapacity()
  protected ClearTransaction internal_clear()
  public SimpleItemContainer clone()
  public boolean isEmpty()
  public void setGlobalFilter(FilterType globalFilter)
  public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
  public ItemStack getItemStack(short slot)
  public boolean equals(Object o)
  public int hashCode()
  public static ItemContainer getNewContainer(short capacity)
  public static boolean addOrDropItemStack(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, ItemStack itemStack)
  public static boolean addOrDropItemStack(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, short slot, ItemStack itemStack)
  public static boolean addOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)
  public static boolean tryAddOrderedOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)

Fields:
public static final BuilderCodec<SimpleItemContainer> CODEC
protected short capacity
protected final ReadWriteLock lock
protected Short2ObjectMap<ItemStack> items
private final Map<FilterActionType,Int2ObjectConcurrentHashMap<SlotFilter>> slotFilters
private FilterType globalFilter
