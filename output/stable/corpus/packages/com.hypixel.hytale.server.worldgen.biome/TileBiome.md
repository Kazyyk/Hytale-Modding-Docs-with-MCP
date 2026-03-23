# TileBiome

Type: class | Package: com.hypixel.hytale.server.worldgen.biome | Extends: Biome

public class TileBiome extends Biome

## Fields

- public static final TileBiome[] EMPTY_ARRAY
- protected final double weight
- protected final double sizeModifier

## Constructors

- public TileBiome(int id,
        String name,
        BiomeInterpolation interpolation,
        @Nonnull IHeightThresholdInterpreter heightmapInterpreter,
        CoverContainer coverContainer,
        LayerContainer layerContainer,
        PrefabContainer prefabContainer,
        TintContainer tintContainer,
        EnvironmentContainer environmentContainer,
        WaterContainer waterContainer,
        FadeContainer fadeContainer,
        NoiseProperty heightmapNoise,
        double weight,
        double sizeModifier,
        int mapColor)` |

## Methods

- public double getWeight()
- public double getSizeModifier()
- @Nonnull @Override public String toString()

Also in this package: Biome, BiomeInterpolation, BiomePatternGenerator, CustomBiome, CustomBiomeGenerator, EmptyInt2IntMap

Complete API:
  public double getWeight()
  public double getSizeModifier()
  public String toString()

Fields:
public static final TileBiome[] EMPTY_ARRAY
protected final double weight
protected final double sizeModifier
