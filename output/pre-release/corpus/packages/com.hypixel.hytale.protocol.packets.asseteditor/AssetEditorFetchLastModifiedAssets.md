# AssetEditorFetchLastModifiedAssets

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorFetchLastModifiedAssets implements Packet, ToServerPacket

Client-to-server packet (ID 338). Requests the list of most recently modified assets.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 0

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorFetchLastModifiedAssets deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorFetchLastModifiedAssets` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorFetchLastModifiedAssets` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorFetchLastModifiedAssets` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
