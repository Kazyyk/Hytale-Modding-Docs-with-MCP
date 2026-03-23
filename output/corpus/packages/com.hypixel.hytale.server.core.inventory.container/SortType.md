# SortType

Type: enum | Package: com.hypixel.hytale.server.core.inventory.container

public enum SortType

Defines inventory sorting strategies. Each constant provides a `Comparator<ItemStack>` that orders items by a specific criterion.

## Enum Constants

- NAME | Translation key | No | No
- TYPE | Item category (WEAPON, ARMOR, TOOL, ITEM, SPECIAL) | No | Yes
- RARITY | Item quality value | Yes (highest first) | Yes

## Methods


@Nonnull
public Comparator<ItemStack> getComparator()

Returns the comparator for this sort type. Nulls are sorted last.


@Nonnull
public com.hypixel.hytale.protocol.SortType toPacket()

Converts this server-side sort type to its protocol equivalent.


@Nonnull
public static SortType fromPacket(@Nonnull com.hypixel.hytale.protocol.SortType sortType_)

Converts a protocol sort type to its server-side equivalent.

## Inner Types

### Dummy.ItemType


static enum ItemType

Internal enum used by the `TYPE` sort strategy. Classifies items into `WEAPON`, `ARMOR`, `TOOL`, `ITEM`, or `SPECIAL` based on which sub-config fields are present on the `Item`.
