# BuilderActionOverrideAltitude

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderActionBase

public class BuilderActionOverrideAltitude extends BuilderActionBase

Builder for temporarily overriding a flying NPC's preferred altitude.

Also in this package: BuilderActionCrouch, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Action build(BuilderSupport builderSupport)
  public Builder<Action> readConfig(JsonElement data)
  public double[] getDesiredAltitudeRange(BuilderSupport support)

Fields:
protected final NumberArrayHolder desiredAltitudeRange
