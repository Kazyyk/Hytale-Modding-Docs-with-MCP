# UpdateServerAccess

Type: class | Package: com.hypixel.hytale.protocol.packets.serveraccess | Implements: Packet, ToServerPacket

public class UpdateServerAccess implements Packet, ToServerPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- @Nonnull public Access access
- @Nullable public HostAddress[] hosts

## Constructors

- public UpdateServerAccess()
- public UpdateServerAccess(@Nonnull Access access, @Nullable HostAddress[] hosts)
- public UpdateServerAccess(@Nonnull UpdateServerAccess other)

## Methods

- @Override public int getId()
- @Override public NetworkChannel getChannel()
- @Nonnull public static UpdateServerAccess deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public UpdateServerAccess clone()
- @Override public boolean equals(Object obj)
- @Override public int hashCode()

Also in this package: Access, RequestServerAccess, SetServerAccess

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static UpdateServerAccess deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateServerAccess clone()
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
public Access access
public HostAddress[] hosts
