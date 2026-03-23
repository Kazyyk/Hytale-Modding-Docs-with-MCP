# SetFluids

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class SetFluids implements Packet, ToClientPacket

Packet delivering compressed fluid data for a chunk section. Compressed on the wire.

## Protocol Constants

- PACKET_ID | 136
- IS_COMPRESSED | true
- NetworkChannel | Chunks

## Fields

- public int x
- public int y
- public int z
- @Nullable public byte[] data

## Methods

- @Nonnull public static SetFluids deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
