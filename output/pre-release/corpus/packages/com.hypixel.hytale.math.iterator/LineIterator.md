# LineIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public class LineIterator

Iterates over integer coordinate positions along a line between two 2D points using Bresenham's line algorithm. Produces `Vector2i` positions at each step. Used for 2D rasterization operations in the world generation and builder tools.

Also in this package: BlockIterator, BlockIteratorProcedure, BlockIteratorProcedurePlus1, BoxBlockIterator, BoxIterationBuffer, BoxIterationConsumer, CircleIterator, CircleSpiralIterator, FastMath, SpiralIterator

Complete API:
  public boolean hasNext()
  public Vector3i next()

Fields:
private final int x_inc
private final int y_inc
private final int z_inc
private final int l
private final int m
private final int n
private final int dx2
private final int dy2
private final int dz2
private int i
private int err1
private int err2
private int pointX
private int pointY
private int pointZ
