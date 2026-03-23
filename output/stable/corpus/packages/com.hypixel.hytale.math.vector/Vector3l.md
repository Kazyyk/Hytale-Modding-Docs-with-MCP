# Vector3l

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector3l

Mutable 3D vector with long components. Provides arithmetic, cross/dot products, distance, normalization, and conversion to `Vector3i`/`Vector3d`.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public long getX()
  public void setX(long x)
  public long getY()
  public void setY(long y)
  public long getZ()
  public void setZ(long z)
  public Vector3l assign(Vector3l v)
  public Vector3l assign(long v)
  public Vector3l assign(long[] v)
  public Vector3l assign(long x, long y, long z)
  public Vector3l add(Vector3l v)
  public Vector3l add(long x, long y, long z)
  public Vector3l addScaled(Vector3l v, long s)
  public Vector3l subtract(Vector3l v)
  public Vector3l subtract(long x, long y, long z)
  public Vector3l negate()
  public Vector3l scale(long s)
  public Vector3l scale(double s)
  public Vector3l scale(Vector3l p)
  public Vector3l cross(Vector3l v)
  public Vector3l cross(Vector3l v, Vector3l res)
  public long dot(Vector3l other)
  public double distanceTo(Vector3l v)
  public double distanceTo(long x, long y, long z)
  public long distanceSquaredTo(Vector3l v)
  public long distanceSquaredTo(long x, long y, long z)
  public Vector3l normalize()
  public double length()
  public long squaredLength()
  public Vector3l setLength(long newLen)
  public Vector3l clampLength(long maxLength)
  public Vector3l dropHash()
  public Vector3l clone()
  public Vector3i toVector3i()
  public Vector3d toVector3d()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Vector3l max(Vector3l a, Vector3l b)
  public static Vector3l min(Vector3l a, Vector3l b)
  public static Vector3l directionTo(Vector3l from, Vector3l to)
  public static Vector3l add(Vector3l one, Vector3l two)
  public static Vector3l add(Vector3l one, Vector3l two, Vector3l three)

Fields:
public static final BuilderCodec<Vector3l> CODEC
public static final Vector3l ZERO
public static final Vector3l UP
public static final Vector3l POS_Y
public static final Vector3l DOWN
public static final Vector3l NEG_Y
public static final Vector3l FORWARD
public static final Vector3l NEG_Z
public static final Vector3l NORTH
public static final Vector3l BACKWARD
public static final Vector3l POS_Z
public static final Vector3l SOUTH
public static final Vector3l RIGHT
public static final Vector3l POS_X
public static final Vector3l EAST
public static final Vector3l LEFT
public static final Vector3l NEG_X
public static final Vector3l WEST
public static final Vector3l ALL_ONES
public static final Vector3l MIN
public static final Vector3l MAX
public static final Vector3l[] BLOCK_SIDES
public static final Vector3l[] BLOCK_EDGES
public static final Vector3l[] BLOCK_CORNERS
public static final Vector3l[][] BLOCK_PARTS
public static final Vector3l[] CARDINAL_DIRECTIONS
public long x
public long y
public long z
private transient int hash
