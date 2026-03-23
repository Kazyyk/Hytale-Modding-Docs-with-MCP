# SmartGiveCreativeItem

Type: class | Package: com.hypixel.hytale.protocol.packets.inventory | Extends: null | Implements: Packet, ToServerPacket

public class SmartGiveCreativeItem implements Packet, ToServerPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public ItemQuantity item
- public SmartMoveType moveType
- SmartGiveCreativeItem obj
- int pos
- int size
- ValidationResult itemResult
- SmartGiveCreativeItem copy

## Constructors

- public SmartGiveCreativeItem()
- public SmartGiveCreativeItem(@Nonnull ItemQuantity item, @Nonnull SmartMoveType moveType)
- public SmartGiveCreativeItem(@Nonnull SmartGiveCreativeItem other)

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public static SmartGiveCreativeItem deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public SmartGiveCreativeItem clone()
- public boolean equals(Object obj)
- public int hashCode()

Also in this package: DropCreativeItem, DropItemStack, InventoryAction, MoveItemStack, SetActiveSlot, SetCreativeItem, SmartMoveItemStack, SwitchHotbarBlockSet, UpdatePlayerInventory

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static SmartGiveCreativeItem deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SmartGiveCreativeItem clone()
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
public ItemQuantity item
public SmartMoveType moveType
