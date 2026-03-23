# SpawnController

Type: class | Package: com.hypixel.hytale.server.spawning.controllers

public abstract class SpawnController<T extends SpawnJob>

Abstract base class for spawn controllers that manage spawn job creation, active job tracking, and NPC population limits.

## Methods

- public World getWorld()
- public boolean isUnspawnable()
- public int getActualNPCs()
- public double getExpectedNPCs()
- public int getActiveJobCount()
- public int getMaxActiveJobs()
- public abstract T createRandomSpawnJob(ComponentAccessor<EntityStore> componentAccessor)

Known subclasses: BeaconSpawnController

Also in this package: BeaconSpawnController, Result, SpawnControllerSystem, SpawnJobSystem

Complete API:
  public World getWorld()
  public boolean isUnspawnable()
  public boolean isDebugSpawnFrozen()
  public int getActualNPCs()
  public double getExpectedNPCs()
  public int getActiveJobCount()
  public int getMaxActiveJobs()
  public T getSpawnJob(int index)
  public List<T> getActiveJobs()
  public void addIdleJob(T job)
  public abstract T createRandomSpawnJob(ComponentAccessor<EntityStore> var1)

Fields:
protected World world
protected boolean unspawnable
protected double expectedNPCs
protected int actualNPCs
protected final List<T> activeJobs
protected final ArrayDeque<T> idleJobs
protected final int baseMaxActiveJobs
protected boolean debugSpawnFrozen
