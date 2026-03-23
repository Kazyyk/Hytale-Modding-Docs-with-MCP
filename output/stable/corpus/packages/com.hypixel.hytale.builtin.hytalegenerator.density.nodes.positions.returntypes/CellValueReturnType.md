# CellValueReturnType

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes | Extends: ReturnType

public class CellValueReturnType extends ReturnType

Extends `ReturnType` to provide CellValueReturnType functionality.

## Fields

- @Nonnull private final Density sampleField
- private final double defaultValue
- @Nonnull private final Density.Context rChildContext

## Methods

- public CellValueReturnType(@Nonnull Density sampleField, double defaultValue)
- @Override public double get(double distance0,
        double distance1,
        @Nonnull Vector3d samplePosition,
        @Nullable Vector3d closestPoint0,
        Vector3d closestPoint1,
        @Nonnull Density.Context context)` |

Also in this package: CurveReturnType, DensityReturnType, Distance2AddReturnType, Distance2DivReturnType, Distance2MulReturnType, Distance2ReturnType, Distance2SubReturnType, DistanceReturnType, Entry, ReturnType, Vector3dComparator

Complete API:
  public double get(double distance0, double distance1, Vector3d samplePosition, Vector3d closestPoint0, Vector3d closestPoint1, Density.Context context)

Fields:
private final Density sampleField
private final double defaultValue
private final Density.Context rChildContext
