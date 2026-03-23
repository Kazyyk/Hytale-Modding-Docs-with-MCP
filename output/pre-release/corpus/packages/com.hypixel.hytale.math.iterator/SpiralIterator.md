# SpiralIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public class SpiralIterator

Iterates over 2D integer coordinate positions in an outward rectangular spiral pattern from the origin. Visits positions in the order: right, down, left, up, expanding the spiral at each revolution. Used for chunk loading priority ordering and breadth-first spatial exploration.

Also in this package: BlockIterator, BlockIteratorProcedure, BlockIteratorProcedurePlus1, BoxBlockIterator, BoxIterationBuffer, BoxIterationConsumer, CircleIterator, CircleSpiralIterator, FastMath, LineIterator

Complete API:
  public void init(int chunkX, int chunkZ, int radiusTo)
  public void init(int chunkX, int chunkZ, int radiusFrom, int radiusTo)
  public void reset()
  public long next()
  public boolean hasNext()
  public boolean isSetup()
  public long getIndex()
  public long getMaxIndex()
  public int getChunkX()
  public int getChunkZ()
  public int getX()
  public int getZ()
  public int getDx()
  public int getDz()
  public int getCurrentRadius()
  public int getCompletedRadius()
  public static long getPosFromIndex(int index)

Fields:
public static final long MAX_RADIUS_LONG
public static final int MAX_RADIUS
private boolean setup
private int chunkX
private int chunkZ
private long maxI
private long i
private int x
private int z
private int dx
private int dz
