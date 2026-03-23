# ContentFieldAsset

Type: abstract class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.worldstructures.mapcontentfield | Implements: Cleanable, JsonAssetWithMap, DefaultAssetMap, ContentFieldAsset>>

public abstract class ContentFieldAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, ContentFieldAsset>>

Abstract base type in the ContentFieldAsset hierarchy.

## Accessors

- getId() | String | Accessor method.

## Methods

- cleanUp() | void | Instance method.

Known subclasses: BaseHeightContentFieldAsset

Also in this package: BaseHeightContentFieldAsset

Complete API:
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,ContentFieldAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<ContentFieldAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
