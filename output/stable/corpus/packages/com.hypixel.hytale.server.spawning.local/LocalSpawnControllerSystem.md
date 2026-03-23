# LocalSpawnControllerSystem

Type: class | Package: com.hypixel.hytale.server.spawning.local | Extends: TickingSystem<EntityStore>

public class LocalSpawnControllerSystem extends TickingSystem<EntityStore>

Main ticking system for local NPC spawning. Evaluates each player with an active spawn controller, checks environment conditions (weather, light levels), and places spawn beacons for matching beacon types. Runs every 5 seconds per player.

## Fields

- public static final | double | RUN_FREQUENCY_SECONDS | Run frequency (5.0 seconds)
