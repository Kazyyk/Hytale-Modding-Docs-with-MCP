# PasswordResponse

Type: class | Package: com.hypixel.hytale.protocol.packets.auth | Implements: Packet, ToServerPacket

public class PasswordResponse implements Packet, ToServerPacket

Client-to-server packet (ID 15) containing the password response byte array sent in reply to a challenge.

Also in this package: AuthGrant, AuthToken, ClientReferral, ConnectAccept, PasswordAccepted, PasswordRejected, ServerAuthToken

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static PasswordResponse deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PasswordResponse clone()
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
public byte[] hash
