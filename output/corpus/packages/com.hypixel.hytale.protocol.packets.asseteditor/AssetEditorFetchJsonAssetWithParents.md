# AssetEditorFetchJsonAssetWithParents

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorFetchJsonAssetWithParents implements Packet, ToServerPacket

Client-to-server packet (ID 311). Requests a JSON asset along with its parent assets in the inheritance chain.

## Fields

- AssetPath path
- boolean isFromOpenedTab

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 32,768,025

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorFetchJsonAssetWithParents deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorFetchJsonAssetWithParents` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorFetchJsonAssetWithParents` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorFetchJsonAssetWithParents` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
