# AssetEditorAuthorization

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorAuthorization implements Packet, ToClientPacket

Server-to-client packet (ID 303). Informs the client whether it is authorized to use the asset editor.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 1

Binary layout: 1 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorAuthorization deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorAuthorization` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorAuthorization` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorAuthorization` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
