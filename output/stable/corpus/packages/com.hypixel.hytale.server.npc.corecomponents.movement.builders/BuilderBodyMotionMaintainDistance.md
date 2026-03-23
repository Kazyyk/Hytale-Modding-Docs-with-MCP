# BuilderBodyMotionMaintainDistance

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionBase

public class BuilderBodyMotionMaintainDistance extends BuilderBodyMotionBase

Builder for distance-maintaining motion with forward/backward speeds, strafing duration and frequency.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BodyMotionMaintainDistance build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionMaintainDistance readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public double[] getDesiredDistanceRange(BuilderSupport support)
  public double getTargetDistanceFactor(BuilderSupport support)
  public double getMoveThreshold(BuilderSupport support)
  public double getRelativeForwardsSpeed(BuilderSupport support)
  public double getRelativeBackwardsSpeed(BuilderSupport support)
  public double getMoveTowardsSlowdownThreshold(BuilderSupport support)
  public double[] getStrafingDurationRange(BuilderSupport support)
  public double[] getStrafingFrequencyRange(BuilderSupport support)

Fields:
public static final String MIN_RANGE_PARAMETER
public static final String MAX_RANGE_PARAMETER
public static final String POSITIONING_ANGLE_PARAMETER
public static final double NO_POSITIONING
public static final double[] DEFAULT_STRAFING_DURATION_RANGE
public static final double[] DEFAULT_STRAFING_FREQUENCY_RANGE
protected final NumberArrayHolder desiredDistanceRange
protected final DoubleHolder targetDistanceFactor
protected final DoubleHolder moveThreshold
protected final DoubleHolder relativeForwardsSpeed
protected final DoubleHolder relativeBackwardsSpeed
protected final DoubleHolder moveTowardsSlowdownThreshold
protected final NumberArrayHolder strafingDurationRange
protected final NumberArrayHolder strafingFrequencyRange
