# InternalContainerUtilTag

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilTag

Internal utility class that implements tag-based removal from item containers. Matches items whose `Item.getData().getExpandedTagIndexes()` contains the specified tag index.

Supports all-or-nothing semantics.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilResource, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  protected static TagSlotTransaction internal_removeTagFromSlot(ItemContainer itemContainer, short slot, int tagIndex, int quantity, boolean allOrNothing, boolean filter)
  protected static TagTransaction internal_removeTag(ItemContainer itemContainer, int tagIndex, int quantity, boolean allOrNothing, boolean exactAmount, boolean filter)
  protected static int testRemoveTagFromItems(ItemContainer container, int tagIndex, int testQuantityRemaining, boolean filter)
  protected static TestRemoveItemSlotResult testRemoveTagSlotFromItems(ItemContainer container, int tagIndex, int testQuantityRemaining, boolean filter)
  protected static int testRemoveTagFromSlot(ItemContainer container, short slot, int tagIndex, int testQuantityRemaining, boolean filter)
