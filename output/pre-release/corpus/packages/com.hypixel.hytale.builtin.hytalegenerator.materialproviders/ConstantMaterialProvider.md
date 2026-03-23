# ConstantMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class ConstantMaterialProvider<V> extends MaterialProvider<V>

Provider supplying ConstantMaterial values based on context.

## Fields

- @Nullable private final V material

## Methods

- public ConstantMaterialProvider(@Nullable V material)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

Also in this package: Context, DownwardDepthMaterialProvider, DownwardSpaceMaterialProvider, FieldDelimiter, FieldDelimiter, FieldFunctionMaterialProvider, HorizontalMaterialProvider, MaterialProvider, QueueMaterialProvider, SolidityMaterialProvider, Stripe, StripedMaterialProvider, TerrainDensityMaterialProvider, UpwardDepthMaterialProvider, UpwardSpaceMaterialProvider, WeightedMaterialProvider

Complete API:
  public V getVoxelTypeAt(MaterialProvider.Context context)

Fields:
private final V material
