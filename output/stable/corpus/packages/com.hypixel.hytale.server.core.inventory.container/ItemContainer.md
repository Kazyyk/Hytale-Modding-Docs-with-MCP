# ItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public abstract class ItemContainer

Abstract base class for all item containers in the inventory system. Provides thread-safe slot-based storage for `ItemStack` instances with support for add, remove, move, replace, and clear operations. Enforces capacity limits, slot filters, and global filters. Subclasses must implement the internal slot access methods and the locking strategy.

Fires `ItemContainerChangeEvent` through both internal and external event bus registries when container contents change.

## Constants

- boolean DEFAULT_ADD_ALL_OR_NOTHING
- boolean DEFAULT_REMOVE_ALL_OR_NOTHING
- boolean DEFAULT_FULL_STACKS
- boolean DEFAULT_EXACT_AMOUNT
- boolean DEFAULT_FILTER

## Abstract Methods


public abstract short getCapacity()

Returns the total number of slots in this container.


public abstract void setGlobalFilter(FilterType var1)

Sets the global input/output filter for the entire container.


public abstract void setSlotFilter(FilterActionType var1, short var2, SlotFilter var3)

Sets a per-slot filter for a specific action type and slot index.


public abstract ItemContainer clone()

Creates a copy of this container.


protected abstract <V> V readAction(Supplier<V> var1)

Executes an action under the container's read lock.


protected abstract <V> V writeAction(Supplier<V> var1)

Executes an action under the container's write lock.


@Nullable
protected abstract ItemStack internal_getSlot(short var1)

Returns the item stack at the given slot without locking.


@Nullable
protected abstract ItemStack internal_setSlot(short var1, ItemStack var2)

Sets the item stack at the given slot without locking. Returns the previous item.


@Nullable
protected abstract ItemStack internal_removeSlot(short var1)

Removes and returns the item stack at the given slot without locking.


protected abstract boolean cantAddToSlot(short var1, ItemStack var2, ItemStack var3)

Returns `true` if the item cannot be added to the given slot (filter check).


protected abstract boolean cantRemoveFromSlot(short var1)

Returns `true` if items cannot be removed from the given slot (filter check).


protected abstract boolean cantDropFromSlot(short var1)

Returns `true` if items cannot be dropped from the given slot (filter check).


protected abstract boolean cantMoveToSlot(ItemContainer var1, short var2)

Returns `true` if items cannot be moved to this container from the source container and slot.

## Public Methods


@Nonnull
public InventorySection toPacket()

Converts this container to a protocol `InventorySection` for network transmission.


@Nonnull
public Map<Integer, ItemWithAllMetadata> toProtocolMap()

Builds a protocol-compatible map of slot index to `ItemWithAllMetadata`.


public EventRegistration registerChangeEvent(@Nonnull Consumer<ItemContainer.ItemContainerChangeEvent> consumer)

Registers a change event listener at default priority.


public ClearTransaction clear()

Removes all items from the container.


public boolean canAddItemStackToSlot(short slot, @Nonnull ItemStack itemStack, boolean allOrNothing, boolean filter)

Tests whether an item stack can be added to a specific slot.


@Nonnull
public ItemStackSlotTransaction addItemStackToSlot(short slot, @Nonnull ItemStack itemStack)

Adds an item stack to a specific slot with default options.


@Nullable
public ItemStack getItemStack(short slot)

Returns the item stack at the given slot, or `null` if empty.


@Nonnull
public SlotTransaction removeItemStackFromSlot(short slot)

Removes the entire item stack from a slot.


@Nonnull
public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, @Nonnull ItemContainer containerTo)

Moves an item stack from a slot in this container to another container.


@Nonnull
public ListTransaction<ItemStackSlotTransaction> replaceAll(SlotReplacementFunction func)

Replaces all non-empty slots using the given replacement function.

## Inner Types

### ItemContainerChangeEvent


public record ItemContainerChangeEvent(ItemContainer container, Transaction transaction) implements IEvent

Event fired when any slot in the container changes. Carries the originating container and the transaction that caused the change.

### TempItemData


public record TempItemData(String itemId, int quantity)

Lightweight holder for an item ID and quantity, used during internal transaction processing.

## See Also

- SimpleItemContainer -- concrete thread-safe implementation backed by `Short2ObjectMap`.
- CombinedItemContainer -- composite container spanning multiple child containers.
- DelegateItemContainer -- wrapper that adds per-slot filters over a delegate.
- EmptyItemContainer -- zero-capacity singleton container.
- ItemStackItemContainer -- container stored inside an item stack's metadata.
