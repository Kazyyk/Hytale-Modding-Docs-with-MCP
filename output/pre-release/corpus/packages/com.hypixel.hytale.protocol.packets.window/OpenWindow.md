# OpenWindow

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Implements: Packet, ToClientPacket

public class OpenWindow implements Packet, ToClientPacket

Server-to-client packet (ID 142) opening a window, specifying type, title, slot count, and window data.

Also in this package: CancelCraftingAction, ChangeBlockAction, ClientOpenWindow, CloseWindow, CraftItemAction, CraftRecipeAction, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public int getId()
  public NetworkChannel getChannel()
  public static OpenWindow deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public OpenWindow clone()
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
public WindowType windowType
public String windowData
public InventorySection inventory
public ExtraResources extraResources
