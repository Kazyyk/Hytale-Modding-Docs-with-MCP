# CountObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: ObjectiveTask

public abstract class CountObjectiveTask extends ObjectiveTask

## Fields

- public static final BuilderCodec<CountObjectiveTask> CODEC
- protected int count
- com.hypixel.hytale.protocol.ObjectiveTask packet

## Constructors

- public CountObjectiveTask(@Nonnull CountObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected CountObjectiveTask()

## Methods

- public CountObjectiveTaskAsset getAsset()
- public boolean checkCompletion()
- public void assetChanged(@Nonnull Objective objective)
- public void increaseTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, int qty, @Nonnull Objective objective)
- public void setTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, int qty, @Nonnull Objective objective)
- private void updateTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull Objective objective)
- public com.hypixel.hytale.protocol.ObjectiveTask toPacket(@Nonnull Objective objective)

## Related Types

- ObjectiveTask

Known subclasses: CraftObjectiveTask, GatherObjectiveTask, KillObjectiveTask, UseBlockObjectiveTask, UseEntityObjectiveTask

Also in this package: CraftObjectiveTask, GatherObjectiveTask, InventoryChangeAware, ObjectiveTask, ObjectiveTaskRef, ReachLocationTask, TreasureMapObjectiveTask, UseBlockObjectiveTask, UseEntityObjectiveTask

Complete API:
  public CountObjectiveTaskAsset getAsset()
  public boolean checkCompletion()
  public void assetChanged(Objective objective)
  public void increaseTaskCompletion(Store<EntityStore> store, Ref<EntityStore> ref, int qty, Objective objective)
  public void setTaskCompletion(Store<EntityStore> store, Ref<EntityStore> ref, int qty, Objective objective)
  private void updateTaskCompletion(Store<EntityStore> store, Ref<EntityStore> ref, Objective objective)
  public com.hypixel.hytale.protocol.ObjectiveTask toPacket(Objective objective)

Fields:
public static final BuilderCodec<CountObjectiveTask> CODEC
protected int count
