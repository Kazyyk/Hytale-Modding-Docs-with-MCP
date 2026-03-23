# DensityReturnType

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes | Extends: ReturnType

public class DensityReturnType extends ReturnType

Extends `ReturnType` to provide DensityReturnType functionality.

## Fields

- @Nonnull private final Density choiceDensity
- private final double defaultValue
- @Nonnull private final double[][] delimiters
- @Nonnull private final Density[] sampleDensities
- private final boolean calculateDistanceFromWall
- @Nonnull private final Vector3d rScaledSamplePointClone
- @Nonnull private final Density.Context rChildContext

## Methods

- public DensityReturnType(@Nonnull Density choiceDensity, @Nonnull Map<Range, Density> densityDelimiters, boolean calculateDistanceFromWall, double defaultValue)
- @Override public double get(double distance0,
        double distance1,
        @Nonnull Vector3d samplePoint,
        @Nullable Vector3d closestPoint0,
        @Nullable Vector3d closestPoint1,
        @Nullable Density.Context context)` |
