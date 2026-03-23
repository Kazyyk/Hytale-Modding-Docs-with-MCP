# Connect

Type: class | Package: com.hypixel.hytale.protocol.packets.connection | Implements: Packet, ToServerPacket

public class Connect implements Packet, ToServerPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public int protocolCrc
- public int protocolBuildNumber
- public String clientVersion
- public ClientType clientType
- public UUID uuid
- public String username
- public String identityToken
- public String language
- public byte[] referralData
- public HostAddress referralSource

## Methods

- @Override public int getId()
- @Override public NetworkChannel getChannel()
- @Nonnull public static Connect deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public Connect clone()
- @Override public boolean equals(Object obj)
- @Override public int hashCode()
