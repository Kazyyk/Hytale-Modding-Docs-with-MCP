# SpawnBeaconSystems.PositionSelectorUpdate

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: EntityTickingSystem<EntityStore>

public static class SpawnBeaconSystems.PositionSelectorUpdate extends EntityTickingSystem<EntityStore>

Rebuilds `FloodFillPositionSelector` position caches when flagged for rebuild. Uses the beacon's transform position and a `FloodFillEntryPoolProviderSimple` resource. Runs after `CheckDespawn`.

Declared as a static inner class of SpawnBeaconSystems.
