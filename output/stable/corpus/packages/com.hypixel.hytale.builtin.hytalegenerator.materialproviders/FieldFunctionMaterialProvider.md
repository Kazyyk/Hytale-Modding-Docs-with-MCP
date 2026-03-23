# FieldFunctionMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class FieldFunctionMaterialProvider<V> extends MaterialProvider<V>

Provider supplying FieldFunctionMaterial values based on context.

## Fields

- @Nonnull private final Density density
- @Nonnull private final FieldFunctionMaterialProvider.FieldDelimiter<V>[] fieldDelimiters
- @Nonnull private final Density.Context rDensityContext

## Methods

- public FieldFunctionMaterialProvider(@Nonnull Density density, @Nonnull List<FieldFunctionMaterialProvider.FieldDelimiter<V>> delimiters)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: AllStoneMaterialProvider, ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, GrassTopMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final Density density
private final FieldFunctionMaterialProvider.FieldDelimiter<V>[] fieldDelimiters
private final Density.Context rDensityContext
