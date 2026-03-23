# CraftObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: CountObjectiveTask

public class CraftObjectiveTask extends CountObjectiveTask

## Fields

- public static final BuilderCodec<CraftObjectiveTask> CODEC
- String desiredItemId
- CraftingRecipe recipe
- boolean isOutput
- Ref<EntityStore> ref
- UUIDComponent uuidComponent

## Constructors

- public CraftObjectiveTask(@Nonnull CraftObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected CraftObjectiveTask()

## Methods

- public CraftObjectiveTaskAsset getAsset()
- protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public String toString()

## Related Types

- CountObjectiveTask
- ObjectiveTask

Also in this package: CountObjectiveTask, GatherObjectiveTask, ObjectiveTask, ObjectiveTaskRef, ReachLocationTask, TreasureMapObjectiveTask, UseBlockObjectiveTask, UseEntityObjectiveTask

Complete API:
  public CraftObjectiveTaskAsset getAsset()
  protected TransactionRecord[] setup0(Objective objective, World world, Store<EntityStore> store)
  public String toString()

Fields:
public static final BuilderCodec<CraftObjectiveTask> CODEC
