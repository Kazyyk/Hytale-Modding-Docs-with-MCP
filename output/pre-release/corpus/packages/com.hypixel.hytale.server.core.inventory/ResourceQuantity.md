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
