# BodyMotionTeleport

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase

public class BodyMotionTeleport extends BodyMotionBase

Teleports the NPC to a sensor-provided position with configurable offset range and cooldown. Attempts up to 10 random offset positions, validating each against ground clearance and position validity.

## Constants

- MAX_TRIES | 10 | Maximum teleport position attempts
- MIN_MOVE_CHANGE | 1 | Minimum distance for teleport to be considered movement
- TELEPORT_COOLDOWN | 0.5 | Cooldown in seconds between teleports

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public void activate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computeSteering(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean tickCooldown(double dt)

Fields:
public static final int MAX_TRIES
public static final int MIN_MOVE_CHANGE
public static final double TELEPORT_COOLDOWN
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final ComponentType<EntityStore,BoundingBox> BOUNDING_BOX_COMPONENT_TYPE
protected final double minOffset
protected final double maxOffset
protected final double maxYOffset
protected final float angle
protected final BodyMotionTeleport.Orientation orientation
protected final Vector3d target
protected final Vector3d offsetVector
protected final Vector3d lastTriedTarget
protected int tries
protected double cooldown
