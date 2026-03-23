# SpawnControllerSystem

Type: class | Package: com.hypixel.hytale.server.spawning.controllers | Extends: EntityTickingSystem<EntityStore>

public abstract class SpawnControllerSystem<J extends SpawnJob, T extends SpawnController<J>> extends EntityTickingSystem<EntityStore>

Abstract system that ticks spawn controllers to generate new spawn jobs when conditions are met (players present, spawning enabled, population below expected).

Known subclasses: ControllerTick

Also in this package: BeaconSpawnController, Result, SpawnController, SpawnJobSystem

Complete API:
  protected void tickController(T spawnController, Store<EntityStore> store)
  protected abstract void prepareSpawnJobGeneration(T var1, ComponentAccessor<EntityStore> var2)
  protected void createRandomSpawnJobs(T spawnController, ComponentAccessor<EntityStore> componentAccessor)
