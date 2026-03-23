# CancelCraftingAction

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Extends: WindowAction

public class CancelCraftingAction extends WindowAction

Window action to cancel an in-progress crafting operation. Contains no fields.

Also in this package: ChangeBlockAction, ClientOpenWindow, CloseWindow, CraftItemAction, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public static CancelCraftingAction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public CancelCraftingAction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
