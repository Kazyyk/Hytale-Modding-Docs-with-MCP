# FieldFunctionAssignmentsAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.assignments | Extends: AssignmentsAsset

public class FieldFunctionAssignmentsAsset extends AssignmentsAsset

Assignment asset that selects block types based on field function evaluation with delimiters. Produces `FieldFunctionAssignments` at runtime.

Also in this package: Argument, AssignmentsAsset, ConstantAssignmentsAsset, DelimiterAsset, DelimiterAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets, WeightedAssignmentsAsset

Complete API:
  public Assignments build(AssignmentsAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<FieldFunctionAssignmentsAsset> CODEC
private FieldFunctionAssignmentsAsset.DelimiterAsset[] delimiterAssets
private DensityAsset densityAsset
