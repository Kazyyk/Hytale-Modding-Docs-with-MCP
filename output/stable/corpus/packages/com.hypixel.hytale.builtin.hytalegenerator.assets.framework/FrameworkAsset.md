# FrameworkAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.framework

public abstract class FrameworkAsset

Abstract base class for world generator framework assets that define reusable configuration blocks (constants, positions) for the Hytale world generator.

Known subclasses: DecimalConstantsFrameworkAsset, PositionsFrameworkAsset

Also in this package: DecimalConstantsFrameworkAsset, Entries, Entries, EntryAsset, EntryAsset, PositionsFrameworkAsset

Complete API:
  public String getId()
  public void cleanUp()
  public abstract void build(WorldStructureAsset.Argument var1, ReferenceBundle var2)

Fields:
public static final AssetCodecMapCodec<String,FrameworkAsset> CODEC
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<FrameworkAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
