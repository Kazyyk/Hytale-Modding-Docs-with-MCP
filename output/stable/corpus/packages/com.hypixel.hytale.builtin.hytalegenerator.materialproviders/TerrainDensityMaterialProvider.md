# TerrainDensityMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class TerrainDensityMaterialProvider<V> extends MaterialProvider<V>

Provider supplying TerrainDensityMaterial values based on context.

## Fields

- @Nonnull private final TerrainDensityMaterialProvider.FieldDelimiter<V>[] fieldDelimiters

## Methods

- public TerrainDensityMaterialProvider(@Nonnull List<TerrainDensityMaterialProvider.FieldDelimiter<V>> delimiters)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)
