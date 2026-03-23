# SetPaused

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToServerPacket

public class SetPaused implements Packet, ToServerPacket

Packet sent from the client to the server requesting to pause or unpause the game.

## Protocol Constants

- PACKET_ID | 158
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public boolean paused

## Methods

- @Nonnull public static SetPaused deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
