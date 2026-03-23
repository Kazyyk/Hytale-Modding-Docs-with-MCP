# FertilizerGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers | Extends: GrowthModifierAsset

public class FertilizerGrowthModifierAsset extends GrowthModifierAsset

Applies a growth speed multiplier when the soil block below the crop is fertilized. Checks the `TilledSoilBlock` component on the block directly below (y-1) for the fertilized flag.

## Key Methods

- public double getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)
