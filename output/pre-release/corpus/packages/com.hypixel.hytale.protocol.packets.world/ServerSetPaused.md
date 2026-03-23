# ServerSetPaused

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class ServerSetPaused implements Packet, ToClientPacket

Packet sent to clients to indicate the server has paused or unpaused the game.

## Protocol Constants

- PACKET_ID | 159
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public boolean paused

## Methods

- @Nonnull public static ServerSetPaused deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
