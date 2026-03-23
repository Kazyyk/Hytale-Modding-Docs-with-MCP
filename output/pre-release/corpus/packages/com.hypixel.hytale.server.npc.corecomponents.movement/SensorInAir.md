# SensorInAir

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: SensorBase

public class SensorInAir extends SensorBase

Detects if the NPC is airborne by checking the movement states component for `inAir` status.

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorMotionController (and 3 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()
