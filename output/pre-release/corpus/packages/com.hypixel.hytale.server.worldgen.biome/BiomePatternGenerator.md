# BiomePatternGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.biome

public class BiomePatternGenerator

## Fields

- protected final IPointGenerator pointGenerator
- @Nonnull protected final IWeightedMap<TileBiome> tileBiomes
- @Nonnull protected final CustomBiome[] customBiomes
- @Nonnull protected final Biome[] biomes
- protected final int extents

## Constructors

- public BiomePatternGenerator(IPointGenerator pointGenerator, @Nonnull IWeightedMap<TileBiome> tileBiomes, @Nonnull CustomBiome[] customBiomes)

## Methods

- public int getExtents()
- @Nonnull public Biome[] getBiomes()
- @Nonnull public CustomBiome[] getCustomBiomes()
- @Nullable public TileBiome getBiome(int seed, int x, int z)
- protected double getBiomeIndex(int seed, int x, int z)
- @Nullable public TileBiome getBiomeDirect(int seed, int x, int z)
- @Nonnull public Biome generateBiomeAt(@Nonnull ZoneGeneratorResult zoneResult, int seed, int x, int z)
- @Nullable public CustomBiome getCustomBiomeAt(int seed, double x, double z, @Nonnull ZoneGeneratorResult zoneResult, @Nonnull Biome parentResult)
- @Nonnull @Override public String toString()
- private static int getExtents(@Nonnull Biome[] biomes)
