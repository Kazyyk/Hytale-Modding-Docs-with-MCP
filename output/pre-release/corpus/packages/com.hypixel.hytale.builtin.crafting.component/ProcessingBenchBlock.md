# ProcessingBenchBlock

Type: class | Package: com.hypixel.hytale.builtin.crafting.component | Implements: Component

public class ProcessingBenchBlock implements Component

Block component for processing benches (furnaces, smelters, etc.) that extends bench functionality with input/output/fuel item containers, recipe tracking, processing progress, and fuel time management. Handles recipe detection, slot configuration, and sound/state updates.

Also in this package: BenchBlock, BenchUpgradingJob, ChestLookupResult, CraftingJob, CraftingManager, InputRemovalType

Complete API:
  public static ComponentType<ChunkStore,ProcessingBenchBlock> getComponentType()
  public Bench getBench()
  public ProcessingBench getProcessingBench()
  public ItemContainer getOutputContainer()
  public ItemContainer getInputContainer()
  public ItemContainer getFuelContainer()
  public float getFuelTime()
  public Set<Short> getProcessingSlots()
  public Set<Short> getProcessingFuelSlots()
  public void setInputProgress(float inputProgress)
  public Instant getLastTickGameTime()
  public void setLastTickGameTime(Instant lastTickGameTime)
  public void setLastConsumedFuelTotal(int lastConsumedFuelTotal)
  public void clearCurrentRecipe()
  public boolean initializeBenchConfig(BlockType blockType)
  public void setupSlots(World world, BenchBlock benchBlock, BlockModule.BlockStateInfo blockStateInfo, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  public boolean isActive()
  public boolean setActive(boolean active, BenchBlock benchBlock, BlockModule.BlockStateInfo blockStateInfo)
  public void updateFuelValues(Map<UUID,BenchWindow> windows)
  public CombinedItemContainer getItemContainer()
  public CraftingRecipe getRecipe()
  public float getInputProgress()
  public void dropFuelItems(List<ItemStack> itemStacks)
  private float getCraftingTimeReductionModifier(int tierLevel)
  public float getRecipeTimeSeconds(int tierLevel)
  private int countAvailableInputSets()
  private float calculateTotalAvailableFuel()
  private boolean canFitScaledOutput(List<ItemStack> outputPerRecipe, int count)
  private void completeRecipes(int count, Store<EntityStore> entityStore, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  public int advanceProcessing(float dt, Store<EntityStore> entityStore, BenchBlock benchBlock, BlockModule.BlockStateInfo blockStateInfo, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  private int consumeOneFuel(Store<EntityStore> entityStore, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  private void addOutputAndEjectRemainder(List<ItemStack> outputItemStacks, Store<EntityStore> entityStore, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  private boolean tryCompleteOneRecipe(Store<EntityStore> entityStore, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  public void consumeFuelForDuration(float duration, Store<EntityStore> entityStore, int blockX, int blockY, int blockZ, BlockType blockType, int rotationIndex)
  private Holder<EntityStore>[] ejectItems(ComponentAccessor<EntityStore> accessor, List<ItemStack> itemStacks, int rotationIndex, BlockType blockType, int blockX, int blockY, int blockZ)
  private static Vector3d getCenteredBlockPosition(BlockType blockType, int rotationIndex, int blockX, int blockY, int blockZ)
  public void sendProgress(float progress, Map<UUID,BenchWindow> windows)
  public void sendProcessingSlots(Map<UUID,BenchWindow> windows)
  public void sendProcessingFuelSlots(Map<UUID,BenchWindow> windows)
  public void setBlockInteractionState(String state, BlockType blockType, World world, int blockX, int blockY, int blockZ)
  public void playSound(int soundEventIndex, ComponentAccessor<EntityStore> componentAccessor, BlockType blockType, int rotationIndex, int blockX, int blockY, int blockZ)
  public void checkForRecipeUpdate(BenchBlock benchBlock)
  private void updateRecipe(BenchBlock benchBlock)
  private void clearRecipe(Map<UUID,BenchWindow> windows)
  public Component<ChunkStore> clone()

Fields:
public static final HytaleLogger LOGGER
public static final boolean EXACT_RESOURCE_AMOUNTS
public static final BuilderCodec<ProcessingBenchBlock> CODEC
private static final float MAX_UNLOAD_ELAPSED_SECONDS
private static final float EJECT_VELOCITY
private static final float EJECT_SPREAD_VELOCITY
private static final float EJECT_VERTICAL_VELOCITY
public static final String PROCESSING
public static final String PROCESS_COMPLETED
private transient Bench bench
private transient ProcessingBench processingBench
private ItemContainer inputContainer
private ItemContainer fuelContainer
private ItemContainer outputContainer
private CombinedItemContainer combinedItemContainer
private float inputProgress
private float fuelTime
private int lastConsumedFuelTotal
private int nextExtra
private final Set<Short> processingSlots
private final Set<Short> processingFuelSlots
private String recipeId
private CraftingRecipe recipe
private boolean active
private Instant lastTickGameTime
