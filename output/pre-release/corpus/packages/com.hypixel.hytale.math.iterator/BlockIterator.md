# BlockIterator

Type: class | Package: com.hypixel.hytale.math.iterator | Extends: java.lang.Object

public final class BlockIterator

Utility class for raycast-style block iteration through 3D voxel space. Uses a DDA (Digital Differential Analyzer) algorithm to walk through all blocks intersected by a ray from an origin point in a given direction. Supports both point-to-point and direction-based iteration with a maximum distance. The callback receives each block's integer coordinates and can terminate early by returning `false`.

## Inner Types

Defines `BlockIteratorProcedure` (functional interface with `apply(int x, int y, int z)`) and `BlockIteratorProcedurePlus1<T>` (variant carrying an extra context parameter).

Also in this package: BlockIteratorProcedure, BlockIteratorProcedurePlus1, BoxBlockIterator, BoxIterationBuffer, BoxIterationConsumer, CircleIterator, CircleSpiralIterator, FastMath, LineIterator, SpiralIterator

Complete API:
  public static boolean iterateFromTo(Vector3d origin, Vector3d target, BlockIterator.BlockIteratorProcedure procedure)
  public static boolean iterateFromTo(Vector3i origin, Vector3i target, BlockIterator.BlockIteratorProcedure procedure)
  public static boolean iterateFromTo(double sx, double sy, double sz, double tx, double ty, double tz, BlockIterator.BlockIteratorProcedure procedure)
  public static boolean iterateFromTo(double sx, double sy, double sz, double tx, double ty, double tz, BlockIterator.BlockIteratorProcedurePlus1<T> procedure, T t)
  public static boolean iterate(Vector3d origin, Vector3d direction, double maxDistance, BlockIterator.BlockIteratorProcedure procedure)
  public static boolean iterate(double sx, double sy, double sz, double dx, double dy, double dz, double maxDistance, BlockIterator.BlockIteratorProcedure procedure)
  private static boolean iterate0(double sx, double sy, double sz, double dx, double dy, double dz, double maxDistance, BlockIterator.BlockIteratorProcedure procedure)
  public static boolean iterate(double sx, double sy, double sz, double dx, double dy, double dz, double maxDistance, BlockIterator.BlockIteratorProcedurePlus1<T> procedure, T obj1)
  private static boolean iterate0(double sx, double sy, double sz, double dx, double dy, double dz, double maxDistance, BlockIterator.BlockIteratorProcedurePlus1<T> procedure, T obj1)
  private static void checkParameters(double sx, double sy, double sz, double dx, double dy, double dz)
  public static boolean isNonValidNumber(double d)
  public static boolean isZeroDirection(double dx, double dy, double dz)
  private static double intersection(double px, double py, double pz, double dx, double dy, double dz)
