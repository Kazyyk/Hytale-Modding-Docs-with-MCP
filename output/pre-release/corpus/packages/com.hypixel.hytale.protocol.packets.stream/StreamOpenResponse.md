# StreamOpenResponse

Type: class | Package: com.hypixel.hytale.protocol.packets.stream | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class StreamOpenResponse implements Packet, ToClientPacket

Server-to-client packet sent in response to a StreamOpen request. Indicates whether the stream was accepted and, if rejected, provides a reason string.

## Protocol Constants

- PACKET_ID | 461
- IS_COMPRESSED | false

## Fields

- type | StreamType | no | The stream type that was requested
- accepted | boolean | no | Whether the stream open request was accepted
- rejectionReason | String | yes | Human-readable reason the request was rejected

## Methods


@Override
public int getId()

Returns the packet ID (`461`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static StreamOpenResponse deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `StreamOpenResponse` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- StreamType -- stream type enum
- StreamOpen -- the client request this responds to

Also in this package: StreamOpen, StreamType

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static StreamOpenResponse deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public StreamOpenResponse clone()
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
public StreamType type
public boolean accepted
public String rejectionReason
