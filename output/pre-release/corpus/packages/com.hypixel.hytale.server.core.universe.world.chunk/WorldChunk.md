# WorldChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: BlockAccessor, Component<ChunkStore>

public class WorldChunk implements BlockAccessor, Component<ChunkStore>

Core chunk component stored in the `ChunkStore`. Contains the `BlockChunk`, `BlockComponentChunk`, and `EntityChunk` sub-components. Manages chunk lifecycle flags, keep-alive timers, saving state, and lighting update control. Provides `BlockAccessor` implementation for reading/writing block data within the chunk.

## Constants

- KEEP_ALIVE_DEFAULT | int | 15

## Static Methods

- static ComponentType<ChunkStore, WorldChunk> getComponentType()
