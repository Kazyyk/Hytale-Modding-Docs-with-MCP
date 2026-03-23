# BodyMotionWanderInCircle

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionWanderBase

public class BodyMotionWanderInCircle extends BodyMotionWanderBase

Wanders in a circular pattern around the NPC's leash point. Constrains wander targets to a configured radius.

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  protected double constrainMove(Ref<EntityStore> ref, Role role, Vector3d probePosition, Vector3d targetPosition, double moveDist, ComponentAccessor<EntityStore> componentAccessor)
  protected Vector3d getReferencePoint(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final double radius
protected final boolean flock
protected final boolean useSphere
protected final Vector3d referencePoint
