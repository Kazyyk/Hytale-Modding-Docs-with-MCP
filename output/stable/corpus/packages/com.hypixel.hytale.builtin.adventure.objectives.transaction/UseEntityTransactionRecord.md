# UseEntityTransactionRecord

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.transaction | Extends: TransactionRecord

public class UseEntityTransactionRecord extends TransactionRecord

Concrete implementation extending `TransactionRecord`.

## Fields

- objectiveUUID | UUID | UUID field.
- taskId | String | String field.

## Constructors

- UseEntityTransactionRecord(UUID objectiveUUID, String taskId) | Creates a new UseEntityTransactionRecord instance.

## Methods

- revert() | void | public method.
- complete() | void | public method.
- unload() | void | public method.
- shouldBeSerialized() | boolean | public method.
- toString() | String | public method.
