# BountyObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.assets | Extends: ObjectiveTaskAsset

public class BountyObjectiveTaskAsset extends ObjectiveTaskAsset

Asset definition for BountyObjectiveTask configuration data.

## Fields

- protected String npcId
- protected WorldLocationProvider worldLocationProvider

## Methods

- public BountyObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, String npcId, WorldLocationProvider worldLocationProvider)
- protected BountyObjectiveTaskAsset()
- @Nonnull @Override public ObjectiveTaskAsset.TaskScope getTaskScope()
- public String getNpcId()
- public WorldLocationProvider getWorldLocationProvider()
- @Override protected boolean matchesAsset0(ObjectiveTaskAsset task)
- @Nonnull @Override public String toString()

Also in this package: KillObjectiveTaskAsset, KillSpawnBeaconObjectiveTaskAsset, KillSpawnMarkerObjectiveTaskAsset, ObjectiveSpawnBeacon

Complete API:
  public ObjectiveTaskAsset.TaskScope getTaskScope()
  public String getNpcId()
  public WorldLocationProvider getWorldLocationProvider()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<BountyObjectiveTaskAsset> CODEC
protected String npcId
protected WorldLocationProvider worldLocationProvider
