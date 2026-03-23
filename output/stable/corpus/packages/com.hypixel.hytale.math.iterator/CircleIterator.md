# CircleIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public class CircleIterator

Iterates over integer coordinate positions on the perimeter of a circle at a given radius. Uses Bresenham's circle algorithm to produce all lattice points on or near the circle boundary. Yields `Vector2i` positions.

Also in this package: BlockIterator, BlockIteratorProcedure, BlockIteratorProcedurePlus1, BoxBlockIterator, BoxIterationBuffer, BoxIterationConsumer, CircleSpiralIterator, FastMath, LineIterator, SpiralIterator

Complete API:
  public boolean hasNext()
  public Vector3d next()

Fields:
private final Vector3d origin
private final int pointTotal
private final double radius
private final float angleOffset
private int pointIndex
