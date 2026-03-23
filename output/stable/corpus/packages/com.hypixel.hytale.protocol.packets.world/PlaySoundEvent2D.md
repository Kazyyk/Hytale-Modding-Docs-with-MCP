# PlaySoundEvent2D

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class PlaySoundEvent2D implements Packet, ToClientPacket

Packet that triggers a 2D (non-positional) sound event on the client, such as UI sounds or music stings.

## Protocol Constants

- PACKET_ID | 154
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public int soundEventIndex
- @Nonnull public SoundCategory category
- public float volumeModifier
- public float pitchModifier

## Methods

- @Nonnull public static PlaySoundEvent2D deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
