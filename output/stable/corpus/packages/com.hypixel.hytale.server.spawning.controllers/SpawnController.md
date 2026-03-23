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
