# CustomBiomeGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: JsonLoader<SeedStringResource, CustomBiomeGenerator>

public class CustomBiomeGeneratorJsonLoader extends JsonLoader<SeedStringResource, CustomBiomeGenerator>

Loads a `CustomBiomeGenerator` from JSON, configuring noise thresholds, valid parent biome conditions, and biome masks that determine where a custom biome can generate within a zone.

Also in this package: BiomeInterpolationJsonLoader, BiomeJsonLoader, BiomeMaskJsonLoader, BiomePatternGeneratorJsonLoader, BiomePatternGeneratorSizeModifierProvider, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CustomBiomeJsonLoader, ISizeModifierProvider, LoadedPointGeneratorDistanceFunction, TileBiomeJsonLoader

Complete API:
  public CustomBiomeGenerator load()
  protected NoiseProperty loadNoiseProperty()
  protected IDoubleThreshold loadNoiseThreshold()
  protected IIntCondition loadBiomeMask()
  protected Map<String,Biome> generateNameBiomeMapping()
  protected int loadPriority()

Fields:
protected final BiomeFileContext biomeContext
protected final Biome[] tileBiomes
