# PatternAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.patterns | Implements: Cleanable, JsonAssetWithMap

public abstract class PatternAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PatternAsset>>

## Fields

- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName
- public SeedBox parentSeed
- public MaterialCache materialCache
- public ReferenceBundle referenceBundle
- public WorkerIndexer.Id workerId

## Methods

- protected PatternAsset()
- public abstract Pattern build(@Nonnull PatternAsset.Argument var1)
- public boolean isSkipped()
- public static PatternAsset getExportedAsset(@Nonnull String name)
- public String getId()
- public void cleanUp()
- public static PatternAsset.Argument argumentFrom(@Nonnull DirectionalityAsset.Argument argument)
- public static PatternAsset.Argument argumentFrom(@Nonnull PropAsset.Argument argument)
