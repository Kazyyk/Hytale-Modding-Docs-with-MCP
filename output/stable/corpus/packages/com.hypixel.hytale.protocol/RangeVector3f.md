# RangeVector3f

Type: class | Package: com.hypixel.hytale.protocol

public class RangeVector3f

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- Rangef x
- Rangef y
- Rangef z

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 25
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 25
- MAX_SIZE | 25

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RangeVector3f deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RangeVector3f` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RangeVector3f` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RangeVector3f` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Rangef
