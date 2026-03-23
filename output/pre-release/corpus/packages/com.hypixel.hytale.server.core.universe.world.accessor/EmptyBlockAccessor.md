# EmptyBlockAccessor

Type: class | Package: com.hypixel.hytale.server.core.universe.world.accessor | Implements: BlockAccessor

public class EmptyBlockAccessor implements BlockAccessor

Singleton `BlockAccessor` implementation that always returns empty/zero values and rejects all write operations. Used as a null-object pattern when no chunk data is available. `getX()`/`getZ()`/`getChunkAccessor()` throw `UnsupportedOperationException`.

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
  public Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
  public int getFluidId(int x, int y, int z)
  public byte getFluidLevel(int x, int y, int z)
  public int getSupportValue(int x, int y, int z)
  public int getFiller(int x, int y, int z)
  public int getRotationIndex(int x, int y, int z)

Fields:
public static final EmptyBlockAccessor INSTANCE
