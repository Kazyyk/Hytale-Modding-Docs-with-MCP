# SlotReplacementFunction

Type: interface | Package: com.hypixel.hytale.server.core.inventory.container

public interface SlotReplacementFunction

Functional interface used by `ItemContainer.replaceAll(SlotReplacementFunction)` to transform item stacks during a bulk replacement operation.

## Methods


ItemStack replace(short var1, ItemStack var2)

Given a slot index and the current item stack in that slot, returns the replacement item stack.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  ItemStack replace(short var1, ItemStack var2)
