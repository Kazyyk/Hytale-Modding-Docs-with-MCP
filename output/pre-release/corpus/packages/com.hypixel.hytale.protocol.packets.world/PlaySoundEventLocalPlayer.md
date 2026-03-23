# PlaySoundEventLocalPlayer

Type: class | Package: com.hypixel.hytale.protocol.packets.world | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class PlaySoundEventLocalPlayer implements Packet, ToClientPacket

Server-to-client packet that instructs the client to play a sound event locally for the player. References sound events by both a local and world index, with configurable volume and pitch modifiers.

## Protocol Constants

- PACKET_ID | 362
- IS_COMPRESSED | false
- MAX_SIZE | 17

## Fields

- localSoundEventIndex | int | Index into the local sound event registry
- worldSoundEventIndex | int | Index into the world sound event registry
- category | SoundCategory | Sound category (default `Music`)
- volumeModifier | float | Volume multiplier
- pitchModifier | float | Pitch multiplier

## Methods


@Override
public int getId()

Returns the packet ID (`362`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static PlaySoundEventLocalPlayer deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `PlaySoundEventLocalPlayer` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- `SoundCategory` -- categorization for sound mixing
