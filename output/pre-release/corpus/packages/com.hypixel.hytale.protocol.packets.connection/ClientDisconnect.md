# ClientDisconnect

Type: class | Package: com.hypixel.hytale.protocol.packets.connection | Extends: java.lang.Object | Implements: Packet, ToServerPacket

public class ClientDisconnect implements Packet, ToServerPacket

Packet sent when a client disconnects.

Also in this package: ClientDisconnectReason, ClientType, Connect, DisconnectType, Ping, Pong, PongType, QuicApplicationErrorCode, ServerDisconnect

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ClientDisconnect deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ClientDisconnect clone()
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
public ClientDisconnectReason reason
public DisconnectType type
