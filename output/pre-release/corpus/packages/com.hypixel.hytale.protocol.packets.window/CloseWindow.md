# CloseWindow

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Implements: Packet, ToClientPacket, ToServerPacket

public class CloseWindow implements Packet, ToClientPacket, ToServerPacket

Bidirectional packet (ID 144) signaling a window close. Contains no fields.

Also in this package: CancelCraftingAction, ChangeBlockAction, ClientOpenWindow, CraftItemAction, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static CloseWindow deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public CloseWindow clone()
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
public int id
