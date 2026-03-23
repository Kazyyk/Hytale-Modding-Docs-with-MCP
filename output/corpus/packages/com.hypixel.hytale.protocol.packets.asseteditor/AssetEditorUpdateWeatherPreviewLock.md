# AssetEditorUpdateWeatherPreviewLock

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorUpdateWeatherPreviewLock implements Packet, ToServerPacket

Client-to-server packet (ID 354). Sent by the client to lock or unlock the weather preview.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 1

Binary layout: 1 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUpdateWeatherPreviewLock deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUpdateWeatherPreviewLock` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUpdateWeatherPreviewLock` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUpdateWeatherPreviewLock` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
