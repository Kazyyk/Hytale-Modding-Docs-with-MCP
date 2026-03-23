# MaterialTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: ListTransaction

public class MaterialTransaction extends ListTransaction<MaterialSlotTransaction>

## Fields

- private final ActionType action
- private final MaterialQuantity material
- private final int remainder
- private final boolean allOrNothing
- private final boolean exactAmount
- private final boolean filter

## Methods

- public MaterialTransaction( boolean succeeded, @Nonnull ActionType action, @Nonnull MaterialQuantity material, int remainder, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull List<MaterialSlotTransaction> slotTransactions )
- public ActionType getAction()
- public MaterialQuantity getMaterial()
- public int getRemainder()
- public boolean isAllOrNothing()
- public boolean isExactAmount()
- public boolean isFilter()
- public MaterialTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public MaterialTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public ActionType getAction()
  public MaterialQuantity getMaterial()
  public int getRemainder()
  public boolean isAllOrNothing()
  public boolean isExactAmount()
  public boolean isFilter()
  public MaterialTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public MaterialTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final ActionType action
private final MaterialQuantity material
private final int remainder
private final boolean allOrNothing
private final boolean exactAmount
private final boolean filter
