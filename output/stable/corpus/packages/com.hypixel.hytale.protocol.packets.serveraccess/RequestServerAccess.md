# RequestServerAccess

Type: class | Package: com.hypixel.hytale.protocol.packets.serveraccess | Implements: Packet, ToClientPacket

public class RequestServerAccess implements Packet, ToClientPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- @Nonnull public Access access
- public short externalPort

## Constructors

- public RequestServerAccess()
- public RequestServerAccess(@Nonnull Access access, short externalPort)
- public RequestServerAccess(@Nonnull RequestServerAccess other)

## Methods

- @Override public int getId()
- @Override public NetworkChannel getChannel()
- @Nonnull public static RequestServerAccess deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public RequestServerAccess clone()
- @Override public boolean equals(Object obj)
- @Override public int hashCode()
