# ItemCategory

Type: class | Package: com.hypixel.hytale.protocol

public class ItemCategory

Hierarchical item category with recursive children, used for inventory UI organization.

## Fields

- String id
- String name
- String icon
- int order
- ItemGridInfoDisplayMode infoDisplayMode
- ItemCategory`[] children

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 22
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemCategory deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemCategory` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemCategory` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemCategory` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemGridInfoDisplayMode
