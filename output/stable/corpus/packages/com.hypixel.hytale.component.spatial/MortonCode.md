# MortonCode

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object

public class MortonCode

Utility class for computing 3D Morton codes (Z-order curve values). Encodes three double-precision coordinates into a single 63-bit interleaved integer for spatial locality-preserving sorting. Used by `SpatialData.sortMorton()` to order entities before k-d tree construction, improving cache performance.

Also in this package: ClosestState, KDTree, Node, OrderedEntry, SpatialData, SpatialResource, SpatialStructure, SpatialSystem

Complete API:
  public static long encode(double x, double y, double z, double minX, double minY, double minZ, double maxX, double maxY, double maxZ)
  private static long interleaveBits(long x, long y, long z)
  private static long expandBits(long value)

Fields:
private static final int BITS_PER_AXIS
private static final long MAX_COORD
