# Vector2d

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector2d

Mutable 2D vector with double-precision components. Provides arithmetic, distance, normalization, interpolation, and directional constants (UP, DOWN, LEFT, RIGHT).

Also in this package: Location, Transform, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public double getX()
  public void setX(double x)
  public double getY()
  public void setY(double y)
  public Vector2d assign(Vector2d v)
  public Vector2d assign(double v)
  public Vector2d assign(double[] v)
  public Vector2d assign(float[] v)
  public Vector2d assign(double x, double y)
  public Vector2d add(Vector2d v)
  public Vector2d add(double x, double y)
  public Vector2d addScaled(Vector2d v, double s)
  public Vector2d subtract(Vector2d v)
  public Vector2d subtract(double x, double y)
  public Vector2d negate()
  public Vector2d scale(double s)
  public Vector2d scale(Vector2d p)
  public double dot(Vector2d other)
  public double distanceTo(Vector2d v)
  public double distanceTo(double x, double y)
  public double distanceSquaredTo(Vector2d v)
  public double distanceSquaredTo(double x, double y)
  public Vector2d normalize()
  public double length()
  public double squaredLength()
  public Vector2d setLength(double newLen)
  public Vector2d clampLength(double maxLength)
  public Vector2d floor()
  public Vector2d ceil()
  public Vector2d clipToZero(double epsilon)
  public boolean closeToZero(double epsilon)
  public boolean isFinite()
  public Vector2d dropHash()
  public static Vector2d max(Vector2d a, Vector2d b)
  public static Vector2d min(Vector2d a, Vector2d b)
  public static Vector2d lerp(Vector2d a, Vector2d b, double t)
  public static Vector2d lerpUnclamped(Vector2d a, Vector2d b, double t)
  public static double distance(double x1, double y1, double x2, double y2)
  public static double distanceSquared(double x1, double y1, double x2, double y2)
  public Vector2d clone()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final BuilderCodec<Vector2d> CODEC
public static final Vector2dArrayCodec AS_ARRAY_CODEC
public static final Vector2d ZERO
public static final Vector2d UP
public static final Vector2d POS_Y
public static final Vector2d DOWN
public static final Vector2d NEG_Y
public static final Vector2d RIGHT
public static final Vector2d POS_X
public static final Vector2d LEFT
public static final Vector2d NEG_X
public static final Vector2d ALL_ONES
public static final Vector2d[] DIRECTIONS
public double x
public double y
private transient int hash
