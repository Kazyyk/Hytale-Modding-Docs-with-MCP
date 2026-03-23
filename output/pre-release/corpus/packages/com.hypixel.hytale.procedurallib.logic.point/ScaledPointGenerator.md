# ScaledPointGenerator

Type: class | Package: com.hypixel.hytale.procedurallib.logic.point | Implements: IPointGenerator

public class ScaledPointGenerator implements IPointGenerator

## Fields

- protected final PointGenerator pointGenerator
- protected final double scale

## Constructors

- public ScaledPointGenerator(PointGenerator pointGenerator, double scale)

## Methods

- @Nonnull @Override public ResultBuffer.ResultBuffer2d nearest2D(int seed, double x, double y)
- @Nonnull @Override public ResultBuffer.ResultBuffer3d nearest3D(int seed, double x, double y, double z)
- @Nonnull @Override public ResultBuffer.ResultBuffer2d transition2D(int seed, double x, double y)
- @Nonnull @Override public ResultBuffer.ResultBuffer3d transition3D(int seed, double x, double y, double z)
- @Override public double getInterval()
- @Override public void collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

Also in this package: DistortedPointGenerator, IPointGenerator, OffsetPointGenerator, PointConsumer, PointConsumer2d, PointGenerator

Complete API:
  public ResultBuffer.ResultBuffer2d nearest2D(int seed, double x, double y)
  public ResultBuffer.ResultBuffer3d nearest3D(int seed, double x, double y, double z)
  public ResultBuffer.ResultBuffer2d transition2D(int seed, double x, double y)
  public ResultBuffer.ResultBuffer3d transition3D(int seed, double x, double y, double z)
  public double getInterval()
  public void collect(int seed, double minX, double minY, double maxX, double maxY, IPointGenerator.PointConsumer2d consumer)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
protected final PointGenerator pointGenerator
protected final double scale
