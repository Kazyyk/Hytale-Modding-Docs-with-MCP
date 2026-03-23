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

Also in this package: AddToServerPlayerList, BlockChange, ChatMessage, ChatTagType, ChatType, CustomHud, CustomPage, CustomPageEvent, CustomPageEventType, CustomPageLifetime, CustomUICommand, CustomUICommandType, CustomUIEventBinding, CustomUIEventBindingType, EditorBlocksChange, EditorSelection, FluidChange, HideEventTitle, HudComponent, KillFeedMessage (and 21 more)

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ServerInfo deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ServerInfo clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int PACKET_ID
public static final boolean IS_COMPRESSED
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String serverName
public String motd
public int maxPlayers
public HostAddress fallbackServer
