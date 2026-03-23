# ItemLibrary

Type: class | Package: com.hypixel.hytale.protocol

public class ItemLibrary

Container for the complete set of item definitions. Transmitted during world loading.

## Fields

- ItemBase`[] items
- Map<``Integer``, ``String``> blockMap

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemLibrary deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemLibrary` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemLibrary` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemLibrary` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemBase
