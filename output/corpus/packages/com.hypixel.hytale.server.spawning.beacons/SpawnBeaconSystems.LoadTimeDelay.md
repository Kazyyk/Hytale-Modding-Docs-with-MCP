# SpawnBeaconSystems.LoadTimeDelay

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: EntityTickingSystem<EntityStore>

public static class SpawnBeaconSystems.LoadTimeDelay extends EntityTickingSystem<EntityStore>

Ticks down InitialBeaconDelay components each frame. When the delay expires, removes the component so the beacon can begin spawning. Runs with `RootDependency.lastSet()` ordering.

Declared as a static inner class of SpawnBeaconSystems.
