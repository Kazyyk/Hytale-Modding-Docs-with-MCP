# KillObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.assets | Extends: CountObjectiveTaskAsset

public class KillObjectiveTaskAsset extends CountObjectiveTaskAsset

Asset definition for KillObjectiveTask configuration data.

## Fields

- protected String npcGroupId

## Methods

- public KillObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, String npcGroupId)
- protected KillObjectiveTaskAsset()
- @Nonnull @Override public ObjectiveTaskAsset.TaskScope getTaskScope()
- public String getNpcGroupId()
- @Override protected boolean matchesAsset0(ObjectiveTaskAsset task)
- @Nonnull @Override public String toString()
