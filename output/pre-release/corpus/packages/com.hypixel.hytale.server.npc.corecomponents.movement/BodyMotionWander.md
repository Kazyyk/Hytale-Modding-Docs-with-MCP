# BodyMotionWander

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionWanderBase

public class BodyMotionWander extends BodyMotionWanderBase

Random wandering within the NPC's leash radius. Picks random positions within the wander radius relative to the leash point and pathfinds to them.

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  protected double constrainMove(Ref<EntityStore> ref, Role role, Vector3d probePosition, Vector3d targetPosition, double moveDist, ComponentAccessor<EntityStore> componentAccessor)
