# SpawnBeaconSystems.EntityAdded

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: RefSystem<EntityStore>

public static class SpawnBeaconSystems.EntityAdded extends RefSystem<EntityStore>

Handles SpawnBeacon entity initialization. On add, resolves the spawn configuration from `BeaconNPCSpawn` asset map, creates a `FloodFillPositionSelector`, and ensures a `PrefabCopyableComponent`. Removes the entity if the config is missing.

Declared as a static inner class of SpawnBeaconSystems.
