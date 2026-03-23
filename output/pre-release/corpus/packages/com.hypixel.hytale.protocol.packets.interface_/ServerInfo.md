# ServerInfo

Type: class | Package: com.hypixel.hytale.protocol.packets.interface_ | Extends: java.lang.Object | Implements: Packet, ToClientPacket

public class ServerInfo implements Packet, ToClientPacket

Server-to-client packet that delivers basic server metadata to the connected client: the server name, message of the day, maximum player count, and an optional fallback server address.

## Protocol Constants

- PACKET_ID | 223
- IS_COMPRESSED | false

## Fields

- serverName | String | yes | Display name of the server
- motd | String | yes | Message of the day
- maxPlayers | int | no | Maximum player capacity
- fallbackServer | HostAddress | yes | Address of a fallback server for redirection

## Methods


@Override
public int getId()

Returns the packet ID (`223`).


@Override
public NetworkChannel getChannel()

Returns `NetworkChannel.Default`.


@Nonnull
public static ServerInfo deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ServerInfo` from the given buffer at the specified offset.


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


public ServerInfo clone()

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
- `HostAddress` -- host/port address pair
