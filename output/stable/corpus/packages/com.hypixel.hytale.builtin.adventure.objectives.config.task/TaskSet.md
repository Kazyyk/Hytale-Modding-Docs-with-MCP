# TaskSet

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: null

public class TaskSet

## Fields

- public static final BuilderCodec<TaskSet> CODEC
- public static final String TASKSET_DESCRIPTION_KEY
- protected String descriptionId
- protected ObjectiveTaskAsset[] tasks

## Constructors

- public TaskSet(String descriptionId, ObjectiveTaskAsset[] tasks)
- protected TaskSet()

## Methods

- public String getDescriptionId()
- public String getDescriptionKey(String objectiveId, int taskSetIndex)
- public ObjectiveTaskAsset[] getTasks()
- public String toString()

## Related Types

- ObjectiveTaskAsset
