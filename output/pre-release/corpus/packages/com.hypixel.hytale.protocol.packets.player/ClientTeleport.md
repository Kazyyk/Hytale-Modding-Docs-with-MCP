# ClientTeleport

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class ClientTeleport implements Packet, ToClientPacket

Sent to the client to teleport the player to a new position with an optional model transform and velocity reset.

## Protocol Constants

- PACKET_ID | 109
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`109`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static ClientTeleport deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ClientTeleport` from the given buffer at the specified offset.


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


public ClientTeleport clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
