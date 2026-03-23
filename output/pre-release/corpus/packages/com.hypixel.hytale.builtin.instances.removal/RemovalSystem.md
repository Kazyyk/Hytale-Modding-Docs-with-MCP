# RemovalSystem

Type: class | Package: com.hypixel.hytale.builtin.instances.removal | Extends: TickingSystem<ChunkStore> | Implements: RunWhenPausedSystem<ChunkStore>

public class RemovalSystem extends TickingSystem<ChunkStore> implements RunWhenPausedSystem<ChunkStore>

ECS system extending `TickingSystem<ChunkStore>`. Processes entities each tick.

## Methods

- tick(float dt, int systemIndex, @Nonnull Store<ChunkStore> store) | void | public method.
- shouldRemoveWorld(@Nonnull Store<ChunkStore> store) | boolean | static public method.
