# UseEntityObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: CountObjectiveTask

public class UseEntityObjectiveTask extends CountObjectiveTask

## Fields

- public static final BuilderCodec<UseEntityObjectiveTask> CODEC
- private static final Message MESSAGE_SERVER_MODULES_OBJECTIVE_TASK_ALREADY_INTERACTED_WITH_NPC
- protected Set<UUID> npcUUIDs
- UUID objectiveUUID
- ObjectiveDataStore objectiveDataStore
- String taskId
- UseEntityObjectiveTaskAsset.DialogOptions dialogOptions
- Player playerComponent

## Constructors

- public UseEntityObjectiveTask(@Nonnull UseEntityObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected UseEntityObjectiveTask()

## Methods

- public UseEntityObjectiveTaskAsset getAsset()
- protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public boolean increaseTaskCompletion(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, int qty, @Nonnull Objective objective, @Nonnull PlayerRef playerRef, UUID npcUUID)
- public String toString()

## Related Types

- CountObjectiveTask
- ObjectiveTask

Also in this package: CountObjectiveTask, CraftObjectiveTask, GatherObjectiveTask, InventoryChangeAware, ObjectiveTask, ObjectiveTaskRef, ReachLocationTask, TreasureMapObjectiveTask, UseBlockObjectiveTask

Complete API:
  public UseEntityObjectiveTaskAsset getAsset()
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  public boolean increaseTaskCompletion(Store<EntityStore> store, Ref<EntityStore> ref, int qty, Objective objective, PlayerRef playerRef, UUID npcUUID)
  public String toString()

Fields:
public static final BuilderCodec<UseEntityObjectiveTask> CODEC
private static final Message MESSAGE_SERVER_MODULES_OBJECTIVE_TASK_ALREADY_INTERACTED_WITH_NPC
protected Set<UUID> npcUUIDs
