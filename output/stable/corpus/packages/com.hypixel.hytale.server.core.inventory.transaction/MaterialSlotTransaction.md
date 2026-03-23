# MaterialSlotTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: SlotTransaction

public class MaterialSlotTransaction extends SlotTransaction

## Fields

- private final MaterialQuantity query
- private final int remainder
- private final SlotTransaction transaction

## Methods

- public MaterialSlotTransaction(@Nonnull MaterialQuantity query, int remainder, @Nonnull SlotTransaction transaction)
- public MaterialQuantity getQuery()
- public int getRemainder()
- public SlotTransaction getTransaction()
- public MaterialSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public MaterialSlotTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public MaterialQuantity getQuery()
  public int getRemainder()
  public SlotTransaction getTransaction()
  public MaterialSlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public MaterialSlotTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final MaterialQuantity query
private final int remainder
private final SlotTransaction transaction
