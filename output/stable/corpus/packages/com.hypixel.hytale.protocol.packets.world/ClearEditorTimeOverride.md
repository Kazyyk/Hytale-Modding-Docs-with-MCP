# ClearEditorTimeOverride

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class ClearEditorTimeOverride implements Packet, ToClientPacket

Packet sent to clients to clear the editor time override, restoring normal day/night cycle.

## Protocol Constants

- PACKET_ID | 148
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static ClearEditorTimeOverride deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
