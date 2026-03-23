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
