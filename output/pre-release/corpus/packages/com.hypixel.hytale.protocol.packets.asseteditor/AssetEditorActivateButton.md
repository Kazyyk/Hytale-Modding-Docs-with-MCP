# AssetEditorActivateButton

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorActivateButton implements Packet, ToServerPacket

Client-to-server packet (ID 335). Sent by the client to activate a UI button in the asset editor.

## Fields

- String buttonId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 16,384,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorActivateButton deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorActivateButton` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorActivateButton` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorActivateButton` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
