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
