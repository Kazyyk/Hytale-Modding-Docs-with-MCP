# AimingHelper

Type: class | Package: com.hypixel.hytale.server.npc.util

public class AimingHelper

Static utility class providing ballistic pitch computation for NPC aiming. Calculates launch angles for parabolic projectile trajectories given distance, height, velocity, and gravity parameters.

## Key Methods

- public static double ensurePossibleThrowSpeed(double distance, double y, double gravity, double throwSpeed)
- public static boolean computePitch(double distance, double height, double velocity, double gravity, float[] resultingPitch)

Also in this package: AimingData, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  public static double ensurePossibleThrowSpeed(double distance, double y, double gravity, double throwSpeed)
  public static boolean computePitch(double distance, double height, double velocity, double gravity, float[] resultingPitch)

Fields:
public static final int MIN_GRAVITY_FOR_PARABOLA
