# QueueMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class QueueMaterialProvider<V> extends MaterialProvider<V>

Provider supplying QueueMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V>[] queue

## Methods

- public QueueMaterialProvider(@Nonnull List<MaterialProvider<V>> queue)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: AllStoneMaterialProvider, ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, GrassTopMaterialProvider, HorizontalMaterialProvider, MaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final MaterialProvider<V>[] queue
