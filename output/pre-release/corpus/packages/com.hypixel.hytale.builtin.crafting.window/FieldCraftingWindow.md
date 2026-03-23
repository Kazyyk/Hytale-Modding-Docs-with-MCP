# FieldCraftingWindow

Type: class | Package: com.hypixel.hytale.builtin.crafting.window | Extends: Window

public class FieldCraftingWindow extends Window

Crafting window for field (pocket) crafting. Displays fieldcraft categories and handles simple recipe actions without a physical bench.

Also in this package: BenchWindow, CraftingWindow, DiagramCraftingWindow, ProcessingBenchWindow, SimpleCraftingWindow, StructuralCraftingWindow

Complete API:
  public JsonObject getData()
  public boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void handleAction(Ref<EntityStore> ref, Store<EntityStore> store, WindowAction action)

Fields:
private final JsonObject windowData
