# ItemArmorSlot

Type: enum | Package: com.hypixel.hytale.protocol

public enum ItemArmorSlot

Identifies equipment slots for armor pieces.

## Constants

- Head | 0 | Helmet slot.
- Chest | 1 | Chestplate slot.
- Hands | 2 | Gauntlets/gloves slot.
- Legs | 3 | Leggings slot.

## Methods


public int getValue()

Returns the integer wire value for this `ItemArmorSlot` constant.


public static ItemArmorSlot fromValue(int value)

Returns the `ItemArmorSlot` constant for the given wire value. Throws `ProtocolException` if the value is out of range.

## Serialization

Serialized as a single byte (`0`--`3`). The static `VALUES` array is used for O(1) lookup by ordinal.

## Related Types

- ItemArmor
