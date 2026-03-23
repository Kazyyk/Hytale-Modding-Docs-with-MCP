# GatherObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: CountObjectiveTaskAsset

public class GatherObjectiveTaskAsset extends CountObjectiveTaskAsset

## Fields

- public static final BuilderCodec<GatherObjectiveTaskAsset> CODEC
- protected BlockTagOrItemIdField blockTagOrItemIdField

## Constructors

- public GatherObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, BlockTagOrItemIdField blockTagOrItemIdField)
- protected GatherObjectiveTaskAsset()

## Methods

- public ObjectiveTaskAsset.TaskScope getTaskScope()
- public BlockTagOrItemIdField getBlockTagOrItemIdField()
- protected boolean matchesAsset0(ObjectiveTaskAsset task)
- public String toString()

## Related Types

- BlockTagOrItemIdField
- CountObjectiveTaskAsset
- ObjectiveTaskAsset
