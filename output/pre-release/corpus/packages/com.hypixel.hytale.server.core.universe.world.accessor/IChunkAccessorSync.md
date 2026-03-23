# IChunkAccessorSync

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.accessor

@Deprecated
public interface IChunkAccessorSync<WorldChunk extends BlockAccessor>

Deprecated interface for synchronous chunk access across multiple chunks. Provides methods to get chunks by index in various states (in-memory, loaded, non-ticking), and delegates block operations to the appropriate chunk's `BlockAccessor`. Includes `getBaseBlock()` for resolving filler block origins and `TestBlockFunction` for placement testing.

## Inner Types

- `IChunkAccessorSync.TestBlockFunction` -- functional interface for block placement testing

Known implementors: ChunkAccessor, IWorldChunks

Also in this package: BlockAccessor, ChunkAccessor, EmptyBlockAccessor, LocalCachedChunkAccessor, OverridableChunkAccessor, TestBlockFunction

Complete API:
  WorldChunk getChunkIfInMemory(long var1)
  WorldChunk loadChunkIfInMemory(long var1)
  WorldChunk getChunkIfLoaded(long var1)
  WorldChunk getChunkIfNonTicking(long var1)
  WorldChunk getChunk(long var1)
  WorldChunk getNonTickingChunk(long var1)
  default int getBlock(Vector3i pos)
  default int getBlock(int x, int y, int z)
  default BlockType getBlockType(Vector3i pos)
  default BlockType getBlockType(int x, int y, int z)
  default void setBlock(int x, int y, int z, String blockTypeKey)
  default void setBlock(int x, int y, int z, String blockTypeKey, int settings)
  default boolean breakBlock(int x, int y, int z, int settings)
  default boolean testBlockTypes(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction predicate)
  default boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation)
  default boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction predicate)
  default Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
  default void setBlockInteractionState(Vector3i blockPosition, BlockType blockType, String state)
  default BlockPosition getBaseBlock(BlockPosition position)
  default int getBlockRotationIndex(int x, int y, int z)
