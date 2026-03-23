# SpreadGrowthBehaviour

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.stages.spread

public abstract class SpreadGrowthBehaviour

Abstract base class for spread growth behaviours used by SpreadFarmingStageData. Subclasses define how blocks spread to new positions. Supports configurable `WorldLocationCondition` arrays for position validation.

## Fields

- protected WorldLocationCondition[] worldLocationConditions

## Abstract Methods

- public abstract void execute(@Nonnull ComponentAccessor<ChunkStore> var1, @Nonnull Ref<ChunkStore> var2, @Nonnull Ref<ChunkStore> var3, int var4, int var5, int var6, float var7)

## Concrete Methods

- protected boolean validatePosition(@Nonnull World world, int worldX, int worldY, int worldZ)

## Known Subclasses

- DirectionalGrowthBehaviour

Known subclasses: DirectionalGrowthBehaviour

Also in this package: BlockTypeWeight, DirectionalGrowthBehaviour, SpreadFarmingStageData, VerticalDirection

Complete API:
  public abstract void execute(ComponentAccessor<ChunkStore> var1, Ref<ChunkStore> var2, Ref<ChunkStore> var3, int var4, int var5, int var6, float var7)
  protected boolean validatePosition(World world, int worldX, int worldY, int worldZ)

Fields:
public static final CodecMapCodec<SpreadGrowthBehaviour> CODEC
public static final BuilderCodec<SpreadGrowthBehaviour> BASE_CODEC
protected WorldLocationCondition[] worldLocationConditions
