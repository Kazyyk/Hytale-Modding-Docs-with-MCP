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
