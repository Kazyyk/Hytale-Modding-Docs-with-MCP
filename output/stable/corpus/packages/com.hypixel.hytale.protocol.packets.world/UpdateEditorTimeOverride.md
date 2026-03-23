# UpdateEditorTimeOverride

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class UpdateEditorTimeOverride implements Packet, ToClientPacket

Packet setting or updating the editor time override.

## Protocol Constants

- PACKET_ID | 147
- IS_COMPRESSED | false
- NetworkChannel | Default

## Methods

- @Nonnull public static UpdateEditorTimeOverride deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
