# AssetEditorUndoChanges

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorUndoChanges implements Packet, ToServerPacket

Client-to-server packet (ID 349). Sent by the client to undo recent changes.

## Fields

- AssetPath path

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 32,768,024

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUndoChanges deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUndoChanges` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUndoChanges` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUndoChanges` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
