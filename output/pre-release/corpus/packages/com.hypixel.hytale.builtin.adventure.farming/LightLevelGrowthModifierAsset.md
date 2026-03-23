# LightLevelGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers | Extends: GrowthModifierAsset

public class LightLevelGrowthModifierAsset extends GrowthModifierAsset

Applies a growth speed multiplier based on ambient light conditions. Supports both artificial RGB light ranges and sunlight intensity ranges. Can require both conditions (`requireBoth`) or either. When only sunlight is active during the initial tick, applies a 0.6x penalty to the base multiplier.

## Key Methods

- public double getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)

## Inner Class: ArtificialLight

`class` -- Inner class holding red/green/blue `Range` thresholds for artificial light validation.

Also in this package: ArtificialLight, FertilizerGrowthModifierAsset, WaterGrowthModifierAsset

Complete API:
  public LightLevelGrowthModifierAsset.ArtificialLight getArtificialLight()
  public Rangef getSunlight()
  public boolean isRequireBoth()
  protected boolean checkArtificialLight(byte red, byte green, byte blue)
  protected boolean checkSunLight(WorldTimeResource worldTimeResource, byte sky)
  protected static boolean isInRange(Range range, int value)
  public double getCurrentGrowthMultiplier(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)
  public String toString()

Fields:
public static final BuilderCodec<LightLevelGrowthModifierAsset> CODEC
protected LightLevelGrowthModifierAsset.ArtificialLight artificialLight
protected Rangef sunlight
protected boolean requireBoth
