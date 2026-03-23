# ChunkUtil

Type: class | Package: com.hypixel.hytale.math.util

public class ChunkUtil

## Constants

- public static final int BITS
- public static final int SIZE
- public static final int SIZE_2
- public static final int SIZE_MINUS_1
- public static final int SIZE_MASK
- public static final int SIZE_COLUMNS
- public static final int SIZE_COLUMNS_MASK
- public static final int SIZE_BLOCKS
- public static final int SIZE_BLOCKS_MASK
- public static final int BITS2
- public static final int NON_CHUNK_MASK
- public static final int HEIGHT_SECTIONS
- public static final int HEIGHT
- public static final int HEIGHT_MINUS_1
- public static final int HEIGHT_MASK
- public static final int SIZE_BLOCKS_COLUMN
- public static final long NOT_FOUND
- public static final int MIN_Y
- public static final int MIN_ENTITY_Y
- public static final int MIN_SECTION

## Methods

- public static byte[] shortToByteArray(@Nonnull short[] data)
- public static byte[] intToByteArray(@Nonnull int[] data)
- public static int indexColumn(int x, int z)
- public static int xFromColumn(int index)
- public static int zFromColumn(int index)
- public static int indexSection(int y)
- public static int indexBlockFromColumn(int column, int y)
- public static int indexBlock(int x, int y, int z)
- public static int xFromIndex(int index)
- public static int yFromIndex(int index)
- public static int zFromIndex(int index)
- public static int indexBlockInColumn(int x, int y, int z)
- public static int indexBlockInColumnFromColumn(int column, int y)
- public static int xFromBlockInColumn(int index)
- public static int yFromBlockInColumn(int index)
- public static int zFromBlockInColumn(int index)
- public static int localCoordinate(long v)
- public static int chunkCoordinate(double block)
- public static int chunkCoordinate(int block)
- public static int chunkCoordinate(long block)
- public static int minBlock(int index)
- public static int maxBlock(int index)
- public static boolean isWithinLocalChunk(int x, int z)
- public static boolean isBorderBlock(int x, int z)
- public static boolean isBorderBlockGlobal(int x, int z)
- public static boolean isInsideChunk(int chunkX, int chunkZ, int x, int z)
- public static boolean isSameChunk(int x0, int z0, int x1, int z1)
- public static boolean isSameChunkSection(int x0, int y0, int z0, int x1, int y1, int z1)
- public static boolean isInsideChunkRelative(int x, int z)
- public static int xOfChunkIndex(long index)
- public static int zOfChunkIndex(long index)
- public static long indexChunk(int x, int z)
- public static long indexChunkFromBlock(int blockX, int blockZ)
- public static long indexChunkFromBlock(double blockX, double blockZ)
- public static int worldCoordFromLocalCoord(int chunkCoord, int localCoord)

Also in this package: FastRandom, HashUtil, Icecore, IterationElement, MathUtil, NearestBlockUtil, NumberUtil, Riven, TrigMathUtil

Complete API:
  public static byte[] shortToByteArray(short[] data)
  public static byte[] intToByteArray(int[] data)
  public static int indexColumn(int x, int z)
  public static int xFromColumn(int index)
  public static int zFromColumn(int index)
  public static int indexSection(int y)
  public static int indexBlockFromColumn(int column, int y)
  public static int indexBlock(int x, int y, int z)
  public static int xFromIndex(int index)
  public static int yFromIndex(int index)
  public static int zFromIndex(int index)
  public static int indexBlockInColumn(int x, int y, int z)
  public static int indexBlockInColumnFromColumn(int column, int y)
  public static int xFromBlockInColumn(int index)
  public static int yFromBlockInColumn(int index)
  public static int zFromBlockInColumn(int index)
  public static int localCoordinate(long v)
  public static int chunkCoordinate(double block)
  public static int chunkCoordinate(int block)
  public static int chunkCoordinate(long block)
  public static int minBlock(int index)
  public static int maxBlock(int index)
  public static boolean isWithinLocalChunk(int x, int z)
  public static boolean isBorderBlock(int x, int z)
  public static boolean isBorderBlockGlobal(int x, int z)
  public static boolean isInsideChunk(int chunkX, int chunkZ, int x, int z)
  public static boolean isSameChunk(int x0, int z0, int x1, int z1)
  public static boolean isSameChunkSection(int x0, int y0, int z0, int x1, int y1, int z1)
  public static boolean isInsideChunkRelative(int x, int z)
  public static int xOfChunkIndex(long index)
  public static int zOfChunkIndex(long index)
  public static long indexChunk(int x, int z)
  public static long indexChunkFromBlock(int blockX, int blockZ)
  public static long indexChunkFromBlock(double blockX, double blockZ)
  public static int worldCoordFromLocalCoord(int chunkCoord, int localCoord)
  public static boolean isValidChunkIndex(long chunkIndex)
  public static boolean isValidChunkCoords(int chunkCoordX, int chunkCoordZ)
  public static boolean isValidChunkCoord(int chunkCoord)

Fields:
public static final int BITS
public static final int SIZE
public static final int SIZE_2
public static final int SIZE_MINUS_1
public static final int SIZE_MASK
public static final int SIZE_COLUMNS
public static final int SIZE_COLUMNS_MASK
public static final int SIZE_BLOCKS
public static final int SIZE_BLOCKS_MASK
public static final int BITS2
public static final int NON_CHUNK_MASK
public static final int HEIGHT_SECTIONS
public static final int HEIGHT
public static final int HEIGHT_MINUS_1
public static final int HEIGHT_MASK
public static final int SIZE_BLOCKS_COLUMN
public static final long NOT_FOUND
public static final int MIN_Y
public static final int MIN_ENTITY_Y
public static final int MIN_SECTION
public static final int MIN_CHUNK_COORD
public static final int MAX_CHUNK_COORD
