# SpawnTreasureChestTransactionRecord

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.transaction | Extends: TransactionRecord

public class SpawnTreasureChestTransactionRecord extends TransactionRecord

Concrete implementation extending `TransactionRecord`.

## Fields

- worldUUID | UUID | UUID field.
- blockPosition | Vector3i | Vector3i field.

## Constructors

- SpawnTreasureChestTransactionRecord(UUID worldUUID, Vector3i blockPosition) | Creates a new SpawnTreasureChestTransactionRecord instance.
- SpawnTreasureChestTransactionRecord() | Creates a new SpawnTreasureChestTransactionRecord instance.

## Methods

- revert() | void | public method.
- complete() | void | public method.
- unload() | void | public method.
- shouldBeSerialized() | boolean | public method.
- toString() | String | public method.

Also in this package: RegistrationTransactionRecord, SpawnEntityTransactionRecord, TransactionRecord, TransactionStatus, TransactionUtil, UseEntityTransactionRecord, WorldTransactionRecord

Complete API:
  public void revert()
  public void complete()
  public void unload()
  public boolean shouldBeSerialized()
  public String toString()

Fields:
public static final BuilderCodec<SpawnTreasureChestTransactionRecord> CODEC
protected UUID worldUUID
protected Vector3i blockPosition
