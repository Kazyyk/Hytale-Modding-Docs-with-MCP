# PrefabPropAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop | Extends: PropAsset

public class PrefabPropAsset extends PropAsset

Asset definition for PrefabProp configuration data.

## Fields

- private PrefabPropAsset.WeightedPathAsset[] weightedPrefabPathAssets
- private boolean legacyPath
- private boolean loadEntities
- private DirectionalityAsset directionalityAsset
- private ScannerAsset scannerAsset
- private BlockMaskAsset blockMaskAsset
- private MoldingDirection moldingDirectionName
- private ScannerAsset moldingScannerAsset
- private PatternAsset moldingPatternAsset
- private boolean moldChildren

## Methods

- @Override public void cleanUp()
- @Nonnull @Override public Prop build(@Nonnull PropAsset.Argument argument)
- @Nullable private List<PrefabBuffer> loadPrefabBuffersFrom(@Nonnull String path)
