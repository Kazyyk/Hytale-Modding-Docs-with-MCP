# SetActiveSlot

Type: class | Package: com.hypixel.hytale.protocol.packets.inventory | Extends: null | Implements: Packet, ToServerPacket, ToClientPacket

public class SetActiveSlot implements Packet, ToServerPacket, ToClientPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public int inventorySectionId
- public int activeSlot
- SetActiveSlot obj
- SetActiveSlot copy

## Constructors

- public SetActiveSlot()
- public SetActiveSlot(int inventorySectionId, int activeSlot)
- public SetActiveSlot(@Nonnull SetActiveSlot other)

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public static SetActiveSlot deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public SetActiveSlot clone()
- public boolean equals(Object obj)
- public int hashCode()

Also in this package: DropCreativeItem, DropItemStack, InventoryAction, MoveItemStack, SetCreativeItem, SmartGiveCreativeItem, SmartMoveItemStack, SwitchHotbarBlockSet, UpdatePlayerInventory

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static SetActiveSlot deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SetActiveSlot clone()
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
public int inventorySectionId
public int activeSlot
