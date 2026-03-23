# ObjectiveHistoryData

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.historydata | Extends: CommonObjectiveHistoryData

public final class ObjectiveHistoryData extends CommonObjectiveHistoryData

Concrete implementation extending `CommonObjectiveHistoryData`.

## Fields

- rewards | ObjectiveRewardHistoryData[] | ObjectiveRewardHistoryData[] field.

## Constructors

- ObjectiveHistoryData(String id, String category) | Creates a new ObjectiveHistoryData instance.
- ObjectiveHistoryData(String id, String category, ObjectiveRewardHistoryData[] rewards) | Creates a new ObjectiveHistoryData instance.
- ObjectiveHistoryData() | Creates a new ObjectiveHistoryData instance.

## Methods

- getRewards() | ObjectiveRewardHistoryData[] | public method.
- addRewardForPlayerUUID(UUID playerUUID, ObjectiveRewardHistoryData objectiveRewardHistoryData) | void | public method.
- cloneForPlayer(UUID playerUUID) | ObjectiveHistoryData | public method.
- completed(UUID playerUUID, @Nonnull ObjectiveHistoryData objectiveHistoryData) | void | public method.
- toString() | String | public method.
