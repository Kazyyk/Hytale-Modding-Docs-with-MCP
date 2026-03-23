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
