# Asset

Type: class | Package: com.hypixel.hytale.protocol

public class Asset

Represents a content asset reference with a content hash for integrity verification and a human-readable name.

## Fields

- String hash
- String name

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 64
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 64
- MAX_SIZE | 2,117

Binary layout: 64 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Asset deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Asset` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Asset` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Asset` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetIconProperties
