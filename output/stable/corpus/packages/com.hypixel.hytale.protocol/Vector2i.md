# Vector2i

Type: class | Package: com.hypixel.hytale.protocol

public class Vector2i

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- int x
- int y

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Vector2i deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Vector2i` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Vector2i` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Vector2i` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
