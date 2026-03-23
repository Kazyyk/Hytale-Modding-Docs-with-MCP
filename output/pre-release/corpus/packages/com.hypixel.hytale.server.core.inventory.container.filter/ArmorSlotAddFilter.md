# ArmorSlotAddFilter

Type: class | Package: com.hypixel.hytale.server.core.inventory.container.filter | Implements: ItemSlotFilter

public class ArmorSlotAddFilter implements ItemSlotFilter

Slot filter that only permits items whose armor slot matches the configured `ItemArmorSlot`. Allows `null` items (empty slots). Used by `ItemContainerUtil.trySetArmorFilters` to restrict the first 5 slots of an armor container.

## Constructors


public ArmorSlotAddFilter(ItemArmorSlot itemArmorSlot)

Creates a filter for the given armor slot.

## Methods


@Override
public boolean test(@Nullable Item item)

Returns `true` if the item is `null`, or if the item has armor data with a matching armor slot.


public ItemArmorSlot getItemArmorSlot()

Returns the armor slot this filter requires.

Also in this package: FilterActionType, FilterType, ItemSlotFilter, NoDuplicateFilter, ResourceFilter, SlotFilter, TagFilter

Complete API:
  public boolean test(Item item)
  public ItemArmorSlot getItemArmorSlot()

Fields:
private final ItemArmorSlot itemArmorSlot
