# ConnectAccept

Type: class | Package: com.hypixel.hytale.protocol.packets.auth | Implements: Packet, ToClientPacket

public class ConnectAccept implements Packet, ToClientPacket

Server-to-client packet (ID 14) indicating the connection was accepted. Optionally carries a password challenge byte array.

Also in this package: AuthGrant, AuthToken, ClientReferral, PasswordAccepted, PasswordRejected, PasswordResponse, ServerAuthToken, Status

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ConnectAccept deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ConnectAccept clone()
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
public byte[] passwordChallenge
