# WeightedAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: Assignments

public class WeightedAssignments extends Assignments

Concrete implementation extending `Assignments`.

## Fields

- weightedDistributions | WeightedMap<Assignments> | final WeightedMap<Assignments> field.
- seedGenerator | SeedGenerator | final SeedGenerator field.
- runtime | int | final int field.
- noneProbability | double | final double field.

## Constructors

- WeightedAssignments(@Nonnull WeightedMap<Assignments> props, int seed, double noneProbability, int runtime) | Creates a new WeightedAssignments instance.

## Methods

- propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge) | Prop | public method.
- getRuntime() | int | public method.
- getAllPossibleProps() | List<Prop> | public method.

Also in this package: Assignments, ConstantAssignments, FieldDelimiter, FieldFunctionAssignments, SandwichAssignments, VerticalDelimiter

Complete API:
  public Prop propAt(Vector3d position, WorkerIndexer.Id id, double distanceTOBiomeEdge)
  public int getRuntime()
  public List<Prop> getAllPossibleProps()

Fields:
private final WeightedMap<Assignments> weightedDistributions
private final SeedGenerator seedGenerator
private final int runtime
private final double noneProbability
