# PlaySoundEvent3D

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Implements: Packet, ToClientPacket

public class PlaySoundEvent3D implements Packet, ToClientPacket

Packet that triggers a 3D positional sound event on the client at a specific world location.

## Protocol Constants

- PACKET_ID | 155
- IS_COMPRESSED | false
- NetworkChannel | Default

## Fields

- public int soundEventIndex
- @Nonnull public SoundCategory category
- @Nullable public Position position
- public float volumeModifier
- public float pitchModifier

## Methods

- @Nonnull public static PlaySoundEvent3D deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
