# SpawnBeaconSystems.SpawnJobTick

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: SpawnJobSystem<NPCBeaconSpawnJob, BeaconSpawnController>

public static class SpawnBeaconSystems.SpawnJobTick extends SpawnJobSystem<NPCBeaconSpawnJob, BeaconSpawnController>

Executes pending NPC beacon spawn jobs. Picks spawn positions using `FloodFillPositionSelector`, spawns NPCs via `NPCPlugin`, creates flocks, and notifies the beacon on success. Handles failure by incrementing spawn attempts and preparing the next spawn timer after 5 failures. Runs after `ControllerTick`.

Declared as a static inner class of SpawnBeaconSystems.
