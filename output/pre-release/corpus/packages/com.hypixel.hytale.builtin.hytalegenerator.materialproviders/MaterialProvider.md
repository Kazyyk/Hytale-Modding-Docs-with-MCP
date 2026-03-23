# MaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders

public abstract class MaterialProvider<V>

Abstract base class providing shared logic for MaterialProvider implementations.

## Methods

- @Nullable public abstract V getVoxelTypeAt(@Nonnull MaterialProvider.Context var1)
- @Nonnull public static <V> MaterialProvider<V> noMaterialProvider()

Known subclasses: ConstantMaterialProvider, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldFunctionMaterialProvider, HorizontalMaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, SpaceAndDepthMaterialProvider, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Also in this package: ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, HorizontalMaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public abstract V getVoxelTypeAt(MaterialProvider.Context var1)
  public static MaterialProvider<V> noMaterialProvider()
