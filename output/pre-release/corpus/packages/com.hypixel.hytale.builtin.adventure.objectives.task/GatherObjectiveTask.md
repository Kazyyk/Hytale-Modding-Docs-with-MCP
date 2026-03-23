# GatherObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: CountObjectiveTask | Implements: InventoryChangeAware

public class GatherObjectiveTask extends CountObjectiveTask implements InventoryChangeAware

Objective task that tracks item-gathering progress. Counts matching items across all participating players' inventories and marks the task as complete when the required count is reached. Implements `InventoryChangeAware` so `ObjectiveInventoryChangeSystem` can notify it of inventory changes in real time.

## Fields

- @Nonnull public static final BuilderCodec<GatherObjectiveTask> CODEC

## Constructors

- public GatherObjectiveTask(@Nonnull GatherObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected GatherObjectiveTask()

## Methods

- @Nonnull public GatherObjectiveTaskAsset getAsset()
- @Nullable @Override protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- @Override public void onInventoryChange(@Nonnull Objective objective, @Nonnull Ref<EntityStore> playerRef, @Nonnull Store<EntityStore> store, @Nonnull InventoryChangeEvent event)
- private int countObjectiveItemInInventories(@Nonnull Set<UUID> participatingPlayers, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- @Nonnull @Override public String toString()

## Behavior

- `setup0` counts matching items in all participating players' inventories at task creation time. If the required count is already met, the task completes immediately.
- `onInventoryChange` recounts items across active players' inventories and updates the task completion state via `setTaskCompletion`.
- `countObjectiveItemInInventories` iterates each player's combined hotbar-first inventory and counts stacks matching the asset's `BlockTagOrItemIdField`.

## Related Types

- CountObjectiveTask -- base class providing count tracking
- InventoryChangeAware -- the interface this task implements
- ObjectiveTask -- root task type

Also in this package: CountObjectiveTask, CraftObjectiveTask, InventoryChangeAware, ObjectiveTask, ObjectiveTaskRef, ReachLocationTask, TreasureMapObjectiveTask, UseBlockObjectiveTask, UseEntityObjectiveTask

Complete API:
  public GatherObjectiveTaskAsset getAsset()
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  public void onInventoryChange(Objective objective, Ref<EntityStore> playerRef, Store<EntityStore> store, InventoryChangeEvent event)
  private int countObjectiveItemInInventories(Set<UUID> participatingPlayers, ComponentAccessor<EntityStore> componentAccessor)
  public String toString()

Fields:
public static final BuilderCodec<GatherObjectiveTask> CODEC
