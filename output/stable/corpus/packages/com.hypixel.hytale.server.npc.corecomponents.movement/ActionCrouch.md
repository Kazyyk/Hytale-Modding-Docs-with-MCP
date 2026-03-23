# ActionCrouch

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: ActionBase

public class ActionCrouch extends ActionBase

Toggles the NPC's crouching state via `MovementStatesComponent`. Sets `movementStates.crouching` to the configured boolean value.

Also in this package: ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)

Fields:
private final boolean crouching
