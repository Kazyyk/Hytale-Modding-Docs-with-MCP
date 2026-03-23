# UpdateSleepState

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class UpdateSleepState implements Packet, ToClientPacket

Packet updating the sleep state including clock and multiplayer info.

## Protocol Constants

- PACKET_ID | 161
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static UpdateSleepState deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
