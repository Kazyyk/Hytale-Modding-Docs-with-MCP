# ClampConfig

Type: class | Package: com.hypixel.hytale.protocol

public class ClampConfig

Defines a value range with min/max bounds and an optional normalization flag.

## Fields

- float min
- float max
- boolean normalize

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 9

Binary layout: 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ClampConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ClampConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ClampConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ClampConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
