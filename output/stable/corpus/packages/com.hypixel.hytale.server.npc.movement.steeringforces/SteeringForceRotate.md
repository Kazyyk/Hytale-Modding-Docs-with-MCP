# SteeringForceRotate

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public class SteeringForceRotate extends SteeringForce

Steering force for rotating toward a direction.

Also in this package: SteeringForce, SteeringForceAvoidCollision, SteeringForceEvade, SteeringForcePursue, SteeringForceWander, SteeringForceWithGroup, SteeringForceWithTarget

Complete API:
  public boolean compute(Steering output)
  public void setDesiredHeading(float desiredHeading)
  public void setHeading(float heading)
  public void setHeading(Ref<EntityStore> ref, Entity entity, ComponentAccessor<EntityStore> componentAccessor)
  public void setTolerance(double tolerance)
  public double getDesiredHeading()
  public double getHeading()
  public double getTolerance()

Fields:
private float desiredHeading
private float heading
private double tolerance
