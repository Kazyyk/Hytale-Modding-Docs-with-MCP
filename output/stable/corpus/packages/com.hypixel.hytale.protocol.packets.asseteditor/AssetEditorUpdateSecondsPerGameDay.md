# AssetEditorUpdateSecondsPerGameDay

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToClientPacket

public class AssetEditorUpdateSecondsPerGameDay implements Packet, ToClientPacket

Server-to-client packet (ID 353). Sent by the client to update the seconds-per-game-day preview setting.

## Fields

- int nighttimeDurationSeconds

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AssetEditorUpdateSecondsPerGameDay deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AssetEditorUpdateSecondsPerGameDay` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AssetEditorUpdateSecondsPerGameDay` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AssetEditorUpdateSecondsPerGameDay` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
