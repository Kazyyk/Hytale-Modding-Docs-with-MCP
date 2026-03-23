# AssetEditorUpdateAsset

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorUpdateAsset implements Packet, ToServerPacket

Client-to-server packet (ID 324). Sent by the client to update an existing binary asset.

## Fields

- String assetType
- AssetPath path
- int assetIndex
- byte`[] data

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 53,248,050

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUpdateAsset deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUpdateAsset` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUpdateAsset` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUpdateAsset` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
