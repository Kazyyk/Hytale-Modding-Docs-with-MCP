# AbstractDistortedExtrusion

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: AbstractDistortedShape

public abstract class AbstractDistortedExtrusion extends AbstractDistortedShape

## Fields

- protected final GeneralNoise.InterpolationFunction interpolation
- double width
- double dist2
- double width2
- double height
- double alpha

## Constructors

- public AbstractDistortedExtrusion(@Nonnull Vector3d o, @Nonnull Vector3d v, double width, double height, GeneralNoise.InterpolationFunction interpolation)

## Methods

- protected abstract double getDistanceSq(double var1, double var3, double var5)
- protected abstract double getHeightComponent(double var1, double var3, double var5)
- public double getHeightAtProjection(int seed, double x, double z, double t, double centerY, @Nonnull CaveType caveType, @Nonnull ShapeDistortion distortion)

## Related Types

- AbstractDistortedShape
- DistortedShape
- ShapeDistortion

Known subclasses: DistortedCylinderShape

Also in this package: AbstractDistortedBody, AbstractDistortedShape, DistortedCylinderShape, DistortedEllipsoidShape, DistortedPipeShape, DistortedShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory, ShapeDistortion

Complete API:
  protected abstract double getDistanceSq(double var1, double var3, double var5)
  protected abstract double getHeightComponent(double var1, double var3, double var5)
  public double getHeightAtProjection(int seed, double x, double z, double t, double centerY, CaveType caveType, ShapeDistortion distortion)

Fields:
protected final GeneralNoise.InterpolationFunction interpolation
