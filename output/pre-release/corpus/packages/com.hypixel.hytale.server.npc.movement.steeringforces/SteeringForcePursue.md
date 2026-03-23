# SteeringForcePursue

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public class SteeringForcePursue extends SteeringForce

Steering force for pursuing a target entity.

Also in this package: SteeringForce, SteeringForceAvoidCollision, SteeringForceEvade, SteeringForceRotate, SteeringForceWander, SteeringForceWithGroup, SteeringForceWithTarget

Complete API:
  public void setDistances(double slowdown, double stop)
  public boolean compute(Steering output)
  public double getStopDistance()
  public void setStopDistance(double stopDistance)
  public double getSlowdownDistance()
  public void setSlowdownDistance(double slowdownDistance)
  public double getFalloff()
  public void setFalloff(double falloff)

Fields:
private double stopDistance
private double slowdownDistance
private double falloff
private double invFalloff
private double squaredStopDistance
private double squaredSlowdownDistance
private double distanceDelta
