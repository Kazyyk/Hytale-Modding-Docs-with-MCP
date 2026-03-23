# Vector2l

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector2l

Mutable 2D vector with long components. Provides arithmetic, distance, and normalization operations.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public long getX()
  public void setX(long x)
  public long getY()
  public void setY(long y)
  public Vector2l assign(Vector2l v)
  public Vector2l assign(long v)
  public Vector2l assign(long[] v)
  public Vector2l assign(long x, long y)
  public Vector2l add(Vector2l v)
  public Vector2l add(long x, long y)
  public Vector2l addScaled(Vector2l v, long s)
  public Vector2l subtract(Vector2l v)
  public Vector2l subtract(long x, long y)
  public Vector2l negate()
  public Vector2l scale(long s)
  public Vector2l scale(double s)
  public Vector2l scale(Vector2l p)
  public long dot(Vector2l other)
  public double distanceTo(Vector2l v)
  public double distanceTo(long x, long y)
  public long distanceSquaredTo(Vector2l v)
  public long distanceSquaredTo(long x, long y)
  public Vector2l normalize()
  public double length()
  public long squaredLength()
  public Vector2l setLength(long newLen)
  public Vector2l clampLength(long maxLength)
  public Vector2l dropHash()
  public Vector2l clone()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Vector2l max(Vector2l a, Vector2l b)
  public static Vector2l min(Vector2l a, Vector2l b)

Fields:
public static final BuilderCodec<Vector2l> CODEC
public static final Vector2l ZERO
public static final Vector2l UP
public static final Vector2l POS_Y
public static final Vector2l DOWN
public static final Vector2l NEG_Y
public static final Vector2l RIGHT
public static final Vector2l POS_X
public static final Vector2l LEFT
public static final Vector2l NEG_X
public static final Vector2l ALL_ONES
public static final Vector2l[] DIRECTIONS
public long x
public long y
private transient int hash
