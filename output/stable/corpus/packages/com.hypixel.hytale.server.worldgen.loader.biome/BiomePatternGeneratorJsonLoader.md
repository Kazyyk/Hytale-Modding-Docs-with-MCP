# BiomePatternGeneratorJsonLoader

Type: class | Package: com.hypixel.hytale.server.worldgen.loader.biome | Extends: JsonLoader<SeedStringResource, BiomePatternGenerator>

public class BiomePatternGeneratorJsonLoader extends JsonLoader<SeedStringResource, BiomePatternGenerator>

Loads a `BiomePatternGenerator` from JSON, configuring the point generator, distance function, tile biome definitions, and custom biome overlays that determine biome distribution within a zone.

Also in this package: BiomeInterpolationJsonLoader, BiomeJsonLoader, BiomeMaskJsonLoader, BiomePatternGeneratorSizeModifierProvider, Constants, Constants, Constants, Constants, Constants, Constants, Constants, CustomBiomeGeneratorJsonLoader, CustomBiomeJsonLoader, ISizeModifierProvider, LoadedPointGeneratorDistanceFunction, TileBiomeJsonLoader

Complete API:
  public BiomePatternGenerator load()
  protected IPointGenerator loadPointGenerator(BiomePatternGeneratorJsonLoader.ISizeModifierProvider sizeModifierProvider)

Fields:
protected final IWeightedMap<TileBiome> tileBiomes
protected final CustomBiome[] customBiomes
