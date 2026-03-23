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
