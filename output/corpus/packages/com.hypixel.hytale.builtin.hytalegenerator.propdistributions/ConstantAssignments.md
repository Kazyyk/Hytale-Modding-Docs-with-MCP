# ConstantAssignments

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.propdistributions | Extends: Assignments

public class ConstantAssignments extends Assignments

Concrete implementation extending `Assignments`.

## Fields

- prop | Prop | final Prop field.
- runtime | int | final int field.

## Constructors

- ConstantAssignments(@Nonnull Prop prop, int runtime) | Creates a new ConstantAssignments instance.

## Methods

- propAt(@Nonnull Vector3d position, @Nonnull WorkerIndexer.Id id, double distanceTOBiomeEdge) | Prop | public method.
- getRuntime() | int | public method.
- getAllPossibleProps() | List<Prop> | public method.
