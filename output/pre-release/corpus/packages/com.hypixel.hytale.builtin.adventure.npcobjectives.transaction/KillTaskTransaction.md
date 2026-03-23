# KillTaskTransaction

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.transaction | Extends: TransactionRecord

public class KillTaskTransaction extends TransactionRecord

Utility type in the `transaction` subsystem.

## Accessors

- getTask() | KillTask | Accessor method.
- getObjective() | Objective | Accessor method.

## Methods

- revert() | void | Instance method.
- complete() | void | Instance method.
- unload() | void | Instance method.
- shouldBeSerialized() | boolean | Instance method.

Complete API:
  public void revert()
  public void complete()
  public void unload()
  public KillTask getTask()
  public Objective getObjective()
  public boolean shouldBeSerialized()

Fields:
private final KillTask task
private final Objective objective
private final ComponentAccessor<EntityStore> componentAccessor
