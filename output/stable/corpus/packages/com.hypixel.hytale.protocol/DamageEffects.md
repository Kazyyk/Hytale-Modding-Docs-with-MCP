# DamageEffects

Type: class | Package: com.hypixel.hytale.protocol

public class DamageEffects

Visual and audio effects triggered when damage is dealt, including particles and sound.

## Fields

- ModelParticle`[] modelParticles
- WorldParticle`[] worldParticles
- int soundEventIndex

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static DamageEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `DamageEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `DamageEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `DamageEffects` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AngledDamage
- DamageEntityInteraction
