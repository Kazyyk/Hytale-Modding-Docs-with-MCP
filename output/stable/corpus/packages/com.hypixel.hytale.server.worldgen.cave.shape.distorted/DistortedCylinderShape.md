# DistortedCylinderShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: AbstractDistortedExtrusion

public class DistortedCylinderShape extends AbstractDistortedExtrusion

## Fields

- protected static final double PITCH_COMPENSATION_MIN
- protected static final double PITCH_COMPENSATION_RANGE
- protected final Vector3d o
- protected final Vector3d v
- protected final double startWidth
- protected final double startHeight
- protected final double midWidth
- protected final double midHeight
- protected final double endWidth
- protected final double endHeight
- double x
- double y
- double z
- double radiusY
- double radiusXZ
- double t
- double ny
- double pitch
- double comp
- double scale

## Constructors

- public DistortedCylinderShape(@Nonnull Vector3d o,
        @Nonnull Vector3d v,
        double startWidth,
        double startHeight,
        double midWidth,
        double midHeight,
        double endWidth,
        double endHeight,
        GeneralNoise.InterpolationFunction interpolation)` |
| `public` | `DistortedCylinderShape(@Nonnull Vector3d o,
        @Nonnull Vector3d v,
        double startWidth,
        double startHeight,
        double midWidth,
        double midHeight,
        double endWidth,
        double endHeight,
        double maxWidth,
        double maxHeight,
        GeneralNoise.InterpolationFunction interpolation)` |

## Methods

- public Vector3d getStart()
- public Vector3d getEnd()
- return new Vector3d(x, y, z)
- public Vector3d getAnchor(@Nonnull Vector3d vector, double t, double tv, double th)
- public double getProjection(double x, double z)
- public boolean isValidProjection(double t)
- public double getYAt(double t)
- public double getWidthAt(double t)
- return getDimAt(t, this.startWidth, this.midWidth, this.endWidth, this.interpolation)
- public double getHeightAt(double t)
- return getDimAt(t, this.startHeight, this.midHeight, this.endHeight, this.interpolation)
- public double getDistanceSq(double x, double z, double t)
- public double getHeightComponent(double width, double width2, double dist2)
- public String toString()
- protected static double getDimAt(double t, double startDim, double midDim, double endDim, @Nonnull GeneralNoise.InterpolationFunction interpolation)
- protected static double getCompensationFactor(@Nonnull Vector3d direction)
- protected static double getHeightCompensation(double factor)
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

- `DistortedCylinderShape.Factory`

## Related Types

- AbstractDistortedExtrusion
- DistortedShape
