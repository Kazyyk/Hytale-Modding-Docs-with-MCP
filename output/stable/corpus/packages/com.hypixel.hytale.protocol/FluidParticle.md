# FluidParticle

Type: class | Package: com.hypixel.hytale.protocol

public class FluidParticle

Defines a particle effect for fluid visuals with system reference, color, and scale.

## Fields

- String systemId
- Color color
- float scale

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 16,384,013

Binary layout: 1 null-bit byte + 8 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FluidParticle deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FluidParticle` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FluidParticle` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FluidParticle` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FluidFX
- Color
