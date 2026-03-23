# BuilderBodyMotionTakeOff

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionBase

public class BuilderBodyMotionTakeOff extends BuilderBodyMotionBase

Builder for switching from walk to fly motion controller.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BodyMotion build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<BodyMotion> readConfig(JsonElement data)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public double getJumpSpeed()

Fields:
protected double jumpSpeed
