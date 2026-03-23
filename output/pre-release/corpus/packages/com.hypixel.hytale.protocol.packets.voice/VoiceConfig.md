# VoiceConfig

Type: class | Package: com.hypixel.hytale.protocol.packets.voice | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class VoiceConfig implements Packet, ToClientPacket

Server-to-client packet that configures the client's voice chat parameters, including codec, sample rate, spatial audio distances, and rate limits.

## Protocol Constants

- PACKET_ID | 452
- IS_COMPRESSED | false
- MAX_SIZE | 17

## Fields

- voiceEnabled | boolean | Whether voice chat is enabled on this server
- codec | VoiceCodec | Audio codec to use (default `Opus`)
- sampleRate | int | Audio sample rate in Hz
- channels | byte | Number of audio channels
- maxHearingDistance | float | Maximum distance at which voice can be heard
- referenceDistance | float | Distance at which audio is at full volume
- supportsVoiceStream | boolean | Whether the server supports voice streaming
- maxPacketsPerSecond | byte | Rate limit for voice packets

## Methods


@Override
public int getId()

Returns the packet ID (`452`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static VoiceConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `VoiceConfig` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- VoiceCodec -- codec enum
- VoiceData -- client voice data packet
- RelayedVoiceData -- relayed voice data packet
