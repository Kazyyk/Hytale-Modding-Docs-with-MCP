# FarmingBlock

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states | Implements: Component<ChunkStore>

public class FarmingBlock implements Component<ChunkStore>

A `ChunkStore` component tracking the growth state of a farming block. Stores the current stage set name, growth progress (float for sub-stage interpolation), the last game-time tick, a generation counter (incremented on each stage advance for deterministic randomization), an optional previous block type (for prefab stages), the spread rate, and the execution counter (for spread stages).

## Constants

- @Nonnull public static final String DEFAULT_STAGE_SET

## Fields

- @Nonnull private String currentStageSet
- private float growthProgress
- private Instant lastTickGameTime
- private int generation
- private String previousBlockType
- private float spreadRate
- private int executions

## Methods

- public static ComponentType<ChunkStore, FarmingBlock> getComponentType()
- @Nonnull public String getCurrentStageSet()
- public void setCurrentStageSet(@Nullable String currentStageSet)
- public float getGrowthProgress()
- public void setGrowthProgress(float growthProgress)
- public Instant getLastTickGameTime()
- public void setLastTickGameTime(Instant lastTickGameTime)
- public int getGeneration()
- public void setGeneration(int generation)
- public String getPreviousBlockType()
- public void setPreviousBlockType(String previousBlockType)
- public float getSpreadRate()
- public void setSpreadRate(float spreadRate)
- public int getExecutions()
- public void setExecutions(int executions)
- @Nullable public Component<ChunkStore> clone()
