# StreamOpen

Type: class | Package: com.hypixel.hytale.protocol.packets.stream | Extends: java.lang.Object | Implements: Packet, ToServerPacket

public class StreamOpen implements Packet, ToServerPacket

Client-to-server packet requesting the server to open a stream of a given type. The client specifies the desired StreamType (e.g., `Game` or `Voice`).

## Protocol Constants

- PACKET_ID | 460
- IS_COMPRESSED | false
- MAX_SIZE | 1

## Fields

- type | StreamType | StreamType.Game | The type of stream to open

## Methods


@Override
public int getId()

Returns the packet ID (`460`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static StreamOpen deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `StreamOpen` from the given buffer at the specified offset.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


@Override
public int computeSize()

Returns `1`.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface
- StreamType -- stream type enum
- StreamOpenResponse -- server response to this request
