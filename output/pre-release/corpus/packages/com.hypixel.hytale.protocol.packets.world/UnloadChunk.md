# UnloadChunk

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class UnloadChunk implements Packet, ToClientPacket

Packet instructing the client to unload a chunk section.

## Protocol Constants

- PACKET_ID | 130
- IS_COMPRESSED | false
- NetworkChannel | Chunks

## Methods

- @Nonnull public static UnloadChunk deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
