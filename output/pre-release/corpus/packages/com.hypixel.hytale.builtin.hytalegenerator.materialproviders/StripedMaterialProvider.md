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
