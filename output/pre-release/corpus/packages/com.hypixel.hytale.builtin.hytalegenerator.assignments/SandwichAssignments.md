# SandwichAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assignments | Extends: Assignments

public class SandwichAssignments extends Assignments

Runtime assignment that layers block types vertically based on delimiter thresholds for stratified terrain.

Also in this package: Assignments, ConstantAssignments, FieldDelimiter, FieldFunctionAssignments, VerticalDelimiter, WeightedAssignments

Complete API:
  public Prop propAt(Vector3d position, WorkerIndexer.Id id, double distanceTOBiomeEdge)
  public List<Prop> getAllPossibleProps()

Fields:
private final List<SandwichAssignments.VerticalDelimiter> delimiters
