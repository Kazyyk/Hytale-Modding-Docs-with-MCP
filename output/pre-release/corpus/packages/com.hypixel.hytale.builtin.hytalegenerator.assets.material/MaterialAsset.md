# MaterialAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.material | Implements: JsonAssetWithMap, Cleanable

public class MaterialAsset implements JsonAssetWithMap, Cleanable

## Fields

- public static final AssetBuilderCodec<String,MaterialAsset> CODEC
- private String id
- private AssetExtraInfo.Data data
- private String solidName
- private String fluidName
- private boolean isSolidBottomUp
- private OrthogonalRotationAsset solidRotationAsset

## Methods

- @Nonnull public Material build(MaterialCache materialCache)
- public String getId()
- @Override public void cleanUp()

Also in this package: OrthogonalRotationAsset

Complete API:
  public Material build(MaterialCache materialCache)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetBuilderCodec<String,MaterialAsset> CODEC
private String id
private AssetExtraInfo.Data data
private String solidName
private String fluidName
private boolean isSolidBottomUp
private OrthogonalRotationAsset solidRotationAsset
