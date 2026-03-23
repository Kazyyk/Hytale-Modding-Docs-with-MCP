# UpdateEnvironmentMusic

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class UpdateEnvironmentMusic implements Packet, ToClientPacket

Packet updating the environment music state.

## Protocol Constants

- PACKET_ID | 157
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static UpdateEnvironmentMusic deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
