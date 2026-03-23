# SetGameMode

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class SetGameMode implements Packet, ToClientPacket

Sent to the client to change the player's game mode (Adventure, Creative, etc.).

## Protocol Constants

- PACKET_ID | 101
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`101`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static SetGameMode deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SetGameMode` from the given buffer at the specified offset.


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


public SetGameMode clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
