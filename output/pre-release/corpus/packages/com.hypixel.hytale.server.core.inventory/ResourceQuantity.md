# ResourceQuantity

Type: class | Package: com.hypixel.hytale.server.core.inventory

public class ResourceQuantity

Represents a quantity of a named resource identified by resource ID. Used alongside MaterialQuantity for crafting and resource tracking.

## Constructors

- ResourceQuantity(String resourceId, int quantity)

## Methods

- public String getResourceId()
- public int getQuantity()
- public ResourceQuantity clone(int quantity)
- public ItemResourceType getResourceType(Item item)

Also in this package: Armor, ArmorChangeEventSystem, Backpack, BackpackChangeEventSystem, Combined, Hotbar, HotbarChangeEventSystem, Inventory, InventoryChangeEvent, InventoryChangeEventSystem, InventoryComponent, InventorySystems, ItemContext, ItemPickupType, ItemStack, LegacyArmorChangeStatSystem, LegacyHotbarChangeStatSystem, LegacyUtilityChangeStatSystem, MaterialQuantity, Metadata (and 7 more)

Complete API:
  public String getResourceId()
  public int getQuantity()
  public ResourceQuantity clone(int quantity)
  public ItemResourceType getResourceType(Item item)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
protected String resourceId
protected int quantity
