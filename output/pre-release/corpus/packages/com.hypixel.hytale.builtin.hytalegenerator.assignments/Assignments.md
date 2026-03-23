# Assignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.assignments

public abstract class Assignments

Abstract base class for runtime block assignment evaluators in the world generator. Subclasses determine how block types are assigned to voxel positions during terrain generation.

Known subclasses: ConstantAssignments, FieldFunctionAssignments, SandwichAssignments, WeightedAssignments

Also in this package: ConstantAssignments, FieldDelimiter, FieldFunctionAssignments, SandwichAssignments, VerticalDelimiter, WeightedAssignments

Complete API:
  public abstract Prop propAt(Vector3d var1, WorkerIndexer.Id var2, double var3)
  public abstract List<Prop> getAllPossibleProps()
  public static Assignments noPropDistribution()
