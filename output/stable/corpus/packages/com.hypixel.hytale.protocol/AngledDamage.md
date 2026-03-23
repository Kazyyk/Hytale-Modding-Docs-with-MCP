# AngledDamage

Type: class | Package: com.hypixel.hytale.protocol

public class AngledDamage

Defines damage configuration for a specific angle range in a directional attack. Used by DamageEntityInteraction to apply different effects based on hit angle.

## Fields

- double angle
- double angleDistance
- DamageEffects damageEffects
- int next

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 21 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AngledDamage deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AngledDamage` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AngledDamage` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AngledDamage` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- DamageEffects
- DamageEntityInteraction
