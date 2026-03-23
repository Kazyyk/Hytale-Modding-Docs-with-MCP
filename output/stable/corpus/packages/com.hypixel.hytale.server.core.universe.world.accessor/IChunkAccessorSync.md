# IChunkAccessorSync

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.accessor | Extends: BlockAccessor>

public interface IChunkAccessorSync<WorldChunk extends BlockAccessor>

## Methods

- @Nullable WorldChunk getChunkIfInMemory(long var1)
- @Nullable WorldChunk loadChunkIfInMemory(long var1)
- @Nullable WorldChunk getChunkIfLoaded(long var1)
- @Nullable WorldChunk getChunkIfNonTicking(long var1)
- @Nullable WorldChunk getChunk(long var1)
- @Nullable WorldChunk getNonTickingChunk(long var1)
- int getBlock(@Nonnull Vector3i pos)
- int getBlock(int x, int y, int z)
- @Nullable BlockType getBlockType(@Nonnull Vector3i pos)
- @Nullable BlockType getBlockType(int x, int y, int z)
- void setBlock(int x, int y, int z, String blockTypeKey)
- void setBlock(int x, int y, int z, String blockTypeKey, int settings)
- boolean breakBlock(int x, int y, int z, int settings)
- boolean testBlockTypes( int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation, @Nonnull IChunkAccessorSync.TestBlockFunction predicate )
- boolean testPlaceBlock(int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation)
- boolean testPlaceBlock( int x, int y, int z, @Nonnull BlockType blockTypeToTest, int rotation, @Nonnull IChunkAccessorSync.TestBlockFunction predicate )
- @Nullable BlockState getState(int x, int y, int z, boolean followFiller)
- @Nullable Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
- void setBlockInteractionState(@Nonnull Vector3i blockPosition, @Nonnull BlockType blockType, @Nonnull String state)
- @Nonnull BlockPosition getBaseBlock(@Nonnull BlockPosition position)
- int getBlockRotationIndex(int x, int y, int z)

## Inner Types

- `IChunkAccessorSync.TestBlockFunction`
