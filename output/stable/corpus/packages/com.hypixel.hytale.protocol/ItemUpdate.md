# ItemUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class ItemUpdate extends ComponentUpdate

A component update (type ID 5) that synchronizes an entity's associated item data and visual scale.

## Fields

- ItemWithAllMetadata item
- float entityScale

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 32,768,044

Binary layout: 4 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `ItemUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemWithAllMetadata
- ComponentUpdate
- EntityUpdate
