# Rangef

Type: class | Package: com.hypixel.hytale.protocol

public class Rangef

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- float min
- float max

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Rangef deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Rangef` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Rangef` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Rangef` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
