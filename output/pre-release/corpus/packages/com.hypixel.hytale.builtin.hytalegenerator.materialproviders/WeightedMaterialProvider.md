# WeightedMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders | Extends: MaterialProvider<V>

public class WeightedMaterialProvider<V> extends MaterialProvider<V>

A `MaterialProvider` that selects from a weighted map of child providers using a deterministic RNG field seeded by voxel position. Before selecting, applies a `noneProbability` chance to return null (no material). The RNG field ensures consistent material selection for the same world position across generation runs.

## Fields

- @Nonnull private final WeightedMap<MaterialProvider<V>> weightedMap
- @Nonnull private final RngField rngField
- @Nonnull private final FastRandom random
- private final double noneProbability

## Constructors

- public WeightedMaterialProvider(@Nonnull WeightedMap<MaterialProvider<V>> weightedMap, @Nonnull SeedBox seedBox, double noneProbability)

## Methods

- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)
