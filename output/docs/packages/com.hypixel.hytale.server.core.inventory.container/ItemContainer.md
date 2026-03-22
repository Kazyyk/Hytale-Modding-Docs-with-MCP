---
title: "ItemContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.inventory.container"
fqcn: "com.hypixel.hytale.server.core.inventory.container.ItemContainer"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T03:01:16Z"
tags:
  - "inventory"
  - "container"
  - "abstract"
---

**Package:** `com.hypixel.hytale.server.core.inventory.container`

```java
public abstract class ItemContainer
```

Abstract base class for all item containers in the inventory system. Provides thread-safe slot-based storage for `ItemStack` instances with support for add, remove, move, replace, and clear operations. Enforces capacity limits, slot filters, and global filters. Subclasses must implement the internal slot access methods and the locking strategy.

Fires `ItemContainerChangeEvent` through both internal and external event bus registries when container contents change.

## Constants

| Type | Name | Value | Description |
|---|---|---|---|
| `boolean` | `DEFAULT_ADD_ALL_OR_NOTHING` | `false` | Default all-or-nothing mode for add operations. |
| `boolean` | `DEFAULT_REMOVE_ALL_OR_NOTHING` | `true` | Default all-or-nothing mode for remove operations. |
| `boolean` | `DEFAULT_FULL_STACKS` | `false` | Default full-stacks mode. |
| `boolean` | `DEFAULT_EXACT_AMOUNT` | `true` | Default exact-amount mode. |
| `boolean` | `DEFAULT_FILTER` | `true` | Whether filters are applied by default. |

## Abstract Methods

```java
public abstract short getCapacity()
```

Returns the total number of slots in this container.

```java
public abstract void setGlobalFilter(FilterType var1)
```

Sets the global input/output filter for the entire container.

```java
public abstract void setSlotFilter(FilterActionType var1, short var2, SlotFilter var3)
```

Sets a per-slot filter for a specific action type and slot index.

```java
public abstract ItemContainer clone()
```

Creates a copy of this container.

```java
protected abstract <V> V readAction(Supplier<V> var1)
```

Executes an action under the container's read lock.

```java
protected abstract <V> V writeAction(Supplier<V> var1)
```

Executes an action under the container's write lock.

```java
@Nullable
protected abstract ItemStack internal_getSlot(short var1)
```

Returns the item stack at the given slot without locking.

```java
@Nullable
protected abstract ItemStack internal_setSlot(short var1, ItemStack var2)
```

Sets the item stack at the given slot without locking. Returns the previous item.

```java
@Nullable
protected abstract ItemStack internal_removeSlot(short var1)
```

Removes and returns the item stack at the given slot without locking.

```java
protected abstract boolean cantAddToSlot(short var1, ItemStack var2, ItemStack var3)
```

Returns `true` if the item cannot be added to the given slot (filter check).

```java
protected abstract boolean cantRemoveFromSlot(short var1)
```

Returns `true` if items cannot be removed from the given slot (filter check).

```java
protected abstract boolean cantDropFromSlot(short var1)
```

Returns `true` if items cannot be dropped from the given slot (filter check).

```java
protected abstract boolean cantMoveToSlot(ItemContainer var1, short var2)
```

Returns `true` if items cannot be moved to this container from the source container and slot.

## Public Methods

```java
@Nonnull
public InventorySection toPacket()
```

Converts this container to a protocol `InventorySection` for network transmission.

```java
@Nonnull
public Map<Integer, ItemWithAllMetadata> toProtocolMap()
```

Builds a protocol-compatible map of slot index to `ItemWithAllMetadata`.

```java
public EventRegistration registerChangeEvent(@Nonnull Consumer<ItemContainer.ItemContainerChangeEvent> consumer)
```

Registers a change event listener at default priority.

```java
public ClearTransaction clear()
```

Removes all items from the container.

```java
public boolean canAddItemStackToSlot(short slot, @Nonnull ItemStack itemStack, boolean allOrNothing, boolean filter)
```

Tests whether an item stack can be added to a specific slot.

```java
@Nonnull
public ItemStackSlotTransaction addItemStackToSlot(short slot, @Nonnull ItemStack itemStack)
```

Adds an item stack to a specific slot with default options.

```java
@Nullable
public ItemStack getItemStack(short slot)
```

Returns the item stack at the given slot, or `null` if empty.

```java
@Nonnull
public SlotTransaction removeItemStackFromSlot(short slot)
```

Removes the entire item stack from a slot.

```java
@Nonnull
public MoveTransaction<ItemStackTransaction> moveItemStackFromSlot(short slot, @Nonnull ItemContainer containerTo)
```

Moves an item stack from a slot in this container to another container.

```java
@Nonnull
public ListTransaction<ItemStackSlotTransaction> replaceAll(SlotReplacementFunction func)
```

Replaces all non-empty slots using the given replacement function.

## Inner Types

### ItemContainerChangeEvent

```java
public record ItemContainerChangeEvent(ItemContainer container, Transaction transaction) implements IEvent
```

Event fired when any slot in the container changes. Carries the originating container and the transaction that caused the change.

### TempItemData

```java
public record TempItemData(String itemId, int quantity)
```

Lightweight holder for an item ID and quantity, used during internal transaction processing.

## See Also

- [SimpleItemContainer](SimpleItemContainer.md) -- concrete thread-safe implementation backed by `Short2ObjectMap`.
- [CombinedItemContainer](CombinedItemContainer.md) -- composite container spanning multiple child containers.
- [DelegateItemContainer](DelegateItemContainer.md) -- wrapper that adds per-slot filters over a delegate.
- [EmptyItemContainer](EmptyItemContainer.md) -- zero-capacity singleton container.
- [ItemStackItemContainer](ItemStackItemContainer.md) -- container stored inside an item stack's metadata.
