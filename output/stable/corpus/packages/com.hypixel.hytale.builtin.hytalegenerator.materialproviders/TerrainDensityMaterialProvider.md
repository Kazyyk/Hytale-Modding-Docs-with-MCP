# TerrainDensityMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class TerrainDensityMaterialProvider<V> extends MaterialProvider<V>

Provider supplying TerrainDensityMaterial values based on context.

## Fields

- @Nonnull private final TerrainDensityMaterialProvider.FieldDelimiter<V>[] fieldDelimiters

## Methods

- public TerrainDensityMaterialProvider(@Nonnull List<TerrainDensityMaterialProvider.FieldDelimiter<V>> delimiters)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: AllStoneMaterialProvider, ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, GrassTopMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final TerrainDensityMaterialProvider.FieldDelimiter<V>[] fieldDelimiters
