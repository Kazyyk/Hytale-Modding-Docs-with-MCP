# BuilderSensorMotionController

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderSensorBase

public class BuilderSensorMotionController extends BuilderSensorBase

Builder for sensor testing if a specific motion controller is active.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public Sensor build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public String getMotionControllerName()

Fields:
protected String motionControllerName
