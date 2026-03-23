# DelimiterAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.assignments | Implements: Cleanable, JsonAssetWithMap>

public static class DelimiterAsset implements Cleanable, JsonAssetWithMap>

Defines a threshold delimiter within a `FieldFunctionAssignmentsAsset`. Specifies the block assignment and the field value boundary.

Also in this package: Argument, AssignmentsAsset, ConstantAssignmentsAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets, WeightedAssignmentsAsset

Complete API:
  public String getId()
  public void cleanUp()

Fields:
public static final AssetBuilderCodec<String,FieldFunctionAssignmentsAsset.DelimiterAsset> CODEC
private String id
private AssetExtraInfo.Data data
private double min
private double max
private AssignmentsAsset assignmentsAsset
