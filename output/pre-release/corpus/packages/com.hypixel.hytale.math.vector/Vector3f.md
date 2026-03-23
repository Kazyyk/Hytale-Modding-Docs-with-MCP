# Vector3f

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector3f

Mutable 3D float vector also used for rotations (pitch=x, yaw=y, roll=z). Provides arithmetic, cross/dot products, rotation, axis operations, lookAt calculation, and directional constants.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public float getX()
  public float getPitch()
  public void setX(float x)
  public void setPitch(float pitch)
  public float getY()
  public float getYaw()
  public void setY(float y)
  public void setYaw(float yaw)
  public float getZ()
  public float getRoll()
  public void setZ(float z)
  public void setRoll(float roll)
  public Vector3f assign(Vector3f v)
  public Vector3f assign(float v)
  public Vector3f assign(float[] v)
  public Vector3f assign(float yaw, float pitch)
  public Vector3f assign(float x, float y, float z)
  public Vector3f add(Vector3f v)
  public Vector3f add(Vector3i v)
  public Vector3f add(float x, float y, float z)
  public void addPitch(float pitch)
  public void addYaw(float yaw)
  public void addRoll(float roll)
  public Vector3f addScaled(Vector3f v, float s)
  public Vector3f subtract(Vector3f v)
  public Vector3f subtract(Vector3i v)
  public Vector3f subtract(float x, float y, float z)
  public void addRotationOnAxis(Axis axis, int angle)
  public void flipRotationOnAxis(Axis axis)
  public Vector3f negate()
  public Vector3f scale(float s)
  public Vector3f scale(Vector3f p)
  public Vector3f cross(Vector3f v)
  public Vector3f cross(Vector3f v, Vector3f res)
  public float dot(Vector3f other)
  public float distanceTo(Vector3f v)
  public float distanceTo(Vector3i v)
  public float distanceTo(float x, float y, float z)
  public float distanceSquaredTo(Vector3f v)
  public float distanceSquaredTo(Vector3i v)
  public float distanceSquaredTo(float x, float y, float z)
  public Vector3f normalize()
  public float length()
  public float squaredLength()
  public Vector3f setLength(float newLen)
  public Vector3f clampLength(float maxLength)
  public Vector3f rotateX(float angle)
  public Vector3f rotateY(float angle)
  public Vector3f rotateZ(float angle)
  public Vector3f floor()
  public Vector3f ceil()
  public Vector3f clipToZero(float epsilon)
  public boolean closeToZero(float epsilon)
  public boolean isInside(int x, int y, int z)
  public boolean isFinite()
  public Vector3f dropHash()
  public Vector3f clone()
  public boolean equals(Object o)
  public boolean equals(Vector3f o)
  public int hashCode()
  public String toString()
  public Vector3d toVector3d()
  public static Vector3f max(Vector3f a, Vector3f b)
  public static Vector3f min(Vector3f a, Vector3f b)
  public static Vector3f lerp(Vector3f a, Vector3f b, float t)
  public static Vector3f lerpUnclamped(Vector3f a, Vector3f b, float t)
  public static Vector3f lerpAngle(Vector3f a, Vector3f b, float t)
  public static Vector3f lerpAngle(Vector3f a, Vector3f b, float t, Vector3f target)
  public static Vector3f directionTo(Vector3f from, Vector3f to)
  public static Vector3f add(Vector3f one, Vector3f two)
  public static Vector3f add(Vector3f one, Vector3f two, Vector3f three)
  public static Vector3f lookAt(Vector3d relative)
  public static Vector3f lookAt(Vector3d relative, Vector3f result)

Fields:
public static final BuilderCodec<Vector3f> CODEC
public static final BuilderCodec<Vector3f> ROTATION
public static final Vector3f ZERO
public static final Vector3f UP
public static final Vector3f POS_Y
public static final Vector3f DOWN
public static final Vector3f NEG_Y
public static final Vector3f FORWARD
public static final Vector3f NEG_Z
public static final Vector3f NORTH
public static final Vector3f BACKWARD
public static final Vector3f POS_Z
public static final Vector3f SOUTH
public static final Vector3f RIGHT
public static final Vector3f POS_X
public static final Vector3f EAST
public static final Vector3f LEFT
public static final Vector3f NEG_X
public static final Vector3f WEST
public static final Vector3f ALL_ONES
public static final Vector3f MIN
public static final Vector3f MAX
public static final Vector3f NaN
public static final Vector3f[] BLOCK_SIDES
public static final Vector3f[] BLOCK_EDGES
public static final Vector3f[] BLOCK_CORNERS
public static final Vector3f[][] BLOCK_PARTS
public static final Vector3f[] CARDINAL_DIRECTIONS
public float x
public float y
public float z
private transient int hash
