# MoveTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Extends: Transaction> | Implements: Transaction

public class MoveTransaction<T extends Transaction> implements Transaction

## Fields

- private final boolean succeeded
- private final SlotTransaction removeTransaction
- private final MoveType moveType
- private final ItemContainer otherContainer
- private final T addTransaction

## Methods

- public MoveTransaction( boolean succeeded, @Nonnull SlotTransaction removeTransaction, @Nonnull MoveType moveType, @Nonnull ItemContainer otherContainer, T addTransaction )
- public boolean succeeded()
- public SlotTransaction getRemoveTransaction()
- public MoveType getMoveType()
- public ItemContainer getOtherContainer()
- public T getAddTransaction()
- public MoveTransaction<T> toInverted(@Nonnull ItemContainer itemContainer)
- public boolean wasSlotModified(short slot)
- public MoveTransaction<T> toParent(ItemContainer parent, short start, ItemContainer container)
- public MoveTransaction<T> fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public boolean succeeded()
  public SlotTransaction getRemoveTransaction()
  public MoveType getMoveType()
  public ItemContainer getOtherContainer()
  public T getAddTransaction()
  public MoveTransaction<T> toInverted(ItemContainer itemContainer)
  public boolean wasSlotModified(short slot)
  public MoveTransaction<T> toParent(ItemContainer parent, short start, ItemContainer container)
  public MoveTransaction<T> fromParent(ItemContainer parent, short start, ItemContainer container)
  public String toString()

Fields:
private final boolean succeeded
private final SlotTransaction removeTransaction
private final MoveType moveType
private final ItemContainer otherContainer
private final T addTransaction
