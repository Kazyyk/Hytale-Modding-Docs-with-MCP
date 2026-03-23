# SetChunkTintmap

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SetChunkTintmap implements Packet, ToClientPacket

Packet delivering the tintmap for a chunk column. Compressed on the wire.

## Protocol Constants

- PACKET_ID | 133
- IS_COMPRESSED | true
- NetworkChannel | Chunks

## Fields

- public int x
- public int z
- @Nullable public byte[] tintmap

## Methods

- @Nonnull public static SetChunkTintmap deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
