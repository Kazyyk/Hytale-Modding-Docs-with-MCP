# TintProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, TintProviderAsset>>

public abstract class TintProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, TintProviderAsset>>

## Fields

- @Nonnull public static final AssetCodecMapCodec<String, TintProviderAsset> CODEC
- @Nonnull private static final Map<String, TintProviderAsset> exportedNodes
- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName

## Constructors

- protected TintProviderAsset()

## Methods

- public abstract TintProvider build(@Nonnull TintProviderAsset.Argument var1)
- @Nonnull public static TintProviderAsset getFallbackAsset()
- public boolean isSkipped()
- public static TintProviderAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Override public void cleanUp()

## Inner Types

- `TintProviderAsset.Argument`
