# CraftingWindow

Type: class | Package: com.hypixel.hytale.builtin.crafting.window | Extends: BenchWindow

public abstract class CraftingWindow extends BenchWindow

Abstract base for crafting bench windows. Populates category and recipe data, handles open/close sounds, and provides a static helper for simple item crafting.

Known subclasses: DiagramCraftingWindow, SimpleCraftingWindow, StructuralCraftingWindow

Also in this package: BenchWindow, DiagramCraftingWindow, FieldCraftingWindow, ProcessingBenchWindow, SimpleCraftingWindow, StructuralCraftingWindow

Complete API:
  protected boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public static boolean craftSimpleItem(Store<EntityStore> store, Ref<EntityStore> ref, CraftingManager craftingManager, CraftRecipeAction action)

Fields:
protected static final String CRAFT_COMPLETED
protected static final String CRAFT_COMPLETED_INSTANT
