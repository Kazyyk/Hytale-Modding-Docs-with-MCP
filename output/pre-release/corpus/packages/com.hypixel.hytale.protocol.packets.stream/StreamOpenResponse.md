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
