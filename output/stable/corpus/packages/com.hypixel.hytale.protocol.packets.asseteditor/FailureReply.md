# FailureReply

Type: class | Package: com.hypixel.hytale.protocol.packets.asseteditor | Implements: Packet, ToServerPacket, ToClientPacket

public class FailureReply implements Packet, ToServerPacket, ToClientPacket

Bidirectional packet (ID 300). Server reply indicating that an asset editor operation failed, with a reason message.

## Fields

- FormattedMessage message

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 5
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FailureReply deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FailureReply` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FailureReply` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FailureReply` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
