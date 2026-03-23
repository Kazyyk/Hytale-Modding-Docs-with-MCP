# StructuralCraftingWindow

Type: class | Package: com.hypixel.hytale.builtin.crafting.window | Extends: CraftingWindow | Implements: ItemContainerWindow

public class StructuralCraftingWindow extends CraftingWindow implements ItemContainerWindow

Crafting window for structural crafting benches. Manages input validation, recipe option display, block group cycling, and slot selection.

Also in this package: BenchWindow, CraftingWindow, DiagramCraftingWindow, FieldCraftingWindow, ProcessingBenchWindow, SimpleCraftingWindow

Complete API:
  private boolean isValidInput(FilterActionType filterActionType, ItemContainer itemContainer, short i, ItemStack itemStack)
  private static void sortRecipes(ObjectList<CraftingRecipe> matching, StructuralCraftingBench structuralBench)
  private static boolean hasHeaderCategory(StructuralCraftingBench bench, CraftingRecipe recipe)
  private static int getSortingPriority(StructuralCraftingBench bench, CraftingRecipe recipe)
  public void handleAction(Ref<EntityStore> ref, Store<EntityStore> store, WindowAction action)
  private void changeBlockType(Ref<EntityStore> ref, boolean down, Store<EntityStore> store)
  public ItemContainer getItemContainer()
  public boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  private void updateRecipes()
  private ObjectList<CraftingRecipe> getMatchingRecipes(ItemStack inputStack)

Fields:
private static final int MAX_OPTIONS
private final SimpleItemContainer inputContainer
private final SimpleItemContainer optionsContainer
private final CombinedItemContainer combinedItemContainer
private final Int2ObjectMap<String> optionSlotToRecipeMap
private int selectedSlot
private EventRegistration inventoryRegistration
