# FarmingBlock

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states | Implements: Component<ChunkStore>

public class FarmingBlock implements Component<ChunkStore>

ChunkStore component storing farming block data such as growth stage and planted crop type.

Also in this package: CoopBlock, CoopResident, FarmingBlockState, RefreshFlags, TilledSoilBlock

Complete API:
  public static ComponentType<ChunkStore,FarmingBlock> getComponentType()
  public String getCurrentStageSet()
  public void setCurrentStageSet(String currentStageSet)
  public float getGrowthProgress()
  public void setGrowthProgress(float growthProgress)
  public Instant getLastTickGameTime()
  public void setLastTickGameTime(Instant lastTickGameTime)
  public int getGeneration()
  public void setGeneration(int generation)
  public String getPreviousBlockType()
  public void setPreviousBlockType(String previousBlockType)
  public float getSpreadRate()
  public void setSpreadRate(float spreadRate)
  public int getExecutions()
  public void setExecutions(int executions)
  public Component<ChunkStore> clone()
  public String toString()

Fields:
public static final String DEFAULT_STAGE_SET
public static final BuilderCodec<FarmingBlock> CODEC
private String currentStageSet
private float growthProgress
private Instant lastTickGameTime
private int generation
private String previousBlockType
private float spreadRate
private int executions
