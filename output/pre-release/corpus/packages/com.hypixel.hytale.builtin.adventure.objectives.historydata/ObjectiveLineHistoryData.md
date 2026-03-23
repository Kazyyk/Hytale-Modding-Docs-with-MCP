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

Also in this package: CommonObjectiveHistoryData, ItemObjectiveRewardHistoryData, ObjectiveHistoryData, ObjectiveRewardHistoryData

Complete API:
  public ObjectiveHistoryData[] getObjectiveHistoryDataArray()
  public String[] getNextObjectiveLineIds()
  public void addObjectiveHistoryData(ObjectiveHistoryData objectiveHistoryData)
  public Map<UUID,ObjectiveLineHistoryData> cloneForPlayers(Set<UUID> playerUUIDs)
  public void completed(UUID playerUUID, ObjectiveLineHistoryData objectiveLineHistoryData)
  public String toString()

Fields:
public static final BuilderCodec<ObjectiveLineHistoryData> CODEC
private ObjectiveHistoryData[] objectiveHistoryDataArray
private String[] nextObjectiveLineIds
