# UseBlockObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: CountObjectiveTask

public class UseBlockObjectiveTask extends CountObjectiveTask

## Fields

- public static final BuilderCodec<UseBlockObjectiveTask> CODEC
- BlockType blockType
- String baseItem
- Ref<EntityStore> entityRef
- Store<EntityStore> entityStore
- Player playerComponent
- UUIDComponent uuidComponent

## Constructors

- public UseBlockObjectiveTask(@Nonnull UseBlockObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected UseBlockObjectiveTask()

## Methods

- public UseBlockObjectiveTaskAsset getAsset()
- protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public String toString()

## Related Types

- CountObjectiveTask
- ObjectiveTask
