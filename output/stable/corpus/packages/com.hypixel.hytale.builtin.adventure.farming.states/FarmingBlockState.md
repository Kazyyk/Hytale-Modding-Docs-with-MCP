# FarmingBlockState

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states | Implements: Component<ChunkStore>

public class FarmingBlockState implements Component<ChunkStore>

ChunkStore component tracking per-block farming state including growth progress and modifier flags.

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
