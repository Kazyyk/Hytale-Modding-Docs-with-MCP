# BuilderBodyMotionFindWithTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement.builders | Extends: BuilderBodyMotionFindBase

public abstract class BuilderBodyMotionFindWithTarget extends BuilderBodyMotionFindBase

Abstract builder extending find-base with target tracking parameters: wait distance, recompute distance, reproject distance, and hitbox range adjustment.

Known subclasses: BuilderBodyMotionFind, BuilderBodyMotionMoveAway

Also in this package: BuilderActionCrouch, BuilderActionOverrideAltitude, BuilderActionRecomputePath, BuilderBodyMotionFind, BuilderBodyMotionFindBase, BuilderBodyMotionLand, BuilderBodyMotionLeave, BuilderBodyMotionMaintainDistance, BuilderBodyMotionMatchLook, BuilderBodyMotionMoveAway, BuilderBodyMotionTakeOff, BuilderBodyMotionTeleport, BuilderBodyMotionWander, BuilderBodyMotionWanderBase, BuilderBodyMotionWanderInCircle, BuilderBodyMotionWanderInRect, BuilderSensorInAir, BuilderSensorMotionController, BuilderSensorNav, BuilderSensorOnGround

Complete API:
  public BuilderBodyMotionFindBase readConfig(JsonElement data)
  public double getMinMoveDistanceWait(BuilderSupport support)
  public double getMinMoveDistanceRecompute(BuilderSupport support)
  public double getRecomputeConeAngle(BuilderSupport support)
  public boolean isAdjustRangeByHitboxSize(BuilderSupport support)
  public double getMinMoveDistanceReproject(BuilderSupport support)

Fields:
protected final DoubleHolder minMoveDistanceWait
protected final DoubleHolder minMoveDistanceRecompute
protected final FloatHolder recomputeConeAngle
protected final DoubleHolder minMoveDistanceReproject
protected final BooleanHolder adjustRangeByHitboxSize
