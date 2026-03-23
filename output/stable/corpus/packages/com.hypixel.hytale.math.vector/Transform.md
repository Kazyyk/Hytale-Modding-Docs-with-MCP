# Transform

Type: class | Package: com.hypixel.hytale.math.vector

public class Transform

Combines a `Vector3d` position and `Vector3f` rotation (pitch/yaw/roll). Supports relative transform masks, direction calculation, axis detection, and codec serialization in both radians and degrees.

Known implementors: Composite, Mirror, Rotate, Translate

Also in this package: Location, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public void assign(Transform transform)
  public Vector3d getPosition()
  public void setPosition(Vector3d position)
  public Vector3f getRotation()
  public void setRotation(Vector3f rotation)
  public Vector3d getDirection()
  public static Vector3d getDirection(float pitch, float yaw)
  public Vector3i getAxisDirection()
  public Vector3i getAxisDirection(float pitch, float yaw)
  public Axis getAxis()
  public Transform clone()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()
  public static void applyMaskedRelativeTransform(Transform transform, byte relativeMask, Vector3d sourcePosition, Vector3f sourceRotation, Vector3i blockPosition)

Fields:
public static final BuilderCodec<Transform> CODEC
public static final BuilderCodec<Transform> CODEC_DEGREES
protected Vector3d position
protected Vector3f rotation
public static final int X_IS_RELATIVE
public static final int Y_IS_RELATIVE
public static final int Z_IS_RELATIVE
public static final int YAW_IS_RELATIVE
public static final int PITCH_IS_RELATIVE
public static final int ROLL_IS_RELATIVE
public static final int RELATIVE_TO_BLOCK
