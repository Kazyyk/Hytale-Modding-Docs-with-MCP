# ProcessingBenchWindow

Type: class | Package: com.hypixel.hytale.builtin.crafting.window | Extends: BenchWindow | Implements: ItemContainerWindow

public class ProcessingBenchWindow extends BenchWindow implements ItemContainerWindow

Window for processing benches (furnaces, etc). Manages fuel, processing progress, active state, input/output slot tiers, and tier upgrades.

Also in this package: BenchWindow, CraftingWindow, DiagramCraftingWindow, FieldCraftingWindow, SimpleCraftingWindow, StructuralCraftingWindow

Complete API:
  public JsonObject getData()
  public CombinedItemContainer getItemContainer()
  public void setActive(boolean active)
  public void setFuelTime(float fuelTime)
  public void setMaxFuel(int maxFuel)
  public void setProgress(float progress)
  public void setProcessingSlots(Set<Short> slots)
  public void setProcessingFuelSlots(Set<Short> slots)
  public void handleAction(Ref<EntityStore> ref, Store<EntityStore> store, WindowAction action)
  protected boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  private void updateOutputSlots(int tierLevel)
  private void updateInputSlots(int tierLevel)
  public void updateBenchTierLevel(int newValue)
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  private static JsonArray generateInventoryHints(Bench bench, CombinedItemContainer combinedInputItemContainer)

Fields:
private CombinedItemContainer itemContainer
private EventRegistration<?,?> inventoryRegistration
private float fuelTime
private int maxFuel
private float progress
private boolean active
private final Set<Short> processingSlots
private final Set<Short> processingFuelSlots
