# SetMovementStates

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class SetMovementStates implements Packet, ToClientPacket

Sent to the client to apply server-authoritative movement state flags.

## Protocol Constants

- PACKET_ID | 102
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`102`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static SetMovementStates deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SetMovementStates` from the given buffer at the specified offset.


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


public SetMovementStates clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
