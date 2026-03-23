# SlotTransaction

Type: class | Package: com.hypixel.hytale.server.core.inventory.transaction | Implements: Transaction

public class SlotTransaction implements Transaction

## Fields

- private final boolean succeeded
- private final ActionType action
- private final short slot
- private final ItemStack slotBefore
- private final ItemStack slotAfter
- private final ItemStack output
- private final boolean allOrNothing
- private final boolean exactAmount
- private final boolean filter

## Methods

- public SlotTransaction( boolean succeeded, @Nonnull ActionType action, short slot, @Nullable ItemStack slotBefore, @Nullable ItemStack slotAfter, @Nullable ItemStack output, boolean allOrNothing, boolean exactAmount, boolean filter )
- public boolean succeeded()
- public boolean wasSlotModified(short slot)
- public ActionType getAction()
- public short getSlot()
- public ItemStack getSlotBefore()
- public ItemStack getSlotAfter()
- public ItemStack getOutput()
- public boolean isAllOrNothing()
- public boolean isExactAmount()
- public boolean isFilter()
- public SlotTransaction toParent(ItemContainer parent, short start, ItemContainer container)
- public SlotTransaction fromParent(ItemContainer parent, short start, @Nonnull ItemContainer container)
- public String toString()
