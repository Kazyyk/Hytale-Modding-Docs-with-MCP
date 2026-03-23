# DelegateItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class DelegateItemContainer<T extends ItemContainer> extends ItemContainer

Generic delegate wrapper around another `ItemContainer`. Adds per-slot and global filter support on top of the delegate's own filtering. Change events bridge between the delegate and the wrapper, translating transactions to maintain correct container references.

## Constructors

- public DelegateItemContainer(T delegate)

## Methods

- public T getDelegate()
- public short getCapacity()
- public ClearTransaction clear()
- public DelegateItemContainer<T> clone()
- public boolean isEmpty()
- public void setGlobalFilter(FilterType globalFilter)
- public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)

## Relationships

- Extends `ItemContainer`

Also in this package: CombinedItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public T getDelegate()
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
  private boolean testFilter(FilterActionType actionType, short slot, ItemStack itemStack)
  public short getCapacity()
  public ClearTransaction clear()
  public DelegateItemContainer<T> clone()
  public boolean isEmpty()
  public void setGlobalFilter(FilterType globalFilter)
  public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
  public EventRegistration<Void,ItemContainer.ItemContainerChangeEvent> registerChangeEvent(short priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  protected void sendUpdate(Transaction transaction)
  public boolean equals(Object o)
  public int hashCode()

Fields:
private T delegate
private final Map<FilterActionType,Int2ObjectConcurrentHashMap<SlotFilter>> slotFilters
private FilterType globalFilter
