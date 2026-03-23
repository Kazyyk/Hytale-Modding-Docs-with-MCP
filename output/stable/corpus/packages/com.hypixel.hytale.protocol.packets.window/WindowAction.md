# WindowAction

Type: class | Package: com.hypixel.hytale.protocol.packets.window

public class WindowAction

Abstract base class for all window actions. Defines `serialize()` and `computeSize()` contracts. Subclasses represent specific inventory operations.

Known subclasses: CancelCraftingAction, ChangeBlockAction, CraftItemAction, CraftRecipeAction, SelectSlotAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction

Also in this package: CancelCraftingAction, ChangeBlockAction, ClientOpenWindow, CloseWindow, CraftItemAction, CraftRecipeAction, OpenWindow, SelectSlotAction, SendWindowAction, SetActiveAction, SortItemsAction, TierUpgradeAction, UpdateCategoryAction, UpdateWindow, WindowType

Complete API:
  public static WindowAction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int getTypeId()
  public abstract int serialize(ByteBuf var1)
  public abstract int computeSize()
  public int serializeWithTypeId(ByteBuf buf)
  public int computeSizeWithTypeId()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)

Fields:
public static final int MAX_SIZE
