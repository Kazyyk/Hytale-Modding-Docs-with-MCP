# AssignmentsAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.assignments | Implements: Cleanable, JsonAssetWithMap>

public abstract class AssignmentsAsset implements Cleanable, JsonAssetWithMap>

Abstract base asset class for world generator block assignments. Defines the codec dispatch hierarchy for all assignment types (constant, field function, imported, sandwich, weighted).

Known subclasses: ConstantAssignmentsAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssignmentsAsset

Also in this package: Argument, ConstantAssignmentsAsset, DelimiterAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets, WeightedAssignmentsAsset

Complete API:
  public abstract Assignments build(AssignmentsAsset.Argument var1)
  public boolean skip()
  public static AssignmentsAsset getExportedAsset(String name)
  public String getId()
  public void cleanUp()

Fields:
public static final AssetCodecMapCodec<String,AssignmentsAsset> CODEC
private static final Map<String,AssignmentsAsset> exportedNodes
public static final Codec<String> CHILD_ASSET_CODEC
public static final Codec<String[]> CHILD_ASSET_CODEC_ARRAY
public static final BuilderCodec<AssignmentsAsset> ABSTRACT_CODEC
private String id
private AssetExtraInfo.Data data
private boolean skip
private String exportName
