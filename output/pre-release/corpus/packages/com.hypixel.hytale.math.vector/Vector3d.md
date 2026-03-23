# Vector3d

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector3d

Mutable 3D vector with double-precision components. Provides arithmetic, cross/dot products, distance, rotation, normalization, interpolation, and directional constants (UP, DOWN, NORTH, SOUTH, EAST, WEST). Includes block-relative geometry arrays (BLOCK_SIDES, BLOCK_EDGES, BLOCK_CORNERS).

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public double getX()
  public void setX(double x)
  public double getY()
  public void setY(double y)
  public double getZ()
  public void setZ(double z)
  public Vector3d assign(Vector3d v)
  public Vector3d assign(Vector3i v)
  public Vector3d assign(double v)
  public Vector3d assign(double[] v)
  public Vector3d assign(float[] v)
  public Vector3d assign(double yaw, double pitch)
  public Vector3d assign(double x, double y, double z)
  public Vector3d add(Vector3d v)
  public Vector3d add(Vector3i v)
  public Vector3d add(double x, double y, double z)
  public Vector3d add(double value)
  public Vector3d addScaled(Vector3d v, double s)
  public Vector3d subtract(Vector3d v)
  public Vector3d subtract(Vector3i v)
  public Vector3d subtract(double x, double y, double z)
  public Vector3d subtract(double value)
  public Vector3d negate()
  public Vector3d scale(double s)
  public Vector3d scale(Vector3d p)
  public Vector3d cross(Vector3d v)
  public Vector3d cross(Vector3d v, Vector3d res)
  public double dot(Vector3d other)
  public double distanceTo(Vector3d v)
  public double distanceTo(Vector3i v)
  public double distanceTo(double x, double y, double z)
  public double distanceSquaredTo(Vector3d v)
  public double distanceSquaredTo(Vector3i v)
  public double distanceSquaredTo(double x, double y, double z)
  public Vector3d normalize()
  public double length()
  public double squaredLength()
  public Vector3d setLength(double newLen)
  public Vector3d clampLength(double maxLength)
  public Vector3d rotateX(float angle)
  public Vector3d rotateY(float angle)
  public Vector3d rotateZ(float angle)
  public Vector3d floor()
  public Vector3d ceil()
  public Vector3d clipToZero(double epsilon)
  public boolean closeToZero(double epsilon)
  public boolean isInside(int x, int y, int z)
  public boolean isFinite()
  public Vector3d dropHash()
  public Vector3d clone()
  public boolean equals(Object o)
  public boolean equals(Vector3d o)
  public int hashCode()
  public String toString()
  public static Vector3d max(Vector3d a, Vector3d b)
  public static Vector3d min(Vector3d a, Vector3d b)
  public static Vector3d lerp(Vector3d a, Vector3d b, double t)
  public static Vector3d lerpUnclamped(Vector3d a, Vector3d b, double t)
  public static Vector3d directionTo(Vector3d from, Vector3d to)
  public static Vector3d directionTo(Vector3i from, Vector3d to)
  public static double distance(double x1, double y1, double z1, double x2, double y2, double z2)
  public static double distanceSquared(double x1, double y1, double z1, double x2, double y2, double z2)
  public static Vector3d add(Vector3d one, Vector3d two)
  public static Vector3d add(Vector3d one, Vector3d two, Vector3d three)
  public static String formatShortString(Vector3d v)
  public Vector3i toVector3i()
  public Vector3f toVector3f()

Fields:
public static final BuilderCodec<Vector3d> CODEC
public static final Vector3dArrayCodec AS_ARRAY_CODEC
public static final Vector3d ZERO
public static final Vector3d UP
public static final Vector3d POS_Y
public static final Vector3d DOWN
public static final Vector3d NEG_Y
public static final Vector3d FORWARD
public static final Vector3d NEG_Z
public static final Vector3d NORTH
public static final Vector3d BACKWARD
public static final Vector3d POS_Z
public static final Vector3d SOUTH
public static final Vector3d RIGHT
public static final Vector3d POS_X
public static final Vector3d EAST
public static final Vector3d LEFT
public static final Vector3d NEG_X
public static final Vector3d WEST
public static final Vector3d ALL_ONES
public static final Vector3d MIN
public static final Vector3d MAX
public static final Vector3d[] BLOCK_SIDES
public static final Vector3d[] BLOCK_EDGES
public static final Vector3d[] BLOCK_CORNERS
public static final Vector3d[][] BLOCK_PARTS
public static final Vector3d[] CARDINAL_DIRECTIONS
public double x
public double y
public double z
private transient int hash
