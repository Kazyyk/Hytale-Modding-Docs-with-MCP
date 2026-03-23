# RootSolver

Type: class | Package: com.hypixel.hytale.server.npc.util

public class RootSolver

Static utility class implementing polynomial root-finding algorithms. Provides solvers for quadratic, cubic, and quartic equations, used by ballistic aiming calculations.

## Key Methods

- public static int solveQuadric(double c2, double c1, double c0, double[] results, int resultIndex)
- public static int solveCubic(double c3, double c2, double c1, double c0, double[] results)
- public static int solveQuartic(double c4, double c3, double c2, double c1, double c0, double[] results)

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, SensorSupportBenchmark, Timer (and 3 more)

Complete API:
  protected static boolean isZero(double x)
  protected static double cubicRoot(double x)
  public static int solveQuadric(double c2, double c1, double c0, double[] results, int resultIndex)
  public static int solveCubic(double c3, double c2, double c1, double c0, double[] results)
  public static int solveQuartic(double c4, double c3, double c2, double c1, double c0, double[] results)

Fields:
public static final double M_PI
public static final double EQN_EPS
