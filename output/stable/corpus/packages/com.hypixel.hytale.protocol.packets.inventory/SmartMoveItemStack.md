# SmartMoveItemStack

Type: class | Package: com.hypixel.hytale.protocol.packets.inventory | Extends: null | Implements: Packet, ToServerPacket, ToClientPacket

public class SmartMoveItemStack implements Packet, ToServerPacket, ToClientPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public int fromSectionId
- public int fromSlotId
- public int quantity
- public SmartMoveType moveType
- SmartMoveItemStack obj
- SmartMoveItemStack copy

## Constructors

- public SmartMoveItemStack()
- public SmartMoveItemStack(int fromSectionId, int fromSlotId, int quantity, @Nonnull SmartMoveType moveType)
- public SmartMoveItemStack(@Nonnull SmartMoveItemStack other)

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public static SmartMoveItemStack deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public SmartMoveItemStack clone()
- public boolean equals(Object obj)
- public int hashCode()

## Related Types

- MoveItemStack
