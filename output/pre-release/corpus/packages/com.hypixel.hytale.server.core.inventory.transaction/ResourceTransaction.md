# ResourceTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: ListTransaction

public class ResourceTransaction extends ListTransaction<ResourceSlotTransaction>

## Fields

- private final ActionType action
- private final ResourceQuantity resource
- private final int remainder
- private final int consumed
- private final boolean allOrNothing
- private final boolean exactAmount
- private final boolean filter

## Methods

- public ResourceTransaction( boolean succeeded, @Nonnull ActionType action, @Nonnull ResourceQuantity resource, int remainder, int consumed, boolean allOrNothing, boolean exactAmount, boolean filter, @Nonnull List<ResourceSlotTransaction> slotTransactions )
- public ActionType getAction()
- public ResourceQuantity getResource()
- public int getRemainder()
- public int getConsumed()
- public boolean isAllOrNothing()
- public boolean isExactAmount()
- public boolean isFilter()
- public ResourceTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public ResourceTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public ActionType getAction()
  public ResourceQuantity getResource()
  public int getRemainder()
  public int getConsumed()
  public boolean isAllOrNothing()
  public boolean isExactAmount()
  public boolean isFilter()
  public ResourceTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public ResourceTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final ActionType action
private final ResourceQuantity resource
private final int remainder
private final int consumed
private final boolean allOrNothing
private final boolean exactAmount
private final boolean filter
