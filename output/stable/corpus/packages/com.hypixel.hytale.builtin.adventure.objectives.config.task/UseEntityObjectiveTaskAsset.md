# UseEntityObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: CountObjectiveTaskAsset

public class UseEntityObjectiveTaskAsset extends CountObjectiveTaskAsset

## Fields

- public static final BuilderCodec<UseEntityObjectiveTaskAsset> CODEC
- protected String taskId
- protected String animationIdToPlay
- protected UseEntityObjectiveTaskAsset.DialogOptions dialogOptions
- public static BuilderCodec<UseEntityObjectiveTaskAsset.DialogOptions> CODEC
- protected String entityNameKey
- protected String dialogKey
- UseEntityObjectiveTaskAsset.DialogOptions that
- int result

## Constructors

- public UseEntityObjectiveTaskAsset(String descriptionId,
        TaskConditionAsset[] taskConditions,
        Vector3i[] mapMarkers,
        int count,
        String taskId,
        String animationIdToPlay,
        UseEntityObjectiveTaskAsset.DialogOptions dialogOptions)` |
| `protected` | `UseEntityObjectiveTaskAsset()` |

## Methods

- public ObjectiveTaskAsset.TaskScope getTaskScope()
- public String getTaskId()
- public String getAnimationIdToPlay()
- public UseEntityObjectiveTaskAsset.DialogOptions getDialogOptions()
- protected boolean matchesAsset0(ObjectiveTaskAsset task)
- public String toString()
- public DialogOptions(String entityNameKey, String dialogKey)
- protected DialogOptions()
- public String getEntityNameKey()
- public String getDialogKey()
- public boolean equals(@Nullable Object o)
- public int hashCode()
- public String toString()

## Inner Types

- `UseEntityObjectiveTaskAsset.DialogOptions`

## Related Types

- CountObjectiveTaskAsset
- ObjectiveTaskAsset

Also in this package: BlockTagOrItemIdField, ChestConfig, CountObjectiveTaskAsset, CraftObjectiveTaskAsset, DialogOptions, GatherObjectiveTaskAsset, ObjectiveTaskAsset, ReachLocationTaskAsset, TaskScope, TaskSet, TreasureMapObjectiveTaskAsset, UseBlockObjectiveTaskAsset

Complete API:
  public ObjectiveTaskAsset.TaskScope getTaskScope()
  public String getTaskId()
  public String getAnimationIdToPlay()
  public UseEntityObjectiveTaskAsset.DialogOptions getDialogOptions()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<UseEntityObjectiveTaskAsset> CODEC
protected String taskId
protected String animationIdToPlay
protected UseEntityObjectiveTaskAsset.DialogOptions dialogOptions
