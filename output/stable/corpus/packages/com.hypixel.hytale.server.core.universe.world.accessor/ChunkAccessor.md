# ChunkAccessor

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.accessor | Extends: BlockAccessor> extends IChunkAccessorSync<WorldChunk>

public interface ChunkAccessor<WorldChunk extends BlockAccessor> extends IChunkAccessorSync<WorldChunk>

## Methods

- int getFluidId(int x, int y, int z)
- boolean performBlockUpdate(int x, int y, int z)
- boolean performBlockUpdate(int x, int y, int z, boolean allowPartialLoad)
