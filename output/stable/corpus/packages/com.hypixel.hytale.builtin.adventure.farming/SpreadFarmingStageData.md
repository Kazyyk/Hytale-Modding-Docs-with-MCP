# SpreadFarmingStageData

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages.spread | Extends: FarmingStageData

public class SpreadFarmingStageData extends FarmingStageData

A farming stage that spreads blocks outward from the source position. Implements `shouldStop` to limit executions based on spread rate decay. Each execution runs all configured SpreadGrowthBehaviour instances, passing a decayed spread rate. The stage repeats until the execution count reaches `executions * spreadRate`.

## Codec Fields

executions (IntRange), spreadDecayPercent (IntRange), spreadGrowthBehaviours (SpreadGrowthBehaviour[])

## Key Methods

- public void apply(@Nonnull ComponentAccessor<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, @Nullable FarmingStageData previousStage)

Also in this package: BlockTypeWeight, DirectionalGrowthBehaviour, SpreadGrowthBehaviour, VerticalDirection

Complete API:
  public IntRange getExecutions()
  public IntRange getSpreadDecayPercent()
  public SpreadGrowthBehaviour[] getSpreadGrowthBehaviours()
  public boolean implementsShouldStop()
  public boolean shouldStop(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z)
  public void apply(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, FarmingStageData previousStage)
  public void remove(ComponentAccessor<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z)
  public String toString()

Fields:
public static final BuilderCodec<SpreadFarmingStageData> CODEC
protected IntRange executions
protected IntRange spreadDecayPercent
protected SpreadGrowthBehaviour[] spreadGrowthBehaviours
