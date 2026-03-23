# SpawnEntityTransactionRecord

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.transaction | Extends: TransactionRecord

public class SpawnEntityTransactionRecord extends TransactionRecord

Concrete implementation extending `TransactionRecord`.

## Fields

- worldUUID | UUID | UUID field.
- entityUUID | UUID | UUID field.

## Constructors

- SpawnEntityTransactionRecord(@Nonnull UUID worldUUID, @Nonnull UUID entityUUID) | Creates a new SpawnEntityTransactionRecord instance.
- SpawnEntityTransactionRecord() | Creates a new SpawnEntityTransactionRecord instance.

## Methods

- revert() | void | public method.
- complete() | void | public method.
- unload() | void | public method.
- shouldBeSerialized() | boolean | public method.
- removeEntity() | void | private method.
- toString() | String | public method.
