# ItemContainerUtil

Type: class | Package: com.hypixel.hytale.server.core.inventory.container

public class ItemContainerUtil

Utility class for applying common filter configurations to item containers.

## Methods


public static <T extends ItemContainer> T trySetArmorFilters(T container)

If the container is a `SimpleItemContainer`, applies `ArmorSlotAddFilter` to the first 5 slots (matching `ItemArmorSlot.VALUES`), `NoDuplicateFilter` to slots 5+, and `SlotFilter.DENY` to any slots beyond the armor slot count.


public static <T extends ItemContainer> T trySetSlotFilters(T container, SlotFilter filter)

If the container is a `SimpleItemContainer`, applies the given filter to all slots for the `ADD` action type.
