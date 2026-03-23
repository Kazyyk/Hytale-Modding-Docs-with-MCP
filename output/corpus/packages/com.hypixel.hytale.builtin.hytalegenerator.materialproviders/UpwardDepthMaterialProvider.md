# UpwardDepthMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class UpwardDepthMaterialProvider<V> extends MaterialProvider<V>

Provider supplying UpwardDepthMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> materialProvider
- private final int depth

## Methods

- public UpwardDepthMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, int depth)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)
