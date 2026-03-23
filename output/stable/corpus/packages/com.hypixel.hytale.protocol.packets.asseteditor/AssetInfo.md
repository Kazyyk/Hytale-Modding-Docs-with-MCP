# AssetInfo

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class AssetInfo

Metadata about an asset including its path, hash, size, and modification info.

## Fields

- AssetPath path
- AssetPath oldPath
- boolean isDeleted
- boolean isNew
- long lastModificationDate
- String lastModificationUsername

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 11
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 23
- MAX_SIZE | 81,920,066

Binary layout: 1 null-bit byte + 11 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetInfo deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetInfo` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetInfo` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetInfo` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
