# BlockUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class BlockUpdate extends ComponentUpdate

A component update (type ID 6) that synchronizes an entity's associated block type and visual scale.

## Fields

- int blockId
- float entityScale

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `BlockUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
- ComponentUpdateType
- EntityUpdate
