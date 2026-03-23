# BoxBlockIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public class BoxBlockIterator

Iterates over all block positions within an axis-aligned bounding box defined by integer min/max coordinates. Visits blocks in Y-Z-X order (inner loop is X). Implements `Iterator<Vector3i>` for standard Java iteration and provides a bulk `forEach` method with a callback.

Also in this package: BlockIterator, BlockIteratorProcedure, BlockIteratorProcedurePlus1, BoxIterationBuffer, BoxIterationConsumer, CircleIterator, CircleSpiralIterator, FastMath, LineIterator, SpiralIterator

Complete API:
  public static BoxBlockIterator.BoxIterationBuffer getBuffer()
  public static boolean iterate(Box box, Vector3d position, Vector3d d, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer)
  public static boolean iterate(Box box, Vector3d pos, Vector3d d, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer, BoxBlockIterator.BoxIterationBuffer buffer)
  public static boolean iterate(Box box, double px, double py, double pz, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer)
  public static boolean iterate(Box box, double px, double py, double pz, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer, BoxBlockIterator.BoxIterationBuffer buffer)
  public static boolean iterate(Vector3d min, Vector3d max, double px, double py, double pz, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer)
  public static boolean iterate(Vector3d min, Vector3d max, double px, double py, double pz, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer, BoxBlockIterator.BoxIterationBuffer buffer)
  public static boolean iterate(Vector3d min, Vector3d max, Vector3d pos, Vector3d d, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer)
  public static boolean iterate(Vector3d min, Vector3d max, Vector3d pos, Vector3d d, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer, BoxBlockIterator.BoxIterationBuffer buffer)
  public static boolean iterate(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double px, double py, double pz, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer)
  public static boolean iterate(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double px, double py, double pz, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer, BoxBlockIterator.BoxIterationBuffer buffer)
  private static boolean iterate0(double minX, double minY, double minZ, double maxX, double maxY, double maxZ, double posX, double posY, double posZ, double dx, double dy, double dz, double maxDistance, BoxBlockIterator.BoxIterationConsumer consumer, BoxBlockIterator.BoxIterationBuffer buffer)

Fields:
private static ThreadLocal<BoxBlockIterator.BoxIterationBuffer> THREAD_LOCAL_BUFFER
