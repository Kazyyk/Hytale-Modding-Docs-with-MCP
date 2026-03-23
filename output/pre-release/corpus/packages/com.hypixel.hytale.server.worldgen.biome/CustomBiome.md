# CustomBiome

Type: class | Package: com.hypixel.hytale.server.worldgen.biome | Extends: Biome

public class CustomBiome extends Biome

## Fields

- protected final CustomBiomeGenerator customBiomeGenerator

## Constructors

- public CustomBiome(int id,
        String name,
        BiomeInterpolation interpolation,
        CustomBiomeGenerator customBiomeGenerator,
        @Nonnull IHeightThresholdInterpreter heightmapInterpreter,
        CoverContainer coverContainer,
        LayerContainer layerContainer,
        PrefabContainer prefabContainer,
        TintContainer tintContainer,
        EnvironmentContainer environmentContainer,
        WaterContainer waterContainer,
        FadeContainer fadeContainer,
        NoiseProperty heightmapNoise,
        int mapColor)` |

## Methods

- public CustomBiomeGenerator getCustomBiomeGenerator()
- @Nonnull @Override public String toString()

Also in this package: Biome, BiomeInterpolation, BiomePatternGenerator, CustomBiomeGenerator, EmptyInt2IntMap, TileBiome

Complete API:
  public CustomBiomeGenerator getCustomBiomeGenerator()
  public String toString()

Fields:
protected final CustomBiomeGenerator customBiomeGenerator
