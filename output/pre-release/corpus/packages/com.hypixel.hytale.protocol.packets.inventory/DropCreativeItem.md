# DropCreativeItem

Type: class | Package: com.hypixel.hytale.protocol.packets.inventory | Extends: null | Implements: Packet, ToServerPacket

public class DropCreativeItem implements Packet, ToServerPacket

## Fields

- public static final int PACKET_ID
- public static final boolean IS_COMPRESSED
- public static final int NULLABLE_BIT_FIELD_SIZE
- public static final int FIXED_BLOCK_SIZE
- public static final int VARIABLE_FIELD_COUNT
- public static final int VARIABLE_BLOCK_START
- public static final int MAX_SIZE
- public ItemQuantity item
- DropCreativeItem obj
- int pos
- int size
- ValidationResult itemResult
- DropCreativeItem copy

## Constructors

- public DropCreativeItem()
- public DropCreativeItem(@Nonnull ItemQuantity item)
- public DropCreativeItem(@Nonnull DropCreativeItem other)

## Methods

- public int getId()
- public NetworkChannel getChannel()
- public static DropCreativeItem deserialize(@Nonnull ByteBuf buf, int offset)
- public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
- public void serialize(@Nonnull ByteBuf buf)
- public int computeSize()
- public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
- public DropCreativeItem clone()
- public boolean equals(Object obj)
- public int hashCode()

Also in this package: DropItemStack, InventoryAction, MoveItemStack, SetActiveSlot, SetCreativeItem, SmartGiveCreativeItem, SmartMoveItemStack, SwitchHotbarBlockSet, UpdatePlayerInventory

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static DropCreativeItem deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public DropCreativeItem clone()
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
