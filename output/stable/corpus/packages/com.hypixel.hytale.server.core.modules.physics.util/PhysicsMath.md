# PhysicsMath

Type: class | Package: com.hypixel.hytale.server.core.modules.physics.util

public class PhysicsMath

## Fields

- public static final double DENSITY_AIR
- public static final double DENSITY_WATER
- public static final double AIR_DENSITY
- public static final float HEADING_DIRECTION

## Methods

- public static double getAcceleration(double speed, double terminalSpeed)
- public static double getTerminalVelocity(double mass, double density, double areaMillimetersSquared, double dragCoefficient)
- public static double getRelativeDensity(Vector3d position, Box boundingBox)
- public static double computeDragCoefficient(double terminalSpeed, double area, double mass, double gravity)
- public static double computeTerminalSpeed(double dragCoefficient, double area, double mass, double gravity)
- public static double computeProjectedArea(double x, double y, double z, @Nonnull Box box)
- public static double computeProjectedArea(@Nonnull Vector3d direction, @Nonnull Box box)
- public static double volumeOfIntersection(@Nonnull Box a, @Nonnull Vector3d posA, @Nonnull Box b, @Nonnull Vector3d posB)
- public static double volumeOfIntersection(@Nonnull Box a, @Nonnull Vector3d posA, @Nonnull Box b, double posBX, double posBY, double posBZ)
- public static double lengthOfIntersection(double aMin, double aMax, double bMin, double bMax)
- public static float headingFromDirection(double x, double z)
- public static float normalizeAngle(float rad)
- public static float normalizeTurnAngle(float rad)
- public static float pitchFromDirection(double x, double y, double z)
- @Nonnull public static Vector3d vectorFromAngles(float heading, float pitch, @Nonnull Vector3d outDirection)
- public static float pitchX(float pitch)
- public static float pitchY(float pitch)
- public static float headingX(float heading)
- public static float headingZ(float heading)
