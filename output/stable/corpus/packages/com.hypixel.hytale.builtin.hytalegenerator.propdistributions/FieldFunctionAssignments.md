# FieldFunctionAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: Assignments

public class FieldFunctionAssignments extends Assignments

Concrete implementation extending `Assignments`.

## Fields

- density | Density | final Density field.
- fieldDelimiters | List<FieldFunctionAssignments.FieldDelimiter> | final List<FieldFunctionAssignments.FieldDelimiter> field.
- runtime | int | final int field.

## Constructors

- FieldFunctionAssignments(@Nonnull Density functionTree, @Nonnull List<FieldFunctionAssignments.FieldDelimiter> fieldDelimiters, int runtime) | Creates a new FieldFunctionAssignments instance.

## Methods

- propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge) | Prop | public method.
- getRuntime() | int | public method.
- getAllPossibleProps() | List<Prop> | public method.
