# BodyMotionTakeOff

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase

public class BodyMotionTakeOff extends BodyMotionBase

Launches a grounded NPC into the air for flying. Applies an upward velocity impulse at the configured `jumpSpeed` and requests a motion controller switch to `"Fly"` mode.

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected final double jumpSpeed
