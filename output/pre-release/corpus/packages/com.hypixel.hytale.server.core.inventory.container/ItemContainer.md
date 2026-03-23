# ItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public abstract class ItemContainer

Abstract base class for all item containers in the inventory system. Provides thread-safe read/write locking, slot-based item manipulation (add, remove, move, swap, sort), filtering via `SlotFilter` and `FilterType`, change event registration, and protocol serialization. Concrete implementations include `SimpleItemContainer`, `EmptyItemContainer`, `DelegateItemContainer`, `FetchedItemContainer`, `ItemStackItemContainer`, and `CombinedItemContainer`.

## Static Fields

- public static final CodecMapCodec<ItemContainer> CODEC
- public static final boolean DEFAULT_ADD_ALL_OR_NOTHING
- public static final boolean DEFAULT_REMOVE_ALL_OR_NOTHING
- public static final boolean DEFAULT_FULL_STACKS
- public static final boolean DEFAULT_EXACT_AMOUNT
- public static final boolean DEFAULT_FILTER

## Abstract Methods

- public abstract short getCapacity()
- public abstract void setGlobalFilter(FilterType globalFilter)
- public abstract void setSlotFilter(FilterActionType actionType, short slot, SlotFilter filter)
- public abstract ItemContainer clone()

## Key Methods

- public ClearTransaction clear()
- public ItemStackSlotTransaction addItemStackToSlot(short slot, ItemStack itemStack)
- public ItemStackSlotTransaction setItemStackForSlot(short slot, ItemStack itemStack)
- public ItemStack getItemStack(short slot)
- public SlotTransaction removeItemStackFromSlot(short slot)
- public ItemStackTransaction addItemStack(ItemStack itemStack)
- public ItemStackTransaction removeItemStack(ItemStack itemStack)
- public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, ItemContainer containerTo)
- public ListTransaction<SlotTransaction> sortItems(SortType sort)
- public EventRegistration<Void, ItemContainerChangeEvent> registerChangeEvent(Consumer<ItemContainerChangeEvent> consumer)
- public boolean isEmpty()
- public InventorySection toPacket()

## Relationships

- Implemented by `SimpleItemContainer`, `EmptyItemContainer`, `DelegateItemContainer`, `FetchedItemContainer`, `ItemStackItemContainer`
- Used by InventoryComponent
