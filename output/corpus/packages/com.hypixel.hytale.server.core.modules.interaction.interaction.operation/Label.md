# Label

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.operation

public class Label

Represents a named position (index) within an operation sequence built by OperationsBuilder. Used by jump operations to implement branching control flow in interaction pipelines.

## Fields

- index | int | The position index in the operation array. Set to `Integer.MIN_VALUE` when unresolved.

## Methods

- getIndex() | int | Returns the label's index position.
- toString() | String | Returns a debug string representation.
