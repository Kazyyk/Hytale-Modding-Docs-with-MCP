# PositionProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders | Implements: Cleanable, JsonAssetWithMap

public abstract class PositionProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PositionProviderAsset>>

Abstract base class in the `positionproviders` package.

## Constants

- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY

## Fields

- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName
- public SeedBox parentSeed
- public ReferenceBundle referenceBundle
- public WorkerIndexer.Id workerId

## Methods

- public abstract PositionProvider build(@Nonnull PositionProviderAsset.Argument var1)
- public boolean skip()
- public static PositionProviderAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Override public void cleanUp()
- public Argument(@Nonnull SeedBox parentSeed, @Nonnull ReferenceBundle referenceBundle, @Nonnull WorkerIndexer.Id workerId)
- public Argument(@Nonnull PositionProviderAsset.Argument argument)
