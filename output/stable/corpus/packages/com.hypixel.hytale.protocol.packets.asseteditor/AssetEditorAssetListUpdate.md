# AssetEditorAssetListUpdate

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorAssetListUpdate implements Packet, ToClientPacket

Server-to-client packet (ID 320). Uses Zstd compression. Sends incremental additions and deletions to the asset list for a given pack.

## Fields

- String pack
- AssetEditorFileEntry[] additions
- AssetEditorFileEntry[] deletions

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorAssetListUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorAssetListUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorAssetListUpdate` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorAssetListUpdate` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorAsset
- AssetEditorFileEntry
