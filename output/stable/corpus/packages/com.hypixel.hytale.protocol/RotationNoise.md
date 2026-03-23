# RotationNoise

Type: class | Package: com.hypixel.hytale.protocol

public class RotationNoise

Protocol data structure in the World/Environment group.

## Fields

- NoiseConfig`[] pitch
- NoiseConfig`[] yaw
- NoiseConfig`[] roll

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 282,624,028

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RotationNoise deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RotationNoise` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RotationNoise` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RotationNoise` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- NoiseConfig
