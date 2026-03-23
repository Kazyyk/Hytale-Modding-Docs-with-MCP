# HorizontalMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class HorizontalMaterialProvider<V> extends MaterialProvider<V>

Provider supplying HorizontalMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> materialProvider
- private double topY
- private double bottomY

## Methods

- public HorizontalMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, double topY, double bottomY)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: ConstantMaterialProvider, Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final MaterialProvider<V> materialProvider
private double topY
private double bottomY
