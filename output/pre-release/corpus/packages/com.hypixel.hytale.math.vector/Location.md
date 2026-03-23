# Location

Type: class | Package: com.hypixel.hytale.math.vector

public class Location

Represents a named world location with position and rotation. Used for teleportation targets and spawn points.

Also in this package: Transform, Vector2d, Vector2i, Vector2l, Vector3d, Vector3f, Vector3i, Vector3l, Vector4d, VectorBoxUtil, VectorSphereUtil

Complete API:
  public String getWorld()
  public void setWorld(String world)
  public Vector3d getPosition()
  public void setPosition(Vector3d position)
  public Vector3f getRotation()
  public void setRotation(Vector3f rotation)
  public Vector3d getDirection()
  public Vector3i getAxisDirection()
  public Vector3i getAxisDirection(float pitch, float yaw)
  public Axis getAxis()
  public Transform toTransform()
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
protected String world
protected Vector3d position
protected Vector3f rotation
