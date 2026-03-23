# CombinedItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class CombinedItemContainer extends ItemContainer

Composite container that concatenates multiple child `ItemContainer` instances into a single logical container. Slot indices are offset: the first child's slots start at 0, the second child's slots start at the first child's capacity, and so on.

Read and write locks are acquired recursively across all child containers to ensure atomicity. Change events are propagated from children to the combined container with slot offsets adjusted.

Does not support `setGlobalFilter(FilterType)` -- throws `UnsupportedOperationException`. Per-slot filters are delegated to the appropriate child container.

Does not support `clone()` -- throws `UnsupportedOperationException`.

## Fields

- ItemContainer[] containers

## Methods


public CombinedItemContainer(ItemContainer... containers)

Creates a combined container from the given child containers.


public ItemContainer getContainer(int index)

Returns the child container at the given index.


public int getContainersSize()

Returns the number of child containers.


@Nullable
public ItemContainer getContainerForSlot(short slot)

Returns the child container that owns the given logical slot, or `null` if out of range.


@Override
public short getCapacity()

Returns the sum of all child container capacities.


@Override
public boolean containsContainer(ItemContainer itemContainer)

Returns `true` if this combined container or any of its children contains the given container.

Also in this package: DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public ItemContainer getContainer(int index)
  public int getContainersSize()
  public ItemContainer getContainerForSlot(short slot)
  protected V readAction(Supplier<V> action)
  protected V readAction(Function<X,V> action, X x)
  protected V writeAction(Supplier<V> action)
  protected V writeAction(Function<X,V> action, X x)
  protected void lockForRead()
  protected void unlockForRead()
  protected void lockForWrite()
  protected void unlockForWrite()
  protected ClearTransaction internal_clear()
  protected ItemStack internal_getSlot(short slot)
  protected ItemStack internal_setSlot(short slot, ItemStack itemStack)
  protected ItemStack internal_removeSlot(short slot)
  protected boolean cantAddToSlot(short slot, ItemStack itemStack, ItemStack slotItemStack)
  protected boolean cantRemoveFromSlot(short slot)
  protected boolean cantDropFromSlot(short slot)
  protected boolean cantMoveToSlot(ItemContainer fromContainer, short slotFrom)
  public short getCapacity()
  public CombinedItemContainer clone()
  public EventRegistration<Void,ItemContainer.ItemContainerChangeEvent> registerChangeEvent(short priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  protected void sendUpdate(Transaction transaction)
  public boolean containsContainer(ItemContainer itemContainer)
  public boolean equals(Object o)
  public int hashCode()
  public void setGlobalFilter(FilterType globalFilter)
  public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)

Fields:
protected final ItemContainer[] containers
