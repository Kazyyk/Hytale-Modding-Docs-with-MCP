# TreasureMapObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.config.task | Extends: ObjectiveTaskAsset

public class TreasureMapObjectiveTaskAsset extends ObjectiveTaskAsset

## Fields

- public static final BuilderCodec<TreasureMapObjectiveTaskAsset> CODEC
- protected TreasureMapObjectiveTaskAsset.ChestConfig[] chestConfigs
- public static final BuilderCodec<TreasureMapObjectiveTaskAsset.ChestConfig> CODEC
- protected float minRadius
- protected float maxRadius
- protected String droplistId
- protected WorldLocationProvider worldLocationProvider
- protected String chestBlockTypeKey
- TreasureMapObjectiveTaskAsset.ChestConfig that
- int result

## Constructors

- public TreasureMapObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, TreasureMapObjectiveTaskAsset.ChestConfig[] chestConfigs)
- protected TreasureMapObjectiveTaskAsset()

## Methods

- public ObjectiveTaskAsset.TaskScope getTaskScope()
- public TreasureMapObjectiveTaskAsset.ChestConfig[] getChestConfigs()
- protected boolean matchesAsset0(ObjectiveTaskAsset task)
- public String toString()
- throw new IllegalArgumentException("ChestConfig.MinRadius ("
                                + chestConfig.minRadius
                                + ")` |
| `` | `public float` | `getMinRadius()` |
| `` | `public float` | `getMaxRadius()` |
| `` | `public String` | `getDroplistId()` |
| `` | `public WorldLocationProvider` | `getWorldLocationProvider()` |
| `` | `public String` | `getChestBlockTypeKey()` |
| `` | `public boolean` | `equals(@Nullable Object o)` |
| `` | `public int` | `hashCode()` |
| `` | `public String` | `toString()` |

## Inner Types

- `TreasureMapObjectiveTaskAsset.ChestConfig`

## Related Types

- ObjectiveTaskAsset

Also in this package: BlockTagOrItemIdField, ChestConfig, CountObjectiveTaskAsset, CraftObjectiveTaskAsset, DialogOptions, GatherObjectiveTaskAsset, ObjectiveTaskAsset, ReachLocationTaskAsset, TaskScope, TaskSet, UseBlockObjectiveTaskAsset, UseEntityObjectiveTaskAsset

Complete API:
  public ObjectiveTaskAsset.TaskScope getTaskScope()
  public TreasureMapObjectiveTaskAsset.ChestConfig[] getChestConfigs()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<TreasureMapObjectiveTaskAsset> CODEC
protected TreasureMapObjectiveTaskAsset.ChestConfig[] chestConfigs
