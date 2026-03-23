# DistortedPipeShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: DistortedCylinderShape

public class DistortedPipeShape extends DistortedCylinderShape

## Fields

- private final double compensation
- double fade
- double compensation
- double scale
- double maxWidth
- double maxHeight

## Constructors

- public DistortedPipeShape(@Nonnull Vector3d o,
        @Nonnull Vector3d v,
        double startWidth,
        double startHeight,
        double midWidth,
        double midHeight,
        double endWidth,
        double endHeight,
        double maxWidth,
        double maxHeight,
        double compensation,
        GeneralNoise.InterpolationFunction interpolation)` |

## Methods

- public double getWidthAt(double t)
- return getCompensatedDim(t, this.startWidth, this.midWidth, this.endWidth, this.compensation, this.interpolation)
- public double getHeightAt(double t)
- return getCompensatedDim(t, this.startHeight, this.midHeight, this.endHeight, this.compensation, this.interpolation)
- public boolean isValidProjection(double t)
- public String toString()
- protected static double getCompensatedDim(double t, double startDim, double midDim, double endDim, double compensation, @Nonnull GeneralNoise.InterpolationFunction interpolation)
- public DistortedShape create(@Nonnull Vector3d origin,
            @Nonnull Vector3d direction,
            double length,
            double startWidth,
            double startHeight,
            double midWidth,
            double midHeight,
            double endWidth,
            double endHeight,
            GeneralNoise.InterpolationFunction interpolation)` |

## Inner Types

- `DistortedPipeShape.Factory`

## Related Types

- DistortedCylinderShape
- DistortedShape

Also in this package: AbstractDistortedBody, AbstractDistortedExtrusion, AbstractDistortedShape, DistortedCylinderShape, DistortedEllipsoidShape, DistortedShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory, ShapeDistortion

Complete API:
  public double getWidthAt(double t)
  public double getHeightAt(double t)
  public boolean isValidProjection(double t)
  public String toString()
  protected static double getCompensatedDim(double t, double startDim, double midDim, double endDim, double compensation, GeneralNoise.InterpolationFunction interpolation)

Fields:
private final double compensation
