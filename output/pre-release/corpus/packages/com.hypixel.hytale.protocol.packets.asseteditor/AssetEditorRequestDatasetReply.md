# AssetEditorRequestDatasetReply

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorRequestDatasetReply implements Packet, ToClientPacket

Server-to-client packet (ID 334). Server reply containing the requested dataset.

## Fields

- String name
- String`[] ids

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorRequestDatasetReply deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorRequestDatasetReply` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorRequestDatasetReply` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorRequestDatasetReply` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AssetEditorRequestDataset
