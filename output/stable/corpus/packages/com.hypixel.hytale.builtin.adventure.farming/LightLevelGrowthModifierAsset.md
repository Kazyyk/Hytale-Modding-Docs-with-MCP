# LightLevelGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers | Extends: GrowthModifierAsset

public class LightLevelGrowthModifierAsset extends GrowthModifierAsset

Applies a growth speed multiplier based on ambient light conditions. Supports both artificial RGB light ranges and sunlight intensity ranges. Can require both conditions (`requireBoth`) or either. When only sunlight is active during the initial tick, applies a 0.6x penalty to the base multiplier.

## Key Methods

- public double getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)

## Inner Class: ArtificialLight

`class` -- Inner class holding red/green/blue `Range` thresholds for artificial light validation.
