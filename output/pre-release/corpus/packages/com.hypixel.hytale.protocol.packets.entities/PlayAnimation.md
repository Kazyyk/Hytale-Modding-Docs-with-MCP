# PlayAnimation

Type: class | Package: com.hypixel.hytale.protocol.packets.entities | Implements: Packet, ToClientPacket

public class PlayAnimation implements Packet, ToClientPacket

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
- public int entityId
- public String itemAnimationsId
- public String animationId
- public AnimationSlot slot

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public PlayAnimation()
- public PlayAnimation(int entityId, @Nullable String itemAnimationsId, @Nullable String animationId, @Nonnull AnimationSlot slot)
- public PlayAnimation(@Nonnull PlayAnimation other)
- public static PlayAnimation deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public PlayAnimation clone()
- public boolean equals(Object obj)
- public int hashCode()

Also in this package: ApplyKnockback, ChangeVelocity, EntityUpdates, MountMovement, PlayEmote, SetEntitySeed, SpawnModelParticles

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static PlayAnimation deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PlayAnimation clone()
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
public int entityId
public String itemAnimationsId
public String animationId
public AnimationSlot slot
