# WeightedAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assignments | Extends: Assignments

public class WeightedAssignments extends Assignments

Runtime assignment that randomly selects block types from a weighted set.

Also in this package: Assignments, ConstantAssignments, FieldDelimiter, FieldFunctionAssignments, SandwichAssignments, VerticalDelimiter

Complete API:
  public Prop propAt(Vector3d position, WorkerIndexer.Id id, double distanceTOBiomeEdge)
  public List<Prop> getAllPossibleProps()

Fields:
private final WeightedMap<Assignments> weightedDistributions
private final RngField rngField
private final double noneProbability
private final FastRandom rRandom
