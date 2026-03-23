# Vector4d

Type: class | Package: com.hypixel.hytale.math.vector

public class Vector4d

Mutable 4D vector with double-precision components (x, y, z, w). Used for homogeneous coordinates and perspective transforms. Provides factory methods for position (w=1) and direction (w=0) vectors.

Also in this package: Location, Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, VectorBoxUtil, VectorSphereUtil

Complete API:
  public static Vector4d newPosition(double x, double y, double z)
  public static Vector4d newPosition(Vector3d v)
  public static Vector4d newDirection(double x, double y, double z)
  public Vector4d setDirection()
  public Vector4d setPosition()
  public Vector4d assign(Vector4d v)
  public Vector4d assign(double x, double y, double z, double w)
  public Vector4d lerp(Vector4d dest, double lerpFactor, Vector4d target)
  public void perspectiveTransform()
  public boolean isInsideFrustum()
  public double get(int component)
  public String toString()

Fields:
public static final int COMPONENT_X
public static final int COMPONENT_Y
public static final int COMPONENT_Z
public static final int COMPONENT_W
public double x
public double y
public double z
public double w
