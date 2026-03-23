# Vector2i

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector2i

Mutable 2D vector with integer components. Provides arithmetic, distance, normalization, and directional constants.

Also in this package: Location, Transform, Vector2d, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public int getX()
  public void setX(int x)
  public int getY()
  public void setY(int y)
  public Vector2i assign(Vector2i v)
  public Vector2i assign(int v)
  public Vector2i assign(int[] v)
  public Vector2i assign(int x, int y)
  public Vector2i add(Vector2i v)
  public Vector2i add(int x, int y)
  public Vector2i addScaled(Vector2i v, int s)
  public Vector2i subtract(Vector2i v)
  public Vector2i subtract(int x, int y)
  public Vector2i negate()
  public Vector2i scale(int s)
  public Vector2i scale(Vector2i p)
  public int dot(Vector2i other)
  public double distanceTo(Vector2i v)
  public double distanceTo(int x, int y)
  public int distanceSquaredTo(Vector2i v)
  public int distanceSquaredTo(int x, int y)
  public Vector2i normalize()
  public double length()
  public double squaredLength()
  public Vector2i setLength(int newLen)
  public Vector2i clampLength(int maxLength)
  public Vector2i dropHash()
  public Vector2i clone()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Vector2i max(Vector2i a, Vector2i b)
  public static Vector2i min(Vector2i a, Vector2i b)

Fields:
public static final BuilderCodec<Vector2i> CODEC
public static final Vector2i ZERO
public static final Vector2i UP
public static final Vector2i POS_Y
public static final Vector2i DOWN
public static final Vector2i NEG_Y
public static final Vector2i RIGHT
public static final Vector2i POS_X
public static final Vector2i LEFT
public static final Vector2i NEG_X
public static final Vector2i ALL_ONES
public static final Vector2i[] DIRECTIONS
public int x
public int y
private transient int hash
