# SortType

Type: enum | Package: com.hypixel.hytale.server.core.inventory.container

public enum SortType

Defines sorting strategies for item containers. Each constant provides a `Comparator<ItemStack>` used by `ItemContainer.sortItems()`.

## Enum Constants

- NAME | Item translation key | Alphabetical, ascending
- TYPE | Item category (WEAPON, ARMOR, TOOL, ITEM, SPECIAL) | Grouped by type, then by name
- RARITY | Item quality value | Descending by rarity, then by name

## Static Fields

- public static SortType[] VALUES

## Methods

- public Comparator<ItemStack> getComparator()

## Relationships

- Used by `ItemContainer.sortItems()`
