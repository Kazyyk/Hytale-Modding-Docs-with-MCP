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
