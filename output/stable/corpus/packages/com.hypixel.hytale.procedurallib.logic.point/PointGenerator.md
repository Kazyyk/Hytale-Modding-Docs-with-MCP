# PointGenerator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.point | Implements: IPointGenerator

public class PointGenerator implements IPointGenerator

## Fields

- protected final int seedOffset
- protected final CellDistanceFunction cellDistanceFunction
- protected final PointEvaluator pointEvaluator

## Constructors

- public PointGenerator(int seedOffset, CellDistanceFunction cellDistanceFunction, PointEvaluator pointEvaluator)

## Methods

- @Nonnull protected ResultBuffer.Bounds2d localBounds2d()
- @Nonnull protected ResultBuffer.ResultBuffer2d localBuffer2d()
- @Nonnull protected ResultBuffer.ResultBuffer3d localBuffer3d()
- @Nonnull @Override public ResultBuffer.ResultBuffer2d nearest2D(int seed, double x, double y)
- @Nonnull @Override public ResultBuffer.ResultBuffer3d nearest3D(int seed, double x, double y, double z)
- @Nonnull @Override public ResultBuffer.ResultBuffer2d transition2D(int seed, double x, double y)
- @Nonnull @Override public ResultBuffer.ResultBuffer3d transition3D(int seed, double x, double y, double z)
- @Override public double getInterval()
- @Override public void collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)
- public void collect0(int seed,
        double minX,
        double minY,
        double maxX,
        double maxY,
        PointConsumer<IPointGenerator.PointConsumer2d> pointConsumer,
        IPointGenerator.PointConsumer2d consumer)` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `@Nonnull @Override public` | `String` | `toString()` |

Known subclasses: SeedResourcePointGenerator

Also in this package: DistortedPointGenerator, IPointGenerator, OffsetPointGenerator, PointConsumer, PointConsumer2d, ScaledPointGenerator

Complete API:
  protected ResultBuffer.Bounds2d localBounds2d()
  protected ResultBuffer.ResultBuffer2d localBuffer2d()
  protected ResultBuffer.ResultBuffer3d localBuffer3d()
  public ResultBuffer.ResultBuffer2d nearest2D(int seed, double x, double y)
  public ResultBuffer.ResultBuffer3d nearest3D(int seed, double x, double y, double z)
  public ResultBuffer.ResultBuffer2d transition2D(int seed, double x, double y)
  public ResultBuffer.ResultBuffer3d transition3D(int seed, double x, double y, double z)
  public double getInterval()
  public void collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)
  public void collect0(int seed, double minX, double minY, double maxX, double maxY, PointConsumer<IPointGenerator.PointConsumer2d> pointConsumer, IPointGenerator.PointConsumer2d consumer)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
protected final int seedOffset
protected final CellDistanceFunction cellDistanceFunction
protected final PointEvaluator pointEvaluator
