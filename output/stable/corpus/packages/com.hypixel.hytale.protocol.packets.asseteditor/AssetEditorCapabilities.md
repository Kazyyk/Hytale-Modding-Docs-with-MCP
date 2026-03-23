# AssetEditorCapabilities

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorCapabilities implements Packet, ToClientPacket

Server-to-client packet (ID 304). Sends the set of asset editor capabilities (permissions) to the client.

## Fields

- boolean canEditAssets
- boolean canCreateAssetPacks
- boolean canEditAssetPacks
- boolean canDeleteAssetPacks

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 5

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorCapabilities deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorCapabilities` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorCapabilities` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorCapabilities` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
