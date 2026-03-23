# SpawnJobSystem

Type: class | Package: com.hypixel.hytale.server.spawning.controllers | Extends: EntityTickingSystem<EntityStore>

public abstract class SpawnJobSystem<J extends SpawnJob, T extends SpawnController<J>> extends EntityTickingSystem<EntityStore>

Abstract system that executes active spawn jobs, managing budget allocation, position probing, spawn attempts, and result handling.

## Inner Types

### Result


public static enum SpawnJobSystem.Result

Spawn job result: `SUCCESS`, `FAILED`, `TRY_AGAIN`, `PERMANENT_FAILURE`, `PENDING_SPAWN`.

Known subclasses: SpawnJobTick

Also in this package: BeaconSpawnController, Result, SpawnController, SpawnControllerSystem

Complete API:
  protected void tickSpawnJobs(T spawnController, Store<EntityStore> store, CommandBuffer<EntityStore> commandBuffer)
  protected void onStartRun(J spawnJob)
  protected abstract void onEndProbing(T var1, J var2, SpawnJobSystem.Result var3, ComponentAccessor<EntityStore> var4)
  protected abstract boolean pickSpawnPosition(T var1, J var2, CommandBuffer<EntityStore> var3)
  protected abstract SpawnJobSystem.Result trySpawn(T var1, J var2, CommandBuffer<EntityStore> var3)
  protected abstract SpawnJobSystem.Result spawn(World var1, T var2, J var3, CommandBuffer<EntityStore> var4)
  protected SpawnJobSystem.Result endProbing(T spawnController, J spawnJob, SpawnJobSystem.Result result, ComponentAccessor<EntityStore> componentAccessor)
  private SpawnJobSystem.Result runJob(T spawnController, J spawnJob, CommandBuffer<EntityStore> commandBuffer)

Fields:
private static final HytaleLogger LOGGER
private static final int JOB_BUDGET
