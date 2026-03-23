# DirectionalityAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality | Implements: Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, DirectionalityAsset>>

public abstract class DirectionalityAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, DirectionalityAsset>>

## Fields

- @Nonnull public static final AssetCodecMapCodec<String, DirectionalityAsset> CODEC
- @Nonnull private static final Map<String, DirectionalityAsset> exportedNodes
- @Nonnull public static final Codec<String> CHILD_ASSET_CODEC
- @Nonnull public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
- private String id
- private AssetExtraInfo.Data data
- private String exportName

## Constructors

- protected DirectionalityAsset()

## Methods

- public abstract Directionality build(@Nonnull DirectionalityAsset.Argument var1)
- @Override public void cleanUp()
- public static DirectionalityAsset getExportedAsset(@Nonnull String name)
- public String getId()
- @Nonnull public static DirectionalityAsset.Argument argumentFrom(@Nonnull PropAsset.Argument argument)

## Inner Types

- `DirectionalityAsset.Argument`

Known subclasses: ImportedDirectionalityAsset, PatternDirectionalityAsset, RandomDirectionalityAsset, StaticDirectionalityAsset

Also in this package: Argument, ImportedDirectionalityAsset, PatternDirectionalityAsset, RandomDirectionalityAsset, StaticDirectionalityAsset

Complete API:
  public abstract Directionality build(DirectionalityAsset.Argument var1)
  public void cleanUp()
  public static DirectionalityAsset getExportedAsset(String name)
  public String getId()
  public static DirectionalityAsset.Argument argumentFrom(PropAsset.Argument argument)

Fields:
public static final AssetCodecMapCodec<String,DirectionalityAsset> CODEC
private static final Map<String,DirectionalityAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<DirectionalityAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private String exportName
