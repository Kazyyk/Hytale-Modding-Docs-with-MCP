# BuilderBodyMotionWanderBase

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders

public abstract class BuilderBodyMotionWanderBase

Abstract base builder for wander motions. Configures walk time, heading change, speed, stop distance, and altitude preference.

Known subclasses: BuilderBodyMotionWander, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BodyMotionWanderBase build(BuilderSupport builderSupport)
  public Builder<BodyMotion> readCommonConfig(JsonElement data)
  public double getMinWalkTime(BuilderSupport support)
  public double getMaxWalkTime(BuilderSupport support)
  public float getMinHeadingChange(BuilderSupport support)
  public float getMaxHeadingChange(BuilderSupport support)
  public boolean isRelaxHeadingChange(BuilderSupport support)
  public double getRelativeSpeed(BuilderSupport support)
  public double getMinMoveDistance(BuilderSupport support)
  public double getStopDistance(BuilderSupport support)
  public boolean isAvoidingBlockDamage(BuilderSupport support)
  public boolean isRelaxedMoveConstraints(BuilderSupport support)
  public int getTestsPerTick(BuilderSupport support)
  public double getDesiredAltitudeWeight(BuilderSupport support)

Fields:
protected final DoubleHolder minWalkTime
protected final DoubleHolder maxWalkTime
protected final FloatHolder minHeadingChange
protected final FloatHolder maxHeadingChange
protected final BooleanHolder relaxHeadingChange
protected final DoubleHolder relativeSpeed
protected final DoubleHolder minMoveDistance
protected final DoubleHolder stopDistance
protected final BooleanHolder isAvoidingBlockDamage
protected final BooleanHolder isRelaxedMoveConstraints
protected final IntHolder testsPerTick
protected final DoubleHolder desiredAltitudeWeight
