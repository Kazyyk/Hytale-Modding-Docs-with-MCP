# Transaction

Type: interface | Package: com.hypixel.hytale.server.core.inventory.transaction

public interface Transaction

Known implementors: ClearTransaction, ItemStackTransaction, ListTransaction, MoveTransaction, SlotTransaction

Also in this package: ActionType, ClearTransaction, ItemStackSlotTransaction, ItemStackTransaction, ListTransaction, MaterialSlotTransaction, MaterialTransaction, MoveTransaction, MoveType, ResourceSlotTransaction, ResourceTransaction, SlotTransaction, TagSlotTransaction, TagTransaction

Complete API:
  boolean succeeded()
  boolean wasSlotModified(short var1)
  Transaction toParent(ItemContainer var1, short var2, ItemContainer var3)
  Transaction fromParent(ItemContainer var1, short var2, ItemContainer var3)
