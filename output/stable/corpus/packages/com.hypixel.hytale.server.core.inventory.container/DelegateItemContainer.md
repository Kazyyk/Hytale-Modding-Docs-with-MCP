# DelegateItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class DelegateItemContainer<T extends ItemContainer> extends ItemContainer

Generic wrapper around another `ItemContainer` that adds per-slot filters (`SlotFilter`) and a global `FilterType` without modifying the delegate's own filter state. All slot access and locking is delegated to the underlying container.

Change events from the delegate are forwarded through this wrapper so listeners see this container as the source.

## Type Parameters

- `T` -- the type of the delegate container.

## Fields

- T delegate

## Constructors


public DelegateItemContainer(T delegate)

Creates a delegate wrapper. Throws `NullPointerException` if delegate is `null`.

## Methods


public T getDelegate()

Returns the underlying delegate container.


@Override
public short getCapacity()

Returns the delegate's capacity.


@Nonnull
public DelegateItemContainer<T> clone()

Returns a new `DelegateItemContainer` wrapping the same delegate.


@Override
public void setGlobalFilter(@Nonnull FilterType globalFilter)

Sets the global filter on this wrapper (does not affect the delegate's own filter).


@Override
public void setSlotFilter(FilterActionType actionType, short slot, @Nullable SlotFilter filter)

Sets or removes a per-slot filter on this wrapper.

Also in this package: CombinedItemContainer, Dummy, EmptyItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public T getDelegate()
  protected V readAction(Supplier<V> action)
  protected V readAction(Function<X,V> action, X x)
  protected V writeAction(Supplier<V> action)
  protected V writeAction(Function<X,V> action, X x)
  protected ClearTransaction internal_clear()
  protected ItemStack internal_getSlot(short slot)
  protected ItemStack internal_setSlot(short slot, ItemStack itemStack)
  protected ItemStack internal_removeSlot(short slot)
  protected boolean cantAddToSlot(short slot, ItemStack itemStack, ItemStack slotItemStack)
  protected boolean cantRemoveFromSlot(short slot)
  protected boolean cantDropFromSlot(short slot)
  protected boolean cantMoveToSlot(ItemContainer fromContainer, short slotFrom)
  private boolean testFilter(FilterActionType actionType, short slot, ItemStack itemStack)
  public short getCapacity()
  public ClearTransaction clear()
  public DelegateItemContainer<T> clone()
  public boolean isEmpty()
  public void setGlobalFilter(FilterType globalFilter)
  public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
  public EventRegistration registerChangeEvent(short priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  protected void sendUpdate(Transaction transaction)
  public boolean equals(Object o)
  public int hashCode()

Fields:
private T delegate
private final Map<FilterActionType,Int2ObjectConcurrentHashMap<SlotFilter>> slotFilters
private FilterType globalFilter
