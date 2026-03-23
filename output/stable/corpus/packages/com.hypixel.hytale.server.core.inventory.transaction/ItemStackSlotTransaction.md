# ItemStackSlotTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: SlotTransaction

public class ItemStackSlotTransaction extends SlotTransaction

## Fields

- private final boolean addToExistingSlot
- private final ItemStack query
- private final ItemStack remainder

## Methods

- public ItemStackSlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter, boolean addToExistingSlot, @Nullable ItemStack query, @Nullable ItemStack remainder )
- public boolean isAddToExistingSlot()
- public ItemStack getQuery()
- public ItemStack getRemainder()
- public ItemStackSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public ItemStackSlotTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public boolean isAddToExistingSlot()
  public ItemStack getQuery()
  public ItemStack getRemainder()
  public ItemStackSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public ItemStackSlotTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final boolean addToExistingSlot
private final ItemStack query
private final ItemStack remainder
