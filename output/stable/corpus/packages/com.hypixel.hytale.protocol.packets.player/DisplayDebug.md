# DisplayDebug

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class DisplayDebug implements Packet, ToClientPacket

Sent to the client to render a debug visualization shape (sphere, box, frustum, etc.) with configurable color, opacity, and lifetime.

## Protocol Constants

- PACKET_ID | 114
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`114`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static DisplayDebug deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `DisplayDebug` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the number of bytes consumed by this packet in the buffer.


@Override
public void serialize(@Nonnull ByteBuf buf)

Serializes this packet into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.


public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)

Validates buffer structure without full deserialization.


public DisplayDebug clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
