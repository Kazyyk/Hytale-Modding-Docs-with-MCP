# DownwardSpaceMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class DownwardSpaceMaterialProvider<V> extends MaterialProvider<V>

Provider supplying DownwardSpaceMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> materialProvider
- private final int space

## Methods

- public DownwardSpaceMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, int space)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: AllStoneMaterialProvider, ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, GrassTopMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final MaterialProvider<V> materialProvider
private final int space
