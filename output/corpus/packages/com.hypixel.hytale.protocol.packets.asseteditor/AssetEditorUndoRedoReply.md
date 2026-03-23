# AssetEditorUndoRedoReply

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorUndoRedoReply implements Packet, ToClientPacket

Server-to-client packet (ID 351). Server reply after an undo or redo operation.

## Fields

- JsonUpdateCommand command

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUndoRedoReply deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUndoRedoReply` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUndoRedoReply` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUndoRedoReply` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- JsonUpdateCommand
