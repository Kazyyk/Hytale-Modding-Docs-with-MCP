# BuilderBodyMotionTeleport

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionBase

public class BuilderBodyMotionTeleport extends BuilderBodyMotionBase

Builder for NPC teleportation to sensor-provided position with offset range and orientation.

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionFindWithTarget, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BodyMotion build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionTeleport readConfig(JsonElement data)
  public double[] getOffsetRadius()
  public double getMaxYOffset()
  public float getSectorRadians()
  public BodyMotionTeleport.Orientation getOrientation()

Fields:
public static final double[] DEFAULT_OFFSET_RADIUS
protected double[] offsetRadius
protected double maxYOffset
protected float sector
protected BodyMotionTeleport.Orientation orientation
