# BodyMotionLand

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFind

public class BodyMotionLand extends BodyMotionFind

Lands a flying NPC on the ground. Extends `BodyMotionFind` with a goal lenience check. When the NPC is within `goalLenience` of the ground and at low altitude, switches the motion controller to walk mode by calling `requestControllerSwitch("Walk")`.

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider infoProvider, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canComputeMotion(Ref<EntityStore> ref, Role role, InfoProvider positionProvider, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean isGoalReached(Ref<EntityStore> ref, MotionController motionController, Vector3d position, Vector3d targetPosition, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final double goalLenience
protected final double goalLenienceSquared
