# ServerSetFluids

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class ServerSetFluids implements Packet, ToClientPacket

Packet that sets multiple fluids relative to an origin position.

## Protocol Constants

- PACKET_ID | 143
- IS_COMPRESSED | false
- NetworkChannel | Chunks

## Fields

- public int x
- public int y
- public int z
- @Nonnull public SetFluidCmd[] cmds

## Methods

- @Nonnull public static ServerSetFluids deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
