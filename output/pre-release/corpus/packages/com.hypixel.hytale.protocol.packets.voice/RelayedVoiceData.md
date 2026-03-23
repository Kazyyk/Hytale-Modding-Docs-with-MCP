# RelayedVoiceData

Type: class | Package: com.hypixel.hytale.protocol.packets.voice | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class RelayedVoiceData implements Packet, ToClientPacket

Server-to-client packet that relays voice data from one player to nearby listeners. Contains the speaker identity, position, sequence metadata, and Opus-encoded audio data. Transmitted on the `Voice` network channel.

## Protocol Constants

- PACKET_ID | 451
- IS_COMPRESSED | false
- MAX_SIZE | 569

## Fields

- speakerId | java.util.UUID | UUID of the speaking player
- entityId | int | Entity ID of the speaker
- sequenceNumber | short | Packet sequence number for ordering
- timestamp | int | Timestamp of the voice sample
- speakerPosition | Position | Nullable 3D position of the speaker for spatial audio
- speakerIsUnderwater | boolean | Whether the speaker is underwater (affects audio filtering)
- opusData | byte[] | Opus-encoded audio data (max 512 bytes)

## Methods


@Override
public int getId()

Returns the packet ID (`451`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Voice`.


@Nonnull
public static RelayedVoiceData deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RelayedVoiceData` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- VoiceData -- client-to-server voice data packet
- VoiceConfig -- voice configuration packet

Also in this package: VoiceCodec, VoiceConfig, VoiceData

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static RelayedVoiceData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public RelayedVoiceData clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public UUID speakerId
public int entityId
public short sequenceNumber
public int timestamp
public Position speakerPosition
public boolean speakerIsUnderwater
public byte[] opusData
