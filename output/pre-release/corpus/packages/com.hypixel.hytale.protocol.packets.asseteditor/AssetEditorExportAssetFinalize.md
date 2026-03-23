# AssetEditorExportAssetFinalize

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorExportAssetFinalize implements Packet, ToClientPacket

Server-to-client packet (ID 345). Finalizes an asset export operation after all parts have been transferred.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 0

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorExportAssetFinalize deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorExportAssetFinalize` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorExportAssetFinalize` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorExportAssetFinalize` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
