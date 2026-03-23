# ClearTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Implements: Transaction

public class ClearTransaction implements Transaction

## Constants

- public static final ClearTransaction EMPTY

## Fields

- private final boolean succeeded
- private final short start
- private final ItemStack[] items

## Methods

- public ClearTransaction(boolean succeeded, short start, @Nonnull ItemStack[] items)
- public boolean succeeded()
- public boolean wasSlotModified(short slot)
- public ItemStack[] getItems()
- public ClearTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public ClearTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public boolean succeeded()
  public boolean wasSlotModified(short slot)
  public ItemStack[] getItems()
  public ClearTransaction toParent(ItemContainer parent, short start, ItemContainer container)
  public ClearTransaction fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
public static final ClearTransaction EMPTY
private final boolean succeeded
private final short start
private final ItemStack[] items
