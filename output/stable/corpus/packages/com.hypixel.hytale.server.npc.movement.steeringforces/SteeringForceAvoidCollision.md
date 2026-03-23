# SteeringForceAvoidCollision

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public class SteeringForceAvoidCollision extends SteeringForce

Steering force for collision avoidance.

Also in this package: SteeringForce, SteeringForceEvade, SteeringForcePursue, SteeringForceRotate, SteeringForceWander, SteeringForceWithGroup, SteeringForceWithTarget

Complete API:
  public void setDebug(boolean debug)
  public Role.AvoidanceMode getAvoidanceMode()
  public void setAvoidanceMode(Role.AvoidanceMode avoidanceMode)
  public void setSelf(Ref<EntityStore> ref, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public void setSelf(Ref<EntityStore> ref, Vector3d position, Vector3d velocity, double radius, ComponentAccessor<EntityStore> componentAccessor)
  public void reset()
  public boolean compute(Steering output)
  public void add(Ref<EntityStore> ref, CommandBuffer<EntityStore> commandBuffer)
  public void setVelocityFromEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void setRadiusFromEntity(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public void setMaxDistance(double distance)
  public void setFalloff(double falloff)
  public void setSelfVelocity(Vector3d selfVelocity)
  public Vector3d getSelfVelocity()
  public double getSelfRadius()
  public void setSelfRadius(double selfRadius)
  public double getStrength()
  public void setStrength(double strength)
  public Vector3d getLastSteeringDirection()

Fields:
private final Vector3d selfVelocity
private double selfRadius
private double collisionTime
private final Vector3d colliderPosition
private final double[] tempTime
private final Vector3d tempPos
private final Vector3d tempVel
private double maxDistance
private double falloff
private double strength
private Role.AvoidanceMode avoidanceMode
private Ref<EntityStore> selfReference
private Ref<EntityStore> otherReference
private double velocity
private double maxTime
private boolean canSlowDown
private boolean overlap
protected final Vector3d lastSteeringDirection
private boolean debug
