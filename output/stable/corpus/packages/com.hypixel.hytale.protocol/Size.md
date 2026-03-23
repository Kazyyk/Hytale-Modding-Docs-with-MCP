# Size

Type: class | Package: com.hypixel.hytale.protocol

public class Size

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- int width
- int height

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Size deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Size` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Size` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Size` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
