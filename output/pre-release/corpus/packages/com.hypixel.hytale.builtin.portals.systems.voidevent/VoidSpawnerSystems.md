# VoidSpawnerSystems

Type: class | Package: com.hypixel.hytale.builtin.portals.systems.voidevent

public final class VoidSpawnerSystems

Container for systems managing void spawner entity lifecycle. The `Instantiate` inner class creates spawn beacons and particle effects on entity add, and cleans them up on removal.

## Inner Types

### Instantiate


public static class VoidSpawnerSystems.Instantiate extends RefSystem<EntityStore>

Reference system creating spawn beacons from configured IDs when a void spawner entity is added.

Also in this package: Instantiate, StartVoidEventInFragmentSystem, VoidEventRefSystem, VoidEventStagesSystem, VoidInvasionData, VoidInvasionPortalsSpawnSystem

Fields:
private static final Query<EntityStore> QUERY
