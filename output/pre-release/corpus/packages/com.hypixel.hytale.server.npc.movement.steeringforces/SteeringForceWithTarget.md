# SteeringForceWithTarget

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public abstract class SteeringForceWithTarget extends SteeringForce

Base steering force for target-directed movement.

Known subclasses: SteeringForceEvade, SteeringForcePursue

Also in this package: SteeringForce, SteeringForceAvoidCollision, SteeringForceEvade, SteeringForcePursue, SteeringForceRotate, SteeringForceWander, SteeringForceWithGroup

Complete API:
  public Vector3d getSelfPosition()
  public void setSelfPosition(Vector3d selfPosition)
  public Vector3d getTargetPosition()
  public void setTargetPosition(Vector3d targetPosition)
  public void setTargetPosition(double x, double y, double z)
  public void setPositions(Vector3d self, Vector3d target)
  public void setSelfPosition(double x, double y, double z)
  public void setComponentSelector(Vector3d componentSelector)
  public boolean compute(Steering output)

Fields:
protected final Vector3d selfPosition
protected final Vector3d targetPosition
private Vector3d componentSelector
