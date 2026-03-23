# AssetEditorFetchAssetReply

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorFetchAssetReply implements Packet, ToClientPacket

Server-to-client packet (ID 312). Server reply containing the requested asset data.

## Fields

- byte`[] contents

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 4,096,010

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorFetchAssetReply deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorFetchAssetReply` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorFetchAssetReply` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorFetchAssetReply` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorFetchAsset
