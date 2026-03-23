# BeaconSpawnController

Type: class | Package: com.hypixel.hytale.server.spawning.controllers | Extends: SpawnController<NPCBeaconSpawnJob>

public class BeaconSpawnController extends SpawnController<NPCBeaconSpawnJob>

Spawn controller for beacon-based NPC spawning. Manages spawn slots, player-based threat distribution, spawn radius/beacon radius constraints, concurrent spawn limits, idle NPC despawn timers, and round-based spawn scheduling.

## Fields

- public static final | int | MAX_ATTEMPTS_PER_TICK | Max spawn attempts per tick (5)
- public static final | double | ROUNDING_BREAK_POINT | Rounding break point (0.25)
