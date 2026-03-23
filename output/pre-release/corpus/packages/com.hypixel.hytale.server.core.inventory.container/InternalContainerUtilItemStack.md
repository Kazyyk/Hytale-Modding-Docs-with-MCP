# InternalContainerUtilItemStack

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilItemStack

Internal utility class that implements the core item-stack-based add, remove, and test operations for `ItemContainer`. All methods operate under the container's write lock (called by the container's `writeAction` methods).

Handles stacking logic, all-or-nothing semantics, filter checks, and quantity splitting across slots.

Not intended for direct use -- called by `ItemContainer` public methods.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilMaterial, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  protected static int testAddToExistingSlot(ItemContainer abstractItemContainer, short slot, ItemStack itemStack, int itemMaxStack, int testQuantityRemaining, boolean filter)
  protected static ItemStackSlotTransaction internal_addToExistingSlot(ItemContainer container, short slot, ItemStack itemStack, int itemMaxStack, boolean filter)
  protected static ItemStackSlotTransaction internal_addToEmptySlot(ItemContainer container, short slot, ItemStack itemStack, int itemMaxStack, boolean filter)
  protected static int testAddToEmptySlots(ItemContainer container, ItemStack itemStack, int itemMaxStack, int testQuantityRemaining, boolean filter)
  protected static ItemStackSlotTransaction internal_addItemStackToSlot(ItemContainer itemContainer, short slot, ItemStack itemStack, boolean allOrNothing, boolean filter)
  protected static ItemStackSlotTransaction internal_setItemStackForSlot(ItemContainer itemContainer, short slot, ItemStack itemStack, boolean filter)
  protected static SlotTransaction internal_removeItemStackFromSlot(ItemContainer itemContainer, short slot, boolean filter)
  protected static ItemStackSlotTransaction internal_removeItemStackFromSlot(ItemContainer itemContainer, short slot, int quantityToRemove, boolean allOrNothing, boolean filter)
  protected static ItemStackSlotTransaction internal_removeItemStackFromSlot(ItemContainer itemContainer, short slot, ItemStack itemStackToRemove, int quantityToRemove, boolean allOrNothing, boolean filter)
  protected static ItemStackSlotTransaction internal_removeItemStackFromSlot(ItemContainer itemContainer, short slot, ItemStack itemStackToRemove, int quantityToRemove, boolean allOrNothing, boolean filter, BiPredicate<ItemStack,ItemStack> predicate)
  protected static int testRemoveItemStackFromSlot(ItemContainer container, short slot, ItemStack itemStack, int testQuantityRemaining, boolean filter, BiPredicate<ItemStack,ItemStack> predicate)
  protected static ItemStackTransaction internal_addItemStack(ItemContainer itemContainer, ItemStack itemStack, boolean allOrNothing, boolean fullStacks, boolean filter)
  protected static ListTransaction<ItemStackTransaction> internal_addItemStacks(ItemContainer itemContainer, List<ItemStack> itemStacks, boolean allOrNothing, boolean fullStacks, boolean filter)
  protected static ListTransaction<ItemStackSlotTransaction> internal_addItemStacksOrdered(ItemContainer itemContainer, short offset, List<ItemStack> itemStacks, boolean allOrNothing, boolean filter)
  protected static int testAddToExistingItemStacks(ItemContainer container, ItemStack itemStack, int itemMaxStack, int testQuantityRemaining, boolean filter)
  protected static ItemStackTransaction internal_removeItemStack(ItemContainer itemContainer, ItemStack itemStack, boolean allOrNothing, boolean filter)
  protected static ListTransaction<ItemStackTransaction> internal_removeItemStacks(ItemContainer itemContainer, List<ItemStack> itemStacks, boolean allOrNothing, boolean filter)
  protected static int testRemoveItemStackFromItems(ItemContainer container, ItemStack itemStack, int testQuantityRemaining, boolean filter)
  protected static int testRemoveItemStackFromItems(ItemContainer container, ItemStack itemStack, int testQuantityRemaining, boolean filter, BiPredicate<ItemStack,ItemStack> predicate)
  protected static TestRemoveItemSlotResult testRemoveItemStackSlotFromItems(ItemContainer container, ItemStack itemStack, int testQuantityRemaining, boolean filter)
  protected static TestRemoveItemSlotResult testRemoveItemStackSlotFromItems(ItemContainer container, ItemStack itemStack, int testQuantityRemaining, boolean filter, BiPredicate<ItemStack,ItemStack> predicate)
