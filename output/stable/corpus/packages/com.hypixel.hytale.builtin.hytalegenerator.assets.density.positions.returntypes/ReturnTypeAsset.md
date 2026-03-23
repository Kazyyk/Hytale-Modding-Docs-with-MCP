# ReturnTypeAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.density.positions.returntypes

public abstract class ReturnTypeAsset

Abstract base for density position return type assets.

Known subclasses: CellValueReturnTypeAsset, CurveReturnTypeAsset, DensityReturnTypeAsset, Distance2AddReturnTypeAsset, Distance2DivReturnTypeAsset, Distance2MulReturnTypeAsset, Distance2ReturnTypeAsset, Distance2SubReturnTypeAsset, DistanceReturnTypeAsset, ImportedReturnTypeAsset

Also in this package: CellValueReturnTypeAsset, CurveReturnTypeAsset, DelimiterAsset, DensityReturnTypeAsset, Distance2AddReturnTypeAsset, Distance2DivReturnTypeAsset, Distance2MulReturnTypeAsset, Distance2ReturnTypeAsset, Distance2SubReturnTypeAsset, DistanceReturnTypeAsset, ImportedReturnTypeAsset

Complete API:
  public abstract ReturnType build(SeedBox var1, ReferenceBundle var2, WorkerIndexer.Id var3)
  public void cleanUp()
  public static boolean registerExportedNode(String name, ReturnTypeAsset node)
  public static ReturnTypeAsset getExportedAsset(String name)
  public String getId()

Fields:
private static final ReturnTypeAsset[] EMPTY_INPUTS
public static final AssetCodecMapCodec<String,ReturnTypeAsset> CODEC
private static final Map<String,ReturnTypeAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<ReturnTypeAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private String exportName
