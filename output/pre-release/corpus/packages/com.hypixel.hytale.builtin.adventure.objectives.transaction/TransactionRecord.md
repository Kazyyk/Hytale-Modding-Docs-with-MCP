# TransactionRecord

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.transaction

public abstract class TransactionRecord

Class in the transaction subsystem.

## Fields

- status | TransactionStatus | TransactionStatus field.
- reason | String | String field.

## Methods

- getStatus() | TransactionStatus | public method.
- revert() | void | public method.
- complete() | void | public method.
- unload() | void | public method.
- shouldBeSerialized() | boolean | public method.
- fail(String reason) | TransactionRecord | public method.
- toString() | String | public method.
- appendTransaction(@Nullable TransactionRecord[] transactions, @Nonnull T transaction) | TransactionRecord[] | static public method.
