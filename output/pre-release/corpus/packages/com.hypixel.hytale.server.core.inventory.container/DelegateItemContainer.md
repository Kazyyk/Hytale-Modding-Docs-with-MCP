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
