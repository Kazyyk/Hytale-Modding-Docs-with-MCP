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

Known subclasses: KillTaskTransaction, RegistrationTransactionRecord, SpawnEntityTransactionRecord, SpawnTreasureChestTransactionRecord, UseEntityTransactionRecord, WorldTransactionRecord

Also in this package: RegistrationTransactionRecord, SpawnEntityTransactionRecord, SpawnTreasureChestTransactionRecord, TransactionStatus, TransactionUtil, UseEntityTransactionRecord, WorldTransactionRecord

Complete API:
  public TransactionStatus getStatus()
  public abstract void revert()
  public abstract void complete()
  public abstract void unload()
  public abstract boolean shouldBeSerialized()
  public TransactionRecord fail(String reason)
  public String toString()
  public static TransactionRecord[] appendTransaction(TransactionRecord[] transactions, T transaction)
  public static TransactionRecord[] appendFailedTransaction(TransactionRecord[] transactions, T transaction, String reason)

Fields:
public static final CodecMapCodec<TransactionRecord> CODEC
public static final BuilderCodec<TransactionRecord> BASE_CODEC
protected TransactionStatus status
private String reason
