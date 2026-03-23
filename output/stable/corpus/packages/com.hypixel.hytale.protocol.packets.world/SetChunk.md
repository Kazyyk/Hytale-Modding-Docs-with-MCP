# SetChunk

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SetChunk implements Packet, ToClientPacket

Packet delivering a full chunk section to the client, including block data and light maps. Compressed on the wire.

## Protocol Constants

- PACKET_ID | 131
- IS_COMPRESSED | true
- NetworkChannel | Chunks

## Fields

- public int x
- public int y
- public int z
- @Nullable public byte[] localLight
- @Nullable public byte[] globalLight
- @Nullable public byte[] data

## Methods

- @Nonnull public static SetChunk deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
