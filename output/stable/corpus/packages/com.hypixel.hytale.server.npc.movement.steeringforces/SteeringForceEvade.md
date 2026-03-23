# SteeringForceEvade

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public class SteeringForceEvade extends SteeringForce

Steering force for evading a target entity.

Also in this package: SteeringForce, SteeringForceAvoidCollision, SteeringForcePursue, SteeringForceRotate, SteeringForceWander, SteeringForceWithGroup, SteeringForceWithTarget

Complete API:
  public void setDistances(double min, double max)
  public void setDirectionHint(float heading)
  public void setAdhereToDirectionHint(boolean adhereToDirectionHint)
  public boolean compute(Steering output)
  public double getSlowdownDistance()
  public void setSlowdownDistance(double slowdownDistance)
  public double getStopDistance()
  public void setStopDistance(double stopDistance)
  public double getFalloff()
  public void setFalloff(double falloff)

Fields:
private double slowdownDistance
private double stopDistance
private double falloff
private double squaredSlowdownDistance
private double squaredStopDistance
private double distanceDelta
private float directionHint
private boolean adhereToDirectionHint
