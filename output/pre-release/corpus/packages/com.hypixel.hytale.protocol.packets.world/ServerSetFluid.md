# ServerSetFluid

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class ServerSetFluid implements Packet, ToClientPacket

Packet that sets a single fluid at the given world coordinates.

## Protocol Constants

- PACKET_ID | 142
- IS_COMPRESSED | false
- NetworkChannel | Chunks

## Fields

- public int x
- public int y
- public int z
- public int fluidId
- public byte fluidLevel

## Methods

- @Nonnull public static ServerSetFluid deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
