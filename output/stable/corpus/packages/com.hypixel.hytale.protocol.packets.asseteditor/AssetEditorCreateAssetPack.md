# AssetEditorCreateAssetPack

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorCreateAssetPack implements Packet, ToServerPacket

Client-to-server packet (ID 316). Sent by the client to create a new asset pack.

## Fields

- AssetPackManifest manifest

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorCreateAssetPack deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorCreateAssetPack` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorCreateAssetPack` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorCreateAssetPack` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorCreateAsset
- AssetPackManifest
