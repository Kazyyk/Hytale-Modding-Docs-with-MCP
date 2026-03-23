# ItemStackTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Implements: Transaction

public class ItemStackTransaction implements Transaction

## Fields

- private final boolean succeeded
- private final ActionType action
- private final ItemStack query
- private final ItemStack remainder
- private final boolean allOrNothing
- private final boolean filter
- private final List<ItemStackSlotTransaction> slotTransactions

## Methods

- public ItemStackTransaction( boolean succeeded, @Nullable ActionType action, @Nullable ItemStack query, @Nullable ItemStack remainder, boolean allOrNothing, boolean filter, @Nonnull List<ItemStackSlotTransaction> slotTransactions )
- public boolean succeeded()
- public boolean wasSlotModified(short slot)
- public ActionType getAction()
- public ItemStack getQuery()
- public ItemStack getRemainder()
- public boolean isAllOrNothing()
- public boolean isFilter()
- public List<ItemStackSlotTransaction> getSlotTransactions()
- public ItemStackTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public ItemStackTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public boolean succeeded()
  public boolean wasSlotModified(short slot)
  public ActionType getAction()
  public ItemStack getQuery()
  public ItemStack getRemainder()
  public boolean isAllOrNothing()
  public boolean isFilter()
  public List<ItemStackSlotTransaction> getSlotTransactions()
  public ItemStackTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public ItemStackTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
public static final ItemStackTransaction FAILED_ADD
private final boolean succeeded
private final ActionType action
private final ItemStack query
private final ItemStack remainder
private final boolean allOrNothing
private final boolean filter
private final List<ItemStackSlotTransaction> slotTransactions
