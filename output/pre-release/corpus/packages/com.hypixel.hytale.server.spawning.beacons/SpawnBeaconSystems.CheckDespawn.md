# SpawnBeaconSystems.CheckDespawn

Type: class | Package: com.hypixel.hytale.server.spawning.beacons | Extends: EntityTickingSystem<EntityStore>

public static class SpawnBeaconSystems.CheckDespawn extends EntityTickingSystem<EntityStore>

Checks beacon self-despawn timers. If the game time exceeds `despawnSelfAfter`, despawns all spawned NPCs and removes the beacon. Also checks `BeaconSpawnWrapper.shouldDespawn` for environment-driven despawn conditions.

Declared as a static inner class of SpawnBeaconSystems.
