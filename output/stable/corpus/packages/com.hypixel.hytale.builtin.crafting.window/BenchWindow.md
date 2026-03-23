# BenchWindow

Type: class | Package: com.hypixel.hytale.builtin.crafting.window | Extends: BlockWindow

public abstract class BenchWindow extends BlockWindow

Abstract base for bench-based crafting windows. Manages bench state, crafting/upgrade progress, material resource sections, and window data serialization.

Known subclasses: CraftingWindow, ProcessingBenchWindow

Also in this package: CraftingWindow, DiagramCraftingWindow, FieldCraftingWindow, ProcessingBenchWindow, SimpleCraftingWindow, StructuralCraftingWindow

Complete API:
  public JsonObject getData()
  protected boolean onOpen0(Ref<EntityStore> ref, Store<EntityStore> store)
  protected int getBenchTierLevel()
  public void onClose0(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void setBlockInteractionState(String state, World world)
  public void updateCraftingJob(float percent)
  public void updateBenchUpgradeJob(float percent)
  private void checkProgressInvalidate(float percent)
  public void updateBenchTierLevel(int newValue)
  public MaterialExtraResourcesSection getExtraResourcesSection()
  public void invalidateExtraResources()
  public boolean isValid()

Fields:
private static final float CRAFTING_UPDATE_MIN_PERCENT
private static final long CRAFTING_UPDATE_INTERVAL_MS
protected static final String BENCH_UPGRADING
private float lastUpdatePercent
private long lastUpdateTimeMs
protected final Bench bench
protected final BenchState benchState
protected final JsonObject windowData
private final MaterialExtraResourcesSection extraResourcesSection
