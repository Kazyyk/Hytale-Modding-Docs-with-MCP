# BuilderSensorNav

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderSensorBase

public class BuilderSensorNav extends BuilderSensorBase

Builder for sensor querying navigation/pathfinding state.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorOnGround

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public EnumSet<NavState> getNavStates(BuilderSupport builderSupport)
  public double getThrottleDuration(BuilderSupport support)
  public double getTargetDelta(BuilderSupport support)

Fields:
protected final EnumSetHolder<NavState> navStateEnumSetHolder
protected final DoubleHolder throttleDuration
protected final DoubleHolder targetDelta
