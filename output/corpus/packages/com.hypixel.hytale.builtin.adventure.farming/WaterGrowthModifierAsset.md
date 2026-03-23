# WaterGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers | Extends: GrowthModifierAsset

public class WaterGrowthModifierAsset extends GrowthModifierAsset

Applies a growth speed multiplier when the crop has access to water. Water can come from adjacent fluid blocks (checked via `FluidSection`), active rain weather (checked via `WeatherResource` with line-of-sight to sky), or manual watering (via `TilledSoilBlock.wateredUntil` set by UseWateringCanInteraction). Also updates the soil's `externalWater` flag and schedules soil ticks when water state changes.

## Key Methods

- public double getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)
