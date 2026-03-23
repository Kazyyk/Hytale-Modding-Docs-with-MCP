# AssetEditorExportAssetPart

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorExportAssetPart implements Packet, ToClientPacket

Server-to-client packet (ID 344). Uses Zstd compression. Transfers a chunk of data for an in-progress asset export.

## Fields

- byte`[] part

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 4,096,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorExportAssetPart deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorExportAssetPart` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorExportAssetPart` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorExportAssetPart` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
