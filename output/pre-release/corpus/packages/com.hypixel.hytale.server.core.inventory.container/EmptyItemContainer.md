# EmptyItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class EmptyItemContainer extends ItemContainer

Singleton zero-capacity item container used as the default for uninitialized inventory components. All slot operations throw `UnsupportedOperationException`. Filter and change event operations are no-ops.

## Static Fields

- public static final EmptyItemContainer INSTANCE
- public static final BuilderCodec<EmptyItemContainer> CODEC

## Methods

- public short getCapacity()
- public ClearTransaction clear()
- public EmptyItemContainer clone()
- public boolean isEmpty()

## Relationships

- Extends `ItemContainer`
- Used as default by InventoryComponent

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public short getCapacity()
  public ClearTransaction clear()
  public void forEach(ShortObjectConsumer<ItemStack> action)
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
  public List<ItemStack> removeAllItemStacks()
  public Map<Integer,ItemWithAllMetadata> toProtocolMap()
  public EmptyItemContainer clone()
  public EventRegistration registerChangeEvent(short priority, Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
  public void setGlobalFilter(FilterType globalFilter)
  public void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)

Fields:
public static final EmptyItemContainer INSTANCE
public static final BuilderCodec<EmptyItemContainer> CODEC
private static final EventRegistration<Void,ItemContainer.ItemContainerChangeEvent> EVENT_REGISTRATION
