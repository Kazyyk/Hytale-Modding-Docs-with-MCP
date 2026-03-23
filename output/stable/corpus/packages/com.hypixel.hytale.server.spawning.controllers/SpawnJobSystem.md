# SpawnJobSystem

Type: class | Package: com.hypixel.hytale.server.spawning.controllers | Extends: EntityTickingSystem<EntityStore>

public abstract class SpawnJobSystem<J extends SpawnJob, T extends SpawnController<J>> extends EntityTickingSystem<EntityStore>

Abstract system that executes active spawn jobs, managing budget allocation, position probing, spawn attempts, and result handling.

## Inner Types

### Result


public static enum SpawnJobSystem.Result

Spawn job result: `SUCCESS`, `FAILED`, `TRY_AGAIN`, `PERMANENT_FAILURE`, `PENDING_SPAWN`.
