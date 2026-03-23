# UpdateCategoryAction

Type: class | Package: com.hypixel.hytale.protocol.packets.window | Extends: WindowAction

public class UpdateCategoryAction extends WindowAction

Window action to update the selected category in a window. Contains a short category index.

Also in this package: CancelCraftingAction, ChangeBlockAction, ClientOpenWindow, CloseWindow, CraftItemAction, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateWindow, WindowAction, WindowType

Complete API:
  public static UpdateCategoryAction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public UpdateCategoryAction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String category
public String itemCategory
