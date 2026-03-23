# KillSpawnBeaconObjectiveTaskAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.npcobjectives.assets | Extends: KillObjectiveTaskAsset

public class KillSpawnBeaconObjectiveTaskAsset extends KillObjectiveTaskAsset

Asset definition for KillSpawnBeaconObjectiveTask configuration data.

## Fields

- protected KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[] spawnBeacons

## Methods

- public KillSpawnBeaconObjectiveTaskAsset(String descriptionId,
        TaskConditionAsset[] taskConditions,
        Vector3i[] mapMarkers,
        int count,
        String npcGroupId,
        KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[] spawnBeacons)` |
| `protected` | | `KillSpawnBeaconObjectiveTaskAsset()` |
| `public` | `KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[]` | `getSpawnBeacons()` |
| `@Override protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `@Nonnull @Override public` | `String` | `toString()` |

Also in this package: BountyObjectiveTaskAsset, KillObjectiveTaskAsset, KillSpawnMarkerObjectiveTaskAsset, ObjectiveSpawnBeacon

Complete API:
  public KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[] getSpawnBeacons()
  protected boolean matchesAsset0(ObjectiveTaskAsset task)
  public String toString()

Fields:
public static final BuilderCodec<KillSpawnBeaconObjectiveTaskAsset> CODEC
protected KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[] spawnBeacons
