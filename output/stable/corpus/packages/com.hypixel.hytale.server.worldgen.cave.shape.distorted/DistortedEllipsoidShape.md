# DistortedEllipsoidShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: AbstractDistortedBody

public class DistortedEllipsoidShape extends AbstractDistortedBody

## Fields

- private final double radiusX
- private final double radiusY
- private final double radiusZ
- private final double radiusX2
- private final double radiusY2
- private final double radiusZ2
- private final double invRadiusX2
- private final double invRadiusZ2
- private final GeneralNoise.InterpolationFunction interpolation
- double dx
- double dz
- double dx2
- double dz2
- double qx
- double qz
- double qh
- double noise
- double y2
- double min
- double max
- double aspect
- double alpha

## Constructors

- public DistortedEllipsoidShape(@Nonnull Vector3d o,
        Vector3d d,
        double yaw,
        double pitch,
        double radiusX,
        double radiusY,
        double radiusZ,
        GeneralNoise.InterpolationFunction interpolation)` |

## Methods

- public Vector3d getAnchor(@Nonnull Vector3d vector, double tx, double ty, double tz)
- public double getProjection(double x, double z)
- public boolean isValidProjection(double t)
- public double getYAt(double t)
- public double getWidthAt(double t)
- public double getHeightAt(double t)
- protected double getHeight(int seed, double x, double z, double t, double centerY, CaveType caveType, @Nonnull ShapeDistortion distortion)
- public String toString()
- private static double wrapPitch(double pitch, double radiusY, double radiusZ)
- protected DistortedShape createShape(@Nonnull Vector3d origin,
            Vector3d direction,
            double yaw,
            double pitch,
            double radiusX,
            double radiusY,
            double radiusZ,
            GeneralNoise.InterpolationFunction interpolation)` |

## Inner Types

- `DistortedEllipsoidShape.Factory`

## Related Types

- AbstractDistortedBody
- DistortedShape
- ShapeDistortion

Also in this package: AbstractDistortedBody, AbstractDistortedExtrusion, AbstractDistortedShape, DistortedCylinderShape, DistortedPipeShape, DistortedShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory, ShapeDistortion

Complete API:
  public Vector3d getAnchor(Vector3d vector, double tx, double ty, double tz)
  public double getProjection(double x, double z)
  public boolean isValidProjection(double t)
  public double getYAt(double t)
  public double getWidthAt(double t)
  public double getHeightAt(double t)
  protected double getHeight(int seed, double x, double z, double t, double centerY, CaveType caveType, ShapeDistortion distortion)
  public String toString()
  private static double wrapPitch(double pitch, double radiusY, double radiusZ)

Fields:
private final double radiusX
private final double radiusY
private final double radiusZ
private final double radiusX2
private final double radiusY2
private final double radiusZ2
private final double invRadiusX2
private final double invRadiusZ2
private final GeneralNoise.InterpolationFunction interpolation
