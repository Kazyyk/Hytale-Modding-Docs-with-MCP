# SpawnControllerSystem

Type: class | Package: com.hypixel.hytale.server.spawning.controllers | Extends: EntityTickingSystem<EntityStore>

public abstract class SpawnControllerSystem<J extends SpawnJob, T extends SpawnController<J>> extends EntityTickingSystem<EntityStore>

Abstract system that ticks spawn controllers to generate new spawn jobs when conditions are met (players present, spawning enabled, population below expected).
