# CraftItemAction

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Extends: WindowAction

public class CraftItemAction extends WindowAction

Window action to craft an item by specifying source slot, destination slot, and quantity.

Also in this package: CancelCraftingAction, ChangeBlockAction, ClientOpenWindow, CloseWindow, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public static CraftItemAction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public CraftItemAction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
