# BuilderBodyMotionWanderInCircle

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionWanderBase

public class BuilderBodyMotionWanderInCircle extends BuilderBodyMotionWanderBase

Builder for wandering within a circular area around spawn position.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BodyMotionWanderInCircle build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionWanderInCircle readConfig(JsonElement data)
  public double getRadius(BuilderSupport builderSupport)
  public boolean isFlock()
  public boolean isUseSphere()

Fields:
protected final DoubleHolder radius
protected boolean flock
protected boolean useSphere
