# UseBlockObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: CountObjectiveTaskAsset

public class UseBlockObjectiveTaskAsset extends CountObjectiveTaskAsset

## Fields

- public static final BuilderCodec<UseBlockObjectiveTaskAsset> CODEC
- protected BlockTagOrItemIdField blockTagOrItemIdField

## Constructors

- public UseBlockObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, BlockTagOrItemIdField blockTagOrItemIdField)
- protected UseBlockObjectiveTaskAsset()

## Methods

- public ObjectiveTaskAsset.TaskScope getTaskScope()
- public BlockTagOrItemIdField getBlockTagOrItemIdField()
- protected boolean matchesAsset0(ObjectiveTaskAsset task)
- public String toString()

## Related Types

- BlockTagOrItemIdField
- CountObjectiveTaskAsset
- ObjectiveTaskAsset
