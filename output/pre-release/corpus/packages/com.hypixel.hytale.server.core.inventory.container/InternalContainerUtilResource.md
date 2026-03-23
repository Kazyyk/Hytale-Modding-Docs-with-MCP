# InternalContainerUtilResource

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class InternalContainerUtilResource

Internal utility class that implements resource-based removal from item containers. Converts resource quantities to item quantities using `ItemResourceType.quantity` ratios, rounding up via `MathUtil.ceil`.

Supports all-or-nothing and exact-amount semantics.

Also in this package: CombinedItemContainer, DelegateItemContainer, Dummy, EmptyItemContainer, FetchedItemContainer, InternalContainerUtilItemStack, InternalContainerUtilMaterial, InternalContainerUtilTag, ItemContainer, ItemContainerChangeEvent, ItemContainerUtil, ItemStackItemContainer, ItemType, SimpleItemContainer, SlotReplacementFunction, SortType, TempItemData, TestRemoveItemSlotResult

Complete API:
  protected static ResourceSlotTransaction internal_removeResourceFromSlot(ItemContainer itemContainer, short slot, ResourceQuantity resource, boolean allOrNothing, boolean filter)
  protected static ResourceTransaction internal_removeResource(ItemContainer itemContainer, ResourceQuantity resource, boolean allOrNothing, boolean exactAmount, boolean filter)
  protected static ListTransaction<ResourceTransaction> internal_removeResources(ItemContainer itemContainer, List<ResourceQuantity> resources, boolean allOrNothing, boolean exactAmount, boolean filter)
  public static int testRemoveResourceFromItems(ItemContainer container, ResourceQuantity resource, int testQuantityRemaining, boolean filter)
  public static TestRemoveItemSlotResult testRemoveResourceSlotFromItems(ItemContainer container, ResourceQuantity resource, int testQuantityRemaining, boolean filter)
  public static int testRemoveResourceFromSlot(ItemContainer container, short slot, ResourceQuantity resource, int testQuantityRemaining, boolean filter)
