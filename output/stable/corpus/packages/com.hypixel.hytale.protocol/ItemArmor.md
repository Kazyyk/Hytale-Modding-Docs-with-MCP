# ItemArmor

Type: class | Package: com.hypixel.hytale.protocol

public class ItemArmor

Armor-specific item configuration with slot assignment and cosmetic hiding rules.

## Fields

- ItemArmorSlot armorSlot
- Cosmetic`[] cosmeticsToHide
- Map``<``Integer, Modifier[]``> statModifiers
- double baseDamageResistance
- Map``<``String, Modifier[]``> damageResistance
- Map``<``String, Modifier[]``> damageEnhancement
- Map``<``String, Modifier[]``> damageClassEnhancement

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 10
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 30
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 10 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemArmor deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemArmor` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemArmor` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemArmor` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemArmorSlot
- Cosmetic
- ItemBase
