# VisHelper

Type: class | Package: com.hypixel.hytale.server.npc.util

public class VisHelper

Utility class providing static methods for rendering debug vectors and spheres in the world via `DebugUtils`. Used by NPC systems for visualizing steering, avoidance, and separation directions.

## Constants

- public static final Vector3f DEBUG_COLOR_STEERING_POST
- public static final Vector3f DEBUG_COLOR_STEERING_PRE
- public static final Vector3f DEBUG_COLOR_AVOIDANCE
- public static final Vector3f DEBUG_COLOR_SEPARATION
- public static final double DEBUG_MIN_VECTOR_DRAW_LENGTH_SQUARED
- public static final double DEBUG_VECTORS_SCALE
- public static final float DEBUG_VECTORS_TIME
- public static final float DEBUG_TRANSPARENT
- public static final double DEBUG_SPHERE_SCALE

## Methods

- public static void renderDebugVector(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, @Nonnull World world)
- public static void renderDebugVector(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, float opacity, @Nonnull World world)
- public static void renderDebugVectorTo(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, @Nonnull World world)
- public static void renderDebugVectorTo(@Nonnull Vector3d position, @Nonnull Vector3d direction, @Nonnull Vector3f color, float opacity, @Nonnull World world)
- public static void renderDebugSphere(@Nonnull Vector3d position, @Nonnull Vector3f color, @Nonnull World world)
- public static void renderDebugSphere(@Nonnull Vector3d position, @Nonnull Vector3f color, float opacity, @Nonnull World world)
- public static void renderDebugSphere(@Nonnull Vector3d position, double radius, @Nonnull Vector3f color, @Nonnull World world)
- public static void renderDebugSphere(@Nonnull Vector3d position, double radius, @Nonnull Vector3f color, float opacity, @Nonnull World world)

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark (and 4 more)

Complete API:
  public static void renderDebugVector(Vector3d position, Vector3d direction, Vector3f color, World world)
  public static void renderDebugVector(Vector3d position, Vector3d direction, Vector3f color, float opacity, World world)
  public static void renderDebugVectorTo(Vector3d position, Vector3d direction, Vector3f color, World world)
  public static void renderDebugVectorTo(Vector3d position, Vector3d direction, Vector3f color, float opacity, World world)
  public static void renderDebugSphere(Vector3d position, Vector3f color, World world)
  public static void renderDebugSphere(Vector3d position, Vector3f color, float opacity, World world)
  public static void renderDebugSphere(Vector3d position, double radius, Vector3f color, World world)
  public static void renderDebugSphere(Vector3d position, double radius, Vector3f color, float opacity, World world)

Fields:
public static final Vector3f DEBUG_COLOR_STEERING_POST
public static final Vector3f DEBUG_COLOR_STEERING_PRE
public static final Vector3f DEBUG_COLOR_AVOIDANCE
public static final Vector3f DEBUG_COLOR_SEPARATION
public static final double DEBUG_MIN_VECTOR_DRAW_LENGTH_SQUARED
public static final double DEBUG_VECTORS_SCALE
public static final float DEBUG_VECTORS_TIME
public static final float DEBUG_TRANSPARENT
public static final double DEBUG_SPHERE_SCALE
