# RailConfig

Type: class | Package: com.hypixel.hytale.protocol

public class RailConfig

Protocol data structure in the Rail System group.

## Fields

- RailPoint`[] points

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 102,400,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RailConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RailConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RailConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RailConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- RailPoint
