# RegistrationTransactionRecord

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.transaction | Extends: TransactionRecord

public class RegistrationTransactionRecord extends TransactionRecord

Concrete implementation extending `TransactionRecord`.

## Fields

- registration | BooleanConsumer | BooleanConsumer field.

## Constructors

- RegistrationTransactionRecord(BooleanConsumer registration) | Creates a new RegistrationTransactionRecord instance.

## Methods

- revert() | void | public method.
- complete() | void | public method.
- unload() | void | public method.
- shouldBeSerialized() | boolean | public method.
- toString() | String | public method.
- wrap(@Nonnull EventRegistry registry) | TransactionRecord[] | static public method.
- append(@Nonnull TransactionRecord[] arr, @Nonnull EventRegistry registry) | TransactionRecord[] | static public method.
