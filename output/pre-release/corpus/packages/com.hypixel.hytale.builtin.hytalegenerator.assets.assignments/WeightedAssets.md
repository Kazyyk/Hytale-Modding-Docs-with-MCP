# WeightedAssets

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.assignments | Implements: Cleanable, JsonAssetWithMap>

public static class WeightedAssets implements Cleanable, JsonAssetWithMap>

Inner class of `WeightedAssignmentsAsset` pairing an `AssignmentsAsset` with a numeric weight for weighted random selection.

Also in this package: Argument, AssignmentsAsset, ConstantAssignmentsAsset, DelimiterAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssignmentsAsset

Complete API:
  public String getId()
  public void cleanUp()

Fields:
public static final AssetBuilderCodec<String,WeightedAssignmentsAsset.WeightedAssets> CODEC
private String id
private AssetExtraInfo.Data data
private double weight
private AssignmentsAsset assignmentsAsset
