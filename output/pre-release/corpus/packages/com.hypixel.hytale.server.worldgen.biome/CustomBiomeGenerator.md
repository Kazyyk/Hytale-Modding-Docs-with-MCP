# CustomBiomeGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.biome

public class CustomBiomeGenerator

## Fields

- protected final NoiseProperty noiseProperty
- protected final IDoubleThreshold threshold
- protected final IIntCondition biomeMask
- protected final int priority

## Constructors

- public CustomBiomeGenerator(NoiseProperty noiseProperty, IDoubleThreshold threshold, IIntCondition biomeMask, int priority)

## Methods

- public boolean shouldGenerateAt(int seed, double x, double z, @Nonnull ZoneGeneratorResult zoneResult, @Nonnull Biome customBiome)
- public boolean isThreshold(double d)
- public boolean isThreshold(double d, double factor)
- public boolean isValidParentBiome(int index)
- public int getPriority()
- @Nonnull @Override public String toString()

Also in this package: Biome, BiomeInterpolation, BiomePatternGenerator, CustomBiome, EmptyInt2IntMap, TileBiome

Complete API:
  public boolean shouldGenerateAt(int seed, double x, double z, ZoneGeneratorResult zoneResult, Biome customBiome)
  public boolean isThreshold(double d)
  public boolean isThreshold(double d, double factor)
  public boolean isValidParentBiome(int index)
  public int getPriority()
  public String toString()

Fields:
protected final NoiseProperty noiseProperty
protected final IDoubleThreshold threshold
protected final IIntCondition biomeMask
protected final int priority
