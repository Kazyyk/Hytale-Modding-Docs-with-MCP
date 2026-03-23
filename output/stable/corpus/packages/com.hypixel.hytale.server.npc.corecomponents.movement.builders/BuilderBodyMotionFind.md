# BuilderBodyMotionFind

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionFindWithTarget

public class BuilderBodyMotionFind extends BuilderBodyMotionFindWithTarget

Builder for chase-target body motion using pathfinding or steering.

Known subclasses: BuilderBodyMotionLand

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BodyMotionFind build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionFind readConfig(JsonElement data)
  public boolean getReachable(BuilderSupport support)
  public double getStopDistance(BuilderSupport support)
  public double[] getHeightDifference(BuilderSupport support)
  public double getAbortDistance(BuilderSupport support)
  public double getFalloff(BuilderSupport support)
  public double getSlowDownDistance(BuilderSupport builderSupport)
  public double getSwitchToSteeringDistance(BuilderSupport support)

Fields:
private static final double[] DEFAULT_HEIGHT_DIFFERENCE
private final BooleanHolder reachable
private final NumberArrayHolder heightDifference
private final DoubleHolder slowDownDistance
private final DoubleHolder stopDistance
private final DoubleHolder abortDistance
private final DoubleHolder falloff
private final DoubleHolder switchToSteeringDistance
