# ChangeBlockAction

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Extends: WindowAction

public class ChangeBlockAction extends WindowAction

Window action to change the block associated with a window. Contains a single byte field.

Also in this package: CancelCraftingAction, ClientOpenWindow, CloseWindow, CraftItemAction, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public static ChangeBlockAction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChangeBlockAction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean down
