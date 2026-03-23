# SandwichAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: Assignments

public class SandwichAssignments extends Assignments

Concrete implementation extending `Assignments`.

## Fields

- verticalDelimiters | List<SandwichAssignments.VerticalDelimiter> | final List<SandwichAssignments.VerticalDelimiter> field.
- runtime | int | final int field.

## Constructors

- SandwichAssignments(@Nonnull List<SandwichAssignments.VerticalDelimiter> verticalDelimiters, int runtime) | Creates a new SandwichAssignments instance.

## Methods

- propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge) | Prop | public method.
- getRuntime() | int | public method.
- getAllPossibleProps() | List<Prop> | public method.

Also in this package: Assignments, ConstantAssignments, FieldDelimiter, FieldFunctionAssignments, VerticalDelimiter, WeightedAssignments

Complete API:
  public Prop propAt(Vector3d position, WorkerIndexer.Id id, double distanceTOBiomeEdge)
  public int getRuntime()
  public List<Prop> getAllPossibleProps()

Fields:
private final List<SandwichAssignments.VerticalDelimiter> verticalDelimiters
private final int runtime
