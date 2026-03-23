# BlockFlags

Type: class | Package: com.hypixel.hytale.protocol

public class BlockFlags

Boolean flags that modify block behavior: whether the block is usable (interactive) and whether it is stackable.

## Fields

- boolean isUsable
- boolean isStackable

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 2
- MAX_SIZE | 2

Binary layout: 2 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockFlags deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockFlags` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockFlags` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockFlags` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockType
