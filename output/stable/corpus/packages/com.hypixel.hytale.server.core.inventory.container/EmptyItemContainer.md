# EmptyItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class EmptyItemContainer extends ItemContainer

Zero-capacity singleton container. All slot access methods throw `UnsupportedOperationException`. Filter setters are no-ops. The `clone()` method returns the singleton `INSTANCE`.

Used as a null-object placeholder where an `ItemContainer` reference is required but no storage is needed.

## Constants

- EmptyItemContainer INSTANCE

## Methods


@Override
public short getCapacity()

Returns `0`.


@Nonnull
@Override
public ClearTransaction clear()

Returns `ClearTransaction.EMPTY`.


@Nonnull
@Override
public List<ItemStack> removeAllItemStacks()

Returns an empty list.


@Nonnull
@Override
public Map<Integer, ItemWithAllMetadata> toProtocolMap()

Returns an empty map.


public EmptyItemContainer clone()

Returns `INSTANCE`.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  public short getCapacity()
  public ClearTransaction clear()
  public void forEach(ShortObjectConsumer<ItemStack> action)
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
