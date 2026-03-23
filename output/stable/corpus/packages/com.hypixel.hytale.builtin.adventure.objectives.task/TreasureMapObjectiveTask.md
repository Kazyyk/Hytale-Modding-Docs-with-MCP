# TreasureMapObjectiveTask

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.task | Extends: ObjectiveTask

public class TreasureMapObjectiveTask extends ObjectiveTask

## Fields

- public static final BuilderCodec<TreasureMapObjectiveTask> CODEC
- public static final int CHEST_SPAWN_TRY
- private int currentCompletion
- private int chestCount
- private final List<UUID> chestUUIDs
- TransactionRecord[] transactionRecords
- TreasureMapObjectiveTaskAsset.ChestConfig[] chestConfigs
- UUID chestUUID
- String chestMarkerID
- Ref<EntityStore> playerRef
- Store<EntityStore> store
- Vector3i conditionPosition
- SpawnTreasureChestTransactionRecord transactionRecord
- TreasureChestState treasureChestState
- List<ItemStack> stacks
- ObjectiveTaskMarker marker
- long chunkIndex
- WorldChunk worldChunk
- BlockState blockState
- int currentTry
- double angle
- float radius
- Vector3d objectivePosition
- Vector3d position
- com.hypixel.hytale.protocol.ObjectiveTask packet

## Constructors

- public TreasureMapObjectiveTask(@Nonnull TreasureMapObjectiveTaskAsset asset, int taskSetIndex, int taskIndex)
- protected TreasureMapObjectiveTask()

## Methods

- public TreasureMapObjectiveTaskAsset getAsset()
- public String getChestMarkerIDFromUUID(@Nonnull UUID uuid)
- protected TransactionRecord[] setup0(@Nonnull Objective objective, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public boolean checkCompletion()
- private void onTreasureChestOpeningEvent(@Nonnull Objective objective, @Nonnull TreasureChestOpeningEvent event)
- private TransactionRecord spawnChest(@Nonnull Objective objective,
        @Nonnull World world,
        @Nonnull TreasureMapObjectiveTaskAsset.ChestConfig chestConfig,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `` | `new` | `Transform(conditionPosition)` |
| `private` | `TreasureChestState` | `spawnChestBlock(@Nonnull World world, @Nonnull Vector3i conditionPosition, String chestBlockTypeKey, @Nonnull SpawnTreasureChestTransactionRecord transactionRecord)` |
| `private` | `Vector3i` | `calculateChestSpawnPosition(@Nonnull TreasureMapObjectiveTaskAsset.ChestConfig chestConfig,
        @Nonnull Objective objective,
        @Nonnull World world,
        @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `com.hypixel.hytale.protocol.ObjectiveTask` | `toPacket(@Nonnull Objective objective)` |
| `public` | `String` | `toString()` |

## Related Types

- ObjectiveTask
