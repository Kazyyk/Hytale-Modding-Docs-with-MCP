# NoDuplicateFilter

Type: class | Package: com.hypixel.hytale.server.core.inventory.container.filter | Implements: ItemSlotFilter

public class NoDuplicateFilter implements ItemSlotFilter

Slot filter that prevents adding items whose item ID already exists in the referenced `SimpleItemContainer`. Scans all slots of the container to check for duplicates. Rejects items with a `null` ID.

Used by `ItemContainerUtil.trySetArmorFilters` for armor slots 5 and above.

## Constructors


public NoDuplicateFilter(SimpleItemContainer container)

Creates a filter that checks for duplicates in the given container.

## Methods


@Override
public boolean test(@Nullable Item item)

Returns `false` if the item is `null`, has no ID, or an item with the same ID already exists in the container.

Also in this package: ArmorSlotAddFilter, FilterActionType, FilterType, ItemSlotFilter, ResourceFilter, SlotFilter, TagFilter

Complete API:
  public boolean test(Item item)

Fields:
private final SimpleItemContainer container
