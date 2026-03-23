# GrassTopMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<SolidMaterial>

public class GrassTopMaterialProvider extends MaterialProvider<SolidMaterial>

Provider supplying GrassTopMaterial values based on context.

## Fields

- private final SolidMaterial grass
- private final SolidMaterial dirt
- private final SolidMaterial stone
- private final SolidMaterial empty

## Methods

- public GrassTopMaterialProvider(@Nonnull SolidMaterial grass, @Nonnull SolidMaterial dirt, @Nonnull SolidMaterial stone, @Nonnull SolidMaterial empty)
- public SolidMaterial getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: AllStoneMaterialProvider, ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public SolidMaterial getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final SolidMaterial grass
private final SolidMaterial dirt
private final SolidMaterial stone
private final SolidMaterial empty
