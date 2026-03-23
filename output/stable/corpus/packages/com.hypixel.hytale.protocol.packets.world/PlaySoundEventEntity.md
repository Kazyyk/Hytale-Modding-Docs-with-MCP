# PlaySoundEventEntity

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class PlaySoundEventEntity implements Packet, ToClientPacket

Packet that triggers a sound event attached to a specific entity, tracking its position.

## Protocol Constants

- PACKET_ID | 156
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public int soundEventIndex
- public int networkId
- public float volumeModifier
- public float pitchModifier

## Methods

- @Nonnull public static PlaySoundEventEntity deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
