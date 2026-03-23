# ActionType

Type: enum | Package: com.hypixel.hytale.server.core.inventory.transaction

public enum ActionType

## Enum Constants

- SET
- false
- true
- ADD
- false
- false
- REMOVE
- true
- false
- REPLACE
- true
- false

## Fields

- private final boolean add
- private final boolean remove
- private final boolean destroy

## Methods

- private ActionType(boolean add, boolean remove, boolean destroy)
- public boolean isAdd()
- public boolean isRemove()
- public boolean isDestroy()

Also in this package: ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction, Transaction

Complete API:
  public boolean isAdd()
  public boolean isRemove()
  public boolean isDestroy()

Fields:
private final boolean add
private final boolean remove
private final boolean destroy
