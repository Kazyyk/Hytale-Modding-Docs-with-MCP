# AssetEditorRenameDirectory

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket

public class AssetEditorRenameDirectory implements Packet, ToServerPacket

Client-to-server packet (ID 309). Sent by the client to rename a directory in the asset tree.

## Fields

- AssetPath path
- AssetPath newPath

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 65,536,051

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorRenameDirectory deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorRenameDirectory` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorRenameDirectory` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorRenameDirectory` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetPath
