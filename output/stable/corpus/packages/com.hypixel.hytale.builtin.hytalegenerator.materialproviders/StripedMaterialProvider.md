# StripedMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class StripedMaterialProvider<V> extends MaterialProvider<V>

Provider supplying StripedMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> materialProvider
- @Nonnull private final StripedMaterialProvider.Stripe[] stripes

## Methods

- public StripedMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, @Nonnull List<StripedMaterialProvider.Stripe> stripes)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: AllStoneMaterialProvider, ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, GrassTopMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final MaterialProvider<V> materialProvider
private final StripedMaterialProvider.Stripe[] stripes
