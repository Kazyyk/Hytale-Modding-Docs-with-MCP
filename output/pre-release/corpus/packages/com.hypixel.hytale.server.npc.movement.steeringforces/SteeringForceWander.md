# SteeringForceWander

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public class SteeringForceWander extends SteeringForce

Steering force for random wandering behavior.

Also in this package: SteeringForce, SteeringForceAvoidCollision, SteeringForceEvade, SteeringForcePursue, SteeringForceRotate, SteeringForceWithGroup, SteeringForceWithTarget

Complete API:
  public void setTurnTime(double t)
  public void updateTime(double dt)
  public void setHeading(float heading)
  public boolean compute(Steering output)

Fields:
private double time
private double turnInterval
private double jitter
private final Vector3d velocity
