# DiagramCraftingWindow

Type: class | Package: com.hypixel.hytale.builtin.crafting.window | Extends: CraftingWindow | Implements: ItemContainerWindow

public class DiagramCraftingWindow extends CraftingWindow implements ItemContainerWindow

Crafting window for diagram-style benches. Manages input/output item containers, slot filters, recipe matching, and category switching.

Also in this package: BenchWindow, CraftingWindow, FieldCraftingWindow, ProcessingBenchWindow, SimpleCraftingWindow, StructuralCraftingWindow

Complete API:
  protected void finalize()
  public boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void handleAction(Ref<EntityStore> ref, Store<EntityStore> store, WindowAction action)
  public ItemContainer getItemContainer()
  private CraftingBench.BenchItemCategory getBenchItemCategory(String category, String itemCategory)
  private void updateInventory(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingBench.BenchItemCategory benchItemCategory)
  private void updateInput(ItemContainer.ItemContainerChangeEvent event)
  private void updateInput(ItemContainer container, Ref<EntityStore> ref, Store<EntityStore> store)
  private boolean collectRecipes(Ref<EntityStore> ref, List<CraftingRecipe> recipes, Store<EntityStore> store)
  private JsonArray generateSlots(CombinedItemContainer combinedStorage, List<CraftingRecipe> recipes)
  public List<CraftingRecipe> getBenchRecipes()

Fields:
private static final HytaleLogger LOGGER
private String category
private String itemCategory
private CraftingBench.BenchItemCategory benchItemCategory
private SimpleItemContainer inputPrimaryContainer
private SimpleItemContainer inputSecondaryContainer
private CombinedItemContainer combinedInputItemContainer
private SimpleItemContainer outputContainer
private CombinedItemContainer combinedItemContainer
private EventRegistration<?,?> inventoryRegistration
