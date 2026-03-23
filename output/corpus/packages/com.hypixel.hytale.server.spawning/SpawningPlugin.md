# SpawningPlugin

Type: class | Package: com.hypixel.hytale.server.spawning | Extends: JavaPlugin

public class SpawningPlugin extends JavaPlugin

Central plugin managing all NPC spawning: world-based environment spawning, beacon-based proximity spawning, and spawn marker placement. Registers all ECS components, systems, asset stores, and commands for the spawning subsystem.

## Registration Summary

Registers two entity types (`LegacySpawnBeacon`, `SpawnBeacon`), four asset stores (`SpawnMarker`, `WorldNPCSpawn`, `BeaconNPCSpawn`, `SpawnSuppression`), one block state (`SpawnMarkerBlock`), one NPC core component type (`TriggerSpawnBeacon`), and one interaction (`TriggerSpawnMarkers`).

## ECS Components (EntityStore)

`SpawnMarkerEntity`, `LocalSpawnController`, `LocalSpawnBeacon`, `SpawnSuppressionComponent`, `InitialBeaconDelay`, `SpawnMarkerReference`, `SpawnBeaconReference`, `FloodFillPositionSelector`, `SpawnMarkerBlockReference`

## ECS Resources (EntityStore)

`WorldSpawnData`, `SpawnSuppressionController`, `LocalSpawnState`, `FloodFillEntryPoolProviderSimple`, three `SpatialResource` instances (legacy beacon, spawn marker, manual spawn beacon)

## ECS Components (ChunkStore)

`SpawnJobData`, `ChunkSpawnData`, `ChunkSpawnedNPCData`, `ChunkSuppressionEntry`

## ECS Resources (ChunkStore)

`ChunkSuppressionQueue`

## Configuration

- SpawnBudgetFactor | double | 1.0 | Multiplier for the per-tick column budget (base 20480)
- MaxActiveJobs | int | 20 | Maximum concurrent spawn jobs allowed
- DefaultSpawnMarkerModel | String | "NPC_Spawn_Marker" | Model ID for spawn marker entities in creative mode
- LocalSpawnControllerJoinDelay | double | 15.0 | Seconds before local spawn controller begins spawning for a player

## Commands

Registers the `spawn` command with subcommands: `beacons`, `markers`, `populate`, `stats`, `suppression`.
