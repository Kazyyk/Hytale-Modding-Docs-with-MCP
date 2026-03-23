# SensorNav

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: SensorBase

public class SensorNav extends SensorBase

Checks the NPC's navigation state against a configured `NavState` value. Used to detect pathfinding status (e.g., navigating, idle, stuck).

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir (and 3 more)

Complete API:
  public boolean matches(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)
  public InfoProvider getSensorInfo()

Fields:
protected final EnumSet<NavState> navStates
protected final double throttleDuration
protected final double targetDeltaSquared
