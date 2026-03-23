# BeaconSpawnWrapper

Type: class | Package: com.hypixel.hytale.server.spawning.wrappers | Extends: SpawnWrapper

public class BeaconSpawnWrapper extends SpawnWrapper

## Fields

- private final IWeightedMap<RoleSpawnParameters> weightedRoles
- private final double minDistanceFromPlayerSquared
- private final double targetDistanceFromPlayerSquared

## Methods

- public double getMinDistanceFromPlayerSquared()
- public double getTargetDistanceFromPlayerSquared()
- public double getBeaconRadius()
- public double getSpawnRadius()
- @Nullable public RoleSpawnParameters pickRole(Random chanceProvider)
