# SyncPlayerPreferences

Type: class | Package: com.hypixel.hytale.protocol.packets.player | Extends: java.lang.Object | Implements: Packet, ToServerPacket

public class SyncPlayerPreferences implements Packet, ToServerPacket

Sent by the client to synchronize player preferences including item pickup locations, NPC detection, hit response, and armor visibility.

## Protocol Constants

- PACKET_ID | 116
- IS_COMPRESSED | false

## Methods


@Override
public int getId()

Returns the packet ID (`116`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static SyncPlayerPreferences deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SyncPlayerPreferences` from the given buffer at the specified offset.


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


public SyncPlayerPreferences clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface
