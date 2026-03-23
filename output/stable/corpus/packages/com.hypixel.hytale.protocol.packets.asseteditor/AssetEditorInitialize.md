# AssetEditorInitialize

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorInitialize implements Packet, ToServerPacket

Client-to-server packet (ID 302). Initializes the asset editor session.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 0

Binary layout: 0 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorInitialize deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorInitialize` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorInitialize` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorInitialize` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
