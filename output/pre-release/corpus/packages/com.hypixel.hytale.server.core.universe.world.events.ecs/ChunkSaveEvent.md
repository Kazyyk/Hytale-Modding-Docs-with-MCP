# ChunkSaveEvent

Type: class | Package: com.hypixel.hytale.server.core.universe.world.events.ecs | Extends: CancellableEcsEvent

public class ChunkSaveEvent extends CancellableEcsEvent

Cancellable ECS event that can be intercepted by event systems.

## Accessors

- getChunk() | WorldChunk | Accessor method.

Also in this package: ChunkUnloadEvent, MoonPhaseChangeEvent

Complete API:
  public WorldChunk getChunk()

Fields:
private final WorldChunk chunk
