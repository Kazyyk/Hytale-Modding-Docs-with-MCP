# ConstantAssignmentsAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.assignments | Extends: AssignmentsAsset

public class ConstantAssignmentsAsset extends AssignmentsAsset

Assignment asset that always resolves to the same block type. Produces `ConstantAssignments` at runtime.

Also in this package: Argument, AssignmentsAsset, DelimiterAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets, WeightedAssignmentsAsset

Complete API:
  public Assignments build(AssignmentsAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<ConstantAssignmentsAsset> CODEC
private PropAsset propAsset
