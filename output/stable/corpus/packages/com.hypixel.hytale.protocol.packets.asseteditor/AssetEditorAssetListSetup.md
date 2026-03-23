# AssetEditorAssetListSetup

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorAssetListSetup implements Packet, ToClientPacket

Server-to-client packet (ID 319). Uses Zstd compression. Initializes the client-side asset list with file entries for a given pack and file tree.

## Fields

- String pack
- boolean isReadOnly
- boolean canBeDeleted
- AssetEditorFileTree tree
- AssetEditorFileEntry[] paths

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 4 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorAssetListSetup deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorAssetListSetup` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorAssetListSetup` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorAssetListSetup` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorAsset
- AssetEditorFileEntry
- AssetEditorFileTree
