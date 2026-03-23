# AssetEditorRequestChildrenListReply

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorRequestChildrenListReply implements Packet, ToClientPacket

Server-to-client packet (ID 322). Server reply containing the children list for a directory.

## Fields

- AssetPath path
- String`[] childrenIds

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorRequestChildrenListReply deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorRequestChildrenListReply` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorRequestChildrenListReply` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorRequestChildrenListReply` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorRequestChildrenList
- AssetPath
