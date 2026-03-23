# DistortedShape

Type: interface | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: IWorldBounds

public interface DistortedShape extends IWorldBounds

## Fields

- GeneralNoise.InterpolationFunction DEFAULT_INTERPOLATION
- double midWidth
- double midHeight

## Methods

- Vector3d getStart()
- Vector3d getEnd()
- Vector3d getAnchor(Vector3d var1, double var2, double var4, double var6)
- default boolean hasGeometry()
- double getProjection(double var1, double var3)
- boolean isValidProjection(double var1)
- double getYAt(double var1)
- double getWidthAt(double var1)
- double getHeightAt(double var1)
- double getHeightAtProjection(int var1, double var2, double var4, double var6, double var8, CaveType var10, ShapeDistortion var11)
- default double getCeiling(double x, double z, double centerY, double height)
- default double getFloor(double x, double z, double centerY, double height)
- DistortedShape create(Vector3d var1,
            Vector3d var2,
            double var3,
            double var5,
            double var7,
            double var9,
            double var11,
            double var13,
            double var15,
            GeneralNoise.InterpolationFunction var17)` |
| `` | `default DistortedShape` | `create(Vector3d origin,
            Vector3d direction,
            double length,
            double startWidth,
            double startHeight,
            double midWidth,
            double midHeight,
            double endWidth,
            double endHeight)` |
| `` | `default DistortedShape` | `create(Vector3d origin,
            Vector3d direction,
            double length,
            double startWidth,
            double startHeight,
            double endWidth,
            double endHeight,
            GeneralNoise.InterpolationFunction interpolation)` |
| `` | `default DistortedShape` | `create(Vector3d origin, Vector3d direction, double length, double startWidth, double startHeight, double endWidth, double endHeight)` |
| `` | `default DistortedShape` | `create(Vector3d origin, Vector3d direction, double length, double width, double height, GeneralNoise.InterpolationFunction interpolation)` |

## Inner Types

- `DistortedShape.Factory`

## Related Types

- ShapeDistortion

Known implementors: AbstractDistortedShape

Also in this package: AbstractDistortedBody, AbstractDistortedExtrusion, AbstractDistortedShape, DistortedCylinderShape, DistortedEllipsoidShape, DistortedPipeShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory, ShapeDistortion

Complete API:
  Vector3d getStart()
  Vector3d getEnd()
  Vector3d getAnchor(Vector3d var1, double var2, double var4, double var6)
  default boolean hasGeometry()
  double getProjection(double var1, double var3)
  boolean isValidProjection(double var1)
  double getYAt(double var1)
  double getWidthAt(double var1)
  double getHeightAt(double var1)
  double getHeightAtProjection(int var1, double var2, double var4, double var6, double var8, CaveType var10, ShapeDistortion var11)
  default double getCeiling(double x, double z, double centerY, double height)
  default double getFloor(double x, double z, double centerY, double height)
