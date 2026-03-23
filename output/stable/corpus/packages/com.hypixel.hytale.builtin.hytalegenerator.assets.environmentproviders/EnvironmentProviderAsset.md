# EnvironmentProviderAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.environmentproviders | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, EnvironmentProviderAsset>>

public abstract class EnvironmentProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, EnvironmentProviderAsset>>

Abstract base class providing shared logic for EnvironmentProviderAsset implementations.

## Constants

- @Nonnull private static final Map<String, EnvironmentProviderAsset> exportedNodes
- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY

## Fields

- private String id
- private AssetExtraInfo.Data data
- private boolean skip
- private String exportName

## Methods

- protected EnvironmentProviderAsset()
- public abstract EnvironmentProvider build(@Nonnull EnvironmentProviderAsset.Argument var1)
- @Nonnull public static EnvironmentProviderAsset getFallbackAsset()
- public boolean isSkipped()
- public static EnvironmentProviderAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Override public void cleanUp()

Known subclasses: ConstantEnvironmentProviderAsset, DensityDelimitedEnvironmentProviderAsset

Also in this package: Argument, ConstantEnvironmentProviderAsset, DelimiterAsset, DensityDelimitedEnvironmentProviderAsset

Complete API:
  public abstract EnvironmentProvider build(EnvironmentProviderAsset.Argument var1)
  public static EnvironmentProviderAsset getFallbackAsset()
  public boolean isSkipped()
  public static EnvironmentProviderAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,EnvironmentProviderAsset> CODEC
private static final Map<String,EnvironmentProviderAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<EnvironmentProviderAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
