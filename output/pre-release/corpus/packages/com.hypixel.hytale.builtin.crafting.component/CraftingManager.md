# CraftingManager

Type: class | Package: com.hypixel.hytale.builtin.crafting.component | Implements: Component<EntityStore>

public class CraftingManager implements Component<EntityStore>

An `EntityStore` ECS component that manages per-player crafting state. Handles crafting job queuing, timed crafting execution, bench tier upgrades, item input removal, output distribution, and nearby chest material lookups. Each player entity has one `CraftingManager` tracking their current bench position, block type, queued crafting jobs, and any active upgrade job.

## Component Type


@Nonnull
public static ComponentType<EntityStore, CraftingManager> getComponentType()

Delegates to `CraftingPlugin.get().getCraftingManagerComponentType()`.

## Bench Management

- hasBenchSet() | boolean | Whether a bench block type is currently set.
- setBench(int x, int y, int z, @Nonnull BlockType blockType) | void | Associates this manager with a bench at the given position. Validates bench type.
- clearBench(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | boolean | Cancels all crafting and clears the bench reference. Returns whether jobs were cancelled.

## Crafting

- craftItem(...) | boolean | Immediately crafts an item, removing inputs and giving outputs. Fires `CraftRecipeEvent` and `PlayerCraftEvent`.
- queueCraft(...) | boolean | Queues a timed crafting job. Applies bench tier speed reduction.
- tick(@Nonnull Ref<EntityStore>, ..., float dt) | void | Advances crafting/upgrade job timers each tick. Completes jobs and distributes outputs.
- cancelAllCrafting(...) | boolean | Drains all queued jobs and refunds the current job's removed items.

## Bench Tier Upgrades

- startTierUpgrade(...) | boolean | Begins a bench tier upgrade if requirements are met. Cancels active crafting.

## Static Utilities

- getOutputItemStacks(@Nonnull CraftingRecipe recipe, int quantity) | Returns output `ItemStack` list for a recipe at the given quantity.
- getInputMaterials(@Nonnull CraftingRecipe recipe, int quantity) | Returns the list of `MaterialQuantity` inputs scaled by quantity.
- matches(@Nonnull MaterialQuantity, @Nonnull ItemStack) | Checks if an item stack satisfies a material requirement (by item ID or resource type).
- generateInventoryHints(...) | Produces a `JsonArray` of slot indices matching recipe inputs.
- matchesAnyRecipe(...) | Checks if an item stack matches any recipe at a given input slot index.
- feedExtraResourcesSection(@Nonnull BenchState, @Nonnull MaterialExtraResourcesSection) | Scans nearby chests for crafting/upgrade materials and populates the extra resources section.

## Inner Types

- CraftingManager.CraftingJob -- tracks a queued crafting operation
- CraftingManager.BenchUpgradingJob -- tracks a bench tier upgrade
- CraftingManager.ChestLookupResult -- result of nearby chest spatial query
- CraftingManager.InputRemovalType -- enum controlling input removal strategy

## Related Types

- `CraftingPlugin` -- registers this component type
- `CraftingRecipe` -- recipe asset driving crafting operations
- `BenchState` -- block state for crafting benches

Also in this package: BenchBlock, BenchUpgradingJob, ChestLookupResult, CraftingJob, InputRemovalType, ProcessingBenchBlock

Complete API:
  public static ComponentType<EntityStore,CraftingManager> getComponentType()
  public boolean hasBenchSet()
  public void setBench(int x, int y, int z, BlockType blockType)
  public boolean clearBench(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean craftItem(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingRecipe recipe, int quantity, ItemContainer itemContainer)
  private static String getRecipeOutputTranslationKey(CraftingRecipe recipe)
  public boolean queueCraft(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingWindow window, int transactionId, CraftingRecipe recipe, int quantity, ItemContainer inputItemContainer, CraftingManager.InputRemovalType inputRemovalType)
  public int getRemainingQueueSize()
  public void tick(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, float dt)
  public boolean cancelAllCrafting(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  private boolean isValidBenchForRecipe(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingRecipe recipe)
  private static void giveOutput(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingManager.CraftingJob job, int currentItemId)
  private static void giveOutput(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingRecipe craftingRecipe, int quantity)
  private static boolean removeInputFromInventory(CraftingManager.CraftingJob job, int currentItemId)
  private static boolean removeInputFromInventory(ItemContainer itemContainer, CraftingRecipe craftingRecipe, int quantity)
  private static void refundInputToInventory(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, CraftingManager.CraftingJob job, int currentItemId)
  public static List<ItemStack> getOutputItemStacks(CraftingRecipe recipe)
  public static List<ItemStack> getOutputItemStacks(CraftingRecipe recipe, int quantity)
  public static ItemStack getOutputItemStack(MaterialQuantity outputMaterial, String id)
  public static ItemStack getOutputItemStack(MaterialQuantity outputMaterial, int quantity)
  public static List<MaterialQuantity> getInputMaterials(CraftingRecipe recipe)
  private static List<MaterialQuantity> getInputMaterials(MaterialQuantity[] input)
  public static List<MaterialQuantity> getInputMaterials(CraftingRecipe recipe, int quantity)
  private static List<MaterialQuantity> getInputMaterials(MaterialQuantity[] input, int quantity)
  public static boolean matches(MaterialQuantity craftingMaterial, ItemStack itemStack)
  public static JsonArray generateInventoryHints(List<CraftingRecipe> recipes, int inputSlotIndex, ItemContainer container)
  public static boolean matchesAnyRecipe(List<CraftingRecipe> recipes, int inputSlotIndex, ItemStack slotItemStack)
  public boolean startTierUpgrade(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor, BenchWindow window)
  private int finishTierUpgrade(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  private BenchTierLevel getBenchTierLevelData(int level)
  private BenchUpgradeRequirement getBenchUpgradeRequirement(int tierLevel)
  private int getBenchTierLevel(ComponentAccessor<EntityStore> componentAccessor)
  public static int feedExtraResourcesSection(World world, int x, int y, int z, BlockType blockType, int rotationIndex, Bench benchAsset, int tierLevel, MaterialExtraResourcesSection extraResourcesSection)
  protected static CraftingManager.ChestLookupResult getContainersAroundBench(World world, int x, int y, int z, BlockType blockType, int rotationIndex)
  public String toString()
  public Component<EntityStore> clone()

Fields:
private static final HytaleLogger LOGGER
private final BlockingQueue<CraftingManager.CraftingJob> queuedCraftingJobs
private CraftingManager.BenchUpgradingJob upgradingJob
private int x
private int y
private int z
private BlockType blockType
