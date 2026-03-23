# AbstractDistortedBody

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: AbstractDistortedShape

public abstract class AbstractDistortedBody extends AbstractDistortedShape

## Fields

- protected final Vector3d o
- protected final Vector3d v
- protected final CoordinateRotator rotation
- double dx
- double dz
- double dy
- double x1
- double x2
- double y1
- double y2
- double z1
- double z2
- double scale
- double nx
- double ny
- double nz
- double yaw
- double pitch

## Constructors

- public AbstractDistortedBody(@Nonnull Vector3d o, Vector3d v, double yaw, double pitch, double radiusX, double radiusY, double radiusZ)
- private AbstractDistortedBody(@Nonnull Vector3d o, Vector3d v, @Nonnull CoordinateRotator rotation, double radiusX, double radiusY, double radiusZ)

## Methods

- protected abstract double getHeight(int var1, double var2, double var4, double var6, double var8, CaveType var10, ShapeDistortion var11)
- public Vector3d getStart()
- return new Vector3d(this.o.x, this.getHighBoundY()
- public Vector3d getEnd()
- return new Vector3d(this.o.x, this.getLowBoundY()
- public double getHeightAtProjection(int caveSeed, double x, double z, double t, double centerY, CaveType caveType, ShapeDistortion distortion)
- public double getFloor(double x, double z, double centerY, double height)
- public double getCeiling(double x, double z, double centerY, double height)
- private static double maxX(@Nonnull CoordinateRotator rotation, double radiusX, double radiusY, double radiusZ)
- private static double maxY(@Nonnull CoordinateRotator rotation, double radiusX, double radiusY, double radiusZ)
- private static double maxZ(@Nonnull CoordinateRotator rotation, double radiusX, double radiusY, double radiusZ)
- public DistortedShape create(Vector3d origin,
            @Nonnull Vector3d direction,
            double length,
            double startWidth,
            double startHeight,
            double midWidth,
            double midHeight,
            double endWidth,
            double endHeight,
            GeneralNoise.InterpolationFunction interpolation)` |
| `` | `protected abstract DistortedShape` | `createShape(Vector3d var1, Vector3d var2, double var3, double var5, double var7, double var9, double var11, GeneralNoise.InterpolationFunction var13)` |

## Related Types

- AbstractDistortedShape
- DistortedShape
- ShapeDistortion
