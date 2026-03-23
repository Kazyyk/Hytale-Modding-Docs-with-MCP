# BodyMotionMaintainDistance

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase

public class BodyMotionMaintainDistance extends BodyMotionBase

Maintains a specific distance from a target entity. Combines pursue and evade steering forces to keep the NPC within a configured distance range. Supports configurable approach angles, strafe speeds, and repositioning.

## Key Fields

- initialDesiredDistanceRange | double[] | Target distance range
- moveThreshold | double | Distance deviation before repositioning
- thresholdDistanceRangeSquared | double[] | Squared distance range for threshold checks

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, BodyMotionWanderInRect, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  public boolean computeSteering(Ref<EntityStore> ref, Role support, InfoProvider sensorInfo, double dt, Steering desiredSteering, ComponentAccessor<EntityStore> componentAccessor)
  protected boolean tickStrafingDelay(double dt)
  public void deactivate(Ref<EntityStore> ref, Role role, ComponentAccessor<EntityStore> componentAccessor)

Fields:
protected static final ComponentType<EntityStore,TransformComponent> TRANSFORM_COMPONENT_TYPE
protected static final float POSITIONING_ANGLE_THRESHOLD
protected final double[] initialDesiredDistanceRange
protected final double moveThreshold
protected final double[] thresholdDistanceRangeSquared
protected final double targetDistanceFactor
protected final double relativeForwardsSpeed
protected final double relativeBackwardsSpeed
protected final double moveTowardsSlowdownThreshold
protected final double[] strafingDurationRange
protected final double[] strafingFrequencyRange
protected final int minRangeProviderSlot
protected final int maxRangeProviderSlot
protected final int positioningAngleProviderSlot
protected final double[] desiredDistanceRange
protected double targetDistanceSquared
protected boolean approaching
protected boolean movingAway
protected int strafingDirection
protected double strafingDelay
protected boolean pauseStrafing
protected final SteeringForceEvade flee
protected final SteeringForcePursue seek
protected final Vector3d targetPosition
protected final Vector3d toTarget
protected DoubleParameterProvider cachedMinRangeProvider
protected DoubleParameterProvider cachedMaxRangeProvider
protected DoubleParameterProvider cachedPositioningAngleProvider
protected boolean initialised
