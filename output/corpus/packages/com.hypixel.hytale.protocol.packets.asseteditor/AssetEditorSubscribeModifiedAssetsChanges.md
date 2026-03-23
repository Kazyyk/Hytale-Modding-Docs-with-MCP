# AssetEditorSubscribeModifiedAssetsChanges

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorSubscribeModifiedAssetsChanges implements Packet, ToServerPacket

Client-to-server packet (ID 341). Subscribes or unsubscribes from modified asset change notifications.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 1

Binary layout: 1 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorSubscribeModifiedAssetsChanges deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorSubscribeModifiedAssetsChanges` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorSubscribeModifiedAssetsChanges` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorSubscribeModifiedAssetsChanges` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
