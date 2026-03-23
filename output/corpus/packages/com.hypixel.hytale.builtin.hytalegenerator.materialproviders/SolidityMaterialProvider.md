# SolidityMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class SolidityMaterialProvider<V> extends MaterialProvider<V>

Provider supplying SolidityMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> solidMaterialProvider
- @Nonnull private final MaterialProvider<V> emptyMaterialProvider

## Methods

- public SolidityMaterialProvider(@Nonnull MaterialProvider<V> solidMaterialProvider, @Nonnull MaterialProvider<V> emptyMaterialProvider)
- @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)
