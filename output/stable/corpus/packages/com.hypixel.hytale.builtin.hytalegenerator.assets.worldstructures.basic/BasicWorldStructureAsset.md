# BasicWorldStructureAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.basic | Extends: WorldStructureAsset

public class BasicWorldStructureAsset extends WorldStructureAsset

Concrete implementation extending `WorldStructureAsset`.

## Fields

- biomeRangeAssets | BiomeRangeAsset[] | BiomeRangeAsset[] field.
- biomeTransitionDistance | int | int field.
- maxBiomeEdgeDistance | int | int field.
- defaultBiomeId | String | String field.
- frameworkAssets | FrameworkAsset[] | FrameworkAsset[] field.

## Methods

- build(@Nonnull WorldStructureAsset.Argument argument) | WorldStructure | public method.
- getSpawnPositionsAsset() | PositionProviderAsset | public method.
- cleanUp() | void | public method.

Also in this package: BiomeRangeAsset

Complete API:
  public WorldStructure build(WorldStructureAsset.Argument argument)
  public PositionProviderAsset getSpawnPositionsAsset()
  public void cleanUp()

Fields:
public static final BuilderCodec<BasicWorldStructureAsset> CODEC
private BiomeRangeAsset[] biomeRangeAssets
private int biomeTransitionDistance
private int maxBiomeEdgeDistance
private DensityAsset densityAsset
private String defaultBiomeId
private FrameworkAsset[] frameworkAssets
private PositionProviderAsset spawnPositionsAsset
