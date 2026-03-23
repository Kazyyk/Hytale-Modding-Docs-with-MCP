# SteeringForceWithGroup

Type: class | Package: com.hypixel.hytale.server.npc.movement.steeringforces | Extends: SteeringForce

public class SteeringForceWithGroup extends SteeringForce

Steering force for group/flock alignment.

Known subclasses: SteeringForceAvoidCollision

Also in this package: SteeringForce, SteeringForceAvoidCollision, SteeringForceEvade, SteeringForcePursue, SteeringForceRotate, SteeringForceWander, SteeringForceWithTarget

Complete API:
  public void setSelf(Ref<EntityStore> ref, Vector3d position, ComponentAccessor<EntityStore> componentAccessor)
  public void setComponentSelector(Vector3d componentSelector)
  public abstract void reset()
  public abstract void add(Ref<EntityStore> var1, CommandBuffer<EntityStore> var2)
  public boolean compute(Steering output)

Fields:
protected final Vector3d selfPosition
protected Vector3d componentSelector
