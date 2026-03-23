# Tint

Type: class | Package: com.hypixel.hytale.protocol

public class Tint

Protocol data structure in the Model/Rendering group.

## Fields

- int top
- int bottom
- int front
- int back
- int left
- int right

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 24
- MAX_SIZE | 24

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Tint deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Tint` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Tint` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Tint` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
