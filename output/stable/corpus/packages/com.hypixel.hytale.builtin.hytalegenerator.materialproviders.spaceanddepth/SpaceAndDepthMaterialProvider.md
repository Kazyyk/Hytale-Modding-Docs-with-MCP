# SpaceAndDepthMaterialProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth | Extends: MaterialProvider<V>

public class SpaceAndDepthMaterialProvider<V> extends MaterialProvider<V>

## Fields

- @Nonnull private final SpaceAndDepthMaterialProvider.LayerContextType layerContextType
- @Nonnull private final SpaceAndDepthMaterialProvider.Layer<V>[] layers
- @Nonnull private final SpaceAndDepthMaterialProvider.Condition condition
- private final int maxDistance

## Constructors

- public SpaceAndDepthMaterialProvider(@Nonnull SpaceAndDepthMaterialProvider.LayerContextType layerContextType,
        @Nonnull List<SpaceAndDepthMaterialProvider.Layer<V>> layers,
        @Nonnull SpaceAndDepthMaterialProvider.Condition condition,
        int maxDistance)` |

## Methods

- @Nullable @Override public V getVoxelTypeAt(@Nonnull MaterialProvider.Context context)

## Inner Types

- `SpaceAndDepthMaterialProvider.Condition`
- `SpaceAndDepthMaterialProvider.Layer`
- `SpaceAndDepthMaterialProvider.LayerContextType`
