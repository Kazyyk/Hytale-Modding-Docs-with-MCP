# AimingData

Type: class | Package: com.hypixel.hytale.server.npc.util | Implements: ExtraInfoProvider

public class AimingData implements ExtraInfoProvider

Stores aiming state for NPC projectile and close-combat targeting. Computes ballistic pitch/yaw solutions for both flat and arced trajectories, tracks the current target reference, and determines whether the NPC is on-target within a specified hit angle.

## Key Methods

- public boolean isHaveAttacked()
- public void setHaveAttacked(boolean haveAttacked)
- public void requireBallistic(BallisticData ballisticData)
- public void requireCloseCombat()
- public float getPitch()
- public float getPitch(boolean flatTrajectory)
- public float getYaw()
- public float getYaw(boolean flatTrajectory)
- public BallisticData getBallisticData()
- public void setUseFlatTrajectory(boolean useFlatTrajectory)
- public void setChargeDistance(double chargeDistance)
- public double getChargeDistance()
- public void setDesiredHitAngle(double desiredHitAngle)
- public double getDesiredHitAngle()
- public Class<AimingData> getType()
- public void setDepthOffset(double depthOffset, boolean pitchAdjustOffset)
- public Ref<EntityStore> getTarget()
- public void setTarget(Ref<EntityStore> ref)
- public boolean haveOrientation()
- public void setOrientation(float yaw, float pitch)

Also in this package: AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  public boolean isHaveAttacked()
  public void setHaveAttacked(boolean haveAttacked)
  public void requireBallistic(BallisticData ballisticData)
  public void requireCloseCombat()
  public float getPitch()
  public float getPitch(boolean flatTrajectory)
  public float getYaw()
  public float getYaw(boolean flatTrajectory)
  public BallisticData getBallisticData()
  public void setUseFlatTrajectory(boolean useFlatTrajectory)
  public void setChargeDistance(double chargeDistance)
  public double getChargeDistance()
  public void setDesiredHitAngle(double desiredHitAngle)
  public double getDesiredHitAngle()
  public Class<AimingData> getType()
  public void setDepthOffset(double depthOffset, boolean pitchAdjustOffset)
  public Ref<EntityStore> getTarget()
  public void setTarget(Ref<EntityStore> ref)
  public boolean haveOrientation()
  public void setOrientation(float yaw, float pitch)
  public void clearSolution()
  public boolean computeSolution(double x, double y, double z, double vx, double vy, double vz)
  public boolean isOnTarget(float yaw, float pitch, double hitAngle)
  public void tryClaim(int id)
  public boolean isClaimedBy(int id)
  public void release()
  public void clear()

Fields:
public static final double MIN_MOVE_SPEED_STATIC
public static final double MIN_MOVE_SPEED_STATIC_2
public static final double MIN_AIMING_DISTANCE
public static final double MIN_AIMING_DISTANCE_2
public static final double MIN_AIR_TIME
public static final double ANGLE_EPSILON
private BallisticData ballisticData
private boolean useFlatTrajectory
private double depthOffset
private boolean pitchAdjustOffset
private boolean haveSolution
private boolean haveOrientation
private boolean haveAttacked
private double chargeDistance
private double desiredHitAngle
private final float[] pitch
private final float[] yaw
private Ref<EntityStore> target
private int owner
