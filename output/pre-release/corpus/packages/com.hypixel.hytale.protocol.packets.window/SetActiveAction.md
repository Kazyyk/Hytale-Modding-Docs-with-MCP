# SetActiveAction

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Extends: WindowAction

public class SetActiveAction extends WindowAction

Window action setting the active hotbar slot. Contains a single byte slot index.

Also in this package: CancelCraftingAction, ChangeBlockAction, ClientOpenWindow, CloseWindow, CraftItemAction, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public static SetActiveAction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SetActiveAction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean state
