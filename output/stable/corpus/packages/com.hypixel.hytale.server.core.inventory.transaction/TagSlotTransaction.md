# TagSlotTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: SlotTransaction

public class TagSlotTransaction extends SlotTransaction

## Fields

- private final int query
- private final int remainder

## Methods

- public TagSlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull int query, int remainder )
- public int getQuery()
- public int getRemainder()
- public TagSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public TagSlotTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()
