# ResourceSlotTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: SlotTransaction

public class ResourceSlotTransaction extends SlotTransaction

## Fields

- private final ResourceQuantity query
- private final int remainder
- private final int consumed

## Methods

- public ResourceSlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull ResourceQuantity query, int remainder, int consumed )
- public ResourceQuantity getQuery()
- public int getRemainder()
- public int getConsumed()
- public ResourceSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public ResourceSlotTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public ResourceQuantity getQuery()
  public int getRemainder()
  public int getConsumed()
  public ResourceSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public ResourceSlotTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final ResourceQuantity query
private final int remainder
private final int consumed
