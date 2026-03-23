# FieldFunctionAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assignments | Extends: Assignments

public class FieldFunctionAssignments extends Assignments

Runtime assignment that selects block types by evaluating a field function and comparing against delimiter thresholds.

Also in this package: Assignments, ConstantAssignments, FieldDelimiter, SandwichAssignments, VerticalDelimiter, WeightedAssignments

Complete API:
  public Prop propAt(Vector3d position, WorkerIndexer.Id id, double distanceFromBiomeEdge)
  public List<Prop> getAllPossibleProps()

Fields:
private final Density density
private final List<FieldFunctionAssignments.FieldDelimiter> delimiters
private final Density.Context rDensityContext
