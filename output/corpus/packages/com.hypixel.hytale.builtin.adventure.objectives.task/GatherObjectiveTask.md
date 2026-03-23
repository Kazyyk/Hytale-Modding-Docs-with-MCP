# GatherObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: CountObjectiveTask

public class GatherObjectiveTask extends CountObjectiveTask

## Fields

- public static final BuilderCodec<GatherObjectiveTask> CODEC
- Set<UUID> participatingPlayers
- int countItem
- LivingEntity livingEntity
- Ref<EntityStore> ref
- World refWorld
- UUIDComponent uuidComponent
- Set<UUID> activePlayerUUIDs
- int count
- BlockTagOrItemIdField blockTypeOrSet
- PlayerRef playerRefComponent
- Ref<EntityStore> playerRef
- Player playerComponent
- CombinedItemContainer inventory

## Constructors

- public GatherObjectiveTask(@Nonnull GatherObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected GatherObjectiveTask()

## Methods

- public GatherObjectiveTaskAsset getAsset()
- protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- private int countObjectiveItemInInventories(@Nonnull Set<UUID> participatingPlayers, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public String toString()

## Related Types

- CountObjectiveTask
- ObjectiveTask
