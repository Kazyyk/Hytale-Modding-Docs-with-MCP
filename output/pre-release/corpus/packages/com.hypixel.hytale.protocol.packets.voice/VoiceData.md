# VoiceData

Type: class | Package: com.hypixel.hytale.protocol.packets.voice | Extends: java.lang.Object | Implements: Packet, ToServerPacket

public class VoiceData implements Packet, ToServerPacket

Client-to-server packet containing the player's encoded voice data. Transmitted on the `Voice` network channel and subsequently relayed to nearby players via RelayedVoiceData.

## Protocol Constants

- PACKET_ID | 450
- IS_COMPRESSED | false
- MAX_SIZE | 523

## Fields

- sequenceNumber | short | Packet sequence number for ordering
- timestamp | int | Timestamp of the voice sample
- opusData | byte[] | Opus-encoded audio data (max 512 bytes)

## Methods


@Override
public int getId()

Returns the packet ID (`450`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Voice`.


@Nonnull
public static VoiceData deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `VoiceData` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface
- RelayedVoiceData -- server relays this to other clients
- VoiceConfig -- voice configuration from server
