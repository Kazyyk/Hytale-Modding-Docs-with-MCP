# GeneratedBlockChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class GeneratedBlockChunk

Represents a generated chunk of blocks during world generation. Stores block data in sections, environment data, tint information, and provides height calculation. Converts to a `BlockChunk` for use in the world.

Also in this package: EntityWrapperEntry, GeneratedBlockStateChunk, GeneratedChunk, GeneratedChunkSection, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  public long getIndex()
  public int getX()
  public int getZ()
  public void setCoordinates(long index, int x, int z)
  public int getHeight(int x, int z)
  public ShortBytePalette generateHeight()
  public EnvironmentChunk getEnvironmentChunk()
  public GeneratedChunkSection getSection(int y)
  public int getTint(int x, int z)
  public void setTint(int x, int z, int tint)
  public void setEnvironment(int x, int y, int z, int environment)
  public void setEnvironmentColumn(int x, int z, int environment)
  public int getEnvironment(int x, int y, int z)
  public int getRotationIndex(int x, int y, int z)
  public int getBlock(int x, int y, int z)
  public void setBlock(int x, int y, int z, int blockId, int rotation, int filler)
  private GeneratedChunkSection initialize(int section)
  public void removeSection(int y)
  public BlockChunk toBlockChunk(Holder<ChunkStore>[] sectionHolders)

Fields:
private static final HytaleLogger LOGGER
protected long index
protected int x
protected int z
protected final IntBytePalette tint
protected final EnvironmentChunk environments
protected final GeneratedChunkSection[] chunkSections
