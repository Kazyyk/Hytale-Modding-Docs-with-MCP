# BuilderBodyMotionMoveAway

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionFindWithTarget

public class BuilderBodyMotionMoveAway extends BuilderBodyMotionFindWithTarget

Builder for move-away-from-target motion with erratic behavior at close range.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BodyMotionMoveAway build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionMoveAway readConfig(JsonElement data)
  public double getSlowdownDistance(BuilderSupport support)
  public double getStopDistance(BuilderSupport support)
  public double getFalloff(BuilderSupport support)
  public double[] getHoldDirectionDurationRange(BuilderSupport support)
  public float getChangeDirectionViewSectorRadians(BuilderSupport support)
  public float getDirectionJitterRadians(BuilderSupport support)
  public double getErraticDistance(BuilderSupport support)
  public float getErraticExtraJitterRadians(BuilderSupport support)
  public double getErraticChangeDurationMultiplier(BuilderSupport support)

Fields:
private static final double[] DEFAULT_HOLD_DIRECTION_DURATION_RANGE
protected final DoubleHolder slowdownDistance
protected final DoubleHolder stopDistance
protected final DoubleHolder falloff
protected final NumberArrayHolder holdDirectionDurationRange
protected final DoubleHolder changeDirectionViewSector
protected final DoubleHolder directionJitter
protected final DoubleHolder erraticDistance
protected final DoubleHolder erraticExtraJitter
protected final DoubleHolder erraticChangeDurationMultiplier
