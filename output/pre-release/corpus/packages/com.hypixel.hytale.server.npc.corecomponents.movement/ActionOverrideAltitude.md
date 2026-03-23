# ActionOverrideAltitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: ActionBase

public class ActionOverrideAltitude extends ActionBase

Overrides the NPC's target altitude for flying by setting `desiredAltitudeOverride` on the active `MotionControllerFly`. Only executes when the active motion controller type is `"Fly"`.

Also in this package: ActionCrouch, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
private final double[] desiredRange
