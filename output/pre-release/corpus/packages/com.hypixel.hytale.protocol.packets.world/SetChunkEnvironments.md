# SetChunkEnvironments

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SetChunkEnvironments implements Packet, ToClientPacket

Packet delivering per-column environment IDs for a chunk. Compressed on the wire.

## Protocol Constants

- PACKET_ID | 134
- IS_COMPRESSED | true
- NetworkChannel | Chunks

## Fields

- public int x
- public int z
- @Nullable public byte[] environments

## Methods

- @Nonnull public static SetChunkEnvironments deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
