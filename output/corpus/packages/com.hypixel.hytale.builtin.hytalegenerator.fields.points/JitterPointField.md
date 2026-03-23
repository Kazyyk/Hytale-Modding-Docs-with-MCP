# JitterPointField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.points | Extends: PointField

public class JitterPointField extends PointField

## Fields

- private final FastNoiseLite noise
- private final int seed
- private final double jitter
- private final Vector3d scaleDown3d
- private final Vector3d scaleUp3d
- private final Vector2d scaleDown2d
- private final Vector2d scaleUp2d

## Methods

- @Override public PointField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
- @Override public void points3i(Vector3i min, Vector3i max, Consumer<Vector3i> pointsOut)
- @Override public void points2i(Vector2i min, Vector2i max, Consumer<Vector2i> pointsOut)
- @Override public void points1i(int min, int max, Consumer<Integer> pointsOut)
- @Override public void points3d(Vector3d min, Vector3d max, Consumer<Vector3d> pointsOut)
- @Override public void points2d(Vector2d min, Vector2d max, Consumer<Vector2d> pointsOut)
- @Override public void points1d(double min, double max, Consumer<Double> pointsOut)
