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

Known subclasses: ConstantTintProviderAsset, DensityDelimitedTintProviderAsset

Also in this package: Argument, ConstantTintProviderAsset, DelimiterAsset, DensityDelimitedTintProviderAsset

Complete API:
  public abstract TintProvider build(TintProviderAsset.Argument var1)
  public static TintProviderAsset getFallbackAsset()
  public boolean isSkipped()
  public static TintProviderAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,TintProviderAsset> CODEC
private static final Map<String,TintProviderAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<TintProviderAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
