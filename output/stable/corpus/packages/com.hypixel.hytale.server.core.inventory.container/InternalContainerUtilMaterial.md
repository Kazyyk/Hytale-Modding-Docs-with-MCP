# InternalContainerUtilMaterial

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilMaterial

Internal utility class that implements material-based removal operations for `ItemContainer`. Materials can be identified by item ID, tag index, or resource type. Delegates to `InternalContainerUtilItemStack`, `InternalContainerUtilTag`, or `InternalContainerUtilResource` depending on the `MaterialQuantity` type.

Supports all-or-nothing and exact-amount semantics.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, InternalContainerUtilItemStack, InternalContainerUtilResource, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  protected static MaterialSlotTransaction internal_removeMaterialFromSlot(ItemContainer itemContainer, short slot, MaterialQuantity material, boolean allOrNothing, boolean filter)
  protected static MaterialTransaction internal_removeMaterial(ItemContainer itemContainer, MaterialQuantity material, boolean allOrNothing, boolean exactAmount, boolean filter)
  protected static ListTransaction<MaterialTransaction> internal_removeMaterials(ItemContainer itemContainer, List<MaterialQuantity> materials, boolean allOrNothing, boolean exactAmount, boolean filter)
  public static int testRemoveMaterialFromItems(ItemContainer container, MaterialQuantity material, int testQuantityRemaining, boolean filter)
  public static TestRemoveItemSlotResult getTestRemoveMaterialFromItems(ItemContainer container, MaterialQuantity material, int testQuantityRemaining, boolean filter)
  protected static ListTransaction<MaterialSlotTransaction> internal_removeMaterialsOrdered(ItemContainer itemContainer, short offset, List<MaterialQuantity> materials, boolean allOrNothing, boolean exactAmount, boolean filter)
  public static int testRemoveMaterialFromSlot(ItemContainer container, short slot, MaterialQuantity material, int testQuantityRemaining, boolean filter)
