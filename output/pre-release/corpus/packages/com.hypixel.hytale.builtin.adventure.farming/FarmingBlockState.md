# FarmingBlockState

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states | Implements: Component<ChunkStore>

@Deprecated(forRemoval = true)
public class FarmingBlockState implements Component<ChunkStore>

Deprecated legacy farming block state component. Replaced by FarmingBlock. The FarmingSystems.MigrateFarming system converts instances of this component to the new format.

## Inner Classes

- RefreshFlags | class | Bitfield constants for refresh operations.

Also in this package: CoopBlock, CoopResident, FarmingBlock, RefreshFlags, TilledSoilBlock

Complete API:
  public String getCurrentFarmingStageSetName()
  public void setCurrentFarmingStageSetName(String currentFarmingStageSetName)
  public int getCurrentFarmingStageIndex()
  public void setCurrentFarmingStageIndex(int currentFarmingStageIndex)
  public String getStageSetAfterHarvest()
  public void setStageSetAfterHarvest(String stageSetAfterHarvest)
  public float getSpreadRate()
  public void setSpreadRate(float spreadRate)
  public String toString()
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<FarmingBlockState> CODEC
public boolean loaded
public String baseCrop
public Instant stageStart
public String currentFarmingStageSetName
public int currentFarmingStageIndex
public Instant[] stageCompletionTimes
public String stageSetAfterHarvest
public double lastGrowthMultiplier
public float spreadRate
