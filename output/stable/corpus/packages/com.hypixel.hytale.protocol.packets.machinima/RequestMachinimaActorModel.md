# RequestMachinimaActorModel

Type: class | Package: com.hypixel.hytale.protocol.packets.machinima | Implements: Packet, ToServerPacket

public class RequestMachinimaActorModel implements Packet, ToServerPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public String modelId
- public String sceneName
- public String actorName

## Methods

- @Override public int getId()
- @Override public NetworkChannel getChannel()
- @Nonnull public static RequestMachinimaActorModel deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- @Override public void serialize(@Nonnull ByteBuf buf)
- @Override public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public RequestMachinimaActorModel clone()
- @Override public boolean equals(Object obj)
- @Override public int hashCode()
