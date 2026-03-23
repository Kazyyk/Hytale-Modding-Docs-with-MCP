# CountObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: ObjectiveTaskAsset

public abstract class CountObjectiveTaskAsset extends ObjectiveTaskAsset

## Fields

- public static final BuilderCodec<CountObjectiveTaskAsset> CODEC
- protected int count

## Constructors

- public CountObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count)
- protected CountObjectiveTaskAsset()

## Methods

- public int getCount()
- protected boolean matchesAsset0(ObjectiveTaskAsset task)
- public String toString()

## Related Types

- ObjectiveTaskAsset

Known subclasses: CraftObjectiveTaskAsset, GatherObjectiveTaskAsset, KillObjectiveTaskAsset, UseBlockObjectiveTaskAsset, UseEntityObjectiveTaskAsset

Also in this package: BlockTagOrItemIdField, ChestConfig, CraftObjectiveTaskAsset, DialogOptions, GatherObjectiveTaskAsset, ObjectiveTaskAsset, ReachLocationTaskAsset, TaskScope, TaskSet, TreasureMapObjectiveTaskAsset, UseBlockObjectiveTaskAsset, UseEntityObjectiveTaskAsset

Complete API:
  public int getCount()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<CountObjectiveTaskAsset> CODEC
protected int count
