# ChangeVelocity

Type: class | Package: com.hypixel.hytale.protocol.packets.entities | Implements: Packet, ToClientPacket

public class ChangeVelocity implements Packet, ToClientPacket

## Constants

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public float x
- public float y
- public float z
- public ChangeVelocityType changeType
- public VelocityConfig config

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public ChangeVelocity()
- public ChangeVelocity(float x, float y, float z, @Nonnull ChangeVelocityType changeType, @Nullable VelocityConfig config)
- public ChangeVelocity(@Nonnull ChangeVelocity other)
- public static ChangeVelocity deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public ChangeVelocity clone()
- public boolean equals(Object obj)
- public int hashCode()

Also in this package: ApplyKnockback, EntityUpdates, MountMovement, PlayAnimation, PlayEmote, SetEntitySeed, SpawnModelParticles

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static ChangeVelocity deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChangeVelocity clone()
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
public float x
public float y
public float z
public ChangeVelocityType changeType
public VelocityConfig config
