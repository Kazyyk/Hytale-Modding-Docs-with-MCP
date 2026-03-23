# CommonObjectiveHistoryData

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.historydata

public abstract class CommonObjectiveHistoryData

Class in the historydata subsystem.

## Fields

- id | String | String field.
- timesCompleted | int | int field.
- lastCompletionTimestamp | Instant | Instant field.
- category | String | String field.

## Constructors

- CommonObjectiveHistoryData(String id, String category) | Creates a new CommonObjectiveHistoryData instance.
- CommonObjectiveHistoryData() | Creates a new CommonObjectiveHistoryData instance.

## Methods

- getId() | String | public method.
- getTimesCompleted() | int | public method.
- getLastCompletionTimestamp() | Instant | public method.
- getCategory() | String | public method.
- completed() | void | protected method.
- toString() | String | public method.

Known subclasses: ObjectiveHistoryData, ObjectiveLineHistoryData

Also in this package: ItemObjectiveRewardHistoryData, ObjectiveHistoryData, ObjectiveLineHistoryData, ObjectiveRewardHistoryData

Complete API:
  public String getId()
  public int getTimesCompleted()
  public Instant getLastCompletionTimestamp()
  public String getCategory()
  protected void completed()
  public String toString()

Fields:
public static final CodecMapCodec<CommonObjectiveHistoryData> CODEC
public static final BuilderCodec<CommonObjectiveHistoryData> BASE_CODEC
protected String id
protected int timesCompleted
protected Instant lastCompletionTimestamp
protected String category
