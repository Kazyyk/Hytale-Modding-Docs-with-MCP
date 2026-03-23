# ReticleEvent

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class ReticleEvent implements Packet, ToClientPacket

Sent to the client to trigger a reticle animation or event by index.

## Protocol Constants

- PACKET_ID | 113
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`113`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static ReticleEvent deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ReticleEvent` from the given buffer at the specified offset.


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


public ReticleEvent clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
