# VelocityConfig

Type: class | Package: com.hypixel.hytale.protocol

public class VelocityConfig

Protocol data structure in the Movement/Physics group.

## Fields

- float groundResistance
- float groundResistanceMax
- float airResistance
- float airResistanceMax
- float threshold
- VelocityThresholdStyle style

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 21

Binary layout: 21 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static VelocityConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `VelocityConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `VelocityConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `VelocityConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- VelocityThresholdStyle
