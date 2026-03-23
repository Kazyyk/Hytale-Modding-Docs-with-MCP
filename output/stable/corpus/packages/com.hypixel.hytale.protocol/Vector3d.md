# Vector3d

Type: class | Package: com.hypixel.hytale.protocol

public class Vector3d

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- double x
- double y
- double z

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 24
- MAX_SIZE | 24

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Vector3d deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Vector3d` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Vector3d` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Vector3d` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
