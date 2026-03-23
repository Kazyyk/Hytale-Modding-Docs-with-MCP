# SimpleItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class SimpleItemContainer extends ItemContainer

Standard fixed-capacity item container backed by a `Short2ObjectMap<ItemStack>`. Provides thread-safe read/write operations via `ReentrantReadWriteLock`. Supports slot filtering, global filtering, codec serialization, and utility methods for adding/dropping items with overflow handling.

## Static Fields

- public static final BuilderCodec<SimpleItemContainer> CODEC

## Constructors

- public SimpleItemContainer(short capacity)
- public SimpleItemContainer(SimpleItemContainer other)

## Methods

- public short getCapacity()
- public SimpleItemContainer clone()
- public boolean isEmpty()
- public void setGlobalFilter(FilterType globalFilter)
- public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
- public ItemStack getItemStack(short slot)
- public static ItemContainer getNewContainer(short capacity)
- public static boolean addOrDropItemStack(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, ItemStack itemStack)
- public static boolean addOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)
- public static boolean tryAddOrderedOrDropItemStacks(ComponentAccessor<EntityStore> store, Ref<EntityStore> ref, ItemContainer itemContainer, List<ItemStack> itemStacks)

## Relationships

- Extends `ItemContainer`
- Used by InventoryComponent and ItemContainerBlock

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  protected V readAction(Supplier<V> action)
  protected V readAction(Function<X,V> action, X x)
  protected V writeAction(Supplier<V> action)
  protected V writeAction(Function<X,V> action, X x)
  protected void lockForRead()
  protected void unlockForRead()
  protected void lockForWrite()
  protected void unlockForWrite()
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
