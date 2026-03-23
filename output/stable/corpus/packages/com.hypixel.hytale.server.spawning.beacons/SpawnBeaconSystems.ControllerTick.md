# SpawnBeaconSystems.ControllerTick

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: SpawnControllerSystem<NPCBeaconSpawnJob, BeaconSpawnController>

public static class SpawnBeaconSystems.ControllerTick extends SpawnControllerSystem<NPCBeaconSpawnJob, BeaconSpawnController>

The main spawn controller tick system for legacy beacons. Validates spawned entities (despawning idle/out-of-range NPCs), collects players in the beacon radius with Y-range filtering, scales max total and concurrent spawns using response curves, sorts players by threat, and generates spawn jobs. Depends on `PlayerSpatialSystem` and `PositionSelectorUpdate`.

Declared as a static inner class of SpawnBeaconSystems.
