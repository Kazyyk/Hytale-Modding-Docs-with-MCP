# CircleSpiralIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public class CircleSpiralIterator

Iterates outward in concentric circles from a center point, visiting all integer coordinate positions from radius 0 to a maximum radius. Combines `CircleIterator` with increasing radii to produce a spiral-like visitation pattern. Used for proximity-ordered chunk loading and entity search.

Also in this package: BlockIterator, BlockIteratorProcedure, BlockIteratorProcedurePlus1, BoxBlockIterator, BoxIterationBuffer, BoxIterationConsumer, CircleIterator, FastMath, LineIterator, SpiralIterator

Complete API:
  public void init(int chunkX, int chunkZ, int radiusTo)
  public void init(int chunkX, int chunkZ, int radiusFrom, int radiusTo)
  public void reset()
  public long next()
  public boolean hasNext()
  public int getCurrentRadius()
  public int getCompletedRadius()
  private void prepareNext()

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
private long radiusFromSq
private long radiusToSq
private boolean hasNext
private long nextChunk
