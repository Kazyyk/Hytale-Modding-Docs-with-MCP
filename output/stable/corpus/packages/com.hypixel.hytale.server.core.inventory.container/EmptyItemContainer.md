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
