# MountMovement

Type: class | Package: com.hypixel.hytale.protocol.packets.entities | Implements: Packet, ToServerPacket

public class MountMovement implements Packet, ToServerPacket

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
- public Position absolutePosition
- public Direction bodyOrientation
- public MovementStates movementStates

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public MountMovement()
- public MountMovement(@Nullable Position absolutePosition, @Nullable Direction bodyOrientation, @Nullable MovementStates movementStates)
- public MountMovement(@Nonnull MountMovement other)
- public static MountMovement deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public MountMovement clone()
- public boolean equals(Object obj)
- public int hashCode()
