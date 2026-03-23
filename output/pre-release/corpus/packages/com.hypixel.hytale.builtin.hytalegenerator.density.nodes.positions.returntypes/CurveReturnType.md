# CurveReturnType

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes | Extends: ReturnType

public class CurveReturnType extends ReturnType

Extends `ReturnType` to provide CurveReturnType functionality.

## Fields

- @Nonnull private final Double2DoubleFunction curve

## Methods

- public CurveReturnType(@Nonnull Double2DoubleFunction curve)
- @Override public double get(double distance0,
        double distance1,
        @Nonnull Vector3d samplePosition,
        @Nullable Vector3d closestPoint0,
        Vector3d closestPoint1,
        @Nullable Density.Context context)` |

Also in this package: CellValueReturnType, DensityReturnType, Distance2AddReturnType, Distance2DivReturnType, Distance2MulReturnType, Distance2ReturnType, Distance2SubReturnType, DistanceReturnType, Entry, ReturnType, Vector3dComparator

Complete API:
  public double get(double distance0, double distance1, Vector3d samplePosition, Vector3d closestPoint0, Vector3d closestPoint1, Density.Context context)

Fields:
private final Double2DoubleFunction curve
