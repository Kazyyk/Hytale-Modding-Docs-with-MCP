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

Also in this package: RelayedVoiceData, VoiceCodec, VoiceConfig

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static VoiceData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public VoiceData clone()
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
public short sequenceNumber
public int timestamp
public byte[] opusData
