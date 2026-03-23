# PlayerChunkTrackerSystems.UpdateSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class PlayerChunkTrackerSystems.UpdateSystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that calls `ChunkTracker.tick()` each frame for entities with `ChunkTracker`, `Player`, `PlayerRef`, and `TransformComponent`. Runs single-threaded (`isParallel` returns `false`).

## Related Types

- PlayerChunkTrackerSystems -- parent container class
- ChunkTracker -- component ticked by this system
