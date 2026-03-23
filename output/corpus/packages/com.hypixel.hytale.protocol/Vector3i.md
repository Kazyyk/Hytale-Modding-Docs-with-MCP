# Vector3i

Type: class | Package: com.hypixel.hytale.protocol

public class Vector3i

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- int x
- int y
- int z

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 12
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 12

Binary layout: 12 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Vector3i deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Vector3i` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Vector3i` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Vector3i` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
