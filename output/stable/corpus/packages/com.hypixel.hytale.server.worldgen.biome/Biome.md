# Biome

Type: class | Package: com.hypixel.hytale.server.worldgen.biome

public abstract class Biome

## Fields

- protected final int id
- protected final String name
- protected final BiomeInterpolation interpolation
- @Nonnull protected final IHeightThresholdInterpreter heightmapInterpreter
- protected final CoverContainer coverContainer
- protected final LayerContainer layerContainer
- protected final PrefabContainer prefabContainer
- protected final TintContainer tintContainer
- protected final EnvironmentContainer environmentContainer
- protected final WaterContainer waterContainer
- protected final FadeContainer fadeContainer
- protected final NoiseProperty heightmapNoise
- protected final int mapColor

## Constructors

- public Biome(int id,
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
        int mapColor)` |

## Methods

- public String getName()
- public BiomeInterpolation getInterpolation()
- public IHeightThresholdInterpreter getHeightmapInterpreter()
- public CoverContainer getCoverContainer()
- public LayerContainer getLayerContainer()
- @Nullable public PrefabContainer getPrefabContainer()
- public TintContainer getTintContainer()
- public EnvironmentContainer getEnvironmentContainer()
- public WaterContainer getWaterContainer()
- public FadeContainer getFadeContainer()
- public NoiseProperty getHeightmapNoise()
- public int getId()
- public int getMapColor()
- @Override public int hashCode()

Known subclasses: CustomBiome, TileBiome

Known implementors: SimpleBiome

Also in this package: BiomeInterpolation, BiomePatternGenerator, CustomBiome, CustomBiomeGenerator, EmptyInt2IntMap, TileBiome

Complete API:
  public String getName()
  public BiomeInterpolation getInterpolation()
  public IHeightThresholdInterpreter getHeightmapInterpreter()
  public CoverContainer getCoverContainer()
  public LayerContainer getLayerContainer()
  public PrefabContainer getPrefabContainer()
  public TintContainer getTintContainer()
  public EnvironmentContainer getEnvironmentContainer()
  public WaterContainer getWaterContainer()
  public FadeContainer getFadeContainer()
  public NoiseProperty getHeightmapNoise()
  public int getId()
  public int getMapColor()
  public int hashCode()

Fields:
protected final int id
protected final String name
protected final BiomeInterpolation interpolation
protected final IHeightThresholdInterpreter heightmapInterpreter
protected final CoverContainer coverContainer
protected final LayerContainer layerContainer
protected final PrefabContainer prefabContainer
protected final TintContainer tintContainer
protected final EnvironmentContainer environmentContainer
protected final WaterContainer waterContainer
protected final FadeContainer fadeContainer
protected final NoiseProperty heightmapNoise
protected final int mapColor
