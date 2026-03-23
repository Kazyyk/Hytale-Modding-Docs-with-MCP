# ResourceFilter

Type: class | Package: com.hypixel.hytale.server.core.inventory.container.filter | Implements: ItemSlotFilter

public class ResourceFilter implements ItemSlotFilter

Slot filter that only permits items that provide the configured `ResourceQuantity` type. Checks via `resource.getResourceType(item)`.

## Constructors


public ResourceFilter(ResourceQuantity resource)

Creates a filter for the given resource type.

## Methods


@Override
public boolean test(@Nullable Item item)

Returns `true` if the item is `null` or provides the configured resource type.


public ResourceQuantity getResource()

Returns the resource quantity this filter checks against.
