# ObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: null

public abstract class ObjectiveTaskAsset

## Fields

- public static final CodecMapCodec<ObjectiveTaskAsset> CODEC
- public static final BuilderCodec<ObjectiveTaskAsset> BASE_CODEC
- public static final String TASK_DESCRIPTION_KEY
- protected String descriptionId
- protected TaskConditionAsset[] taskConditions
- protected Vector3i[] mapMarkers
- private String defaultDescriptionId
- PLAYER, 
- MARKER, PLAYER_AND_MARKER 

## Constructors

- public ObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers)
- protected ObjectiveTaskAsset()

## Methods

- public String getDescriptionId()
- public String getDescriptionKey(String objectiveId, int taskSetIndex, int taskIndex)
- public TaskConditionAsset[] getTaskConditions()
- public Vector3i[] getMapMarkers()
- public abstract ObjectiveTaskAsset.TaskScope getTaskScope()
- public boolean matchesAsset(@Nonnull ObjectiveTaskAsset task)
- protected abstract boolean matchesAsset0(ObjectiveTaskAsset var1)
- public String toString()
- public boolean isTaskPossibleForMarker()
- public boolean isTaskPossibleForPlayer()

## Inner Types

- `ObjectiveTaskAsset.TaskScope`

Known subclasses: BountyObjectiveTaskAsset, CountObjectiveTaskAsset, ReachLocationTaskAsset, TreasureMapObjectiveTaskAsset

Also in this package: BlockTagOrItemIdField, ChestConfig, CountObjectiveTaskAsset, CraftObjectiveTaskAsset, DialogOptions, GatherObjectiveTaskAsset, ReachLocationTaskAsset, TaskScope, TaskSet, TreasureMapObjectiveTaskAsset, UseBlockObjectiveTaskAsset, UseEntityObjectiveTaskAsset

Complete API:
  public String getDescriptionId()
  public String getDescriptionKey(String objectiveId, int taskSetIndex, int taskIndex)
  public TaskConditionAsset[] getTaskConditions()
  public Vector3i[] getMapMarkers()
  public abstract ObjectiveTaskAsset.TaskScope getTaskScope()
  public boolean matchesAsset(ObjectiveTaskAsset task)
  protected abstract boolean matchesAsset0(ObjectiveTaskAsset var1)
  public String toString()

Fields:
public static final CodecMapCodec<ObjectiveTaskAsset> CODEC
public static final BuilderCodec<ObjectiveTaskAsset> BASE_CODEC
public static final String TASK_DESCRIPTION_KEY
protected String descriptionId
protected TaskConditionAsset[] taskConditions
protected Vector3i[] mapMarkers
private String defaultDescriptionId
