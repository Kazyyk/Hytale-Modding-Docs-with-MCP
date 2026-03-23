# AssetEditorAsset

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor

public class AssetEditorAsset

Represents a single asset entry with a content hash and path.

## Fields

- String hash
- AssetPath path

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 49,152,033

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorAsset deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorAsset` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorAsset` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorAsset` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
