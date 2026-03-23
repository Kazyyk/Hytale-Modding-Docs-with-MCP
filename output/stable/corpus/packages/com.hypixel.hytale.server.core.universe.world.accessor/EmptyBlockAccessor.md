# EmptyBlockAccessor

Type: class | Package: com.hypixel.hytale.server.core.universe.world.accessor | Implements: BlockAccessor

public class EmptyBlockAccessor implements BlockAccessor

## Fields

- public static final EmptyBlockAccessor INSTANCE

## Methods

- @Override public int getX()
- @Override public int getZ()
- @Override public ChunkAccessor getChunkAccessor()
- @Override public int getBlock(int x, int y, int z)
- @Override public boolean setBlock(int x, int y, int z, int id, BlockType blockType, int rotation, int filler, int settings)
- @Override public boolean breakBlock(int x, int y, int z, int filler, int settings)
- @Override public boolean testBlocks(int x, int y, int z, BlockType blockTypeToTest, int rotation, TriIntPredicate predicate)
- @Override public boolean testBlockTypes(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction predicate)
- @Override public boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation)
- @Override public boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction filter)
- @Override public boolean setTicking(int x, int y, int z, boolean ticking)
- @Override public boolean isTicking(int x, int y, int z)
- @Override @Nullable public BlockState getState(int x, int y, int z)
- @Override @Nullable public Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
- @Override public void setState(int x, int y, int z, BlockState state, boolean notify)
- @Override public int getFluidId(int x, int y, int z)
- @Override public byte getFluidLevel(int x, int y, int z)
- @Override public int getSupportValue(int x, int y, int z)
- @Override public int getFiller(int x, int y, int z)
- @Override public int getRotationIndex(int x, int y, int z)

Also in this package: BlockAccessor, ChunkAccessor, IChunkAccessorSync, LocalCachedChunkAccessor, OverridableChunkAccessor, TestBlockFunction

Complete API:
  public int getX()
  public int getZ()
  public ChunkAccessor getChunkAccessor()
  public int getBlock(int x, int y, int z)
  public boolean setBlock(int x, int y, int z, int id, BlockType blockType, int rotation, int filler, int settings)
  public boolean breakBlock(int x, int y, int z, int filler, int settings)
  public boolean testBlocks(int x, int y, int z, BlockType blockTypeToTest, int rotation, TriIntPredicate predicate)
  public boolean testBlockTypes(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction predicate)
  public boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation)
  public boolean testPlaceBlock(int x, int y, int z, BlockType blockTypeToTest, int rotation, IChunkAccessorSync.TestBlockFunction filter)
  public boolean setTicking(int x, int y, int z, boolean ticking)
  public boolean isTicking(int x, int y, int z)
  public BlockState getState(int x, int y, int z)
  public Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
  public void setState(int x, int y, int z, BlockState state, boolean notify)
  public int getFluidId(int x, int y, int z)
  public byte getFluidLevel(int x, int y, int z)
  public int getSupportValue(int x, int y, int z)
  public int getFiller(int x, int y, int z)
  public int getRotationIndex(int x, int y, int z)

Fields:
public static final EmptyBlockAccessor INSTANCE
