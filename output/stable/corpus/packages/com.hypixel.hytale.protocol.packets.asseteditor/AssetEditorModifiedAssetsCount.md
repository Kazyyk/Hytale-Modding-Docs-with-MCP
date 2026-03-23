# AssetEditorModifiedAssetsCount

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorModifiedAssetsCount implements Packet, ToClientPacket

Server-to-client packet (ID 340). Sends the count of modified assets to the client.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 4

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorModifiedAssetsCount deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorModifiedAssetsCount` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorModifiedAssetsCount` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorModifiedAssetsCount` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
