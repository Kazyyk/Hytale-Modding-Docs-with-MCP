# SlotFilter

Type: interface | Package: com.hypixel.hytale.server.core.inventory.container.filter

public interface SlotFilter

Functional interface for per-slot inventory filtering. Determines whether an action (add, remove, or drop) is permitted on a specific slot.

## Constants

- SlotFilter ALLOW
- SlotFilter DENY

## Methods


boolean test(FilterActionType var1, ItemContainer var2, short var3, @Nullable ItemStack var4)

Tests whether the given action is permitted on the specified slot. Returns `true` to allow, `false` to block.

## Known Implementations

- ItemSlotFilter -- extends `SlotFilter` to delegate to an `Item`-based test.
- ArmorSlotAddFilter -- restricts a slot to a specific armor slot type.
- NoDuplicateFilter -- prevents duplicate item types in a container.
- ResourceFilter -- restricts a slot to items matching a resource type.
- TagFilter -- restricts a slot to items matching a tag index.

Known implementors: ItemSlotFilter

Also in this package: ArmorSlotAddFilter, FilterActionType, FilterType, ItemSlotFilter, NoDuplicateFilter, ResourceFilter, TagFilter

Complete API:
  boolean test(FilterActionType var1, ItemContainer var2, short var3, ItemStack var4)

Fields:
SlotFilter ALLOW
SlotFilter DENY
