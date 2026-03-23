# BodyMotionWanderInRect

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionWanderBase

public class BodyMotionWanderInRect extends BodyMotionWanderBase

Wanders in a rectangular region around the NPC's leash point. Constrains wander targets to a configured rectangular area.

Also in this package: ActionCrouch, ActionOverrideAltitude, ActionRecomputePath, BodyMotionFind, BodyMotionFindBase, BodyMotionFindWithTarget, BodyMotionLand, BodyMotionLeave, BodyMotionMaintainDistance, BodyMotionMatchLook, BodyMotionMoveAway, BodyMotionTakeOff, BodyMotionTeleport, BodyMotionWander, BodyMotionWanderBase, BodyMotionWanderInCircle, DebugFlags, Orientation, SensorInAir, SensorMotionController (and 3 more)

Complete API:
  protected double constrainMove(Ref<EntityStore> ref, Role role, Vector3d probePosition, Vector3d targetPosition, double moveDist, ComponentAccessor<EntityStore> componentAccessor)
  protected int sectorCode(double x, double z)
  protected double distanceSquared(double x, double z, int sector)

Fields:
public static final int LEFT
public static final int RIGHT
public static final int BOTTOM
public static final int TOP
public static final int VERTICAL_MASK
public static final int HORIZONTAL_MASK
protected final double width
protected final double depth
protected final double halfWidth
protected final double halfDepth
