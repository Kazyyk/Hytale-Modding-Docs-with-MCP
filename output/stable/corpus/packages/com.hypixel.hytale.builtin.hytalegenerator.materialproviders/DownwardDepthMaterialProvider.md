# DownwardDepthMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class DownwardDepthMaterialProvider<V> extends MaterialProvider<V>

Provider supplying DownwardDepthMaterial values based on context.

## Fields

- @Nonnull private final MaterialProvider<V> materialProvider
- private final int depth

## Methods

- public DownwardDepthMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, int depth)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)
