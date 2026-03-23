# TickableBlockState

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.chunk.state

public interface TickableBlockState

Utility type in the `state` subsystem.

## Abstract Methods

- tick | void | float var1, int var2, ArchetypeChunk<ChunkStore> var3, Store<ChunkStore> var4, CommandBuffer<ChunkStore> var5
- getPosition | Vector3i
- getBlockPosition | Vector3i
- getChunk | WorldChunk
- invalidate | void
