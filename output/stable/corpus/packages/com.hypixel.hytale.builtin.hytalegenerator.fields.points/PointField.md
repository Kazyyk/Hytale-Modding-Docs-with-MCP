# PointField

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.fields.points | Implements: PointProvider

public abstract class PointField implements PointProvider

## Fields

- protected double scaleX
- protected double scaleY
- protected double scaleZ
- protected double scaleW

## Methods

- @Nonnull @Override public List<Vector3i> points3i(Vector3i min, Vector3i max)
- @Nonnull @Override public List<Vector2i> points2i(Vector2i min, Vector2i max)
- @Nonnull @Override public List<Integer> points1i(int min, int max)
- @Nonnull @Override public List<Vector3d> points3d(Vector3d min, Vector3d max)
- @Nonnull @Override public List<Vector2d> points2d(Vector2d min, Vector2d max)
- @Nonnull @Override public List<Double> points1d(double min, double max)
- public PointField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
- @Nonnull public PointField setScale(double scale)

Known subclasses: JitterPointField

Also in this package: JitterPointField, PointProvider

Complete API:
  public List<Vector3i> points3i(Vector3i min, Vector3i max)
  public List<Vector2i> points2i(Vector2i min, Vector2i max)
  public List<Integer> points1i(int min, int max)
  public List<Vector3d> points3d(Vector3d min, Vector3d max)
  public List<Vector2d> points2d(Vector2d min, Vector2d max)
  public List<Double> points1d(double min, double max)
  public PointField setScale(double scaleX, double scaleY, double scaleZ, double scaleW)
  public PointField setScale(double scale)

Fields:
protected double scaleX
protected double scaleY
protected double scaleZ
protected double scaleW
