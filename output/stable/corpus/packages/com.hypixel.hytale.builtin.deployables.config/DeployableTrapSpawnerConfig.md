# DeployableTrapSpawnerConfig

Type: class | Package: com.hypixel.hytale.builtin.deployables.config

public class DeployableTrapSpawnerConfig

Trap-spawner hybrid extending `DeployableTrapConfig`. On trigger, spawns child deployables from configured `DeployableSpawner` entries at offset positions around the trap. Manages a multi-phase state machine: deploy, animate, fuse, live, triggered, despawn.
