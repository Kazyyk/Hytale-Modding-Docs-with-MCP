# UpwardSpaceMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class UpwardSpaceMaterialProvider<V> extends MaterialProvider<V>

Provider supplying UpwardSpaceMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> materialProvider
- private final int space

## Methods

- public UpwardSpaceMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, int space)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final MaterialProvider<V> materialProvider
private final int space
