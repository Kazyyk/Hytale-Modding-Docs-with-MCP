# Vector3i

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector3i

Mutable 3D vector with integer components. Provides arithmetic, cross/dot products, distance, and conversion to `Vector3d`/`Vector3f`/`Vector3l`. Includes directional and block geometry constants.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public int getX()
  public void setX(int x)
  public int getY()
  public void setY(int y)
  public int getZ()
  public void setZ(int z)
  public Vector3i assign(Vector3i v)
  public Vector3i assign(int v)
  public Vector3i assign(int[] v)
  public Vector3i assign(int x, int y, int z)
  public Vector3i add(Vector3i v)
  public Vector3i add(int x, int y, int z)
  public Vector3i addScaled(Vector3i v, int s)
  public Vector3i subtract(Vector3i v)
  public Vector3i subtract(int x, int y, int z)
  public Vector3i negate()
  public Vector3i scale(int s)
  public Vector3i scale(double s)
  public Vector3i scale(Vector3i p)
  public Vector3i cross(Vector3i v)
  public Vector3i cross(Vector3i v, Vector3i res)
  public int dot(Vector3i other)
  public double distanceTo(Vector3i v)
  public double distanceTo(int x, int y, int z)
  public int distanceSquaredTo(Vector3i v)
  public int distanceSquaredTo(int x, int y, int z)
  public Vector3i normalize()
  public double length()
  public int squaredLength()
  public Vector3i setLength(int newLen)
  public Vector3i clampLength(int maxLength)
  public Vector3i dropHash()
  public Vector3i clone()
  public Vector3d toVector3d()
  public Vector3f toVector3f()
  public Vector3l toVector3l()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static Vector3i max(Vector3i a, Vector3i b)
  public static Vector3i min(Vector3i a, Vector3i b)
  public static Vector3i directionTo(Vector3i from, Vector3i to)
  public static Vector3i add(Vector3i one, Vector3i two)
  public static Vector3i add(Vector3i one, Vector3i two, Vector3i three)

Fields:
public static final BuilderCodec<Vector3i> CODEC
public static final Vector3i ZERO
public static final Vector3i UP
public static final Vector3i POS_Y
public static final Vector3i DOWN
public static final Vector3i NEG_Y
public static final Vector3i FORWARD
public static final Vector3i NEG_Z
public static final Vector3i NORTH
public static final Vector3i BACKWARD
public static final Vector3i POS_Z
public static final Vector3i SOUTH
public static final Vector3i RIGHT
public static final Vector3i POS_X
public static final Vector3i EAST
public static final Vector3i LEFT
public static final Vector3i NEG_X
public static final Vector3i WEST
public static final Vector3i ALL_ONES
public static final Vector3i MIN
public static final Vector3i MAX
public static final Vector3i[] BLOCK_SIDES
public static final Vector3i[] BLOCK_EDGES
public static final Vector3i[] BLOCK_CORNERS
public static final Vector3i[][] BLOCK_PARTS
public static final Vector3i[] CARDINAL_DIRECTIONS
public int x
public int y
public int z
private transient int hash
