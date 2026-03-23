# SpawnBeaconSystems

Type: class | Package: com.hypixel.hytale.server.spawning.beacons

public class SpawnBeaconSystems

Container class for all spawn beacon ECS systems. Contains static inner classes that handle beacon lifecycle, despawn checking, position calculation, spawn controller ticking, and spawn job execution.

## Constants

- public static final double[] POSITION_CALCULATION_DELAY_RANGE

## Inner Classes

- CheckDespawn | class | Checks and processes beacon self-despawn timers.
- ControllerTick | class | Main spawn controller tick: player detection, spawn scaling, job generation.
- EntityAdded | class | Handles SpawnBeacon entity initialization on add.
- LegacyEntityAdded | class | Handles LegacySpawnBeaconEntity entity initialization on add.
- LoadTimeDelay | class | Ticks InitialBeaconDelay components and removes them when expired.
- PositionSelectorUpdate | class | Rebuilds `FloodFillPositionSelector` caches when needed.
- SpawnJobTick | class | Executes pending NPC beacon spawn jobs.
