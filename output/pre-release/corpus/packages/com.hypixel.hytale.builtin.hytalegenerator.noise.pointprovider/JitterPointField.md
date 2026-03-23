# JitterPointField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.noise.pointprovider | Extends: PointField

public class JitterPointField extends PointField

Point field that generates jittered grid points using `FastNoiseLite` hash-based point placement. For each grid cell within the queried bounds, a deterministic pseudo-random offset is applied based on the seed and jitter amount. Points are scaled to world coordinates and filtered to the requested bounding region.

## Fields

- @Nonnull private final FastNoiseLite noise
- private final int seed
- private final double jitter
- @Nonnull private final Vector3d scaleDown3d
- @Nonnull private final Vector3d scaleUp3d
- @Nonnull private final Vector2d scaleDown2d
- @Nonnull private final Vector2d scaleUp2d

## Constructors

- JitterPointField(int seed, double jitter)

## Methods

- @Override public PointField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
- @Override public void points3i(@Nonnull Vector3i min, @Nonnull Vector3i max, @Nonnull Consumer<Vector3i> pointsOut)
- @Override public void points2i(@Nonnull Vector2i min, @Nonnull Vector2i max, @Nonnull Consumer<Vector2i> pointsOut)
- @Override public void points1i(int min, int max, @Nonnull Consumer<Integer> pointsOut)
- @Override public void points3d(@Nonnull Vector3d min, @Nonnull Vector3d max, @Nonnull Consumer<Vector3d> pointsOut)
- @Override public void points2d(@Nonnull Vector2d min, @Nonnull Vector2d max, @Nonnull Consumer<Vector2d> pointsOut)
- @Override public void points1d(double min, double max, @Nonnull Consumer<Double> pointsOut)
