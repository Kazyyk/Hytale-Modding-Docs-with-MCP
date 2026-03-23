# WeightedAssignmentsAsset

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assets.propassignments | Extends: AssignmentsAsset

public class WeightedAssignmentsAsset extends AssignmentsAsset

## Fields

- private WeightedAssignmentsAsset.WeightedAssets[] weightedAssets
- private String seed
- private double skipChance
- private String id
- private AssetExtraInfo.Data data
- private double weight
- private AssignmentsAsset assignmentsAsset

## Methods

- @Override @Nonnull public Assignments build(@Nonnull AssignmentsAsset.Argument argument)
- @Override public void cleanUp()
- public String getId()

## Inner Types

- `WeightedAssignmentsAsset.WeightedAssets`

Also in this package: Argument, AssignmentsAsset, ConstantAssignmentsAsset, DelimiterAsset, DelimiterAsset, FieldFunctionAssignmentsAsset, ImportedAssignmentsAsset, SandwichAssignmentsAsset, WeightedAssets

Complete API:
  public Assignments build(AssignmentsAsset.Argument argument)
  public void cleanUp()

Fields:
public static final BuilderCodec<WeightedAssignmentsAsset> CODEC
private WeightedAssignmentsAsset.WeightedAssets[] weightedAssets
private String seed
private double skipChance
