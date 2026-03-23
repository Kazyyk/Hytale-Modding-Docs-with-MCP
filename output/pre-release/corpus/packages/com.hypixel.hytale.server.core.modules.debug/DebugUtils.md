# DebugUtils

Type: class | Package: com.hypixel.hytale.server.core.modules.debug

public class DebugUtils

Static utility class for rendering debug shapes (spheres, cubes, cones, cylinders, arrows, lines, discs, sectors, frustums) in the game world. Shapes are sent to all players in the world as `DisplayDebug` packets. Provides predefined color constants and flag constants for controlling shape appearance (fade, wireframe, solid).

## Color Constants

- COLOR_BLACK | (0, 0, 0)
- COLOR_WHITE | (1, 1, 1)
- COLOR_RED | (1, 0, 0)
- COLOR_LIME | (0, 1, 0)
- COLOR_BLUE | (0, 0, 1)
- COLOR_YELLOW | (1, 1, 0)
- COLOR_CYAN | (0, 1, 1)
- COLOR_MAGENTA | (1, 0, 1)

## Flag Constants

- FLAG_NONE: No flags
- FLAG_FADE: Shape fades over time
- FLAG_NO_WIREFRAME: Disable wireframe rendering
- FLAG_NO_SOLID: Disable solid rendering

## Key Static Methods

- void add(World world, DebugShape shape, Matrix4d matrix, Vector3f color, float time, int flags)
- void addSphere(World world, Vector3d pos, Vector3f color, double scale, float time)
- void addCube(World world, Vector3d pos, Vector3f color, double scale, float time)
- void addCone(World world, Vector3d pos, Vector3f color, double scale, float time)
- void addCylinder(World world, Vector3d pos, Vector3f color, double scale, float time)
- void addArrow(World world, Matrix4d baseMatrix, Vector3f color, double length, float time, int flags)
- void addLine(World world, Vector3d start, Vector3d end, Vector3f color, double thickness, float time, int flags)
- void addDisc(World world, Matrix4d matrix, double outerRadius, double innerRadius, Vector3f color, float opacity, int segmentCount, float time, int flags)
- void addSector(World world, double x, double y, double z, double heading, double radius, double angle, Vector3f color, float time, int flags)
- void addFrustum(World world, Matrix4d matrix, Matrix4d frustumProjection, Vector3f color, float time, int flags)
- void clear(World world)
- Matrix4d makeMatrix(Vector3d pos, double scale)

Also in this package: DebugPlugin

Complete API:
  public static void add(World world, DebugShape shape, Matrix4d matrix, Vector3f color, float time, int flags)
  public static void add(World world, DebugShape shape, Matrix4d matrix, Vector3f color, float opacity, float time, int flags)
  private static void add(World world, DebugShape shape, Matrix4d matrix, Vector3f color, float opacity, float time, int flags, float[] shapeParams)
  public static void addFrustum(World world, Matrix4d matrix, Matrix4d frustumProjection, Vector3f color, float time, int flags)
  public static void clear(World world)
  public static void addArrow(World world, Matrix4d baseMatrix, Vector3f color, float opacity, double length, float time, int flags)
  public static void addArrow(World world, Matrix4d baseMatrix, Vector3f color, double length, float time, int flags)
  public static void addSphere(World world, Vector3d pos, Vector3f color, double scale, float time)
  public static void addSphere(World world, double x, double y, double z, Vector3f color, double scale, float time)
  public static void addSphere(World world, Vector3d pos, Vector3f color, float opacity, double scale, float time)
  public static void addSphere(World world, double x, double y, double z, Vector3f color, float opacity, double scale, float time)
  public static void addCone(World world, Vector3d pos, Vector3f color, double scale, float time)
  public static void addCube(World world, Vector3d pos, Vector3f color, double scale, float time)
  public static void addCube(World world, double x, double y, double z, Vector3f color, double scale, float time)
  public static void addCylinder(World world, Vector3d pos, Vector3f color, double scale, float time)
  public static void addLine(World world, Vector3d start, Vector3d end, Vector3f color, double thickness, float time, int flags)
  public static void addLine(World world, double startX, double startY, double startZ, double endX, double endY, double endZ, Vector3f color, double thickness, float time, int flags)
  public static void addDisc(World world, Matrix4d matrix, double outerRadius, double innerRadius, Vector3f color, float opacity, int segmentCount, float time, int flags)
  public static void addDisc(World world, Matrix4d matrix, double outerRadius, double innerRadius, Vector3f color, float opacity, float time, int flags)
  public static void addDisc(World world, Vector3d center, double radius, Vector3f color, float time, int flags)
  public static void addDisc(World world, double x, double y, double z, double radius, Vector3f color, float time, int flags)
  public static void addDisc(World world, double x, double y, double z, double radius, Vector3f color, float opacity, float time, int flags)
  public static void addDisc(World world, double x, double y, double z, double outerRadius, double innerRadius, Vector3f color, float opacity, float time, int flags)
  public static void addDisc(World world, double x, double y, double z, double outerRadius, double innerRadius, Vector3f color, float opacity, int segmentCount, float time, int flags)
  public static void addSector(World world, double x, double y, double z, double heading, double radius, double angle, Vector3f color, float time, int flags)
  public static void addSector(World world, double x, double y, double z, double heading, double radius, double angle, Vector3f color, float opacity, float time, int flags)
  public static void addSector(World world, double x, double y, double z, double heading, double outerRadius, double angle, double innerRadius, Vector3f color, float opacity, float time, int flags)
  public static void addSector(World world, double x, double y, double z, double heading, double outerRadius, double angle, double innerRadius, Vector3f color, float opacity, int segmentCount, float time, int flags)
  public static void addArrow(World world, Vector3d position, Vector3d direction, Vector3f color, float opacity, float time, int flags)
  public static void addArrow(World world, Vector3d position, Vector3d direction, Vector3f color, float time, int flags)
  public static void addForce(World world, Vector3d position, Vector3d force, VelocityConfig velocityConfig)
  public static Matrix4d makeMatrix(Vector3d pos, double scale)

Fields:
public static final Vector3f COLOR_BLACK
public static final Vector3f COLOR_WHITE
public static final Vector3f COLOR_RED
public static final Vector3f COLOR_LIME
public static final Vector3f COLOR_BLUE
public static final Vector3f COLOR_YELLOW
public static final Vector3f COLOR_CYAN
public static final Vector3f COLOR_MAGENTA
public static final Vector3f COLOR_SILVER
public static final Vector3f COLOR_GRAY
public static final Vector3f COLOR_MAROON
public static final Vector3f COLOR_OLIVE
public static final Vector3f COLOR_GREEN
public static final Vector3f COLOR_PURPLE
public static final Vector3f COLOR_TEAL
public static final Vector3f COLOR_NAVY
public static final Vector3f[] INDEXED_COLORS
public static final String[] INDEXED_COLOR_NAMES
public static boolean DISPLAY_FORCES
public static final float DEFAULT_OPACITY
public static final int FLAG_NONE
public static final int FLAG_FADE
public static final int FLAG_NO_WIREFRAME
public static final int FLAG_NO_SOLID
