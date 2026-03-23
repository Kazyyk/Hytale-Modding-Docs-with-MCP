# UpdateMovementSettings

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class UpdateMovementSettings implements Packet, ToClientPacket

Sent to the client to apply a new set of movement physics parameters.

## Protocol Constants

- PACKET_ID | 110
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`110`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static UpdateMovementSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UpdateMovementSettings` from the given buffer at the specified offset.


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


public UpdateMovementSettings clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
