# TagTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: ListTransaction

public class TagTransaction extends ListTransaction<TagSlotTransaction>

## Fields

- private final ActionType action
- private final int tagIndex
- private final int remainder
- private final boolean allOrNothing
- private final boolean exactAmount
- private final boolean filter

## Methods

- public TagTransaction( boolean succeeded, @Nonnull ActionType action, int tagIndex, int remainder, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull List<TagSlotTransaction> slotTransactions )
- public ActionType getAction()
- public int getTagIndex()
- public int getRemainder()
- public boolean isAllOrNothing()
- public boolean isExactAmount()
- public boolean isFilter()
- public TagTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public TagTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, Transaction

Complete API:
  public ActionType getAction()
  public int getTagIndex()
  public int getRemainder()
  public boolean isAllOrNothing()
  public boolean isExactAmount()
  public boolean isFilter()
  public TagTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public TagTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final ActionType action
private final int tagIndex
private final int remainder
private final boolean allOrNothing
private final boolean exactAmount
private final boolean filter
