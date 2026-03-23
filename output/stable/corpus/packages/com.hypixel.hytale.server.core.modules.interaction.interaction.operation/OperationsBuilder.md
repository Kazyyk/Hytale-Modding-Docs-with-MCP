# OperationsBuilder

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.operation

public class OperationsBuilder

Builder for constructing ordered sequences of interaction operations. Supports label-based jump targets for branching control flow within an interaction. Labels can be resolved immediately or deferred (unresolved) and resolved later before building.

## Methods

- createLabel() | Label | Creates a label pointing to the current position in the operation list.
- createUnresolvedLabel() | Label | Creates an unresolved label (index `Integer.MIN_VALUE`) to be resolved later.
- resolveLabel(@Nonnull Label label) | void | Resolves a previously unresolved label to the current position. Throws `IllegalArgumentException` if already resolved.
- jump(@Nonnull Label target) | void | Appends a `JumpOperation` that redirects execution to the given label.
- addOperation(@Nonnull Operation operation) | void | Appends an operation to the sequence.
- addOperation(@Nonnull Operation operation, Label... labels) | void | Appends an operation wrapped with associated labels.
- build() | Operation[] | Builds and returns the finalized operation array.

Also in this package: JumpOperation, Label, LabelOperation, NestedOperation, Operation

Complete API:
  public Label createLabel()
  public Label createUnresolvedLabel()
  public void resolveLabel(Label label)
  public void jump(Label target)
  public void addOperation(Operation operation)
  public void addOperation(Operation operation, Label labels)
  public Operation[] build()

Fields:
private final List<Operation> operationList
