# PointGeneratorAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.pointgenerators | Implements: JsonAssetWithMap

public abstract class PointGeneratorAsset implements JsonAssetWithMap

## Fields

- private static final PointGeneratorAsset[] EMPTY_INPUTS
- public static final AssetCodecMapCodec<String,PointGeneratorAsset> CODEC
- private static final Map<String,PointGeneratorAsset> exportedNodes
- public static final Codec<String> CHILD_ASSET_CODEC
- public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- public static final BuilderCodec<PointGeneratorAsset> ABSTRACT_CODEC
- private String id
- private AssetExtraInfo.Data data
- private PointGeneratorAsset[] inputs
- private boolean skip
- private String exportName

## Methods

- public abstract PointProvider build(SeedBox var1)
- @Nonnull public PointGeneratorAsset[] inputs()
- public boolean skip()
- public static PointGeneratorAsset getExportedAsset(String name)
- public String getId()

Known subclasses: MeshPointGeneratorAsset, NoPointGeneratorAsset

Also in this package: MeshPointGeneratorAsset, NoPointGeneratorAsset

Complete API:
  public abstract PointProvider build(SeedBox var1)
  public PointGeneratorAsset[] inputs()
  public boolean skip()
  public static PointGeneratorAsset getExportedAsset(String name)
  public String getId()

Fields:
private static final PointGeneratorAsset[] EMPTY_INPUTS
public static final AssetCodecMapCodec<String,PointGeneratorAsset> CODEC
private static final Map<String,PointGeneratorAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<PointGeneratorAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private PointGeneratorAsset[] inputs
private boolean skip
private String exportName
