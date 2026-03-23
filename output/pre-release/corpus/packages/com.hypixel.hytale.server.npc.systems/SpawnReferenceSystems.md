# SpawnReferenceSystems

Type: class | Package: com.hypixel.hytale.server.npc.systems

public class SpawnReferenceSystems

Container class for four ECS systems that manage the linkage between spawned NPC entities and their spawn markers or spawn beacons. These systems handle add/remove lifecycle events and periodic validation of the spawn reference, despawning NPCs when their spawn source is lost.

## Inner Systems

### SpawnReferenceSystems.BeaconAddRemoveSystem


public static class BeaconAddRemoveSystem extends RefSystem<EntityStore>

Manages the lifecycle of NPCs linked to legacy spawn beacons. On `LOAD`: resolves the beacon reference, refreshes the timeout counter, and notifies the `BeaconSpawnController`. If the beacon has no slots, marks the NPC for despawn.

On `REMOVE`: notifies the beacon's spawn controller of NPC removal.

**Query:** `SpawnBeaconReference AND NPCEntity`

### SpawnReferenceSystems.MarkerAddRemoveSystem


public static class MarkerAddRemoveSystem extends RefSystem<EntityStore>

Manages the lifecycle of NPCs linked to spawn markers. On `LOAD`: resolves the marker reference, refreshes timeouts, updates `WorldGenId`, and logs the sync.

On `REMOVE`: decrements the marker's spawn count, removes the NPC reference from the marker's array, and manages respawn timing. If the marker's spawn count reaches zero and it is not a realtime respawn marker, sets the `spawnAfter` instant and clears stored flock data.

**Query:** `SpawnMarkerReference AND NPCEntity AND UUIDComponent`

### SpawnReferenceSystems.TickingSpawnBeaconSystem


public static class TickingSpawnBeaconSystem extends EntityTickingSystem<EntityStore>

Periodically checks whether the spawn beacon reference is still valid. If the beacon is lost and the NPC is not in a busy state, marks it for despawn.

**Dependencies:** AFTER `NPCPreTickSystem`, BEFORE `DeathSystems.CorpseRemoval`

**Parallelism:** `EntityTickingSystem.maybeUseParallel`.

### SpawnReferenceSystems.TickingSpawnMarkerSystem


public static class TickingSpawnMarkerSystem extends EntityTickingSystem<EntityStore>

Periodically checks whether the spawn marker reference is still valid. If the marker is lost and the NPC is not in a busy state, marks it for despawn. Also refreshes the marker's timeout on successful resolution.

**Dependencies:** AFTER `NPCPreTickSystem`, BEFORE `DeathSystems.CorpseRemoval`

**Parallelism:** `EntityTickingSystem.maybeUseParallel`.

## Related Types

- NPCPreTickSystem -- despawn logic that precedes spawn reference checks
- NPCSystems -- NPC lifecycle events
