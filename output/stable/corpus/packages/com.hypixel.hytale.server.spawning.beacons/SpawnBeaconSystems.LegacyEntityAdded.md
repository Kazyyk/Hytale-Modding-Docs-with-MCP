# SpawnBeaconSystems.LegacyEntityAdded

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: RefSystem<EntityStore>

public static class SpawnBeaconSystems.LegacyEntityAdded extends RefSystem<EntityStore>

Handles LegacySpawnBeaconEntity entity initialization. On add, resolves the spawn wrapper, creates a `BeaconSpawnController`, initializes a `FloodFillPositionSelector`, computes initial scaled max spawns, and adds an InitialBeaconDelay on load. Removes the entity if the config is missing.

Declared as a static inner class of SpawnBeaconSystems.
