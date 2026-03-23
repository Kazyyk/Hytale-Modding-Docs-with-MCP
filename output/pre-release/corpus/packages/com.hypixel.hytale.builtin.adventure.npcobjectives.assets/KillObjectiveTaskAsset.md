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

Known subclasses: KillSpawnBeaconObjectiveTaskAsset, KillSpawnMarkerObjectiveTaskAsset

Also in this package: BountyObjectiveTaskAsset, KillSpawnBeaconObjectiveTaskAsset, KillSpawnMarkerObjectiveTaskAsset, ObjectiveSpawnBeacon

Complete API:
  public ObjectiveTaskAsset.TaskScope getTaskScope()
  public String getNpcGroupId()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<KillObjectiveTaskAsset> CODEC
protected String npcGroupId
