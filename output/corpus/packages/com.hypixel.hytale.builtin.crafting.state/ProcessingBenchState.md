# ProcessingBenchState

Type: class | Package: com.hypixel.hytale.builtin.crafting.state | Extends: BenchState | Implements: TickableBlockState, ItemContainerBlockState, DestroyableBlockState, PlacedByBlockState

public class ProcessingBenchState extends BenchState implements TickableBlockState, ItemContainerBlockState, DestroyableBlockState, PlacedByBlockState

Extends `BenchState`.

## Constants

- public static final boolean EXACT_RESOURCE_AMOUNTS
- @Nonnull public static final String PROCESSING
- @Nonnull public static final String PROCESS_COMPLETED

## Fields

- private ProcessingBench processingBench
- private ItemContainer inputContainer
- private ItemContainer fuelContainer
- private ItemContainer outputContainer
- private CombinedItemContainer combinedItemContainer
- private float inputProgress
- private float fuelTime
- private int lastConsumedFuelTotal
- private int nextExtra
- @Nullable private String recipeId
- @Nullable private CraftingRecipe recipe
- private boolean active

## Methods

- @Override public boolean initialize(@Nonnull BlockType blockType)
- private void setupSlots()
- @Override public void tick(float dt, int index, ArchetypeChunk<ChunkStore> archetypeChunk, @Nonnull Store<ChunkStore> store, CommandBuffer<ChunkStore> commandBuffer)
- private float getCraftingTimeReductionModifier()
- @Nonnull private Holder<EntityStore>[] ejectItems(@Nonnull ComponentAccessor<EntityStore> accessor, @Nonnull List<ItemStack> itemStacks)
- private void sendProgress(float progress)
- private void sendProcessingSlots()
- private void sendProcessingFuelSlots()
- public boolean isActive()
- public boolean setActive(boolean active)
- public void updateFuelValues()
- @Override public void onDestroy()
- public CombinedItemContainer getItemContainer()
- private void checkForRecipeUpdate()
- private void updateRecipe()
- private void clearRecipe()
- public void dropFuelItems(@Nonnull List<ItemStack> itemStacks)
- @Nullable public CraftingRecipe getRecipe()
- public float getInputProgress()
- public void onItemChange(ItemContainer.ItemContainerChangeEvent event)
- public void setBlockInteractionState(@Nonnull String state, @Nonnull BlockType blockType)
- @Override public void placedBy(@Nonnull Ref<EntityStore> playerRef,
        @Nonnull String blockTypeKey,
        @Nonnull BlockState blockState,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `private void` | `playSound(@Nonnull World world, int soundEventIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `@Override protected` | `void` | `onTierLevelChange()` |
