# BlockMount

Type: class | Package: com.hypixel.hytale.protocol

public class BlockMount

Defines a mountable position on a block (seat or bed) with precise position and orientation.

## Fields

- BlockMountType type
- Vector3f position
- Vector3f orientation
- int blockTypeId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 30
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 30
- MAX_SIZE | 30

Binary layout: 1 null-bit byte + 30 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockMount deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockMount` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockMount` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockMount` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockMountType
- BlockType
