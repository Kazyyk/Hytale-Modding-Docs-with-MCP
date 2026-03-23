# CustomBiomeJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: BiomeJsonLoader

public class CustomBiomeJsonLoader extends BiomeJsonLoader

Loads a custom biome definition from JSON. Custom biomes overlay on top of tile biomes and reference the parent tile biomes array for biome mask resolution.

Also in this package: BiomeInterpolationJsonLoader, BiomeJsonLoader, BiomeMaskJsonLoader, BiomePatternGeneratorJsonLoader, BiomePatternGeneratorSizeModifierProvider, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CustomBiomeGeneratorJsonLoader, ISizeModifierProvider, LoadedPointGeneratorDistanceFunction, TileBiomeJsonLoader

Complete API:
  public CustomBiome load()
  protected CustomBiomeGenerator loadCustomBiomeGenerator()

Fields:
protected final Biome[] tileBiomes
