# UpdatePostFxSettings

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class UpdatePostFxSettings implements Packet, ToClientPacket

Packet updating post-processing effects settings.

## Protocol Constants

- PACKET_ID | 151
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static UpdatePostFxSettings deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
