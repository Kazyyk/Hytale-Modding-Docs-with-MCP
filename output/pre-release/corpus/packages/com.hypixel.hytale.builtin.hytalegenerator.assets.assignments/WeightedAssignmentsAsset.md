# WeightedAssignmentsAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.assignments | Extends: AssignmentsAsset

public class WeightedAssignmentsAsset extends AssignmentsAsset

Assignment asset that selects from weighted block type options. Produces `WeightedAssignments` at runtime for randomized block selection.

Also in this package: Argument, AssignmentsAsset, ConstantAssignmentsAsset, DelimiterAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets

Complete API:
  public Assignments build(AssignmentsAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WeightedAssignmentsAsset> CODEC
private WeightedAssignmentsAsset.WeightedAssets[] weightedAssets
private String seed
private double skipChance
