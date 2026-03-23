# WeightedMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class WeightedMaterialProvider<V> extends MaterialProvider<V>

Provider supplying WeightedMaterial values based on context.

## Fields

- @Nonnull private final WeightedMap<MaterialProvider<V>> weightedMap
- @Nonnull private final SeedGenerator seedGenerator
- private final double noneProbability

## Methods

- public WeightedMaterialProvider(@Nonnull WeightedMap<MaterialProvider<V>> weightedMap, @Nonnull SeedBox seedBox, double noneProbability)
- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)
