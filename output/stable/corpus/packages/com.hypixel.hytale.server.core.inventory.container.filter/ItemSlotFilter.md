# ItemSlotFilter

Type: interface | Package: com.hypixel.hytale.server.core.inventory.container.filter | Extends: SlotFilter

public interface ItemSlotFilter extends SlotFilter

Extension of SlotFilter that extracts the `Item` from the `ItemStack` before testing. The default `test(FilterActionType, ItemContainer, short, ItemStack)` implementation delegates to `test(Item)`, resolving the item from the stack for ADD actions or from the slot contents for REMOVE/DROP actions.

## Methods


boolean test(@Nullable Item var1)

Tests whether the given item is permitted. Returns `true` to allow, `false` to block. A `null` item (empty slot) is typically allowed.

## Known Implementations

- ArmorSlotAddFilter
- NoDuplicateFilter
- ResourceFilter
- TagFilter
