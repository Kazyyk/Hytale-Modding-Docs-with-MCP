# ItemWeapon

Type: class | Package: com.hypixel.hytale.protocol

public class ItemWeapon

Weapon-specific item configuration.

## Fields

- int``[] entityStatsToClear
- Map``<``Integer, Modifier[]``> statModifiers
- boolean renderDualWielded

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 10
- MAX_SIZE | 1,626,112,020

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemWeapon deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemWeapon` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemWeapon` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemWeapon` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemBase
