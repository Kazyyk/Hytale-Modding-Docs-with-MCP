# ChunkUnloadEvent

Type: class | Package: com.hypixel.hytale.server.core.universe.world.events.ecs | Extends: CancellableEcsEvent

public class ChunkUnloadEvent extends CancellableEcsEvent

Cancellable ECS event that can be intercepted by event systems.

## Accessors

- getChunk() | WorldChunk | Accessor method.
- setResetKeepAlive(boolean willResetKeepAlive) | void | Mutator method.
- willResetKeepAlive() | boolean | Boolean accessor.

Also in this package: ChunkSaveEvent, MoonPhaseChangeEvent

Complete API:
  public WorldChunk getChunk()
  public void setResetKeepAlive(boolean willResetKeepAlive)
  public boolean willResetKeepAlive()

Fields:
private final WorldChunk chunk
private boolean resetKeepAlive
