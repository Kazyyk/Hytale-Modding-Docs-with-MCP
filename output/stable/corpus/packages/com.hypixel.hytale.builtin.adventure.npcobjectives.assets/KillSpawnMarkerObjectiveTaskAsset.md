# KillSpawnMarkerObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.assets | Extends: KillObjectiveTaskAsset

public class KillSpawnMarkerObjectiveTaskAsset extends KillObjectiveTaskAsset

Asset definition for KillSpawnMarkerObjectiveTask configuration data.

## Fields

- protected String[] spawnMarkerIds
- protected float radius

## Methods

- public KillSpawnMarkerObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, String npcGroupId, String[] spawnMarkerIds, float radius)
- protected KillSpawnMarkerObjectiveTaskAsset()
- @Nonnull public String[] getSpawnMarkerIds()
- public float getRadius()
- @Override protected boolean matchesAsset0(ObjectiveTaskAsset task)
- @Nonnull @Override public String toString()

Also in this package: BountyObjectiveTaskAsset, KillObjectiveTaskAsset, KillSpawnBeaconObjectiveTaskAsset, ObjectiveSpawnBeacon

Complete API:
  public String[] getSpawnMarkerIds()
  public float getRadius()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<KillSpawnMarkerObjectiveTaskAsset> CODEC
protected String[] spawnMarkerIds
protected float radius
