# ObjectiveLineHistoryData

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.historydata | Extends: CommonObjectiveHistoryData

public final class ObjectiveLineHistoryData extends CommonObjectiveHistoryData

Concrete implementation extending `CommonObjectiveHistoryData`.

## Fields

- objectiveHistoryDataArray | ObjectiveHistoryData[] | ObjectiveHistoryData[] field.
- nextObjectiveLineIds | String[] | String[] field.

## Constructors

- ObjectiveLineHistoryData(String id, String category, String[] nextObjectiveLineIds) | Creates a new ObjectiveLineHistoryData instance.
- ObjectiveLineHistoryData() | Creates a new ObjectiveLineHistoryData instance.

## Methods

- getObjectiveHistoryDataArray() | ObjectiveHistoryData[] | public method.
- getNextObjectiveLineIds() | String[] | public method.
- addObjectiveHistoryData(@Nonnull ObjectiveHistoryData objectiveHistoryData) | void | public method.
- cloneForPlayers(@Nonnull Set<UUID> playerUUIDs) | Map<UUID, ObjectiveLineHistoryData> | public method.
- completed(UUID playerUUID, @Nonnull ObjectiveLineHistoryData objectiveLineHistoryData) | void | public method.
- toString() | String | public method.
