# InventoryAction

Type: class | Package: com.hypixel.hytale.protocol.packets.inventory | Extends: null | Implements: Packet, ToServerPacket

public class InventoryAction implements Packet, ToServerPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public int inventorySectionId
- public InventoryActionType inventoryActionType
- public byte actionData
- InventoryAction obj
- InventoryAction copy

## Constructors

- public InventoryAction()
- public InventoryAction(int inventorySectionId, @Nonnull InventoryActionType inventoryActionType, byte actionData)
- public InventoryAction(@Nonnull InventoryAction other)

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public static InventoryAction deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public InventoryAction clone()
- public boolean equals(Object obj)
- public int hashCode()
