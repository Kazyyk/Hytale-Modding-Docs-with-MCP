# AssetEditorExportAssetInitialize

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorExportAssetInitialize implements Packet, ToClientPacket

Server-to-client packet (ID 343). Initializes an asset export, specifying the asset to export and its total size.

## Fields

- AssetEditorAsset asset
- AssetPath oldPath
- int size
- boolean failed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 14
- MAX_SIZE | 81,920,066

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorExportAssetInitialize deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorExportAssetInitialize` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorExportAssetInitialize` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorExportAssetInitialize` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorAsset
- AssetPath
