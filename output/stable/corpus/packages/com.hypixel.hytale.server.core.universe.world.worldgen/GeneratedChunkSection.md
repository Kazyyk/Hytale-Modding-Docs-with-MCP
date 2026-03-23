# GeneratedChunkSection

Type: class | Package: com.hypixel.hytale.server.core.universe.world.worldgen

public class GeneratedChunkSection

Represents a 32x32x32 section of a generated chunk containing block IDs, filler data, and rotation data. Converts to a `BlockSection` with palette compression.

Also in this package: EntityWrapperEntry, GeneratedBlockChunk, GeneratedBlockStateChunk, GeneratedChunk, GeneratedEntityChunk, IBenchmarkableWorldGen, IWorldGen, IWorldGenBenchmark, ValidatableWorldGen, WorldGenLoadException, WorldGenTimingsCollector

Complete API:
  public int getRotationIndex(int x, int y, int z)
  private int getRotationIndex(int index)
  public int getBlock(int x, int y, int z)
  public int getFiller(int x, int y, int z)
  private int getBlock(int index)
  public void setBlock(int x, int y, int z, int block, int rotation, int filler)
  public void setBlock(int index, int block, int rotation, int filler)
  public int[] getData()
  public void reset()
  public boolean isSolidAir()
  public BlockSection toChunkSection()
  public void serialize(ByteBuf buf)
  public void deserialize(ByteBuf buf, int version)

Fields:
private final int[] data
private final int[] temp
private ISectionPalette fillers
private ISectionPalette rotations
