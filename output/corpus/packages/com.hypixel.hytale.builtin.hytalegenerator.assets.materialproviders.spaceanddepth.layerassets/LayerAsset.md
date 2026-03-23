# LayerAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.spaceanddepth.layerassets | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, LayerAsset>>

public abstract class LayerAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, LayerAsset>>

## Fields

- @Nonnull private static final LayerAsset[] EMPTY_INPUTS
- @Nonnull public static final AssetCodecMapCodec<String, LayerAsset> CODEC
- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- @Nonnull public static final BuilderCodec<LayerAsset> ABSTRACT_CODEC
- private String id
- private AssetExtraInfo.Data data

## Constructors

- protected LayerAsset()

## Methods

- public abstract SpaceAndDepthMaterialProvider.Layer<Material> build(@Nonnull MaterialProviderAsset.Argument var1)
- public String getId()
- @Override public void cleanUp()
