# TransactionUtil

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.transaction

public class TransactionUtil

Class in the transaction subsystem.

## Methods

- anyFailed(@Nullable TransactionRecord[] transactionRecords) | boolean | static public method.
- revertAll(@Nullable TransactionRecord[] transactionRecords) | void | static public method.
- completeAll(@Nullable TransactionRecord[] transactionRecords) | void | static public method.
- unloadAll(@Nullable TransactionRecord[] transactionRecords) | void | static public method.

Also in this package: RegistrationTransactionRecord, SpawnEntityTransactionRecord, SpawnTreasureChestTransactionRecord, TransactionRecord, TransactionStatus, UseEntityTransactionRecord, WorldTransactionRecord

Complete API:
  public static boolean anyFailed(TransactionRecord[] transactionRecords)
  public static void revertAll(TransactionRecord[] transactionRecords)
  public static void completeAll(TransactionRecord[] transactionRecords)
  public static void unloadAll(TransactionRecord[] transactionRecords)
