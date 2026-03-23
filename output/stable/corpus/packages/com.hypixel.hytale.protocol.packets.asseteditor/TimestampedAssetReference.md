# TimestampedAssetReference

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class TimestampedAssetReference

An asset reference with an associated timestamp for tracking modifications.

## Fields

- AssetPath path
- String timestamp

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 49,152,033

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static TimestampedAssetReference deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `TimestampedAssetReference` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `TimestampedAssetReference` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `TimestampedAssetReference` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
