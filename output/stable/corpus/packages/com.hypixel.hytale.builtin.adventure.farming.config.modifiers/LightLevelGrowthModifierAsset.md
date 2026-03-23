# LightLevelGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers

public class LightLevelGrowthModifierAsset

Growth modifier asset that adjusts crop growth rate based on ambient light level.

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
